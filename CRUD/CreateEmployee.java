package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateEmployee {
    public static void tambahPegawai(Connection conn, String nik, String nama, String pendidikan, String tempat,
            String tanggal_lahir, String jenis_kelamin, String npwp, String status_pernikahan, int jumlah_anak,
            String nomor_rekening, String alamat, int kelas, int golongan, String status_pegawai, int total_cuti,
            int total_izin) throws SQLException {

        String query = "INSERT INTO data_pegawai (nik, nama, pendidikan, tempat, tanggal_lahir, jenis_kelamin, npwp, status_pernikahan, jumlah_anak, nomor_rekening, alamat) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
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

    public static void tambahDetailPegawai(Connection conn, String nik, int kelas, int golongan, String status_pegawai,
            int total_cuti, int total_izin) throws SQLException {

        String query = "INSERT INTO detail_pegawai (nik, kelas, golongan, status_pegawai, total_cuti, total_izin) VALUES ( ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
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
