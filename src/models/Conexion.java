package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author otherside
 */
public class Conexion {
    
    //Java Conexion
    public static final String URL = "jdbc:mysql://localhost/biblioteca"; 
    public static final String USERNAME = "root";
    public static final String PASSWORD = ""; 
    
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
