package CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Connection.SQLConnection;

public class CreateBarang {

    // add barang
    public static void insertBarang(Connection conn, String nama, int harga) throws SQLException {
        Statement st = conn.createStatement();
        try {
            st.executeUpdate(String.format("INSERT INTO barang(nama_barang,harga) VALUES('%s',%d);", nama, harga));
            ResultSet rs = st
                    .executeQuery(String.format("SELECT kode_barang FROM barang WHERE nama_barang = '%s';", nama));
            int kode_barang;
            if (rs.next()) {
                kode_barang = rs.getInt(1);
            } else {
                kode_barang = 1;
            }

            String[] ukuran = { "S", "M", "L", "XL", "XXL" };

            for (String string : ukuran) {
                st.executeUpdate(String.format(
                        "INSERT INTO stok_barang(kode_barang,ukuran,offlen,shopee,tokopedia) VALUES(%d, '%s', 0, 0, 0);",
                        kode_barang, string));
            }
            System.out.println("Barang added successfully.");
        } catch (Exception e) {
            System.out.println("Barang already exists.");
        }

    }



    public static void main(String[] args) {
        try {
            // Get a database connection
            Connection conn = SQLConnection.getConnection();

            // Get user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name of the barang: ");
            String barangName = scanner.nextLine();
            System.out.print("Enter the price of the barang: ");
            int barangPrice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()

            // Call the method to insert barang
            insertBarang(conn, barangName, barangPrice);

            // Get user input for nota
            System.out.print("Enter the total number of barang: ");
            int totalBarang = scanner.nextInt();
            System.out.print("Enter the total price of barang: ");
            int totalHarga = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()
            System.out.print("Enter the payment method: ");
            String paymentMethod = scanner.nextLine();

            // Call the method to insert nota

            // Close the connection
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}