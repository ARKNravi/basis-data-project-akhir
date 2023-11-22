package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateEmployee {
    public static void main(String[] args) {
        try (Connection conn = SQLConnection.getConnection()) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the values for the following fields in data_pegawai:");
                System.out.print("nik: ");
                String nik = scanner.nextLine();
                if (nik.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.print("nama: ");
                String nama = scanner.nextLine();
                System.out.print("pendidikan: ");
                String pendidikan = scanner.nextLine();
                System.out.print("tempat: ");
                String tempat = scanner.nextLine();
                System.out.print("tanggal_lahir (yyyy-mm-dd): ");
                String tanggal_lahir = scanner.nextLine();
                System.out.print("jenis_kelamin: ");
                String jenis_kelamin = scanner.nextLine();
                System.out.print("npwp: ");
                String npwp = scanner.nextLine();
                System.out.print("status_pernikahan: ");
                String status_pernikahan = scanner.nextLine();
                System.out.print("jumlah_anak: ");
                int jumlah_anak = Integer.parseInt(scanner.nextLine());
                System.out.print("nomor_rekening: ");
                String nomor_rekening = scanner.nextLine();
                System.out.print("alamat: ");
                String alamat = scanner.nextLine();

                String sql = "INSERT INTO data_pegawai (nik, nama, pendidikan, tempat, tanggal_lahir, jenis_kelamin, npwp, status_pernikahan, jumlah_anak, nomor_rekening, alamat) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nik);
                pstmt.setString(2, nama);
                pstmt.setString(3, pendidikan);
                pstmt.setString(4, tempat);
                pstmt.setString(5, tanggal_lahir);
                pstmt.setString(6, jenis_kelamin);
                pstmt.setString(7, npwp);
                pstmt.setString(8, status_pernikahan);
                pstmt.setInt(9, jumlah_anak);
                pstmt.setString(10, nomor_rekening);
                pstmt.setString(11, alamat);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Insert into data_pegawai successful!");
                } else {
                    System.out.println("Insert into data_pegawai failed. Please check your inputs and try again.");
                    continue;
                }

                System.out.println("Enter the values for the following fields in detail_pegawai:");
                System.out.print("nip: ");
                String nip = scanner.nextLine();
                System.out.print("kelas: ");
                int kelas = Integer.parseInt(scanner.nextLine());
                System.out.print("golongan: ");
                int golongan = Integer.parseInt(scanner.nextLine());
                System.out.print("status_pegawai: ");
                String status_pegawai = scanner.nextLine();
                System.out.print("total_cuti: ");
                int total_cuti = Integer.parseInt(scanner.nextLine());
                System.out.print("total_izin: ");
                int total_izin = Integer.parseInt(scanner.nextLine());

                sql = "INSERT INTO detail_pegawai (nip, nik, kelas, golongan, status_pegawai, total_cuti, total_izin) VALUES (?, ?, ?, ?, ?, ?, ?)";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nip);
                pstmt.setString(2, nik);
                pstmt.setInt(3, kelas);
                pstmt.setInt(4, golongan);
                pstmt.setString(5, status_pegawai);
                pstmt.setInt(6, total_cuti);
                pstmt.setInt(7, total_izin);

                rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Insert into detail_pegawai successful!");
                } else {
                    System.out.println("Insert into detail_pegawai failed. Please check your inputs and try again.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
