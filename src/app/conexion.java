
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class conexion {
    
    //metodo necesario para estrablecer la conexion con la base de datos 
    public static Connection getConexion (){
        
        String conexionURL ="jdbc:sqlserver://localhost:1433;"
                +"database=lavieVital;"
                +"user=sa;"
                +"password=confidencial;"
                +"loginTimeout=30;";
        
        try {
            Connection con = DriverManager.getConnection(conexionURL);
            return con;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
    }
}
