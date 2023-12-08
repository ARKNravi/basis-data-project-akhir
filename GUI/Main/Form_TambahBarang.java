package Main; // Change the package from "Main" to "com.example"

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

import CRUD.CreateBarang;

import javax.swing.JOptionPane;

public class Form_TambahBarang extends javax.swing.JFrame {

    private javax.swing.JButton tambahBarangi_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_HargaSatuan;
    private javax.swing.JTextField txt_namaBarang;

    Connection conn;

    public Form_TambahBarang() {
        this.conn = conn;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_HargaSatuan = new javax.swing.JTextField();
        txt_namaBarang = new javax.swing.JTextField();
        tambahBarangi_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tambahBarangi_Button.setBackground(new java.awt.Color(13, 14, 69));
        tambahBarangi_Button.setFont(new java.awt.Font("Lato", 1, 14));
        tambahBarangi_Button.setForeground(new java.awt.Color(255, 255, 255));
        tambahBarangi_Button.setText("TAMBAH BARANG");
        tambahBarangi_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tambahBarangi_ButtonMousePressed(evt);
            }
        });
        tambahBarangi_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBarangi_ButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lato", 0, 16));
        jLabel2.setText("Nama Barang");

        jLabel3.setFont(new java.awt.Font("Lato", 0, 16));
        jLabel3.setText("Harga Satuan");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txt_namaBarang, GroupLayout.PREFERRED_SIZE, 451,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_HargaSatuan, GroupLayout.PREFERRED_SIZE, 451,
                                                                GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(63, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(tambahBarangi_Button, GroupLayout.PREFERRED_SIZE, 169,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_namaBarang, GroupLayout.PREFERRED_SIZE, 31,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(txt_HargaSatuan, GroupLayout.PREFERRED_SIZE, 31,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(tambahBarangi_Button, GroupLayout.PREFERRED_SIZE, 44,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    private void tambahBarangi_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Get the name and price from the text fields
        String barangName = txt_namaBarang.getText().trim();
        int barangPrice = Integer.parseInt(txt_HargaSatuan.getText().trim());

        // Check if name is empty or price is not a number
        if (barangName.isEmpty() || barangPrice <= 0) {
            JOptionPane.showMessageDialog(null, "Please enter a valid name and price.");
            return; // Exit the method if name or price is invalid
        }

        try {
            // Call the insertBarang method from the CreateBarang class to add new barang
            CreateBarang.insertBarang(conn, barangName, barangPrice);

            // Provide user feedback
            JOptionPane.showMessageDialog(null, "Barang baru berhasil ditambahkan!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to add new barang. Please check your inputs and try again.");
        }
    }

    private void tambahBarangi_ButtonMousePressed(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Barang baru berhasil ditambahkan!");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_TambahBarang().setVisible(true);
            }
        });
    }
}
