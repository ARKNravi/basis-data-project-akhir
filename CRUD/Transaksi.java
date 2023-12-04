package CRUD;

import Connection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transaksi {
    private Connection connection;

    public Transaksi() {
        try {
            this.connection = SQLConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTransaksi(int no_nota, int kode_barang, String ukuran, int jumlah_barang, int total_harga_barang) {
        String query = "IF EXISTS (SELECT * FROM transaksi WHERE no_nota = ? AND kode_barang = ? AND ukuran = ?) " +
                       "UPDATE transaksi SET jumlah_barang = jumlah_barang + ? WHERE no_nota = ? AND kode_barang = ? AND ukuran = ? " +
                       "ELSE " +
                       "INSERT INTO transaksi (no_nota, kode_barang, ukuran, jumlah_barang, total_harga_barang) VALUES (?, ?, ?, ?, ?)";
    
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, no_nota);
            preparedStatement.setInt(2, kode_barang);
            preparedStatement.setString(3, ukuran);
            preparedStatement.setInt(4, jumlah_barang);
            preparedStatement.setInt(5, no_nota);
            preparedStatement.setInt(6, kode_barang);
            preparedStatement.setString(7, ukuran);
            preparedStatement.setInt(8, no_nota);
            preparedStatement.setInt(9, kode_barang);
            preparedStatement.setString(10, ukuran);
            preparedStatement.setInt(11, jumlah_barang);
            preparedStatement.setInt(12, total_harga_barang);
    
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

public int createNota(int total_barang, int total_harga, String kode_metode) {
    String query = "INSERT INTO nota (total_barang, total_harga, metode_pembelian) OUTPUT INSERTED.no_nota VALUES (?, ?, ?)";
    int no_nota = 0;

    try {
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, total_barang);
        preparedStatement.setInt(2, total_harga);
        preparedStatement.setString(3, kode_metode);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            no_nota = resultSet.getInt(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return no_nota;
}

    

}
