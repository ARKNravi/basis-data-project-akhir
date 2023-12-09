/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Main;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import CRUD.DeleteBarang;
import CRUD.ReadBarang;
import CRUD.UpdateBarang;
import Search.Search;

/**
 *
 * @author Bagas
 */
public class Form_Barang extends javax.swing.JPanel {

            private void loadTableData() {
        try {
            // Call the method from ReadBarang class to fetch data
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nama Barang");
            model.addColumn("Harga");
            model.addColumn("Total Stock");

            // Fetch data from barang table
            ReadBarang.bacaBarang(model);

            // Set the model to the JTable
            tableDataBarang.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception as needed
        }
    }
    

    /**
     * Creates new form Form_Barang
     */
    public Form_Barang(String os) {
        initComponents( os);
        
        
        tableDataBarang.getTableHeader().setFont(new Font("Lato", Font.PLAIN, 12));
        tableDataBarang.getTableHeader().setOpaque(false);
        tableDataBarang.getTableHeader().setForeground(new Color(0,0,0));
        tableDataBarang.setRowHeight(25);  
        loadTableData();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String os) {

        mainPanel = new javax.swing.JPanel();
        dataBarang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDataBarang = new javax.swing.JTable();
        tambahBarang_button = new javax.swing.JButton();
        txt_NoNota = new javax.swing.JTextField();
        button_search_barang = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        tambahBarang_button1 = new javax.swing.JButton();
        tambahBarang_button2 = new javax.swing.JButton();
        TambahBarang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        batal_button_simpan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        inputKodeBarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputNamaBarang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputJumlahBarang = new javax.swing.JTextField();
        ukuran_comboBox = new javax.swing.JComboBox<>();
        simpan_button1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Gudang_comboBox = new javax.swing.JComboBox<>();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        dataBarang.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 14, 69));
        jLabel1.setText("DATA BARANG");

        tableDataBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Ukuran", "Harga Barang", "Stok Barang"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDataBarang.setFocusable(false);
        tableDataBarang.setGridColor(new java.awt.Color(128, 128, 128));
        tableDataBarang.setRowHeight(25);
        tableDataBarang.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tableDataBarang.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableDataBarang.setShowHorizontalLines(true);
        tableDataBarang.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableDataBarang);

        tambahBarang_button.setBackground(new java.awt.Color(13, 14, 69));
        tambahBarang_button.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        tambahBarang_button.setForeground(new java.awt.Color(255, 255, 255));
        tambahBarang_button.setText("UPDATE STOK");
        tambahBarang_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBarang_buttonActionPerformed(evt);
            }
        });

        txt_NoNota.setText("Cari barang");
        txt_NoNota.setBorder(null);
        txt_NoNota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NoNotaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NoNotaFocusLost(evt);
            }
        });

        button_search_barang.setIcon(new javax.swing.ImageIcon("GUI"+os+"image_main"+os+"search (1).png")); // NOI18N
        button_search_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_search_barangMouseClicked(evt);
            }
        });

        tambahBarang_button1.setBackground(new java.awt.Color(13, 14, 69));
        tambahBarang_button1.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        tambahBarang_button1.setForeground(new java.awt.Color(255, 255, 255));
        tambahBarang_button1.setText("HAPUS");
        tambahBarang_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBarang_button1ActionPerformed(evt);
            }
        });

        tambahBarang_button2.setBackground(new java.awt.Color(13, 14, 69));
        tambahBarang_button2.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        tambahBarang_button2.setForeground(new java.awt.Color(255, 255, 255));
        tambahBarang_button2.setText("TAMBAH BARANG");
        tambahBarang_button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tambahBarang_button2MousePressed(evt);
            }
        });
        tambahBarang_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBarang_button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataBarangLayout = new javax.swing.GroupLayout(dataBarang);
        dataBarang.setLayout(dataBarangLayout);
        dataBarangLayout.setHorizontalGroup(
            dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarangLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1492, Short.MAX_VALUE)
                    .addGroup(dataBarangLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataBarangLayout.createSequentialGroup()
                        .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dataBarangLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1161, Short.MAX_VALUE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dataBarangLayout.createSequentialGroup()
                                .addComponent(tambahBarang_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tambahBarang_button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(tambahBarang_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_NoNota, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_search_barang)))
                .addGap(36, 36, 36))
        );
        dataBarangLayout.setVerticalGroup(
            dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarangLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataBarangLayout.createSequentialGroup()
                        .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_NoNota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_search_barang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tambahBarang_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tambahBarang_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tambahBarang_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        mainPanel.add(dataBarang, "card2");

        TambahBarang.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 14, 69));
        jLabel2.setText("DATA BARANG");

        batal_button_simpan.setBackground(new java.awt.Color(13, 14, 69));
        batal_button_simpan.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        batal_button_simpan.setForeground(new java.awt.Color(255, 255, 255));
        batal_button_simpan.setText("BATAL");
        batal_button_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batal_button_simpanActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel3.setText("Kode Barang");

        inputKodeBarang.setBackground(new java.awt.Color(245, 245, 245));
        inputKodeBarang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel4.setText("Nama Barang");

        inputNamaBarang.setBackground(new java.awt.Color(245, 245, 245));
        inputNamaBarang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel5.setText("Ukuran");

        jLabel6.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel6.setText("Jumlah Barang");

        inputJumlahBarang.setBackground(new java.awt.Color(245, 245, 245));
        inputJumlahBarang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ukuran_comboBox.setBackground(new java.awt.Color(245, 245, 245));
        ukuran_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XXL", "XL", "L", "M", "S" }));
        ukuran_comboBox.setBorder(null);

        simpan_button1.setBackground(new java.awt.Color(13, 14, 69));
        simpan_button1.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        simpan_button1.setForeground(new java.awt.Color(255, 255, 255));
        simpan_button1.setText("UPDATE");
        simpan_button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                simpan_button1MousePressed(evt);
            }
        });
        simpan_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_button1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KODE BARANG", "KOKIN15 T-SHIRT BRAWIJAYA UNIVERSITY WHITE", "KOKIN16 T-SHIRT BRAWIJAYA UNIVERSITY 1963 GRAY", "KOKIN18 T-SHIRT MESIN UB WHITE", "KOKIN17 T-SHIRT MESIN UB BLACK", "KOKIN28 T-SHIRT BRAWIJAYA UNIVERSITY NAVY", "KOHIN11 HOODIE UNIVERSITAS BRAWAIJAYA BLACK", "KOBOIN22 BASEBALL SHIRT UB WHITE", "KOKIN35 T-SHIRT BRAWIJAYA ARMY" }));
        jComboBox1.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel7.setText("Gudang");

        Gudang_comboBox.setBackground(new java.awt.Color(245, 245, 245));
        Gudang_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Offlen", "Shopee", "Tokopedia" }));
        Gudang_comboBox.setBorder(null);

        javax.swing.GroupLayout TambahBarangLayout = new javax.swing.GroupLayout(TambahBarang);
        TambahBarang.setLayout(TambahBarangLayout);
        TambahBarangLayout.setHorizontalGroup(
            TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahBarangLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TambahBarangLayout.createSequentialGroup()
                        .addGroup(TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TambahBarangLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(TambahBarangLayout.createSequentialGroup()
                        .addGroup(TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(TambahBarangLayout.createSequentialGroup()
                                .addComponent(simpan_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(batal_button_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(inputKodeBarang)
                            .addComponent(inputNamaBarang)
                            .addComponent(ukuran_comboBox, 0, 1223, Short.MAX_VALUE)
                            .addGroup(TambahBarangLayout.createSequentialGroup()
                                .addGroup(TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(inputJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(Gudang_comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(313, 313, 313))))
        );
        TambahBarangLayout.setVerticalGroup(
            TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahBarangLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batal_button_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpan_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TambahBarangLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ukuran_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TambahBarangLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Gudang_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(404, Short.MAX_VALUE))
        );

        mainPanel.add(TambahBarang, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void batal_button_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batal_button_simpanActionPerformed
        // Berfungsi untuk kembali ke form utama 
       mainPanel.removeAll();
       mainPanel.repaint();
       mainPanel.revalidate();
       
       mainPanel.add(dataBarang);
       mainPanel.repaint();
       mainPanel.revalidate();
    }//GEN-LAST:event_batal_button_simpanActionPerformed

    private void simpan_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_button1ActionPerformed
        // Kode buat update data barang ke database stok barang
    }//GEN-LAST:event_simpan_button1ActionPerformed

    private void tambahBarang_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBarang_buttonActionPerformed
        //Menampilkan form baru untuk menambah/update barang
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(TambahBarang);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_tambahBarang_buttonActionPerformed

    private void txt_NoNotaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NoNotaFocusGained
        //Ketika txt_NoNota di pilih, text default akan hilang
        String NoNota = txt_NoNota.getText();
        if(NoNota.equals("Cari No Nota")) {
            txt_NoNota.setText("");
        }
    }//GEN-LAST:event_txt_NoNotaFocusGained

    private void txt_NoNotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NoNotaFocusLost
        // Ketika txt_NoNota tidak dipilih dan kosong, text default akan muncul kembali
        String NoNota = txt_NoNota.getText();
        if(NoNota.equals("")||NoNota.equals("Password")) {
            txt_NoNota.setText("Password");
        }
    }//GEN-LAST:event_txt_NoNotaFocusLost

private void button_search_barangMouseClicked(java.awt.event.MouseEvent evt) {
    // Get the keyword from a JTextField (replace "yourTextField" with the actual variable name)
    String keyword = txt_NoNota.getText().trim();

    // Check if keyword is empty
    if (keyword.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a keyword for searching.");
        return; // Exit the method if keyword is invalid
    }

    try {
        // Call the barang method from the Search class to search for items
        DefaultTableModel model = Search.barang(keyword);

        // Update the table with search results
        tableDataBarang.setModel(model);

        // Provide user feedback
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No items found with keyword: " + keyword);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to search for items. Please check your inputs and try again.");
    }
}


private void simpan_button1MousePressed(java.awt.event.MouseEvent evt) {
    // Get the values from the text fields and combo box
    String kodeBarang = inputKodeBarang.getText().trim();
    String namaBarang = inputNamaBarang.getText().trim();
    String jumlahBarang = inputJumlahBarang.getText().trim();
    String ukuranBarang = ukuran_comboBox.getSelectedItem().toString();
    String gudang = Gudang_comboBox.getSelectedItem().toString();

    // Check if kodeBarang is empty
    if (kodeBarang.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a valid 'kode_barang'.");
        return; // Exit the method if kodeBarang is empty
    }

    Integer stok = null;
    if (!jumlahBarang.isEmpty()) {
        try {
            stok = Integer.parseInt(jumlahBarang);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number format for 'harga'.");
            return; // Exit the method if jumlahBarang is not a valid number
        }
    }

    try {
        // Call the updateBarang method from the UpdateBarang class to update the barang
        UpdateBarang.updateBarang(kodeBarang, namaBarang.isEmpty() ? null : namaBarang, ukuranBarang, gudang, stok);

        // Provide user feedback
        JOptionPane.showMessageDialog(null, "Data barang berhasil di update!");
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to update barang. Please check your inputs and try again.");
    }
}


private void tambahBarang_button1ActionPerformed(java.awt.event.ActionEvent evt) {
    // Get the selected row index
    int selectedRowIndex = tableDataBarang.getSelectedRow();

    if (selectedRowIndex != -1) {
        // Get the 'kode_barang' of the selected row
        String kodeBarang = tableDataBarang.getValueAt(selectedRowIndex, 0).toString();

        // Remove the first character 'P' from the kodeBarang
        String realId = kodeBarang.substring(1);

        try {
            // Call the deleteBarang method from the DeleteBarang class to delete the barang
            DeleteBarang.deleteBarang(realId);

            // Provide user feedback
            JOptionPane.showMessageDialog(null, "Data barang berhasil dihapus!");

            // Remove the selected row from the table
            ((DefaultTableModel) tableDataBarang.getModel()).removeRow(selectedRowIndex);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to delete barang. Please try again.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a row to delete.");
    }
}



    private void tambahBarang_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBarang_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahBarang_button2ActionPerformed

    private void tambahBarang_button2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahBarang_button2MousePressed
        // TODO add your handling code here:
        Form_TambahBarang tambahBarang = new Form_TambahBarang();
        tambahBarang.setVisible(true);
        tambahBarang.pack();
        tambahBarang.setLocationRelativeTo(null);
        tambahBarang.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_tambahBarang_button2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Gudang_comboBox;
    private javax.swing.JPanel TambahBarang;
    private javax.swing.JButton batal_button_simpan;
    private javax.swing.JLabel button_search_barang;
    private javax.swing.JPanel dataBarang;
    private javax.swing.JTextField inputJumlahBarang;
    private javax.swing.JTextField inputKodeBarang;
    private javax.swing.JTextField inputNamaBarang;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton simpan_button1;
    private javax.swing.JTable tableDataBarang;
    private javax.swing.JButton tambahBarang_button;
    private javax.swing.JButton tambahBarang_button1;
    private javax.swing.JButton tambahBarang_button2;
    private javax.swing.JTextField txt_NoNota;
    private javax.swing.JComboBox<String> ukuran_comboBox;
    // End of variables declaration//GEN-END:variables
}