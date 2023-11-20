package contoh;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sbd1 {

    static String url = "jdbc:jtds:sqlserver://localhost:1433/TestDB";
    static String userName = "sa";
    static String password = "berjuang99";
 
    public static void main(String[] args) {
        Connection conn = null;
        Sbd1 sbd1 = new Sbd1();
        try {
            conn = sbd1.getConnection(url, userName, password);
            System.out.println("Before Insert");
            sbd1.statementQuery(conn);
            sbd1.statementInsert(conn);
            System.out.println("After Insert");
            sbd1.statementQuery(conn);
            sbd1.preparedStatementInsert(conn);
            System.out.println("After Insert with preparedstatement");
            sbd1.statementQuery(conn);
            sbd1.statementDelete(conn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Connection getConnection(String url, String userName, String passwd)

            throws SQLException, ClassNotFoundException {
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, userName, passwd);
        return conn;
    }

    public void statementQuery(Connection conn) throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from Inventory");
        System.out.println("==========================================");
        System.out.println("| ID | NAMA | JUMLAH");
        System.out.println("==========================================");
        while (rs.next()) {
            Integer id = rs.getInt(1);
            String nama = rs.getString(2);
            Integer jml = rs.getInt(3);
            System.out.println("| " + id + " | " + nama + " | " + jml);
        }
    }

    public void statementInsert(Connection conn) throws SQLException {
        Statement st = conn.createStatement();
        st.executeUpdate("insert into Inventory(id, name, quantity) values (3,'grapes',100)");
    }

    public void preparedStatementInsert(Connection conn) throws SQLException {

        String sql = "insert into Inventory(id, name, quantity) values(?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, 4);
        st.setString(2, "Melon ");
        st.setInt(3, 110);
        st.executeUpdate();
        st.setInt(1, 5);
        st.setString(2, "Kiwi ");
        st.setInt(3, 120);
        st.executeUpdate();
    }

    public void statementDelete(Connection conn) throws SQLException {
        Statement st = conn.createStatement();
        st.executeUpdate("delete from Inventory where id=3");
        st.executeUpdate("delete from Inventory where id=4");
        st.executeUpdate("delete from Inventory where id=5");
    }
}