/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.admin.estudiantes;

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
import views.administradores.admis.MenuAdmin;

/**
 *
 * @author Otherside
 */
public class EliminarEstudiante extends javax.swing.JFrame {
Connection cn;
private int id;
    /**
     * Creates new form Buscarf
     */
    public EliminarEstudiante() throws SQLException, ClassNotFoundException {
        initComponents();
        setLocationRelativeTo(null);
        cargarTabla("");
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
        txt_buscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_buscar = new javax.swing.JTable();
        btn_atras = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ELIMINAR ESTUDIANTES");

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESE LIBRO A ELIMINAR");

        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        tabla_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_buscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_buscar);

        btn_atras.setText("ATRAS");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        btn_modificar.setText("ELIMINAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(548, 548, 548)
                .addComponent(jLabel1)
                .addContainerGap(492, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(64, 64, 64)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
            .addGroup(layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_atras))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        try {
            cargarTabla(txt_buscar.getText());
        } catch (SQLException ex) {
            Logger.getLogger(EliminarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EliminarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        try {
            cargarTabla("");
        } catch (SQLException ex) {
            Logger.getLogger(EliminarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EliminarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_buscar.setText(null);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void tabla_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_buscarMouseClicked
        try {
             id  = Integer.parseInt((String) tabla_buscar.getValueAt(tabla_buscar.getSelectedRow(), 0));
             Statement smt = cn.createStatement();
             ResultSet rs = smt.executeQuery("select * from estudiantes where es_codigo ="+id);
             rs.close();
             smt.close();
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_tabla_buscarMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (id!=0) {
            try {
               {
                Statement smt = cn.createStatement();
                if (JOptionPane.showConfirmDialog(rootPane, "Eliminar Registro!, ¿desea continuar?",
                "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    smt.execute("delete from estudiantes where es_codigo ="+id);
                    JOptionPane.showMessageDialog(this, "Datos Actualizados Correctamente!");
                    smt.close();
                    cargarTabla("");
                    id = 0;
                }else{
                    cargarTabla("");
                }
              }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar los datos " +e);
            }
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
       MenuAdmin ma = null;
    try {
        ma = new MenuAdmin();
    } catch (SQLException ex) {
        Logger.getLogger(EliminarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(EliminarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
    }
       ma.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btn_atrasActionPerformed
    
    void cargarTabla(String cad) throws SQLException, ClassNotFoundException{
        CargarTabla(tabla_buscar, cad);
    }
    
    public void CargarTabla(JTable tabla, String cadena) throws SQLException, ClassNotFoundException{
        DefaultTableModel modelo;
        String [] titulo = {"NUM CARNET", "NOMBRE","APELLIDO","DIRECCION","TELEFONO","EMAIL","SEXO","PASATIEMPO", "DEPARTAMENTO", "MUNICIPIO"};
        modelo = new DefaultTableModel(null,titulo);
        
        String [] registros = new String[10];
        String sql = "SELECT es_NumCarnet, es_nombre, es_apellido, es_direccion,es_telefono,es_email,es_sexo,es_pasatiempo, es_departamento, es_municipio FROM estudiantes WHERE CONCAT (es_NumCarnet, es_nombre, es_apellido, es_direccion,es_telefono,es_email,es_sexo,es_pasatiempo, es_departamento, es_municipio) LIKE '%"+cadena+"%'";
        Conexion con = new Conexion();  
        cn = (Connection) con.conectar();
        
        try{
            Statement st  = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i <10; i++) 
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
            java.util.logging.Logger.getLogger(EliminarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new EliminarEstudiante().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EliminarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(EliminarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla_buscar;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
