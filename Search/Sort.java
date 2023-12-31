package Search;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

public class Sort {

    public static DefaultTableModel barangAsc(Connection conn, String sort) throws SQLException {
        DefaultTableModel model = new DefaultTableModel();
    
        String query = "SELECT b.kode_barang, b.nama_barang, b.harga, COALESCE(SUM(sb.offlen + sb.shopee + sb.tokopedia), 0) AS total_stok "
        +
        "FROM barang b " +
        "LEFT JOIN stok_barang sb ON b.kode_barang = sb.kode_barang " +
        "GROUP BY b.kode_barang, b.nama_barang, b.harga " +
        "ORDER BY " + sort + " ASC";

    
        // Using PreparedStatement to avoid SQL injection
        try (PreparedStatement st = conn.prepareStatement(query)) {
            // Executing the query
            try (ResultSet rs = st.executeQuery()) {
                // Add columns to the table model
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    model.addColumn(metaData.getColumnName(i));
                }
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }
            }
        }
        return model;
    }
    

    public static DefaultTableModel barangDesc(Connection conn, String sort) throws SQLException {
        DefaultTableModel model = new DefaultTableModel();
    
        String query = "SELECT b.kode_barang, b.nama_barang, b.harga, COALESCE(SUM(sb.offlen + sb.shopee + sb.tokopedia), 0) AS total_stok "
        +
        "FROM barang b " +
        "LEFT JOIN stok_barang sb ON b.kode_barang = sb.kode_barang " +
        "GROUP BY b.kode_barang, b.nama_barang, b.harga " +
        "ORDER BY " + sort + " ASC";

    
        // Using PreparedStatement to avoid SQL injection
        try (PreparedStatement st = conn.prepareStatement(query)) {
            // Executing the query
            try (ResultSet rs = st.executeQuery()) {
                // Add columns to the table model
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    model.addColumn(metaData.getColumnName(i));
                }
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }
            }
        }
        return model;
    }
    

    public static DefaultTableModel pegawaiAsc(Connection conn, String keyword, String sort) throws SQLException {
        DefaultTableModel model = new DefaultTableModel();

        String query = "SELECT dp.nip, p.nik, p.nama, j.nama_jabatan, p.pendidikan, p.tempat, p.tanggal_lahir, p.jenis_kelamin, p.npwp, p.nomor_rekening, dp.status_pegawai, dp.total_cuti, dp.total_izin, g.gaji, t.tunjangan "
                +
                "FROM detail_pegawai dp " +
                "JOIN data_pegawai p ON dp.nik = p.nik " +
                "JOIN jabatan j ON dp.kelas = j.kelas " +
                "JOIN tunjangan_keluarga t ON p.status_pernikahan = t.status_pernikahan AND p.jumlah_anak = t.jumlah_anak "
                +
                "JOIN gaji_pokok g ON dp.golongan = g.golongan " +
                "WHERE p.nik LIKE ? OR " +
                "      dp.nip LIKE ? OR " +
                "      p.nama LIKE ? OR " +
                "      j.nama_jabatan LIKE ? OR " +
                "      p.pendidikan LIKE ? OR " +
                "      p.tempat LIKE ? OR " +
                "      p.tanggal_lahir LIKE ? OR " +
                "      p.jenis_kelamin LIKE ? OR " +
                "      p.npwp LIKE ? OR " +
                "      p.nomor_rekening LIKE ? OR " +
                "      dp.status_pegawai LIKE ? OR " +
                "      dp.total_cuti LIKE ? OR " +
                "      dp.total_izin LIKE ? OR " +
                "      g.gaji LIKE ? OR " +
                "      t.tunjangan LIKE ?" +
                " ORDER BY ?";

        // Using PreparedStatement to avoid SQL injection
        try (PreparedStatement st = conn.prepareStatement(query)) {
            // Setting parameters
            for (int i = 1; i <= 15; i++) {
                st.setString(i, "%" + keyword + "%");
            }
            st.setString(16, "%" + sort + "%");

            // Executing the query
            try (ResultSet rs = st.executeQuery()) {
                // Add columns to the table model
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    model.addColumn(metaData.getColumnName(i));
                }

                // Add rows to the table model
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }
            }
        }

        return model;
    }

    public static DefaultTableModel pegawaiDesc(Connection conn, String keyword, String sort) throws SQLException {
        DefaultTableModel model = new DefaultTableModel();

        String query = "SELECT dp.nip, p.nik, p.nama, j.nama_jabatan, p.pendidikan, p.tempat, p.tanggal_lahir, p.jenis_kelamin, p.npwp, p.nomor_rekening, dp.status_pegawai, dp.total_cuti, dp.total_izin, g.gaji, t.tunjangan "
                +
                "FROM detail_pegawai dp " +
                "JOIN data_pegawai p ON dp.nik = p.nik " +
                "JOIN jabatan j ON dp.kelas = j.kelas " +
                "JOIN tunjangan_keluarga t ON p.status_pernikahan = t.status_pernikahan AND p.jumlah_anak = t.jumlah_anak "
                +
                "JOIN gaji_pokok g ON dp.golongan = g.golongan " +
                "WHERE p.nik LIKE ? OR " +
                "      dp.nip LIKE ? OR " +
                "      p.nama LIKE ? OR " +
                "      j.nama_jabatan LIKE ? OR " +
                "      p.pendidikan LIKE ? OR " +
                "      p.tempat LIKE ? OR " +
                "      p.tanggal_lahir LIKE ? OR " +
                "      p.jenis_kelamin LIKE ? OR " +
                "      p.npwp LIKE ? OR " +
                "      p.nomor_rekening LIKE ? OR " +
                "      dp.status_pegawai LIKE ? OR " +
                "      dp.total_cuti LIKE ? OR " +
                "      dp.total_izin LIKE ? OR " +
                "      g.gaji LIKE ? OR " +
                "      t.tunjangan LIKE ?" +
                " ORDER BY ? DESC";

        // Using PreparedStatement to avoid SQL injection
        try (PreparedStatement st = conn.prepareStatement(query)) {
            // Setting parameters
            for (int i = 1; i <= 15; i++) {
                st.setString(i, "%" + keyword + "%");
            }
            st.setString(16, "%" + sort + "%");

            // Executing the query
            try (ResultSet rs = st.executeQuery()) {
                // Add columns to the table model
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    model.addColumn(metaData.getColumnName(i));
                }

                // Add rows to the table model
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }
            }
        }

        return model;
    }

    public static DefaultTableModel notaAsc(Connection conn, String sort) throws SQLException {
        DefaultTableModel model = new DefaultTableModel();
    
        String query = "SELECT transaksi.*, nota.tanggal_transaksi ,nota.metode_pembelian\n" +
                "FROM transaksi\n" +
                "    JOIN nota\n" +
                "    ON transaksi.no_nota = nota.no_nota\n" +
                "ORDER BY " + sort;
    
        try (PreparedStatement st = conn.prepareStatement(query)) {
            // Executing the query
            try (ResultSet rs = st.executeQuery()) {
                // Add columns to the table model
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    model.addColumn(metaData.getColumnName(i));
                }
    
                // Add rows to the table model
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }
            }
        }
    
        return model;
    }
    

    public static DefaultTableModel notaDesc(Connection conn, String sort) throws SQLException {
        DefaultTableModel model = new DefaultTableModel();
    
        String query = "SELECT transaksi.*,  nota.tanggal_transaksi ,nota.metode_pembelian\n" +
                "FROM transaksi\n" +
                "    JOIN nota\n" +
                "    ON transaksi.no_nota = nota.no_nota\n" +
                "ORDER BY " + sort + " DESC";
    
        try (PreparedStatement st = conn.prepareStatement(query)) {
            // Executing the query
            try (ResultSet rs = st.executeQuery()) {
                // Add columns to the table model
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    model.addColumn(metaData.getColumnName(i));
                }
    
                // Add rows to the table model
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }
            }
        }
    
        return model;
    }
    

}