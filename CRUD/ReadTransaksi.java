package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

public class ReadTransaksi {

    public static void readTransactions(Connection conn) {
        String query = "SELECT t.no_nota, t.kode_barang, b.nama_barang, t.ukuran, t.jumlah_barang, t.total_harga_barang, n.tanggal_transaksi, n.metode_pembelian "
                +
                "FROM transaksi t " +
                "JOIN barang b ON t.kode_barang = b.kode_barang " +
                "JOIN nota n ON t.no_nota = n.no_nota " +
                "ORDER BY t.no_nota, t.kode_barang, t.ukuran";
        try (PreparedStatement statement = conn.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery()) {
            int currentNotaId = -1;
            System.out.println("All Transactions");
            System.out.println("-------------------------------------------------");
            System.out.printf("%-15s%-15s%-30s%-15s%-15s%-15s%-20s%-15s%n", "Nota ID", "Kode Barang", "Nama Barang",
                    "Ukuran", "Jumlah", "Total Harga", "Tanggal Transaksi", "Metode Pembelian");
            System.out.println("-------------------------------------------------");
            while (resultSet.next()) {
                int notaId = resultSet.getInt("no_nota");
                int kodeBarang = resultSet.getInt("kode_barang");
                String namaBarang = resultSet.getString("nama_barang");
                String ukuran = resultSet.getString("ukuran");
                int jumlahBarang = resultSet.getInt("jumlah_barang");
                int totalHargaBarang = resultSet.getInt("total_harga_barang");
                // New attributes
                String tanggalTransaksi = resultSet.getString("tanggal_transaksi");
                String metodePembelian = resultSet.getString("metode_pembelian");

                if (currentNotaId != notaId) {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Nota ID: " + notaId);
                    System.out.println("Tanggal Transaksi: " + tanggalTransaksi);
                    System.out.println("Metode Pembelian: " + metodePembelian);
                    currentNotaId = notaId;
                }

                System.out.printf("%-15s%-15s%-30s%-15s%-15s%-15s%-20s%-15s%n", notaId, kodeBarang, namaBarang,
                        ukuran, jumlahBarang, totalHargaBarang, tanggalTransaksi, metodePembelian);
            }
            System.out.println("-------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to read transactions. Please check your inputs and try again.");

        }
    }

    public static DefaultTableModel getTransactionsTableModel(Connection conn) {
        DefaultTableModel model = new DefaultTableModel();

        // Add columns to the model
        model.addColumn("Nota ID");
        model.addColumn("Kode Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Ukuran");
        model.addColumn("Jumlah");
        model.addColumn("Total Harga");
        model.addColumn("Tanggal Transaksi");
        model.addColumn("Metode Pembelian");

        try {
            
            String query = "SELECT t.no_nota, t.kode_barang, b.nama_barang, t.ukuran, t.jumlah_barang, t.total_harga_barang, n.tanggal_transaksi, n.metode_pembelian "
                    +
                    "FROM transaksi t " +
                    "JOIN barang b ON t.kode_barang = b.kode_barang " +
                    "JOIN nota n ON t.no_nota = n.no_nota " +
                    "ORDER BY t.no_nota, t.kode_barang, t.ukuran";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Process the ResultSet and add rows to the model
            while (resultSet.next()) {
                int notaId = resultSet.getInt("no_nota");
                int kodeBarang = resultSet.getInt("kode_barang");
                String namaBarang = resultSet.getString("nama_barang");
                String ukuran = resultSet.getString("ukuran");
                int jumlahBarang = resultSet.getInt("jumlah_barang");
                int totalHargaBarang = resultSet.getInt("total_harga_barang");
                // New attributes
                String tanggalTransaksi = resultSet.getString("tanggal_transaksi");
                String metodePembelian = resultSet.getString("metode_pembelian");

                // Add a new row to the model
                model.addRow(new Object[] { notaId, kodeBarang, namaBarang, ukuran, jumlahBarang, totalHargaBarang,
                        tanggalTransaksi, metodePembelian });
            }

            // Close the ResultSet and PreparedStatement
            resultSet.close();
            statement.close();

            return model;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to get transactions DefaultTableModel. Please check your inputs and try again.");
            return null;
        }

    }

}
