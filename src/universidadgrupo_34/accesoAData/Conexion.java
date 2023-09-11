
package universidadgrupo_34.accesoAData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Fer
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://Localhost/";
    private static final String DB="universidadgrupo_34";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection conexion;
    
    public static Connection getConexion(){
    
        if(conexion==null){
        
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error al cargar los driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error de conexion");
            }
            
        }
        return conexion;
    }
    
}
