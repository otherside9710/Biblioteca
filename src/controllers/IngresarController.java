package controllers;

import java.sql.*;
import javax.swing.JOptionPane;
import models.Conexion;
import views.Login;
import views.administradores.admis.MenuAdmin;
import views.user.MenuUser;

/**
 *
 * @author Otherside
 */
public class IngresarController {
    public void ingresar(String usario, String pass) throws SQLException, ClassNotFoundException{
        try {
            boolean swc;
        swc = false;
        Conexion con = new Conexion();
        Connection cn = con.conectar();
        String sql = "SELECT * FROM usuarios WHERE usuario ='"+usario+"' && password = '"+pass+"'";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        String capturar =""; 
        if (rs.next()) {
            capturar = rs.getString("tipouser");            
        }
        
        if (capturar.equals("admin")) {
            JOptionPane.showMessageDialog(null, "Bienvenido " + usario);
            MenuAdmin ma = new MenuAdmin();
            ma.setVisible(true);
        }
        if (capturar.equals("estudiante")) {
            JOptionPane.showMessageDialog(null, "Bienvenido " + usario);  
            MenuUser mu = new MenuUser();
            mu.setVisible(true);
            swc = true;
        }
        if (!capturar.equals("admin") && (!capturar.equals("estudiante"))) {            
            JOptionPane.showMessageDialog(null, "Credenciales Iconrrectas, Vuelva A intentar ");
            Login log = new Login();
            log.setVisible(true);
        }
       
        }
        catch(SQLException e){
             throw new SQLException(e);
        }
        
    } 
}