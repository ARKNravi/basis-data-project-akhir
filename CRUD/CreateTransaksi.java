package CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTransaksi {
     public static void insertTransaksi(Connection conn, int kode_barang, String ukuran, int jumlah_barang, String metode, int total_barang,int total_harga)
            throws SQLException {

        Statement st = conn.createStatement();
        int no_nota = ReadBarang.ambilNoNotaTerakhir(conn);
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

        st = conn.createStatement();
        st.executeUpdate(
                String.format("UPDATE nota\n" + //
                        "SET total_barang = %d, total_harga = %d, metode_pembelian = '%s'\n" + //
                        "WHERE no_nota = %d;",
                        total_barang, total_harga, metode, ReadBarang.ambilNoNotaTerakhir(conn)));

    }
}
