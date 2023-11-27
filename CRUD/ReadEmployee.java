package CRUD;

import Connection.SQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadEmployee {
    public static void main(String[] args) {
        bacaSemuaPegawai();
    }

    public static void bacaSemuaPegawai() {
        try (Connection connection = SQLConnection.getConnection()) {
            String selectQuery = "SELECT  dp.nip, p.nik, p.nama, j.nama_jabatan, p.pendidikan, p.tempat, p.tanggal_lahir, p.jenis_kelamin, p.npwp, p.nomor_rekening, dp.status_pegawai, dp.total_cuti, dp.total_izin, g.gaji, t.tunjangan\n" + //
                    "FROM detail_pegawai dp\n" + //
                    "    JOIN data_pegawai p\n" + //
                    "    ON dp.nik = p.nik\n" + //
                    "    JOIN jabatan j \n" + //
                    "    ON dp.kelas = j.kelas\n" + //
                    "    JOIN tunjangan_keluarga t \n" + //
                    "    ON p.status_pernikahan = t.status_pernikahan AND p.jumlah_anak = t.jumlah_anak\n" + //
                    "    JOIN gaji_pokok g \n" + //
                    "    ON dp.golongan = g.golongan";

            try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                System.out.println("Employee Data (Joined):");
                System.out.println("--------------------------------------------------");
                System.out.printf("%-15s %-15s %-30s %-15s %-15s %-20s %-15s %-7s %-20s %-20s %-4s %-4s %20s %20s\n",
                        "NIP", "NIK", "Name", "Jabatan", "Pendidikan", "Asal", "Tanggal Lahir", "Kelamin", "NPWP", "Nomor Rekening", "Status Pegawai", "Cuti", "Izin", "Gaji Pokok", "Tunjangan");
                System.out.println("--------------------------------------------------");

                while (resultSet.next()) {
                    int nip = resultSet.getInt("nip");
                    String nik = resultSet.getString("nik");
                    String nama = resultSet.getString("nama");
                    String jabatan = resultSet.getString("nama_jabatan");
                    String pendidikan = resultSet.getString("pendidikan");
                    String asal = resultSet.getString("tempat");
                    String tanggalLahir = resultSet.getString("tanggal_lahir");
                    String kelamin = resultSet.getString("jenis_kelamin");
                    String npwp = resultSet.getString("npwp");
                    String norek = resultSet.getString("nomor_rekening");
                    String status = resultSet.getString("status_pegawai");
                    String cuti = resultSet.getString("total_cuti");
                    String izin = resultSet.getString("total_izin");
                    String gaji = resultSet.getString("gaji");
                    String tunjangan = resultSet.getString("tunjangan");

                    System.out.printf("%-15s %-15s %-30s %-15s %-15s %-20s %-15s %-7s %-20s %-20s %-4s %-4s %20s %20s\n",
                            nip, nik, nama, jabatan, pendidikan, asal, tanggalLahir, kelamin, npwp, norek, status, cuti, izin, gaji, tunjangan);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet bacaSemuaPegawaiResultSet() {
        try {
            Connection connection = SQLConnection.getConnection();
            String selectQuery = "SELECT  dp.nip, p.nik, p.nama, j.nama_jabatan, p.pendidikan, p.tempat, p.tanggal_lahir, p.jenis_kelamin, p.npwp, p.nomor_rekening, dp.status_pegawai, dp.total_cuti, dp.total_izin, g.gaji, t.tunjangan\n" +
                    "FROM detail_pegawai dp\n" +
                    "    JOIN data_pegawai p\n" +
                    "    ON dp.nik = p.nik\n" +
                    "    JOIN jabatan j \n" +
                    "    ON dp.kelas = j.kelas\n" +
                    "    JOIN tunjangan_keluarga t \n" +
                    "    ON p.status_pernikahan = t.status_pernikahan AND p.jumlah_anak = t.jumlah_anak\n" +
                    "    JOIN gaji_pokok g \n" +
                    "    ON dp.golongan = g.golongan";

            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            return preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
