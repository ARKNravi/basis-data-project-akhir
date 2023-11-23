package Search;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search {
    public static ResultSet barang(Connection conn, String keyword) throws SQLException{
          Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(String.format("\n" + //
                "SELECT *\n" + //
                "FROM barang\n" + //
                "WHERE nama_barang LIKE '%%s%' OR kode_barang LIKE '%%s%' OR harga LIKE '%%s%'\n" + //
                "",keyword,keyword,keyword));

        return rs;
    }

    public static ResultSet pegawai(Connection conn, String keyword) throws SQLException{
          Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(String.format("\n" + //
                "SELECT *\n" + //
                "FROM barang\n" + //
                "WHERE nama_barang LIKE '%%s%' OR kode_barang LIKE '%%s%' OR harga LIKE '%%s%'\n" + //
                "",keyword,keyword,keyword));

        return rs;
    }


}
