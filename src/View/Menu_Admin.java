/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
/**
 *
 * @author SELLA
 */
final public class Menu_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Admin
     */
    public Menu_Admin() {
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
        IconAdmin = new javax.swing.JLabel();
        CAdmin = new javax.swing.JButton();
        Radmin = new javax.swing.JButton();
        UAdmin = new javax.swing.JButton();
        DAdmin = new javax.swing.JButton();
        kembali1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconAdmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\SELLA\\Downloads\\a72.jpeg")); // NOI18N
        jPanel1.add(IconAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1050, 530));

        CAdmin.setText("jButton1");
        CAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAdminActionPerformed(evt);
            }
        });
        jPanel1.add(CAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 270, 60));

        Radmin.setText("jButton2");
        Radmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadminActionPerformed(evt);
            }
        });
        jPanel1.add(Radmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 260, 40));

        UAdmin.setText("jButton3");
        UAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UAdminActionPerformed(evt);
            }
        });
        jPanel1.add(UAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 270, 60));

        DAdmin.setText("jButton4");
        DAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DAdminActionPerformed(evt);
            }
        });
        jPanel1.add(DAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 270, 50));

        kembali1.setText("jButton1");
        kembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali1ActionPerformed(evt);
            }
        });
        jPanel1.add(kembali1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAdminActionPerformed
        // TODO add your handling code here:
        new Tambah_Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CAdminActionPerformed

    private void UAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UAdminActionPerformed
        // TODO add your handling code here:
        new Update_Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UAdminActionPerformed

    private void RadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadminActionPerformed
        // TODO add your handling code here:
        new Tampilan_DataAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RadminActionPerformed

    private void DAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DAdminActionPerformed
        // TODO add your handling code here:
        new Hapus_Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DAdminActionPerformed

    private void kembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali1ActionPerformed
        // TODO add your handling code here:
        new Pilih_Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kembali1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CAdmin;
    private javax.swing.JButton DAdmin;
    private javax.swing.JLabel IconAdmin;
    private javax.swing.JButton Radmin;
    private javax.swing.JButton UAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kembali1;
    // End of variables declaration//GEN-END:variables
}
