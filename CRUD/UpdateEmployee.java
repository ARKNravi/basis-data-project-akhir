package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee {
    public static void main(String[] args) {
        try (Connection conn = SQLConnection.getConnection()) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the NIP of the employee you want to update or 'exit' to quit:");
                String nip = scanner.nextLine();
                if (nip.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.println("Select the table and column you want to update:");
                System.out.println("1. detail_pegawai - kelas");
                System.out.println("2. detail_pegawai - golongan");
                System.out.println("3. detail_pegawai - status_pegawai");
                System.out.println("4. detail_pegawai - total_cuti");
                System.out.println("5. detail_pegawai - total_izin");
                System.out.println("6. data_pegawai - nama");
                System.out.println("7. data_pegawai - pendidikan");
                System.out.println("8. data_pegawai - tempat");
                System.out.println("9. data_pegawai - tanggal_lahir");
                System.out.println("10. data_pegawai - jenis_kelamin");
                System.out.println("11. data_pegawai - npwp");
                System.out.println("12. data_pegawai - status_pernikahan");
                System.out.println("13. data_pegawai - jumlah_anak");
                System.out.println("14. data_pegawai - nomor_rekening");
                System.out.println("15. data_pegawai - alamat");

                int choice = scanner.nextInt();
                scanner.nextLine();  // consume newline

                String table, column;
                switch (choice) {
                    case 1: table = "detail_pegawai"; column = "kelas"; break;
                    case 2: table = "detail_pegawai"; column = "golongan"; break;
                    case 3: table = "detail_pegawai"; column = "status_pegawai"; break;
                    case 4: table = "detail_pegawai"; column = "total_cuti"; break;
                    case 5: table = "detail_pegawai"; column = "total_izin"; break;
                    case 6: table = "data_pegawai"; column = "nama"; break;
                    case 7: table = "data_pegawai"; column = "pendidikan"; break;
                    case 8: table = "data_pegawai"; column = "tempat"; break;
                    case 9: table = "data_pegawai"; column = "tanggal_lahir"; break;
                    case 10: table = "data_pegawai"; column = "jenis_kelamin"; break;
                    case 11: table = "data_pegawai"; column = "npwp"; break;
                    case 12: table = "data_pegawai"; column = "status_pernikahan"; break;
                    case 13: table = "data_pegawai"; column = "jumlah_anak"; break;
                    case 14: table = "data_pegawai"; column = "nomor_rekening"; break;
                    case 15: table = "data_pegawai"; column = "alamat"; break;
                    default: System.out.println("Invalid choice. Please try again."); continue;
                }

                System.out.println("Enter the new value:");
                String value = scanner.nextLine();

                String sql;
                if (table.equals("detail_pegawai")) {
                    sql = "UPDATE " + table + " SET " + column + " = ? WHERE nip = ?";
                } else {  // data_pegawai
                    sql = "UPDATE " + table + " SET " + column + " = ? WHERE nik = (SELECT nik FROM detail_pegawai WHERE nip = ?)";
                }
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, value);
                pstmt.setString(2, nip);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Update successful!");
                } else {
                    System.out.println("Update failed. Please check your inputs and try again.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
