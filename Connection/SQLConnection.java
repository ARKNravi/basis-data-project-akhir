package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    public static Connection getConnection() throws SQLException {
        String connectionUrl = "jdbc:jtds:sqlserver://localhost:1433/project_basdat;user=sa;password=berjuang99;";
        return DriverManager.getConnection(connectionUrl);
    }
}


