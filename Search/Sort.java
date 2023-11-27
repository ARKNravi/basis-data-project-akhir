package Search;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.SQLConnection;

public class Sort {

    public class Search {
        public static ResultSet barangAsc(String keyword) throws SQLException {
            // Obtain the connection from SQLConnection class
            try (Connection conn = SQLConnection.getConnection()) {
                String query = "SELECT *\n" + //
                        "FROM barang\n" + //
                        "ORDER BY ?;";

                // Using PreparedStatement to avoid SQL injection
                try (PreparedStatement st = conn.prepareStatement(query)) {
                    // Setting parameters
                    st.setString(1, keyword);

                    // Executing the query
                    ResultSet rs = st.executeQuery();
                    return rs;
                }
            }
        }

        public static ResultSet barangDesc(String keyword) throws SQLException {
            // Obtain the connection from SQLConnection class
            try (Connection conn = SQLConnection.getConnection()) {
                String query = "SELECT *\n" + //
                        "FROM barang\n" + //
                        "ORDER BY ? DESC;";

                // Using PreparedStatement to avoid SQL injection
                try (PreparedStatement st = conn.prepareStatement(query)) {
                    // Setting parameters
                    st.setString(1, keyword);

                    // Executing the query
                    ResultSet rs = st.executeQuery();
                    return rs;
                }
            }
        }

    }
}