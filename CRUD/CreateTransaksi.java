package CRUD;

import Connection.SQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTransaksi {

    public static void main(String[] args) {
        try (Connection connection = SQLConnection.getConnection()) {
            // Display available payment methods
            displayPaymentMethods(connection);

            // Get user input for transaction details
            int selectedPaymentMethod = getSelectedPaymentMethod();

            // Create a new transaction and retrieve the generated nota ID
            int notaId = createTransaction(connection, selectedPaymentMethod);

            // Display success message with the generated nota ID
            System.out.println("Transaction successfully created! Nota ID: " + notaId);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to create transaction. Please check your inputs and try again.");
        }
    }

    private static void displayPaymentMethods(Connection connection) throws SQLException {
        System.out.println("Available Payment Methods:");
        String query = "SELECT * FROM metode_pembelian";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("kode_metode") + ". " + resultSet.getString("nama_metode"));
            }
        }
    }

    private static int getSelectedPaymentMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select Payment Method (Enter the code): ");
        return scanner.nextInt();
    }

    private static int createTransaction(Connection connection, int selectedPaymentMethod) throws SQLException {
        try (PreparedStatement notaStatement = connection.prepareStatement(
                "INSERT INTO nota (total_barang, total_harga, metode_pembelian) VALUES (?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS);
             PreparedStatement transaksiStatement = connection.prepareStatement(
                     "INSERT INTO transaksi (no_nota, kode_barang, ukuran, jumlah_barang, total_harga_barang) " +
                             "VALUES (?, ?, ?, ?, ?)");
             PreparedStatement stokUpdateStatement = connection.prepareStatement(
                     "UPDATE stok_barang SET offlen = offlen - ?, shopee = shopee - ?, tokopedia = tokopedia - ? " +
                             "WHERE kode_barang = ? AND ukuran = ?")) {

            // Get transaction details from the user
            int totalBarang = getTotalInput("Enter Total Number of Items: ");
            int totalHarga = 0; // Initialize totalHarga to 0

            // Insert data into nota table
            notaStatement.setInt(1, totalBarang);
            notaStatement.setInt(2, totalHarga); // Initialize totalHarga to 0
            notaStatement.setInt(3, selectedPaymentMethod);

            int affectedRows = notaStatement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating transaction failed, no rows affected.");
            }

            // Retrieve the generated nota ID
            ResultSet generatedKeys = notaStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int notaId = generatedKeys.getInt(1);

                // Insert data into transaksi table
                System.out.println("Enter Transaction Details:");

                while (true) {
                    int kodeBarang = getTotalInput("Enter Kode Barang (or 0 to finish): ");
                    if (kodeBarang == 0) {
                        break;
                    }

                    String ukuran = getStringInput("Enter Ukuran: ");
                    int jumlahBarang = getTotalInput("Enter Jumlah Barang: ");

                    // Check if there is enough stock for the selected size and source
                    if (!isStockAvailable(connection, kodeBarang, ukuran, jumlahBarang)) {
                        System.out.println("Not enough stock. Transaction failed.");
                        return -1; // Indicates a failed transaction
                    }

                    // Fetch harga from barang table based on kode_barang
                    int harga = getHarga(connection, kodeBarang);

                    // Calculate total_harga_barang as the product of harga and jumlah_barang
                    int totalHargaBarang = harga * jumlahBarang;

                    // Add totalHargaBarang to totalHarga
                    totalHarga += totalHargaBarang;

                    // Get user input for stock source (offlen, shopee, or tokopedia)
                    String stockSource = getStockSource();

                    // Insert data into transaksi table
                    transaksiStatement.setInt(1, notaId);
                    transaksiStatement.setInt(2, kodeBarang);
                    transaksiStatement.setString(3, ukuran);
                    transaksiStatement.setInt(4, jumlahBarang);
                    transaksiStatement.setInt(5, totalHargaBarang);

                    transaksiStatement.executeUpdate();

                    // Update stok_barang table to reduce the stock based on the selected source
                    updateStock(connection, stokUpdateStatement, kodeBarang, ukuran, jumlahBarang, stockSource);
                }

                // Update total_harga in nota table with the calculated totalHarga
                updateTotalHarga(connection, notaId, totalHarga);

                return notaId;
            } else {
                throw new SQLException("Creating transaction failed, no ID obtained.");
            }
        }
    }

    private static boolean isStockAvailable(Connection connection, int kodeBarang, String ukuran, int jumlahBarang) throws SQLException {
        String query = "SELECT offlen, shopee, tokopedia FROM stok_barang WHERE kode_barang = ? AND ukuran = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, kodeBarang);
            statement.setString(2, ukuran);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int offlenStock = resultSet.getInt("offlen");
                    int shopeeStock = resultSet.getInt("shopee");
                    int tokopediaStock = resultSet.getInt("tokopedia");

                    // Check if there is enough stock for the selected size and source
                    return offlenStock >= jumlahBarang || shopeeStock >= jumlahBarang || tokopediaStock >= jumlahBarang;
                } else {
                    throw new SQLException("Stock not found for kode_barang: " + kodeBarang + " and ukuran: " + ukuran);
                }
            }
        }
    }

    private static int getHarga(Connection connection, int kodeBarang) throws SQLException {
        String query = "SELECT harga FROM barang WHERE kode_barang = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, kodeBarang);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("harga");
                } else {
                    throw new SQLException("Barang not found with kode_barang: " + kodeBarang);
                }
            }
        }
    }

    private static void updateStock(Connection connection, PreparedStatement stokUpdateStatement, int kodeBarang, String ukuran, int jumlahBarang, String stockSource) throws SQLException {
        // Update stok_barang table based on the selected source
        stokUpdateStatement.setInt(1, stockSource.equals("offlen") ? jumlahBarang : 0);
        stokUpdateStatement.setInt(2, stockSource.equals("shopee") ? jumlahBarang : 0);
        stokUpdateStatement.setInt(3, stockSource.equals("tokopedia") ? jumlahBarang : 0);
        stokUpdateStatement.setInt(4, kodeBarang);
        stokUpdateStatement.setString(5, ukuran);

        stokUpdateStatement.executeUpdate();
    }

    private static void updateTotalHarga(Connection connection, int notaId, int totalHarga) throws SQLException {
        // Update total_harga in nota table
        String query = "UPDATE nota SET total_harga = ? WHERE no_nota = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, totalHarga);
            statement.setInt(2, notaId);
            statement.executeUpdate();
        }
    }

    private static int getTotalInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    private static String getStringInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    private static String getStockSource() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Stock Source (offlen, shopee, tokopedia): ");
        return scanner.nextLine().toLowerCase();
    }
}