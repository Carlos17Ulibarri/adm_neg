
package BOs;

import BD.Conexion;
import DAOs.PlatilloDAO;
import Tablas.Platillo;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;
/**
 *
 * @author Carlos Ulibarri
 */
public class PlatilloBO {
    private String mensaje = "";
    public PlatilloDAO pDao = new PlatilloDAO();
    
    public String agregarPlatillo(Platillo plt){
        Connection conn = Conexion.getConnection();
        try{
            mensaje = pDao.agregarPlatillo(conn, plt);
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
    
    public String editarPlatillo(Platillo plt, int platillo_id){
        Connection conn = Conexion.getConnection();
        try{
            mensaje = pDao.editarPlatillo(conn, plt, platillo_id);
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
    
    public String borrarPlatillo(int platillo_id){
        Connection conn = Conexion.getConnection();
        try{
            mensaje = pDao.borrarPlatillo(conn, platillo_id);
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
    
    public void mostrarPlatillo(JTable tabla){
        Connection conn = Conexion.getConnection();
        
        pDao.mostrarPlatillo(conn, tabla);
        try{
        conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
