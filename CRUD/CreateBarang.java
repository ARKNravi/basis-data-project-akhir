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
            System.out.println("Barang added successfully.");
        } catch (Exception e) {
            System.out.println("Barang already exists.");
        }

    }
}
