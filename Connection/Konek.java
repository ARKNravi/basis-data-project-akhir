package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Konek {
    public static Connection getConnection(String url, String userName, String passwd) throws SQLException, ClassNotFoundException {
        
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, userName, passwd);
        return conn;
    }
}
