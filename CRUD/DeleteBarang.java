package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.SQLConnection;

public class DeleteBarang {
    public static void deleteBarang(String kode_barang) throws SQLException {
        // Obtain the connection from SQLConnection class
        try (Connection conn = SQLConnection.getConnection()) {
            String checkKodeBarangSql = "SELECT COUNT(*) FROM barang WHERE kode_barang = ?";

            try (PreparedStatement checkKodeBarangStmt = conn.prepareStatement(checkKodeBarangSql)) {
                checkKodeBarangStmt.setString(1, kode_barang);

                try (ResultSet rs = checkKodeBarangStmt.executeQuery()) {
                    if (rs.next() && rs.getInt(1) > 0) {
                        String deleteStokBarangSql = "DELETE FROM stok_barang WHERE kode_barang = ?";
                        String deleteBarangSql = "DELETE FROM barang WHERE kode_barang = ?";

                        try (PreparedStatement deleteStokBarangStmt = conn.prepareStatement(deleteStokBarangSql)) {
                            deleteStokBarangStmt.setString(1, kode_barang);
                            deleteStokBarangStmt.executeUpdate();
                        }

                        try (PreparedStatement deleteBarangStmt = conn.prepareStatement(deleteBarangSql)) {
                            deleteBarangStmt.setString(1, kode_barang);
                            deleteBarangStmt.executeUpdate();
                        }
                    } else {
                        System.out.println("No item found with the provided 'kode_barang'.");
                    }
                }
            }
        }
    }
}