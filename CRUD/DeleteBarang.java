package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Connection.SQLConnection;

public class DeleteBarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'kode_barang' of the item you want to delete:");
        String kode_barang = scanner.nextLine();

        String checkKodeBarangSql = "SELECT COUNT(*) FROM barang WHERE kode_barang = ?";

        try (Connection con = SQLConnection.getConnection();
             PreparedStatement checkKodeBarangStmt = con.prepareStatement(checkKodeBarangSql)) {

            checkKodeBarangStmt.setString(1, kode_barang);

            try (ResultSet rs = checkKodeBarangStmt.executeQuery()) {
                if (rs.next() && rs.getInt(1) > 0) {
                    String deleteStokBarangSql = "DELETE FROM stok_barang WHERE kode_barang = ?";
                    String deleteBarangSql = "DELETE FROM barang WHERE kode_barang = ?";

                    try (PreparedStatement deleteStokBarangStmt = con.prepareStatement(deleteStokBarangSql)) {
                        deleteStokBarangStmt.setString(1, kode_barang);

                        int rowAffected = deleteStokBarangStmt.executeUpdate();
                        System.out.println(String.format("Row affected in 'stok_barang' table %d", rowAffected));
                    }

                    try (PreparedStatement deleteBarangStmt = con.prepareStatement(deleteBarangSql)) {
                        deleteBarangStmt.setString(1, kode_barang);

                        int rowAffected = deleteBarangStmt.executeUpdate();
                        System.out.println(String.format("Row affected in 'barang' table %d", rowAffected));
                    }
                } else {
                    System.out.println("No item found with the provided 'kode_barang'.");
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
