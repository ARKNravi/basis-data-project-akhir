package Main; // Change the package from "Main" to "com.example"

import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.JOptionPane;

public class Form_TambahBarang extends javax.swing.JFrame {

    private javax.swing.JButton tambahBarangi_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_HargaSatuan;
    private javax.swing.JTextField txt_KodeBarang;
    private javax.swing.JTextField txt_namaBarang;

    public Form_TambahBarang() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_KodeBarang = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Lato", 0, 16));
        jLabel1.setText("Kode Barang");

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
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txt_KodeBarang, GroupLayout.PREFERRED_SIZE, 451, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_namaBarang, GroupLayout.PREFERRED_SIZE, 451, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_HargaSatuan, GroupLayout.PREFERRED_SIZE, 451, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tambahBarangi_Button, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_KodeBarang, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_namaBarang, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(txt_HargaSatuan, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(tambahBarangi_Button, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void tambahBarangi_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Your code for the button action
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
