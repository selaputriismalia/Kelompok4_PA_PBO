/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Control.Database;
import Model.Costume;
import Model.Costume_Anime;
import Control.Costume_CRUD;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author SELLA
 */
final public class Tambah_Anime2 extends javax.swing.JFrame {
    private String idCostume;


    /**
     * Creates new form Tambah_Anime2
     */
    public Tambah_Anime2() {
        initComponents();
        this.idCostume = idCostume;
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
        id_costume = new javax.swing.JTextField();
        nama_studio = new javax.swing.JTextField();
        nama_manga = new javax.swing.JTextField();
        nama_anime = new javax.swing.JTextField();
        IconAnime2 = new javax.swing.JLabel();
        KembaliAnime2 = new javax.swing.JButton();
        TambahkanAnime = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_costume.setToolTipText("Nama Manga");
        id_costume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_costumeActionPerformed(evt);
            }
        });
        jPanel1.add(id_costume, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 410, 50));

        nama_studio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_studioActionPerformed(evt);
            }
        });
        jPanel1.add(nama_studio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 190, 50));

        nama_manga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_mangaActionPerformed(evt);
            }
        });
        jPanel1.add(nama_manga, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 190, 50));

        nama_anime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_animeActionPerformed(evt);
            }
        });
        jPanel1.add(nama_anime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 190, 50));

        IconAnime2.setIcon(new javax.swing.ImageIcon("C:\\Users\\SELLA\\Downloads\\1a.jpeg")); // NOI18N
        jPanel1.add(IconAnime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        KembaliAnime2.setText("jButton2");
        KembaliAnime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliAnime2ActionPerformed(evt);
            }
        });
        jPanel1.add(KembaliAnime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 120, 40));

        TambahkanAnime.setText("jButton1");
        TambahkanAnime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahkanAnimeActionPerformed(evt);
            }
        });
        jPanel1.add(TambahkanAnime, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1060, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_costumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_costumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_costumeActionPerformed

    private void TambahkanAnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahkanAnimeActionPerformed
    String idCostume = id_costume.getText();
    String namaAnime = nama_anime.getText();
    String namaMangaka = nama_manga.getText();
    String namaStudio = nama_studio.getText();
    
    if (idCostume.isEmpty() || namaAnime.isEmpty() || namaMangaka.isEmpty() || namaStudio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harap lengkapi semua kolom input.", "Error", JOptionPane.ERROR_MESSAGE);}
    
    Costume_CRUD.addAnime1(idCostume, namaAnime, namaMangaka, namaStudio);
    }//GEN-LAST:event_TambahkanAnimeActionPerformed

    private void KembaliAnime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliAnime2ActionPerformed
        // TODO add your handling code here:
        new Tambah_Anime().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliAnime2ActionPerformed

    private void nama_studioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_studioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_studioActionPerformed

    private void nama_mangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_mangaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_mangaActionPerformed

    private void nama_animeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_animeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_animeActionPerformed

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
            java.util.logging.Logger.getLogger(Tambah_Anime2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tambah_Anime2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tambah_Anime2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tambah_Anime2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tambah_Anime2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconAnime2;
    private javax.swing.JButton KembaliAnime2;
    private javax.swing.JButton TambahkanAnime;
    private javax.swing.JTextField id_costume;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nama_anime;
    private javax.swing.JTextField nama_manga;
    private javax.swing.JTextField nama_studio;
    // End of variables declaration//GEN-END:variables
}
