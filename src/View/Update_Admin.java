/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Iterator;
import Control.LoginClass;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author SELLA
 */
public class Update_Admin extends javax.swing.JFrame {
    /**
     * Creates new form Update_Admin
     */
    public Update_Admin() {
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
        id_karwayan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel3 = new javax.swing.JTable();
        Devisi = new javax.swing.JTextField();
        no_tlpn = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cari = new javax.swing.JButton();
        ubah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_karwayan.setText("jTextField1");
        id_karwayan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_karwayanActionPerformed(evt);
            }
        });
        jPanel1.add(id_karwayan, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 430, 70));

        tabel3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, 60));

        Devisi.setText("jTextField2");
        Devisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevisiActionPerformed(evt);
            }
        });
        jPanel1.add(Devisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 110, 40));

        no_tlpn.setText("jTextField3");
        no_tlpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_tlpnActionPerformed(evt);
            }
        });
        jPanel1.add(no_tlpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 130, 40));

        alamat.setText("jTextField4");
        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        jPanel1.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SELLA\\Downloads\\1111111.jpeg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        cari.setText("jButton1");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        jPanel1.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, 120, 30));

        ubah.setText("jButton2");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        jPanel1.add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 470, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_karwayanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_karwayanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_karwayanActionPerformed

    private void DevisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DevisiActionPerformed

    private void no_tlpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_tlpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_tlpnActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
              
    }//GEN-LAST:event_ubahActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
           
            
    }//GEN-LAST:event_cariActionPerformed

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
            java.util.logging.Logger.getLogger(Update_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Devisi;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton cari;
    private javax.swing.JTextField id_karwayan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField no_tlpn;
    private javax.swing.JTable tabel3;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
