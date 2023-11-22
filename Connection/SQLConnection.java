package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    public static Connection getConnection() throws SQLException {
        String connectionUrl = "jdbc:sqlserver://MSI\\SQLEXPRESS:1433;databaseName=project_basdat;user=admin;password=apjy2k18;encrypt=true;trustServerCertificate=true";
        return DriverManager.getConnection(connectionUrl);
    }
}
