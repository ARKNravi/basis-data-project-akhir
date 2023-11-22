package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Connection.Konek;

public class coba {
    static String url = "jdbc:jtds:sqlserver://localhost:1433/project_basdat";
    static String userName = "sa";
    static String password = "berjuang99";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Connection conn = null;
        Konek konek = new Konek();
        try {
            conn = konek.getConnection(url, userName, password);

            // Create
            while(true) {
            System.out.print("Nama barang\t: ");
            String nama = in.nextLine();
            if(nama.equals("0"))break;

            System.out.print("Harga\t\t: ");
            int harga = in.nextInt();
            in.nextLine();
            CreateBarang.insertBarang(conn, nama, harga);
            }

            // baca barang
            Read.bacaBarang(conn);

            // // baca stok barang
            // Read.bacaStokBarang(conn);

            // // insert transaksi nota
            // int total_barang = 0;
            // int total_harga = 0;
            // while (true) {
            //     Read.bacaBarang(conn);

            //     System.out.print("Masukkan kode barang: ");
            //     String kode = in.next();
            //     if (kode.equals("0"))
            //         break;
            //     int kode_barang = Integer.parseInt(kode.replace('P', '0'));

            //     System.out.print("Pilih Ukuran(S,M,L,XL,XXL): ");
            //     String ukuran = in.next();

            //     System.out.print("Jumlah: ");
            //     int jumlah_barang = in.nextInt();

            //     if (total_barang == 0) {
            //         Create.insertNota(conn, 0, 0, "OF");
            //     }
            //     Create.insertTransaksi(conn, kode_barang, ukuran, jumlah_barang);
            //     total_barang += jumlah_barang;
            //     total_harga += Read.bacaHargaBarang(conn, kode_barang) * jumlah_barang;
            // }
            // System.out.print("""
            //         1. Offline\t(OF)
            //         2. Shopee\t(SP)
            //         3. Tokopedia\t(TP)
            //         Pilih metode pembayaran diatas: """);
            // String metode = in.next();

            // Statement st = conn.createStatement();
            // st.executeUpdate(
            //         String.format("UPDATE nota\n" + //
            //                 "SET total_barang = %d, total_harga = %d, metode_pembelian = '%s'\n" + //
            //                 "WHERE no_nota = %d;",
            //                 total_barang, total_harga, metode, Read.ambilNoNotaTerakhir(conn)));

            // // baca total belanjaan
            // Read.bacaTotalBelanja(conn, Read.ambilNoNotaTerakhir(conn));



            System.out.println("Enter the values for the following fields in data_pegawai:");
                System.out.print("nik: ");
                String nik = in.nextLine();
                
                System.out.print("nama: ");
                String nama = in.nextLine();
                System.out.print("pendidikan: ");
                String pendidikan = in.nextLine();
                System.out.print("tempat: ");
                String tempat = in.nextLine();
                System.out.print("tanggal_lahir (yyyy-mm-dd): ");
                String tanggal_lahir = in.nextLine();
                System.out.print("jenis_kelamin: ");
                String jenis_kelamin = in.nextLine();
                System.out.print("npwp: ");
                String npwp = in.nextLine();
                System.out.print("status_pernikahan: ");
                String status_pernikahan = in.nextLine();
                System.out.print("jumlah_anak: ");
                int jumlah_anak = Integer.parseInt(in.nextLine());
                System.out.print("nomor_rekening: ");
                String nomor_rekening = in.nextLine();
                System.out.print("alamat: ");
                String alamat = in.nextLine();

                
                System.out.println("Enter the values for the following fields in detail_pegawai:");
                System.out.print("kelas: ");
                int kelas = Integer.parseInt(in.nextLine());
                System.out.print("golongan: ");
                int golongan = Integer.parseInt(in.nextLine());
                System.out.print("status_pegawai: ");
                String status_pegawai = in.nextLine();
                System.out.print("total_cuti: ");
                int total_cuti = Integer.parseInt(in.nextLine());
                System.out.print("total_izin: ");
                int total_izin = Integer.parseInt(in.nextLine());
                
                CreateEmployee.tambahPegawai(conn, nik, nama, pendidikan, tempat, tanggal_lahir, jenis_kelamin, npwp,
                        status_pernikahan, jumlah_anak, nomor_rekening, alamat,kelas, golongan, status_pegawai, total_cuti, total_izin);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        in.close();
    }

    public Connection getConnection(String url, String userName, String passwd)

        throws SQLException, ClassNotFoundException {
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, userName, passwd);
        return conn;
    }
}
