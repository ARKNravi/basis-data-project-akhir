package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {
    public static void main(String[] args) {
        try (Connection conn = SQLConnection.getConnection()) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the NIP of the employee you want to delete or 'exit' to quit:");
                String nip = scanner.nextLine();
                if (nip.equalsIgnoreCase("exit")) {
                    break;
                }

                // Get the nik associated with the nip from detail_pegawai
                String sql = "SELECT nik FROM detail_pegawai WHERE nip = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nip);
                ResultSet rs = pstmt.executeQuery();
                if (!rs.next()) {
                    System.out.println("No employee found with the given NIP. Please check your inputs and try again.");
                    continue;
                }
                String nik = rs.getString("nik");

                // Delete from detail_pegawai
                sql = "DELETE FROM detail_pegawai WHERE nip = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nip);
                int rowsAffected = pstmt.executeUpdate();

                // Delete from data_pegawai
                sql = "DELETE FROM data_pegawai WHERE nik = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nik);
                rowsAffected += pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Delete successful!");
                } else {
                    System.out.println("Delete failed. Please check your inputs and try again.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
