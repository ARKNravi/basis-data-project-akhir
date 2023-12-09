package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Connection.SQLConnection;

public class UpdateBarang {
    public static void updateBarang(String kode_barang, String nama_barang, String ukuran, String platform, Integer stok) throws SQLException {
        // Obtain the connection from SQLConnection class
        try (Connection conn = SQLConnection.getConnection()) {
            if (nama_barang != null && !nama_barang.isEmpty()) {
                String updateNamaSql = "UPDATE barang SET nama_barang = ? WHERE kode_barang = ?";
                try (PreparedStatement updateNamaStmt = conn.prepareStatement(updateNamaSql)) {
                    updateNamaStmt.setString(1, nama_barang);
                    updateNamaStmt.setString(2, kode_barang);
                    int rowAffected = updateNamaStmt.executeUpdate();
                    System.out.println(String.format("Row affected %d", rowAffected));
                }
            }

            if (ukuran != null && !ukuran.isEmpty() && platform != null && !platform.isEmpty() && stok != null) {
                String updateStokSql = "UPDATE stok_barang SET " + platform + " = ? WHERE kode_barang = ? AND ukuran = ?";
                try (PreparedStatement updateStokStmt = conn.prepareStatement(updateStokSql)) {
                    updateStokStmt.setInt(1, stok);
                    updateStokStmt.setString(2, kode_barang);
                    updateStokStmt.setString(3, ukuran);
                    int rowAffected = updateStokStmt.executeUpdate();
                    System.out.println(String.format("Row affected %d", rowAffected));
                }
            }
        }
    }
}