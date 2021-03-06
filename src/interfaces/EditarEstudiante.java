package interfaces;


import com.mysql.jdbc.Connection;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import coneccion.Conexion;

/**
 *
 * @author danna
 */
public class EditarEstudiante extends javax.swing.JFrame {
Connection cn;
private int id;

    /**
     * Creates new form Buscarf
     */
    public EditarEstudiante() throws SQLException, ClassNotFoundException {
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
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        btn_modificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        APELLIDO = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_pasatiempo = new javax.swing.JTextField();
        combo_sexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_municipio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_departamento = new javax.swing.JTextField();
        txt_numCarnet = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("EDITAR ESTUDIANTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 37, -1, -1));

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 408, -1));

        jLabel3.setText("INGRESE ESTUDIANTE  A  EDITAR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, 20));

        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 121, 30));

        tabla_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_buscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_buscar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 1280, 326));

        btn_atras.setText("ATRAS");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, 225, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 110, 28));
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 134, 28));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 132, 28));

        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, 206, -1));

        jLabel2.setText("NOMBRE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel4.setText("DIRECCION");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        APELLIDO.setText("APELLIDO");
        getContentPane().add(APELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel6.setText("TELEFONO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        jLabel7.setText("EMAIL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, -1));

        jLabel8.setText("SEXO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));

        jLabel9.setText("PASA TIEMPO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, -1, -1));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 114, 28));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 150, 28));
        getContentPane().add(txt_pasatiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 120, 30));

        combo_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer", "Otro" }));
        getContentPane().add(combo_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 100, 30));

        jLabel5.setText("DEPARTAMENTO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 150, -1, -1));
        getContentPane().add(txt_municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 180, 130, 30));

        jLabel10.setText("MUNICIPIO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 150, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 650, -1, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 380, 10, 50));
        getContentPane().add(txt_departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, 130, 30));
        getContentPane().add(txt_numCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 79, 30));

        jLabel13.setText("CODIGO");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        try {
            cargarTabla(txt_buscar.getText());
        } catch (SQLException ex) {
            Logger.getLogger(EditarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        try {
            cargarTabla("");
            limpiarcajas();
        } catch (SQLException ex) {
            Logger.getLogger(EditarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_buscar.setText(null);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void tabla_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_buscarMouseClicked
        try {
             id  = Integer.parseInt((String) tabla_buscar.getValueAt(tabla_buscar.getSelectedRow(), 0));
             Statement smt = cn.createStatement();
             ResultSet rs = smt.executeQuery("SELECT es_NumCarnet, es_nombre, es_apellido, es_direccion,es_telefono,es_email,es_sexo,es_pasatiempo, es_departamento, es_municipio FROM estudiantes WHERE es_codigo ="+id);
             if (rs.next()) {
                txt_numCarnet.setText(rs.getString(1));
                txt_nombre.setText(rs.getString(2));
                txt_apellido.setText(rs.getString(3));
                txt_direccion.setText(rs.getString(4));
                txt_telefono.setText(rs.getString(5));
                txt_email.setText(rs.getString(6));
                combo_sexo.setSelectedItem(rs.getString(7));
                txt_pasatiempo.setText(rs.getString(8));
                txt_departamento.setText(rs.getString(9));
                txt_municipio.setText(rs.getString(10));
            }
             rs.close();
             smt.close();
          } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_tabla_buscarMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (id!=0) {
            String codigo = txt_numCarnet.getText();
            String nombre = txt_nombre.getText();
            String apellido = txt_apellido.getText();
            String direccion = txt_direccion.getText();
            String telefono = txt_telefono.getText();
            String email = txt_email.getText();
            String sexo = (String) combo_sexo.getSelectedItem();
            String pasatiempo =  txt_pasatiempo.getText(); 
            String departamento =  txt_municipio.getText(); 
            String municipio =  txt_municipio.getText(); 
            
            try {
                if (codigo =="" && nombre == "" && apellido =="" && direccion =="" && telefono =="" && email =="" && pasatiempo =="" && departamento ==""  && municipio =="") {
                    JOptionPane.showMessageDialog(this, "Por Favor Complete Los Campos");
                }else{
                    if (JOptionPane.showConfirmDialog(rootPane, "Editar Registro!, ¿desea continuar?",
                        "Editar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                        Statement smt = cn.createStatement();
                        smt.execute("UPDATE estudiantes set es_codigo='"+codigo+"',es_nombre='"+nombre+"', es_apellido = '"+apellido+"', es_direccion ='"+direccion+"',  es_telefono='"+telefono+"', es_email ='"+email+"', es_sexo ='"+sexo+"', es_pasatiempo ='"+pasatiempo+"', es_departamento = '"+departamento+"', es_municipio ='"+municipio+"' where es_codigo ="+id);
                        JOptionPane.showMessageDialog(this, "Datos Actualizados Correctamente!");
                        smt.close();
                        cargarTabla("");
                        limpiarcajas();
                        id = 0;
                    }else{
                        cargarTabla("");
                        limpiarcajas();
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
        Logger.getLogger(EditarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(EditarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
    }
       ma.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btn_atrasActionPerformed
    
    void cargarTabla(String cad) throws SQLException, ClassNotFoundException{
        CargarTabla(tabla_buscar, cad);
    }
    
    public void CargarTabla(JTable tabla, String cadena) throws SQLException, ClassNotFoundException{
        DefaultTableModel modelo;
        String [] titulo = {"CODIGO","NUM CARNET", "NOMBRE","APELLIDO","DIRECCION","TELEFONO","EMAIL","SEXO","PASATIEMPO", "DEPARTAMENTO", "MUNICIPIO"};
        modelo = new DefaultTableModel(null,titulo);
        
        String [] registros = new String[11];
        String sql = "SELECT es_codigo,es_NumCarnet, es_nombre, es_apellido, es_direccion,es_telefono,es_email,es_sexo,es_pasatiempo, es_departamento, es_municipio FROM estudiantes WHERE CONCAT (es_NumCarnet, es_nombre, es_apellido, es_direccion,es_telefono,es_email,es_sexo,es_pasatiempo, es_departamento, es_municipio) LIKE '%"+cadena+"%'";
        Conexion con = new Conexion();  
        cn = (Connection) con.conectar();
        
        try{
            Statement st  = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i <11; i++) 
                    registros[i]= rs.getString(i+1);
                modelo.addRow(registros);                
            }
            tabla.setModel(modelo);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+ e);
        }
    }
    
    public void limpiarcajas(){
        txt_numCarnet.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_email.setText("");
        txt_pasatiempo.setText("");
        txt_departamento.setText("");
        txt_municipio.setText("");
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
            java.util.logging.Logger.getLogger(EditarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                    new EditarEstudiante().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EditarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(EditarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APELLIDO;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JComboBox<String> combo_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla_buscar;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_departamento;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_municipio;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numCarnet;
    private javax.swing.JTextField txt_pasatiempo;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
