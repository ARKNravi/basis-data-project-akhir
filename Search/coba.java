package Search;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.Konek;

public class coba {
    static String url = "jdbc:jtds:sqlserver://localhost:1433/project_basdat";
    static String userName = "sa";
    static String password = "berjuang99";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = Konek.getConnection(url, userName, password);
        ResultSet rs = Search.barang(conn, "a");
        rs.next();
        System.out.println(rs.getString(2));

    }
}
