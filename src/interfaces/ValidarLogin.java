package interfaces;
import java.sql.*;
import javax.swing.JOptionPane;
import coneccion.Conexion;
import interfaces.Login;
import interfaces.MenuUser;

/**
 *
 * @author danna
 */
public class ValidarLogin {
    public void ingresar(String usuario, String pass) throws SQLException, ClassNotFoundException{
        try {
        Conexion con = new Conexion();
        Connection cn = con.conectar();
        String sql = "SELECT * FROM usuarios WHERE usuario ='"+usuario+"' && password = '"+pass+"'";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        String capturar =""; 
        if (rs.next()) {
            capturar = rs.getString("tipouser");            
        }
        
        if (capturar.equals("1")) {            
            MenuAdmin ma = new MenuAdmin();
            ma.setVisible(true);
        }
        if (capturar.equals("2")) {
            MenuUser mu = new MenuUser();
            mu.setVisible(true);
           
        }
        if (!capturar.equals("1") && (!capturar.equals("2"))) {            
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