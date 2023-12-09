package CRUD;

import Connection.SQLConnection;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class CreateEmployee {

    public static void main(String[] args) {
        try (Connection connection = SQLConnection.getConnection()) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter employee details:");

            System.out.print("NIK: ");
            String nik = scanner.nextLine();

            System.out.print("Name: ");
            String nama = scanner.nextLine();

            System.out.print("Education: ");
            String pendidikan = scanner.nextLine();

            System.out.print("Place of Birth: ");
            String tempat = scanner.nextLine();

            System.out.print("Date of Birth (YYYY-MM-DD): ");
            String tanggal_lahir = scanner.nextLine();

            System.out.print("Gender: ");
            String jenis_kelamin = scanner.nextLine();

            System.out.print("NPWP: ");
            String npwp = scanner.nextLine();

            System.out.print("Marital Status: ");
            String status_pernikahan = scanner.nextLine();

            System.out.print("Number of Children: ");
            int jumlah_anak = scanner.nextInt();

            System.out.print("Bank Account Number: ");
            String nomor_rekening = scanner.next();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Address: ");
            String alamat = scanner.nextLine();

            System.out.print("Class: ");
            int kelas = scanner.nextInt();

            System.out.print("Golongan: ");
            int golongan = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Employee Status: ");
            String status_pegawai = scanner.nextLine();

            System.out.print("Total Cuti: ");
            int total_cuti = scanner.nextInt();

            System.out.print("Total Izin: ");
            int total_izin = scanner.nextInt();

            tambahPegawai(connection, nik, nama, pendidikan, tempat, tanggal_lahir, jenis_kelamin, npwp,
                    status_pernikahan, jumlah_anak, nomor_rekening, alamat, kelas, golongan, status_pegawai,
                    total_cuti, total_izin);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void tambahPegawai(Connection conn, String nik, String nama, String pendidikan, String tempat,
                                     String tanggal_lahir, String jenis_kelamin, String npwp, String status_pernikahan,
                                     int jumlah_anak, String nomor_rekening, String alamat, int kelas, int golongan,
                                     String status_pegawai, int total_cuti, int total_izin) throws SQLException {

        String query = "INSERT INTO data_pegawai (nik, nama, pendidikan, tempat, tanggal_lahir, jenis_kelamin, npwp, status_pernikahan, jumlah_anak, nomor_rekening, alamat) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, nik);
            ps.setString(2, nama);
            ps.setString(3, pendidikan);
            ps.setString(4, tempat);
            ps.setString(5, tanggal_lahir);
            ps.setString(6, jenis_kelamin);
            ps.setString(7, npwp);
            ps.setString(8, status_pernikahan);
            ps.setInt(9, jumlah_anak);
            ps.setString(10, nomor_rekening);
            ps.setString(11, alamat);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Insert into data_pegawai successful!");
            } else {
                System.out.println("Insert into data_pegawai failed. Please check your inputs and try again.");
            }
            tambahDetailPegawai(conn, nik, kelas, golongan, status_pegawai, total_cuti, total_izin);
        }
    }

    public static void tambahDetailPegawai(Connection conn, String nik, int kelas, int golongan, String status_pegawai,
                                           int total_cuti, int total_izin) throws SQLException {

        String query = "INSERT INTO detail_pegawai (nik, kelas, golongan, status_pegawai, total_cuti, total_izin) VALUES ( ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, nik);
            ps.setInt(2, kelas);
            ps.setInt(3, golongan);
            ps.setString(4, status_pegawai);
            ps.setInt(5, total_cuti);
            ps.setInt(6, total_izin);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Insert into detail_pegawai successful!");
            } else {
                System.out.println("Insert into detail_pegawai failed. Please check your inputs and try again.");
            }
        }
    }
}