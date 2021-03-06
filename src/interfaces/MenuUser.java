package interfaces;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaces.Login;

/**
 *
 * @author danna
 */
public class MenuUser extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuUser() {
        initComponents();
        setLocationRelativeTo(null);//Centrar Ventana
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_prestarLibro = new javax.swing.JButton();
        btn_devolverlibro = new javax.swing.JButton();
        btn_singout = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 20, 10));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDOS ESTUDIANTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 300, 40));

        btn_prestarLibro.setText("PRESTAR LIBRO");
        btn_prestarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestarLibroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_prestarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 240, -1));

        btn_devolverlibro.setText("DEVOLVER LIBRO");
        btn_devolverlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devolverlibroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_devolverlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 240, -1));

        btn_singout.setText("CERRAR SESION");
        btn_singout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_singoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_singout, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 160, -1));

        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 400, 160, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivos/user.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_prestarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestarLibroActionPerformed
        try {
            Prestar_Libro bl = new Prestar_Libro();
            bl.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(MenuUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuUser.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btn_prestarLibroActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_singoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_singoutActionPerformed
       Login lo = new Login();
       lo.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btn_singoutActionPerformed

    private void btn_devolverlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devolverlibroActionPerformed
        try {
            Devolver_Libro dl = new Devolver_Libro();
            dl.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(MenuUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuUser.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btn_devolverlibroActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_devolverlibro;
    private javax.swing.JButton btn_prestarLibro;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_singout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
