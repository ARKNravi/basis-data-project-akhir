package Main;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Bagas
 */
public class Form_Pegawai extends javax.swing.JPanel {

    /**
     * Creates new form Form_Pegawai
     */
    public Form_Pegawai() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        riwayatTransaksi = new javax.swing.JPanel();
        transaksiBaru = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        tambahPegawai_Button = new javax.swing.JButton();
        cariPegawai_Button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        namaLenkapField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        status_comboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        TanggalLahirField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NPWPField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JumlahAnakField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        NoRekeningField = new javax.swing.JTextField();
        AlamatField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        NIPField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        PerjanjianField = new javax.swing.JTextField();
        Pendidikan_comboBOX = new javax.swing.JComboBox<>();
        Grade_ComnoBox = new javax.swing.JComboBox<>();
        JenisKelamin_comboBox = new javax.swing.JComboBox<>();
        Golongan_ComboBox = new javax.swing.JComboBox<>();
        NIKField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDataTransaksi = new javax.swing.JTable();
        pecatPegawai_button = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        riwayatTransaksi.setBackground(new java.awt.Color(255, 255, 255));

        transaksiBaru.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 14, 69));
        jLabel3.setText("DATA PEGAWAI");

        tambahPegawai_Button.setBackground(new java.awt.Color(13, 14, 69));
        tambahPegawai_Button.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        tambahPegawai_Button.setForeground(new java.awt.Color(255, 255, 255));
        tambahPegawai_Button.setText("TAMBAH PEGAWAI");
        tambahPegawai_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahPegawai_ButtonActionPerformed(evt);
            }
        });

        cariPegawai_Button.setBackground(new java.awt.Color(13, 14, 69));
        cariPegawai_Button.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        cariPegawai_Button.setForeground(new java.awt.Color(255, 255, 255));
        cariPegawai_Button.setText("CARI PEGAWAI");
        cariPegawai_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariPegawai_ButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel5.setText("Nama Lengkap");

        namaLenkapField.setBackground(new java.awt.Color(245, 245, 245));
        namaLenkapField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        namaLenkapField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaLenkapFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel6.setText("Penddikan");

        status_comboBox.setBackground(new java.awt.Color(245, 245, 245));
        status_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LAJANG", "MENIKAH" }));
        status_comboBox.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel7.setText("Tempat Tanggal Lahir");

        TanggalLahirField.setBackground(new java.awt.Color(245, 245, 245));
        TanggalLahirField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel8.setText("Jenis Kelamin");

        jLabel9.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel9.setText("NPWP");

        NPWPField.setBackground(new java.awt.Color(245, 245, 245));
        NPWPField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel10.setText("Status");

        jLabel11.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel11.setText("Jumlah Anak");

        JumlahAnakField.setBackground(new java.awt.Color(245, 245, 245));
        JumlahAnakField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel12.setText("No Rekening");

        NoRekeningField.setBackground(new java.awt.Color(245, 245, 245));
        NoRekeningField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AlamatField.setBackground(new java.awt.Color(245, 245, 245));
        AlamatField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel13.setText("Alamat");

        jLabel14.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel14.setText("Grade");

        jLabel15.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel15.setText("Golongan");

        NIPField.setBackground(new java.awt.Color(245, 245, 245));
        NIPField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel16.setText("NIP/NRK");

        jLabel17.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jLabel17.setText("Perjanjian");

        PerjanjianField.setBackground(new java.awt.Color(245, 245, 245));
        PerjanjianField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Pendidikan_comboBOX.setBackground(new java.awt.Color(245, 245, 245));
        Pendidikan_comboBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SD", "SMP", "SMA/SMK", "S1/SEDEJARAT", "S2/SEDERAJAT", "S3/SEDERAJAT" }));
        Pendidikan_comboBOX.setBorder(null);

        Grade_ComnoBox.setBackground(new java.awt.Color(245, 245, 245));
        Grade_ComnoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV", "V", "VI", "VII" }));
        Grade_ComnoBox.setBorder(null);

        JenisKelamin_comboBox.setBackground(new java.awt.Color(245, 245, 245));
        JenisKelamin_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LAKI-LAKI", "PEREMPUAN" }));
        JenisKelamin_comboBox.setBorder(null);

        Golongan_ComboBox.setBackground(new java.awt.Color(245, 245, 245));
        Golongan_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));
        Golongan_ComboBox.setBorder(null);

        NIKField.setBackground(new java.awt.Color(245, 245, 245));
        NIKField.setText("NIK");
        NIKField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NIKField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIKFieldActionPerformed(evt);
            }
        });

        tableDataTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIK", "Nama Lengkap", "Pendidikan", "TTL", "Jenis Kelamin", "NPWP", "No Rekening", "Jumlah Anak", "Alamat", "Grade", "Golongan", "NIP/NRK", "Perjanjian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableDataTransaksi);

        pecatPegawai_button.setBackground(new java.awt.Color(13, 14, 69));
        pecatPegawai_button.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        pecatPegawai_button.setForeground(new java.awt.Color(255, 255, 255));
        pecatPegawai_button.setText("PECAT PEGAWAI");
        pecatPegawai_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pecatPegawai_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transaksiBaruLayout = new javax.swing.GroupLayout(transaksiBaru);
        transaksiBaru.setLayout(transaksiBaruLayout);
        transaksiBaruLayout.setHorizontalGroup(
            transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiBaruLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transaksiBaruLayout.createSequentialGroup()
                        .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(transaksiBaruLayout.createSequentialGroup()
                                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(transaksiBaruLayout.createSequentialGroup()
                                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(status_comboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JenisKelamin_comboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Pendidikan_comboBOX, javax.swing.GroupLayout.Alignment.LEADING, 0, 286, Short.MAX_VALUE)
                                    .addComponent(NoRekeningField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JumlahAnakField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NPWPField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TanggalLahirField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaLenkapField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(transaksiBaruLayout.createSequentialGroup()
                        .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NIKField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, transaksiBaruLayout.createSequentialGroup()
                                    .addComponent(tambahPegawai_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pecatPegawai_button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cariPegawai_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(transaksiBaruLayout.createSequentialGroup()
                                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGap(209, 209, 209)
                                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Golongan_ComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Grade_ComnoBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PerjanjianField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NIPField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AlamatField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        transaksiBaruLayout.setVerticalGroup(
            transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiBaruLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NIKField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pecatPegawai_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cariPegawai_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahPegawai_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(transaksiBaruLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaLenkapField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pendidikan_comboBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TanggalLahirField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JenisKelamin_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPWPField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transaksiBaruLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlamatField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Grade_ComnoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(transaksiBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(transaksiBaruLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(PerjanjianField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(transaksiBaruLayout.createSequentialGroup()
                                .addComponent(Golongan_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NIPField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)))))
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JumlahAnakField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoRekeningField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout riwayatTransaksiLayout = new javax.swing.GroupLayout(riwayatTransaksi);
        riwayatTransaksi.setLayout(riwayatTransaksiLayout);
        riwayatTransaksiLayout.setHorizontalGroup(
            riwayatTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riwayatTransaksiLayout.createSequentialGroup()
                .addComponent(transaksiBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        riwayatTransaksiLayout.setVerticalGroup(
            riwayatTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, riwayatTransaksiLayout.createSequentialGroup()
                .addComponent(transaksiBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(riwayatTransaksi, "card2");

        jPanel1.add(mainPanel, "card2");

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void pecatPegawai_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pecatPegawai_buttonActionPerformed
        // Tombol pecat pegawai
        JOptionPane.showMessageDialog(null, "Pegawai dipecat!");
    }//GEN-LAST:event_pecatPegawai_buttonActionPerformed

    private void NIKFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIKFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIKFieldActionPerformed

    private void namaLenkapFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaLenkapFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaLenkapFieldActionPerformed

    private void cariPegawai_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariPegawai_ButtonActionPerformed
        // button buat update nota, supaya bisa liat harga total sementara
    }//GEN-LAST:event_cariPegawai_ButtonActionPerformed

    private void tambahPegawai_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahPegawai_ButtonActionPerformed
        // Button buat tambah pwgawai 
          JOptionPane.showMessageDialog(null, "Pegawai baru berhasil ditambah!");
    }//GEN-LAST:event_tambahPegawai_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlamatField;
    private javax.swing.JComboBox<String> Golongan_ComboBox;
    private javax.swing.JComboBox<String> Grade_ComnoBox;
    private javax.swing.JComboBox<String> JenisKelamin_comboBox;
    private javax.swing.JTextField JumlahAnakField;
    private javax.swing.JTextField NIKField;
    private javax.swing.JTextField NIPField;
    private javax.swing.JTextField NPWPField;
    private javax.swing.JTextField NoRekeningField;
    private javax.swing.JComboBox<String> Pendidikan_comboBOX;
    private javax.swing.JTextField PerjanjianField;
    private javax.swing.JTextField TanggalLahirField;
    private javax.swing.JButton cariPegawai_Button;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField namaLenkapField;
    private javax.swing.JButton pecatPegawai_button;
    private javax.swing.JPanel riwayatTransaksi;
    private javax.swing.JComboBox<String> status_comboBox;
    private javax.swing.JTable tableDataTransaksi;
    private javax.swing.JButton tambahPegawai_Button;
    private javax.swing.JPanel transaksiBaru;
    // End of variables declaration//GEN-END:variables
}
