package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Connection.SQLConnection;

public class UpdateStokBarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'kode_barang' of the item you want to update:");
        int kode_barang = scanner.nextInt();

        String checkKodeBarangSql = "SELECT COUNT(*) FROM barang WHERE kode_barang = ?";

        try (Connection con = SQLConnection.getConnection();
             PreparedStatement checkKodeBarangStmt = con.prepareStatement(checkKodeBarangSql)) {

            checkKodeBarangStmt.setInt(1, kode_barang);

            try (ResultSet rs = checkKodeBarangStmt.executeQuery()) {
                if (rs.next() && rs.getInt(1) > 0) {
                    String[] ukuran = { "S", "M", "L", "XL", "XXL" };
                    String[] platforms = { "offlen", "shopee", "tokopedia" };
                    String updateSql = "UPDATE stok_barang SET %s = ? WHERE kode_barang = ? AND ukuran = ?";

                    boolean exit = false;
                    while (!exit) {
                        for (int i = 0; i < ukuran.length; i++) {
                            for (int j = 0; j < platforms.length; j++) {
                                System.out.println(String.format("%d. %s %s", i * platforms.length + j + 1, platforms[j], ukuran[i]));
                            }
                        }
                        System.out.println(String.format("%d. Exit", ukuran.length * platforms.length + 1));

                        int choice = scanner.nextInt();
                        scanner.nextLine(); // consume newline left-over

                        if (choice == ukuran.length * platforms.length + 1) {
                            exit = true;
                            continue;
                        } else if (choice < 1 || choice > ukuran.length * platforms.length) {
                            System.out.println("Invalid choice");
                            continue;
                        }

                        int platformIndex = (choice - 1) % platforms.length;
                        int sizeIndex = (choice - 1) / platforms.length;

                        System.out.println("Enter the new stock for " + platforms[platformIndex] + " " + ukuran[sizeIndex] + ":");
                        int stock = scanner.nextInt();

                        try (PreparedStatement updateStmt = con.prepareStatement(String.format(updateSql, platforms[platformIndex]))) {
                            updateStmt.setInt(1, stock);
                            updateStmt.setInt(2, kode_barang);
                            updateStmt.setString(3, ukuran[sizeIndex]);

                            int rowAffected = updateStmt.executeUpdate();
                            System.out.println(String.format("Row affected %d", rowAffected));
                        }
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