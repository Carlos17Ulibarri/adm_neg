
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Ulibarri
 */
public class Conexion {
    public static Connection connect = null;
    public static String login = "usr_negocio";
    public static String pass = "123456";
    public static String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
  
    public static Connection getConnection(){ 
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connect = DriverManager.getConnection(url,login,pass);
            connect.setAutoCommit(false);
            if(connect != null){
                System.out.println("Conexcion exitosa");
            }else{
                System.out.println("Erorr de conexion");
            }
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Conexion erronea" + e.getMessage());
        }
        return connect;
        
    }
    
    public void desconectar(){
        try{
            connect.close();
        }catch(SQLException e){
            System.out.println("Error al desconectar" + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.getConnection();
    }

}
