package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Connection.SQLConnection;

public class InsertBarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the new 'kode_barang':");
        String kode_barang = scanner.nextLine();
        System.out.println("Enter the new 'nama_barang':");
        String nama_barang = scanner.nextLine();
        System.out.println("Enter the new 'harga':");
        int harga = scanner.nextInt();

        String insertBarangSql = "INSERT INTO barang(kode_barang, nama_barang, harga) VALUES(?, ?, ?)";
        String insertStokBarangSql = "INSERT INTO stok_barang(kode_barang, ukuran, offlen, shopee, tokopedia) VALUES(?, ?, 0, 0, 0)";
        String[] ukuran = { "S", "M", "L", "XL", "XXL" };

        try (Connection con = SQLConnection.getConnection();
             PreparedStatement insertBarangStmt = con.prepareStatement(insertBarangSql)) {

            insertBarangStmt.setString(1, kode_barang);
            insertBarangStmt.setString(2, nama_barang);
            insertBarangStmt.setInt(3, harga);

            int rowAffected = insertBarangStmt.executeUpdate();
            System.out.println(String.format("Row affected in 'barang' table %d", rowAffected));

            try (PreparedStatement insertStokBarangStmt = con.prepareStatement(insertStokBarangSql)) {
                for (String size : ukuran) {
                    insertStokBarangStmt.setString(1, kode_barang);
                    insertStokBarangStmt.setString(2, size);

                    rowAffected = insertStokBarangStmt.executeUpdate();
                    System.out.println(String.format("Row affected in 'stok_barang' table for size '%s' %d", size, rowAffected));
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
