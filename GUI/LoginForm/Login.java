/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginForm;

import Main.MenuUtama;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Bagas
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login(String os) {
        initComponents(os);
    }
    
    void cleanTextField() {
        txt_username.setText("Username");
        txt_password.setText("Password");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String os) {
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exit_button = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
    
        getContentPane().setLayout(new java.awt.FlowLayout());
    
        jLabel3.setIcon(new javax.swing.ImageIcon("GUI"+os+"LoginForm"+os+"lock (1).png")); // NOI18N
        getContentPane().add(jLabel3);
    
        jLabel4.setIcon(new javax.swing.ImageIcon("GUI"+os+"LoginForm"+os+"user (3) (1).png")); // NOI18N
        getContentPane().add(jLabel4);
    
        exit_button.setIcon(new javax.swing.ImageIcon("GUI"+os+"LoginForm"+os+"Close.png")); // NOI18N
        exit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit_buttonMousePressed(evt);
            }
        });
        getContentPane().add(exit_button);
    
        txt_username.setFont(new java.awt.Font("Lato", 0, 12));
        txt_username.setText("Username");
        txt_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usernameFocusLost(evt);
            }
        });
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username);
    
        txt_password.setFont(new java.awt.Font("Lato", 0, 12));
        txt_password.setText("Password");
        txt_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passwordFocusLost(evt);
            }
        });
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password);
    
        jButton1.setBackground(new java.awt.Color(13, 14, 69));
        jButton1.setFont(new java.awt.Font("Lato", 1, 14));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt, os);
            }
        });
        getContentPane().add(jButton1);
    
        jLabel2.setFont(new java.awt.Font("Lato", 3, 24));
        jLabel2.setText("UB MERCH LOGIN");
        getContentPane().add(jLabel2);
    
        background.setIcon(new javax.swing.ImageIcon("GUI"+os+"LoginForm"+os+"PngItem_1127587 (3).png")); // NOI18N
        getContentPane().add(background);
    
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
    
        getContentPane().add(jPanel1);
    
        pack();
        setLocationRelativeTo(null);
    }
    // </editor-fold>//GEN-END:initComponents

    private void exit_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_buttonMousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exit_buttonMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, String os) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username = txt_username.getText();
        String password = txt_password.getText();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost//SQLEXPRESS:1433;databaseName=project_basdat;encrypt=true;trustServerCertificate=true", "admin", "123");
            String sqlquery = "SELECT * FROM userlog WHERE username = '"+username+"' AND userpassword = '"+password+"'";
            PreparedStatement pst = con.prepareStatement(sqlquery);
            ResultSet rs = pst.executeQuery();
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Username or Password Incorret / Empty");
            }else{
                this.dispose();
                new MenuUtama(os).show();
             
                }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusLost
        // TODO add your handling code here:
        String password = txt_password.getText();
        if(password.equals("")||password.equals("Password")) {
            txt_password.setText("Password");
        }
    }//GEN-LAST:event_txt_passwordFocusLost

    private void txt_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusGained
        // TODO add your handling code here:
        String password = txt_password.getText();
        if(password.equals("Password")) {
            txt_password.setText("");
        }
    }//GEN-LAST:event_txt_passwordFocusGained

    private void txt_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusGained
        // TODO add your handling code here:
        String username = txt_username.getText();
        if(username.equals("Username")) {
            txt_username.setText("");
        }
    }//GEN-LAST:event_txt_usernameFocusGained

    private void txt_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusLost
        // TODO add your handli
        String username = txt_username.getText();
        if(username.equals("")||username.equals("Username")) {
            txt_username.setText("Username");
        }
         
    }//GEN-LAST:event_txt_usernameFocusLost

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel exit_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}