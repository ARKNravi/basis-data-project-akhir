package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

    // add barang
    public static void insertBarang(Connection conn, String nama, int harga) throws SQLException {
        Statement st = conn.createStatement();
        try {
            st.executeUpdate(String.format("INSERT INTO barang(nama_barang,harga) VALUES('%s',%d);", nama, harga));
            ResultSet rs = st
                    .executeQuery(String.format("SELECT kode_barang FROM barang WHERE nama_barang = '%s';", nama));
            int kode_barang;
            if (rs.next()) {
                kode_barang = rs.getInt(1);
            } else {
                kode_barang = 1;
            }

            String[] ukuran = { "S", "M", "L", "XL", "XXL" };

            for (String string : ukuran) {
                st.executeUpdate(String.format(
                        "INSERT INTO stok_barang(kode_barang,ukuran,offlen,shopee,tokopedia) VALUES(%d, '%s', 0, 0, 0);",
                        kode_barang, string));
            }
        } catch (Exception e) {
            System.out.println("Barang sudah ada");
        }

    }

    public static void insertStok(Connection conn, String nama) throws SQLException {
        Statement st = conn.createStatement();

    }

    // add transaksi
    public static void insertNota(Connection conn, int total_barang, int total_harga, String metode_pembelian)
            throws SQLException {
        Statement st = conn.createStatement();
        st.executeUpdate(
                String.format("INSERT INTO nota(total_barang,total_harga,metode_pembelian) VALUES(%d, %d, '%s')",
                        total_barang, total_barang, metode_pembelian));
    }

    public static void insertTransaksi(Connection conn, int kode_barang, String ukuran, int jumlah_barang)
            throws SQLException {

        Statement st = conn.createStatement();
        int no_nota = Read.ambilNoNotaTerakhir(conn);
        int harga = 0;
        ResultSet rs = st.executeQuery(String.format("SELECT harga FROM barang WHERE kode_barang = %d", kode_barang));
        if (rs.next()) {
            harga = rs.getInt(1);
        }
        int total_harga_barang = harga * jumlah_barang;

        st.executeUpdate(
                String.format(
                        "INSERT INTO transaksi(no_nota,kode_barang,ukuran,jumlah_barang,total_harga_barang) VALUES(%d, %d, '%s', %d, %d);",
                        no_nota, kode_barang, ukuran, jumlah_barang, total_harga_barang));
    }

    // Pegawai
    public static void tambahPegawai(Connection conn, String nik, String nama, String pendidikan, String tempat_lahir,
            String tanggal_lahir, String kelamin, String npwp, String status_pernikahan,
            int jumlah_anak, String no_rek, String alamat) throws SQLException {
        String insertQuery = "INSERT INTO data_pegawai (nik, nama, pendidikan, tempat, tanggal_lahir, jenis_kelamin, npwp, "
                +
                "status_pernikahan, jumlah_anak, nomor_rekening, alamat) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement query = conn.prepareStatement(insertQuery)) {
            // Set parameters
            query.setString(1, nik); // Replace with actual NIK
            query.setString(2, nama);
            query.setString(3, pendidikan);
            query.setString(4, tempat_lahir);
            query.setString(5, tanggal_lahir);
            query.setString(6, kelamin);
            query.setString(7, npwp);
            query.setString(8, status_pernikahan);
            query.setInt(9, jumlah_anak);
            query.setString(10, no_rek);
            query.setString(11, alamat);

            // execute
            query.executeUpdate();
            System.out.println("Employee added successfully!");
        }
    }

    // Read employee data from the data_pegawai table
    public static void readEmployeeData(Connection connection) throws SQLException {
        String selectQuery = "SELECT nik, nama, pendidikan, tempat, tanggal_lahir FROM data_pegawai";

        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                String nik = resultSet.getString("nik");
                String name = resultSet.getString("nama");
                String education = resultSet.getString("pendidikan");
                String placeOfBirth = resultSet.getString("tempat");
                String dateOfBirth = resultSet.getString("tanggal_lahir");

                System.out.println("NIK: " + nik + ", Name: " + name + ", Education: " + education +
                        ", Place of Birth: " + placeOfBirth + ", Date of Birth: " + dateOfBirth);
            }
        }
    }

}
