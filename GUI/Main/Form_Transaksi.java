package Main;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import CRUD.ReadTransaksi;
import Connection.SQLConnection;
import Search.Search;

public class Form_Transaksi extends javax.swing.JPanel {

        private void setTransactionsTableModel() {
        DefaultTableModel model = ReadTransaksi.getTransactionsTableModel();
        tableDataTransaksi.setModel(model);
    }
    

    /**
     * Creates new form Form_Transaksi
     */
    public Form_Transaksi() {
        initComponents();
        
        tableDataTransaksi.getTableHeader().setFont(new Font("Lato", Font.PLAIN, 12));
        tableDataTransaksi.getTableHeader().setOpaque(false);
        tableDataTransaksi.getTableHeader().setForeground(new Color(0,0,0));
        tableDataTransaksi.setRowHeight(25);  
        setTransactionsTableModel();
    }
    
        
    void cleanTextField() {
        txt_NoNota.setText("Cari No Nota");
     
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        riwayatTransaksi = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDataTransaksi = new javax.swing.JTable();
        TransaksiBaru_button = new javax.swing.JButton();
        button_search = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txt_NoNota = new javax.swing.JTextField();
        transaksiBaru = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        tambahTransaksi_button = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        inputJumlahBarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ukuran_comboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        inputNamaBarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputKodeBarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ukuran_comboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        HitungTotal_button = new javax.swing.JButton();
        batal_button = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        batal_button1 = new javax.swing.JButton();
        TOTALHARGA = new javax.swing.JTextField();
        hapusBarangNota_button2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        riwayatTransaksi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 14, 69));
        jLabel2.setText("RIWAYAT TRANSAKSI");

        tableDataTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No Nota", "Kode Barang", "Ukuran", "Jumlah ", "Total Harga", "Tanggal Transaksi", "Metode Pembelian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDataTransaksi.setFocusable(false);
        tableDataTransaksi.setGridColor(new java.awt.Color(0, 0, 0));
        tableDataTransaksi.setRowHeight(25);
        tableDataTransaksi.setSelectionBackground(new java.awt.Color(128, 128, 128));
        tableDataTransaksi.setShowGrid(false);
        jScrollPane2.setViewportView(tableDataTransaksi);

        TransaksiBaru_button.setBackground(new java.awt.Color(13, 14, 69));
        TransaksiBaru_button.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        TransaksiBaru_button.setForeground(new java.awt.Color(255, 255, 255));
        TransaksiBaru_button.setText("TRANSAKSI BARU");
        TransaksiBaru_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiBaru_buttonActionPerformed(evt);
            }
        });

        button_search.setIcon(new javax.swing.ImageIcon("C:\\Recovery\\Project\\basis-data-project-akhir\\GUI\\image_main\\search (1).png")); // NOI18N

        txt_NoNota.setText("Cari No Nota");
        txt_NoNota.setBorder(null);
        txt_NoNota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NoNotaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NoNotaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout riwayatTransaksiLayout = new javax.swing.GroupLayout(riwayatTransaksi);
        riwayatTransaksi.setLayout(riwayatTransaksiLayout);
        riwayatTransaksiLayout.setHorizontalGroup(
            riwayatTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riwayatTransaksiLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(riwayatTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(riwayatTransaksiLayout.createSequentialGroup()
                        .addGroup(riwayatTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(TransaksiBaru_button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(1270, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, riwayatTransaksiLayout.createSequentialGroup()
                        .addGroup(riwayatTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(riwayatTransaksiLayout.createSequentialGroup()
                                .addGap(0, 1266, Short.MAX_VALUE)
                                .addGroup(riwayatTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_NoNota, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_search)))
                        .addGap(36, 36, 36))))
        );
        riwayatTransaksiLayout.setVerticalGroup(
            riwayatTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riwayatTransaksiLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(riwayatTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_NoNota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TransaksiBaru_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        mainPanel.add(riwayatTransaksi, "card2");

        transaksiBaru.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 14, 69));
        jLabel3.setText("RIWAYAT TRANSAKSI");

        tambahTransaksi_button.setBackground(new java.awt.Color(13, 14, 69));
        tambahTransaksi_button.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        tambahTransaksi_button.setForeground(new java.awt.Color(255, 255, 255));
        tambahTransaksi_button.setText("TAMBAH TRANSAKSI");
        tambahTransaksi_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahTransaksi_buttonActionPerformed(evt);
            }
        });

        inputJumlahBarang.setBackground(new java.awt.Color(245, 245, 245));
        inputJumlahBarang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel6.setText("Jumlah Barang");

        ukuran_comboBox.setBackground(new java.awt.Color(245, 245, 245));
        ukuran_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XXL", "XL", "L", "M", "S" }));
        ukuran_comboBox.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel5.setText("Ukuran");

        inputNamaBarang.setBackground(new java.awt.Color(245, 245, 245));
        inputNamaBarang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel4.setText("Kode Barang");

        inputKodeBarang.setBackground(new java.awt.Color(245, 245, 245));
        inputKodeBarang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel7.setText("No Nota");

        ukuran_comboBox2.setBackground(new java.awt.Color(245, 245, 245));
        ukuran_comboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Offline", "Shopee", "Tokopedia" }));
        ukuran_comboBox2.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel9.setText("Metode Pembayaran");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Ukuran", "Jumlah", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        HitungTotal_button.setBackground(new java.awt.Color(13, 14, 69));
        HitungTotal_button.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        HitungTotal_button.setForeground(new java.awt.Color(255, 255, 255));
        HitungTotal_button.setText("HITUNG TOTAL");
        HitungTotal_button.setToolTipText("");
        HitungTotal_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungTotal_buttonActionPerformed(evt);
            }
        });

        batal_button.setBackground(new java.awt.Color(13, 14, 69));
        batal_button.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        batal_button.setForeground(new java.awt.Color(255, 255, 255));
        batal_button.setText("BATAL");
        batal_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batal_buttonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel8.setText("Nota");

        batal_button1.setBackground(new java.awt.Color(13, 14, 69));
        batal_button1.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        batal_button1.setForeground(new java.awt.Color(255, 255, 255));
        batal_button1.setText("TAMBAH BARANG");
        batal_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batal_button1ActionPerformed(evt);
            }
        });

        TOTALHARGA.setToolTipText("");

        hapusBarangNota_button2.setBackground(new java.awt.Color(13, 14, 69));
        hapusBarangNota_button2.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        hapusBarangNota_button2.setForeground(new java.awt.Color(255, 255, 255));
        hapusBarangNota_button2.setText("HAPUS BARANG");
        hapusBarangNota_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBarangNota_button2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel1.setText("Total Yang Harus Dibayar");

        javax.swing.GroupLayout transaksiBaruLayout = new javax.swing.GroupLayout(transaksiBaru);
        transaksiBaru.setLayout(transaksiBaruLayout);
        transaksiBaruLayout.setHorizontalGroup(
            transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiBaruLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transaksiBaruLayout.createSequentialGroup()
                        .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(transaksiBaruLayout.createSequentialGroup()
                                .addComponent(tambahTransaksi_button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(batal_button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(transaksiBaruLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(828, 828, 828)
                                .addComponent(jLabel8)))
                        .addContainerGap(265, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transaksiBaruLayout.createSequentialGroup()
                        .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transaksiBaruLayout.createSequentialGroup()
                                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(inputJumlahBarang, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ukuran_comboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputNamaBarang, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputKodeBarang, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ukuran_comboBox2, 0, 762, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(transaksiBaruLayout.createSequentialGroup()
                                        .addComponent(batal_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(hapusBarangNota_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(HitungTotal_button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transaksiBaruLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TOTALHARGA, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(174, 174, 174))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transaksiBaruLayout.createSequentialGroup()
                .addContainerGap(1233, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        transaksiBaruLayout.setVerticalGroup(
            transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiBaruLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahTransaksi_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batal_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(transaksiBaruLayout.createSequentialGroup()
                        .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(transaksiBaruLayout.createSequentialGroup()
                                .addComponent(inputKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ukuran_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ukuran_comboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(batal_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hapusBarangNota_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HitungTotal_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TOTALHARGA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(transaksiBaru, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void TransaksiBaru_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiBaru_buttonActionPerformed
       mainPanel.removeAll();
       mainPanel.repaint();
       mainPanel.revalidate();
       
       mainPanel.add(transaksiBaru);
       mainPanel.repaint();
       mainPanel.revalidate();
    }//GEN-LAST:event_TransaksiBaru_buttonActionPerformed

    private void tambahTransaksi_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahTransaksi_buttonActionPerformed
        // Button buat tambah transaski ke dalam riwayat
    }//GEN-LAST:event_tambahTransaksi_buttonActionPerformed

    private void HitungTotal_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungTotal_buttonActionPerformed
        // button buat update nota, supaya bisa liat harga total sementara
    }//GEN-LAST:event_HitungTotal_buttonActionPerformed

    private void batal_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batal_buttonActionPerformed
       mainPanel.removeAll();
       mainPanel.repaint();
       mainPanel.revalidate();
       
       mainPanel.add(riwayatTransaksi);
       mainPanel.repaint();
       mainPanel.revalidate();
    }//GEN-LAST:event_batal_buttonActionPerformed

    private void txt_NoNotaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NoNotaFocusGained
        // TODO add your handling code here:
        String NoNota = txt_NoNota.getText();
        if(NoNota.equals("Cari No Nota")) {
            txt_NoNota.setText("");
        }
    }//GEN-LAST:event_txt_NoNotaFocusGained

    private void txt_NoNotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NoNotaFocusLost
        // TODO add your handling code here:
        String NoNota = txt_NoNota.getText();
        if(NoNota.equals("")||NoNota.equals("Password")) {
            txt_NoNota.setText("Password");
        }
    }//GEN-LAST:event_txt_NoNotaFocusLost

    private void batal_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batal_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batal_button1ActionPerformed

    private void hapusBarangNota_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBarangNota_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusBarangNota_button2ActionPerformed

    private void button_searchMousePressed(java.awt.event.ActionEvent evt) throws SQLException {
        String keyword = txt_NoNota.getText();
        ResultSet rs = Search.nota(keyword);
        try (Connection connection = SQLConnection.getConnection()) {
            // Call the pegawai method from the Search class to search for employees
            ResultSet resultSet = Search.nota(keyword);
    
            // Update the table with search results
            DefaultTableModel model = new DefaultTableModel();
            tableDataTransaksi.setModel(model);
    
            // Add columns to the table model
            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                model.addColumn(resultSet.getMetaData().getColumnName(i));
            }
    
            // Add rows to the table model
            while (resultSet.next()) {
                Object[] row = new Object[resultSet.getMetaData().getColumnCount()];
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to search for employee. Please check your inputs and try again.");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HitungTotal_button;
    private javax.swing.JTextField TOTALHARGA;
    private javax.swing.JButton TransaksiBaru_button;
    private javax.swing.JButton batal_button;
    private javax.swing.JButton batal_button1;
    private javax.swing.JLabel button_search;
    private javax.swing.JButton hapusBarangNota_button2;
    private javax.swing.JTextField inputJumlahBarang;
    private javax.swing.JTextField inputKodeBarang;
    private javax.swing.JTextField inputNamaBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel riwayatTransaksi;
    private javax.swing.JTable tableDataTransaksi;
    private javax.swing.JButton tambahTransaksi_button;
    private javax.swing.JPanel transaksiBaru;
    private javax.swing.JTextField txt_NoNota;
    private javax.swing.JComboBox<String> ukuran_comboBox;
    private javax.swing.JComboBox<String> ukuran_comboBox2;
}