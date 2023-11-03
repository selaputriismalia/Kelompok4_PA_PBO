/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Control.Database;
import Model.Costume;
import Control.Costume_CRUD;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author SELLA
 */
final public class Tampilan_Anime extends javax.swing.JFrame {
    DefaultTableModel model;
    
     /* Creates new form Tampilan_Anime
     */
    
        public Tampilan_Anime(Database database) {
        initComponents();
        model = (DefaultTableModel) Tabel2.getModel();
        Costume_CRUD.getAllAnime(model); 
    }

    Tampilan_Anime() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabel2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_Costume", "Jenis", "Karakter", "Gender", "Nama Anime", "Nama Mangaka", "Nama_Studio", "Hartga", "Ukuran"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 590, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SELLA\\Downloads\\1b.jpeg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, -1, -1));

        Kembali.setText("jButton1");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        jPanel1.add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, 120, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
           new Menu_Awal().setVisible(true);
           this.dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    private void Tabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel2MouseClicked
        // TODO add your handling code here:                                  
 


    }//GEN-LAST:event_Tabel2MouseClicked

    /**
     * @param args the command line arguments
     */
 public static void main(String args[]) {
    Database database = new Database(); // Create a new Database object
    /* Set the Nimbus look and feel */
    // ... (rest of your code)

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Tampilan_Anime(database).setVisible(true);
        }
    });    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembali;
    private javax.swing.JTable Tabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
