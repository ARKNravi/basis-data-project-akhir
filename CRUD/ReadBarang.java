package CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class ReadBarang {

    public static void bacaBarang(Connection conn, DefaultTableModel model) throws SQLException {

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(
                "SELECT b.kode_barang, b.nama_barang, b.harga, COALESCE(SUM(sb.offlen + sb.shopee + sb.tokopedia), 0) AS total_stok "
                        +
                        "FROM barang b " +
                        "LEFT JOIN stok_barang sb ON b.kode_barang = sb.kode_barang " +
                        "GROUP BY b.kode_barang, b.nama_barang, b.harga");

        while (rs.next()) {
            String id = "P" + rs.getInt("kode_barang");
            String nama = rs.getString("nama_barang");
            Integer harga = rs.getInt("harga");
            Integer totalStok = rs.getInt("total_stok");

            // Add a row to the model
            model.addRow(new Object[] { id, nama, harga, totalStok });
        }

    }

    public static void bacaStokBarang(Connection conn) throws SQLException {

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(
                "SELECT b.kode_barang, b.nama_barang, SUM(sb.offlen + sb.shopee + sb.tokopedia) AS total_stok " +
                        "FROM barang b " +
                        "JOIN stok_barang sb ON b.kode_barang = sb.kode_barang " +
                        "GROUP BY b.kode_barang, b.nama_barang");
        System.out.println("===============================================================");
        System.out.printf("|  %3s   | %-30s | %-20s\n", "ID", "Nama Barang", "Total Stok");
        System.out.println("===============================================================");
        while (rs.next()) {
            String id = "P" + rs.getInt("kode_barang");
            String nama = rs.getString("nama_barang");
            Integer totalStok = rs.getInt("total_stok");
            System.out.printf("| %-6s | %-30s | %-20s\n", id, nama, totalStok);
        }

    }

}
