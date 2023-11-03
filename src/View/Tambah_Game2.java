/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Control.Costume_CRUD;

import javax.swing.JOptionPane;

/**
 *
 * @author SELLA
 */
final public class Tambah_Game2 extends javax.swing.JFrame {

    /**
     * Creates new form Tambah_Game2
     */
    public Tambah_Game2() {
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
        ID_Costume = new javax.swing.JTextField();
        TIPE = new javax.swing.JTextField();
        GAME = new javax.swing.JTextField();
        PERUSAHAN = new javax.swing.JTextField();
        IconGame2 = new javax.swing.JLabel();
        TambahkanGame = new javax.swing.JButton();
        KembaliGame2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ID_Costume.setToolTipText("Nama Game");
        ID_Costume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_CostumeActionPerformed(evt);
            }
        });
        jPanel1.add(ID_Costume, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 110, 50));

        TIPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIPEActionPerformed(evt);
            }
        });
        jPanel1.add(TIPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 170, 50));

        GAME.setToolTipText("Perusahan");
        GAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAMEActionPerformed(evt);
            }
        });
        jPanel1.add(GAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 270, 50));

        PERUSAHAN.setToolTipText("Tipe Game");
        PERUSAHAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PERUSAHANActionPerformed(evt);
            }
        });
        jPanel1.add(PERUSAHAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 190, 50));

        IconGame2.setIcon(new javax.swing.ImageIcon("C:\\Users\\SELLA\\Downloads\\14.jpeg")); // NOI18N
        jPanel1.add(IconGame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        TambahkanGame.setText("jButton1");
        TambahkanGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahkanGameActionPerformed(evt);
            }
        });
        jPanel1.add(TambahkanGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 120, -1));

        KembaliGame2.setText("jButton2");
        KembaliGame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliGame2ActionPerformed(evt);
            }
        });
        jPanel1.add(KembaliGame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 303, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ID_CostumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_CostumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_CostumeActionPerformed

    private void GAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GAMEActionPerformed

    private void PERUSAHANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PERUSAHANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PERUSAHANActionPerformed

    private void TambahkanGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahkanGameActionPerformed
        // TODO add your handling code here:
    String ID_Cos = ID_Costume.getText();
    String namaGame = GAME.getText();
    String namaPeru = PERUSAHAN.getText();
    String tipe = TIPE.getText();
    
        if (ID_Cos.isEmpty() || namaGame.isEmpty() || namaPeru.isEmpty() || tipe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harap lengkapi semua kolom input.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    Costume_CRUD.addGame(ID_Cos, namaGame, namaPeru, tipe); 
    }//GEN-LAST:event_TambahkanGameActionPerformed

    private void KembaliGame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliGame2ActionPerformed
        // TODO add your handling code here:
        new Tambah_Game().setVisible(true);
        dispose();
    }//GEN-LAST:event_KembaliGame2ActionPerformed

    private void TIPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIPEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIPEActionPerformed

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
            java.util.logging.Logger.getLogger(Tambah_Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tambah_Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tambah_Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tambah_Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tambah_Game2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GAME;
    private javax.swing.JTextField ID_Costume;
    private javax.swing.JLabel IconGame2;
    private javax.swing.JButton KembaliGame2;
    private javax.swing.JTextField PERUSAHAN;
    private javax.swing.JTextField TIPE;
    private javax.swing.JButton TambahkanGame;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
