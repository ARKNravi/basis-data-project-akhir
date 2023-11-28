package Search;

import Connection.SQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Search {
  public static ResultSet barang(Connection conn, String keyword) throws SQLException {
    // Obtain the connection from SQLConnection class

    String query = "SELECT * FROM barang " +
        "WHERE nama_barang LIKE ? OR kode_barang LIKE ? OR harga LIKE ?";

    // Using PreparedStatement to avoid SQL injection
    try (PreparedStatement st = conn.prepareStatement(query)) {
      // Setting parameters
      st.setString(1, "%" + keyword + "%");
      st.setString(2, "%" + keyword + "%");
      st.setString(3, "%" + keyword + "%");

      // Executing the query
      ResultSet rs = st.executeQuery();
      return rs;
    }

  }

  public static ResultSet nota(String keyword) throws SQLException {
    ResultSet rs;
    try (// Obtain the connection from SQLConnection class
    Connection conn = SQLConnection.getConnection()) {
      String query = "SELECT transaksi.*, nota.metode_pembelian\n" + //
          "FROM transaksi\n" + //
          "    JOIN nota\n" + //
          "    ON transaksi.no_nota = nota.no_nota\n" + //
          "WHERE transaksi.no_nota LIKE '%?%' OR\n" + //
          "    kode_barang LIKE '%?%' OR\n" + //
          "    ukuran LIKE '%?%' OR\n" + //
          "    jumlah LIKE '%?%' OR\n" + //
          "    total_harga LIKE '%?%' OR\n" + //
          "    tanggal_transaksi LIKE '%?%' OR\n" + //
          "    metode_pembelian LIKE '%?%';";

      // Using PreparedStatement to avoid SQL injection
      try (PreparedStatement st = conn.prepareStatement(query)) {
        // Setting parameters
        st.setString(1, "%" + keyword + "%");
        st.setString(2, "%" + keyword + "%");
        st.setString(3, "%" + keyword + "%");
        st.setString(4, "%" + keyword + "%");
        st.setString(5, "%" + keyword + "%");
        st.setString(6, "%" + keyword + "%");
        st.setString(7, "%" + keyword + "%");

        // Executing the query
        rs = st.executeQuery();
      }
    }
    return rs;

  }

  public static ResultSet pegawai(Connection conn, String keyword) throws SQLException {
    // Obtain the connection from SQLConnection class

    String query = "SELECT dp.nip, p.nik, p.nama, j.nama_jabatan, p.pendidikan, p.tempat, p.tanggal_lahir, p.jenis_kelamin, p.npwp, p.nomor_rekening, dp.status_pegawai, dp.total_cuti, dp.total_izin, g.gaji, t.tunjangan "
        +
        "FROM detail_pegawai dp " +
        "JOIN data_pegawai p ON dp.nik = p.nik " +
        "JOIN jabatan j ON dp.kelas = j.kelas " +
        "JOIN tunjangan_keluarga t ON p.status_pernikahan = t.status_pernikahan AND p.jumlah_anak = t.jumlah_anak " +
        "JOIN gaji_pokok g ON dp.golongan = g.golongan " +
        "WHERE nikLIKE ? OR " +
        "      nip LIKE ? OR " +
        "      p.nik LIKE ? OR " +
        "      nama LIKE ? OR " +
        "      nama_jabatan LIKE ? OR " +
        "      pendidikan LIKE ? OR " +
        "      tempat LIKE ? OR " +
        "      tanggal_lahir LIKE ? OR " +
        "      jenis_kelamin LIKE ? OR " +
        "      npwp LIKE ? OR " +
        "      nomor_rekening LIKE ? OR " +
        "      status_pegawai LIKE ? OR " +
        "      total_cuti LIKE ? OR " +
        "      total_izin LIKE ? OR " +
        "      g.gaji LIKE ? OR " +
        "      t.tunjangan LIKE ?";

    try (PreparedStatement st = conn.prepareStatement(query)) {
      for (int i = 1; i <= 16; i++) {
        st.setString(i, "%" + keyword + "%");
      }

      ResultSet rs = st.executeQuery();
      return rs;
    }

  }


}
