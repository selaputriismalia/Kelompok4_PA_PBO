/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author SELLA
 */
final public class Pilih_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Awal
     */
    public Pilih_Menu() {
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

        jLabel1 = new javax.swing.JLabel();
        IconMenu = new javax.swing.JLabel();
        MenuAdmin2 = new javax.swing.JButton();
        MenuRental2 = new javax.swing.JButton();
        KembaliAwal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("FrameMenu_Awal"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SELLA\\Downloads\\ab2.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 160, 30));

        IconMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\SELLA\\Downloads\\a6.jpeg")); // NOI18N
        getContentPane().add(IconMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 390));

        MenuAdmin2.setText("jButton1");
        MenuAdmin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdmin2ActionPerformed(evt);
            }
        });
        getContentPane().add(MenuAdmin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 173, 230, 60));

        MenuRental2.setText("jButton2");
        MenuRental2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRental2ActionPerformed(evt);
            }
        });
        getContentPane().add(MenuRental2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 263, 250, 60));

        KembaliAwal.setText("jButton1");
        KembaliAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliAwalActionPerformed(evt);
            }
        });
        getContentPane().add(KembaliAwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 320, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAdmin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdmin2ActionPerformed
        // TODO add your handling code here
        new Menu_Admin().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_MenuAdmin2ActionPerformed

    private void MenuRental2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRental2ActionPerformed
        // TODO add your handling code here:
        new Menu_Awal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuRental2ActionPerformed

    private void KembaliAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliAwalActionPerformed
           // TODO add your handling code here:
           new Login().setVisible(true);
           this.dispose();
    }//GEN-LAST:event_KembaliAwalActionPerformed

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
            java.util.logging.Logger.getLogger(Pilih_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pilih_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pilih_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pilih_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pilih_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconMenu;
    private javax.swing.JButton KembaliAwal;
    private javax.swing.JButton MenuAdmin2;
    private javax.swing.JButton MenuRental2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}