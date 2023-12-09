package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployee {
    public static void deleteEmployeeByNIK(Connection conn, String nik) throws SQLException {
        // Delete from detail_pegawai
        String sqlDetail = "DELETE FROM detail_pegawai WHERE nik = ?";
        try (PreparedStatement pstmtDetail = conn.prepareStatement(sqlDetail)) {
            pstmtDetail.setString(1, nik);
            pstmtDetail.executeUpdate();
        }

        // Delete from data_pegawai
        String sqlData = "DELETE FROM data_pegawai WHERE nik = ?";
        try (PreparedStatement pstmtData = conn.prepareStatement(sqlData)) {
            pstmtData.setString(1, nik);
            pstmtData.executeUpdate();
        }
    }
}