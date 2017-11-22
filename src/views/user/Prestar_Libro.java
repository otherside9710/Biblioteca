/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.user;

import views.admin.libros.*;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.Conexion;
import static views.admin.libros.EditarLibro.tabla_buscar;
import views.administradores.admis.MenuAdmin;

/**
 *
 * @author Otherside
 */
public class Prestar_Libro extends javax.swing.JFrame {
Connection cn;

private int id;
    public Prestar_Libro() throws SQLException, ClassNotFoundException {
        initComponents();
        setLocationRelativeTo(null);
        cargarTabla("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_buscar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();
        btn_prestar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PRESTAR LIBROS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 440, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESE LIBRO A PRESTAR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, 20));

        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 121, -1));

        tabla_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_buscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_buscar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 1080, 320));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 160, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 640, -1, -1));

        btn_atras.setText("ATRAS");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 160, -1));

        btn_prestar.setText("PRESTAR LIBRO");
        btn_prestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_prestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 160, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        try {
            cargarTabla(txt_buscar.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Prestar_Libro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prestar_Libro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        try {
            cargarTabla("");
        } catch (SQLException ex) {
            Logger.getLogger(Prestar_Libro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prestar_Libro.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_buscar.setText(null);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void tabla_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_buscarMouseClicked
        
    }//GEN-LAST:event_tabla_buscarMouseClicked

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
       MenuUser mu = new MenuUser();
       mu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_prestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestarActionPerformed
        id  = Integer.parseInt((String) tabla_buscar.getValueAt(tabla_buscar.getSelectedRow(), 0));
        if (id !=0) {
            try {
                if (JOptionPane.showConfirmDialog(rootPane, "Prestar Libro!, ¿Desea Continuar?",
                "Prestar Libro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    Statement smt = cn.createStatement();
                    smt.executeUpdate("update libros set li_estado ='Prestado' WHERE li_codigo ="+id);
                    JOptionPane.showMessageDialog(this, "Datos Actualizados Correctamente!");
                    smt.close();
                    cargarTabla("");
                    id = 0;
                }else{
                    cargarTabla("");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar los datos " +e);
            }
        }
    }//GEN-LAST:event_btn_prestarActionPerformed
    
    void cargarTabla(String cad) throws SQLException, ClassNotFoundException{
        CargarTabla(tabla_buscar, cad);
    }
    
    public void CargarTabla(JTable tabla, String cadena) throws SQLException, ClassNotFoundException{
        DefaultTableModel modelo;
        String [] titulo = {"CODIGO", "NOMBRE","EDITORIAL","GENERO","AUTOR","UBICACION","ESTADO","AÑO EDICION"};
        modelo = new DefaultTableModel(null,titulo);
        
        String [] registros = new String[8];
        String sql = "SELECT * FROM libros WHERE CONCAT (li_codigo, li_nombre, li_editorial, li_genero,li_autor,li_ubicacion,li_estado,li_añoEdicion) LIKE '%"+cadena+"%'";
        Conexion con = new Conexion();  
        cn = (Connection) con.conectar();
        
        try{
            Statement st  = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i <8; i++) 
                    registros[i]= rs.getString(i+1);
                modelo.addRow(registros);                
            }
            tabla.setModel(modelo);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+ e);
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(Prestar_Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestar_Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestar_Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestar_Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Prestar_Libro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Prestar_Libro.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Prestar_Libro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_prestar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla_buscar;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
