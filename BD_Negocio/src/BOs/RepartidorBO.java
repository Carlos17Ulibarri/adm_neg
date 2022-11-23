
package BOs;

import BD.Conexion;
import DAOs.RepartidorDAO;
import Tablas.Repartidor;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;
/**
 *
 * @author Carlos Ulibarri
 */
public class RepartidorBO {
    private String mensaje = "";
    public RepartidorDAO rDao = new RepartidorDAO();
    
    public String agregarRep(Repartidor rep){
        Connection conn = Conexion.getConnection();
        try{
            mensaje = rDao.agregarRep(conn, rep);
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
    
    public String editarRep(Repartidor rep, int rep_id){
        Connection conn = Conexion.getConnection();
        try{
            mensaje = rDao.editarRep(conn, rep, rep_id);
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
    
    public String borrarRep(int rep_id){
        Connection conn = Conexion.getConnection();
        try{
            mensaje = rDao.borrarRep(conn, rep_id);
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
    
    public void mostrarRep(JTable tabla){
        Connection conn = Conexion.getConnection();
        
        rDao.mostrarRep(conn, tabla);
        try{
        conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
