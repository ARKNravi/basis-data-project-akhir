package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Connection.SQLConnection;

public class UpdateBarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'kode_barang' of the item you want to update:");
        String kode_barang = scanner.nextLine();

        String checkSql = "SELECT COUNT(*) FROM barang WHERE kode_barang = ?";

        try (Connection con = SQLConnection.getConnection();
             PreparedStatement checkStmt = con.prepareStatement(checkSql)) {

            checkStmt.setString(1, kode_barang);

            try (ResultSet rs = checkStmt.executeQuery()) {
                if (rs.next() && rs.getInt(1) > 0) {
                    System.out.println("What do you want to update?");
                    System.out.println("1. nama_barang");
                    System.out.println("2. harga");
                    System.out.println("3. Both");
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // consume newline left-over
                    String nama_barang = null;
                    Integer harga = null;

                    switch (choice) {
                        case 1:
                            System.out.println("Enter the new 'nama_barang':");
                            nama_barang = scanner.nextLine();
                            break;
                        case 2:
                            System.out.println("Enter the new 'harga':");
                            harga = scanner.nextInt();
                            break;
                        case 3:
                            System.out.println("Enter the new 'nama_barang':");
                            nama_barang = scanner.nextLine();
                            System.out.println("Enter the new 'harga':");
                            harga = scanner.nextInt();
                            break;
                        default:
                            System.out.println("Invalid choice");
                            return;
                    }

                    String updateSql = "UPDATE barang SET nama_barang = ?, harga = ? WHERE kode_barang = ?";
                    if (nama_barang == null) {
                        updateSql = "UPDATE barang SET harga = ? WHERE kode_barang = ?";
                    } else if (harga == null) {
                        updateSql = "UPDATE barang SET nama_barang = ? WHERE kode_barang = ?";
                    }

                    try (PreparedStatement updateStmt = con.prepareStatement(updateSql)) {
                        if (nama_barang != null) {
                            updateStmt.setString(1, nama_barang);
                        }
                        if (harga != null) {
                            updateStmt.setInt(nama_barang == null ? 1 : 2, harga);
                        }
                        updateStmt.setString(nama_barang == null && harga == null ? 1 : 2, kode_barang);                        

                        int rowAffected = updateStmt.executeUpdate();
                        System.out.println(String.format("Row affected %d", rowAffected));
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
