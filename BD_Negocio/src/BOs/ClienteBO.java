
package BOs;

import BD.Conexion;
import DAOs.ClienteDAO;
import Tablas.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;
/**
 *
 * @author Carlos Ulibarri
 */
public class ClienteBO {
    private String mensaje = "";
    public ClienteDAO CDao = new ClienteDAO();
    
    public String agregarCliente(Cliente cnt){
        Connection conn = Conexion.getConnection();
        try{
            mensaje = CDao.agregarCliente(conn, cnt);
        }catch(Exception e){
            
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException e){
                
            }
        }
        
        return mensaje;
    }
    
    public String editarCliente(Cliente cnt, int cliente_id){
        Connection conn = Conexion.getConnection();
        try{
            mensaje = CDao.editarCliente(conn, cnt, cliente_id);
        }catch(Exception e){
            
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException e){
                
            }
        }
        return mensaje;
    }
    
    public String borrarCliente(int c_id){
        Connection conn = Conexion.getConnection();
        try{
            mensaje = CDao.borrarCliente(conn, c_id);
        }catch(Exception e){
            
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException e){
                
            }
        }
        return mensaje;
    }
    
    public void mostrarCliente(JTable tabla){
        Connection conn = Conexion.getConnection();
        
        CDao.mostrarCliente(conn, tabla);
        try{
        conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
