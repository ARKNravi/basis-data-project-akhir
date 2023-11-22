package CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        } catch (Exception e) {
            System.out.println("Barang sudah ada");
        }

    }

    public static void insertStok(Connection conn, String nama) throws SQLException {
        Statement st = conn.createStatement();

    }

    // add transaksi
    public static void insertNota(Connection conn, int total_barang, int total_harga, String metode_pembelian)
            throws SQLException {
        Statement st = conn.createStatement();
        st.executeUpdate(
                String.format("INSERT INTO nota(total_barang,total_harga,metode_pembelian) VALUES(%d, %d, '%s')",
                        total_barang, total_barang, metode_pembelian));
    }

    public static void insertTransaksi(Connection conn, int kode_barang, String ukuran, int jumlah_barang)
            throws SQLException {

        Statement st = conn.createStatement();
        int no_nota = Read.ambilNoNotaTerakhir(conn);
        int harga = 0;
        ResultSet rs = st.executeQuery(String.format("SELECT harga FROM barang WHERE kode_barang = %d", kode_barang));
        if (rs.next()) {
            harga = rs.getInt(1);
        }
        int total_harga_barang = harga * jumlah_barang;

        st.executeUpdate(
                String.format(
                        "INSERT INTO transaksi(no_nota,kode_barang,ukuran,jumlah_barang,total_harga_barang) VALUES(%d, %d, '%s', %d, %d);",
                        no_nota, kode_barang, ukuran, jumlah_barang, total_harga_barang));
    }
}
