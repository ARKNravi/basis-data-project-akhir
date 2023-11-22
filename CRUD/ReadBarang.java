package CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadBarang {

    public static void bacaBarang(Connection conn) throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from barang");
        System.out.println("=========================================================");
        System.out.printf("|  %3s   | %-30s | %-20s\n", "ID", "Nama Barang", "Harga");
        System.out.println("=========================================================");
        while (rs.next()) {
            String id = "P" + rs.getInt(1);
            String nama = rs.getString(2);
            Integer harga = rs.getInt(3);
            System.out.printf("| %-6s | %-30s | %-20s\n", id, nama, harga);
        }
    }

    public static int bacaHargaBarang(Connection conn, int kode_barang) throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(String.format("SELECT harga FROM barang WHERE kode_barang = '%d'",kode_barang));
        rs.next();
        return rs.getInt(1);
    }

    public static void bacaStokBarang(Connection conn) throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs = st
                .executeQuery("SELECT s.kode_barang, b.nama_barang, s.ukuran, s.offlen, s.shopee, s.tokopedia\n" + //
                        "FROM stok_barang s\n" + //
                        "    JOIN barang b\n" + //
                        "    ON b.kode_barang = s.kode_barang;");

        System.out.println(
                "=============================================================================================");
        System.out.printf("  %-2s |  %3s   | %-30s | %-6s | %-9s | %-9s | %-9s |\n", "No", "ID", "Nama Barang",
                "ukuran", "Offline", "Shopee", "Tokopedia");
        System.out.println(
                "=============================================================================================");

        int no = 1;
        while (rs.next()) {
            String kode_barang = "P" + rs.getInt(1);
            String nama = rs.getString(2);
            String ukuran = rs.getString(3);
            int offline = rs.getInt(4);
            int shopee = rs.getInt(5);
            int tokopedia = rs.getInt(6);
            System.out.printf(" %-3s |  %3s   | %-30s |   %-4s | %-9s | %-9s | %-9s |\n",
                    no, kode_barang, nama, ukuran, offline, shopee, tokopedia);
            no++;
            System.out.println(
                    "---------------------------------------------------------------------------------------------");
        }
    }

    public static void bacaTotalBelanja(Connection conn, int no_nota) throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(String
                .format("SELECT b.nama_barang, t.ukuran, t.jumlah_barang, t.total_harga_barang FROM transaksi t\n" + //
                        "JOIN barang b\n" + //
                        "ON  t.kode_barang = b.kode_barang\n" + //
                        "WHERE no_nota = %d;", no_nota));
        System.out.println("=====================================================================");
        System.out.printf("|  %-2s  | %-30s | %-6s | %-6s | %-20s\n", "No", "Nama Barang", "ukuran", "Jumlah", "Harga");
        System.out.println("=====================================================================");

        int no = 1;
        int total_harga = 0;
        int total_jumlah = 0;
        while (rs.next()) {
            String nama_barang = rs.getString(1);
            String ukuran = rs.getString(2);
            int jumlah = rs.getInt(3);
            int harga = rs.getInt(4);
            System.out.printf("|  %-2d  | %-30s | %-6s | %-6d | %-20d\n", no, nama_barang, ukuran, jumlah, harga);
            no++;
            total_harga += harga;
            total_jumlah += jumlah;
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("|  %-45s | %-6d | %-20d\n", "Total", total_jumlah, total_harga);
        System.out.println("---------------------------------------------------------------------");

    }

    public static int ambilNoNotaTerakhir(Connection conn) throws SQLException{
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT TOP 1 no_nota FROM nota ORDER BY no_nota DESC;");
        rs.next();
        return rs.getInt(1);
    }
}
