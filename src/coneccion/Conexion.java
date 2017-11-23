package coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author danna
 */
public class Conexion {
    
    //Java Conexion LocalHost
    //public static final String URL = "jdbc:mysql://localhost/biblioteca"; 
    //public static final String USERNAME = "root";
    //public static final String PASSWORD = ""; 
    
    //Java Conexion Servidor                       
    public static final String URL = "jdbc:mysql://186.87.135.186:3306/biblioteca"; 
    public static final String USERNAME = "SYSTEM";
    public static final String PASSWORD = "MANAGER*"; 
    
    public PreparedStatement ps;
    public ResultSet rs;
    Connection con = null;
    public Connection conectar() throws SQLException, ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
           //JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return con;
    }
}
