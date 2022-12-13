/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alfa.praktikumpbo.pertemuan8;

import javax.swing.JOptionPane;

/**
 *
 * @author alfa <your.name at your.org>
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        email = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        inputemail = new javax.swing.JTextField();
        inputpass = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login bang");
        getContentPane().setLayout(null);

        email.setText("E-mail");
        getContentPane().add(email);
        email.setBounds(6, 9, 37, 16);

        pass.setText("Password");
        getContentPane().add(pass);
        pass.setBounds(6, 37, 50, 16);

        inputemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputemailActionPerformed(evt);
            }
        });
        getContentPane().add(inputemail);
        inputemail.setBounds(67, 6, 341, 22);
        getContentPane().add(inputpass);
        inputpass.setBounds(68, 34, 340, 22);

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(180, 65, 72, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\alfag\\Desktop\\bg.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //    Array untuk menampung data user yang bisa login
    User[] registeredUsers = {
        new User("alfabload@gmail.com", "interaksi09"),
        new User("gilebload@gmail.com", "interaksi28"),
        new User("hahabload@gmail.com", "gileboy21")
    };
   
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
        
        String email = inputemail.getText();
        String password = inputpass.getText();
        
        
        
        for(User u : registeredUsers){
            boolean loginBerhasil = u.verify(email, password);
            
            if(loginBerhasil){
                JOptionPane.showMessageDialog(null, "Login Berhasil");
            }
            else{
                JOptionPane.showMessageDialog(null, "Login Gagal");
            }
        }
    }//GEN-LAST:event_loginActionPerformed

    private void inputemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputemailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private javax.swing.JTextField inputemail;
    private javax.swing.JPasswordField inputpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    private javax.swing.JLabel pass;
    // End of variables declaration//GEN-END:variables
}