
package DAOs;

import Tablas.Platillo;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Carlos Ulibarri
 */
public class PlatilloDAO {
    private String mensaje;
    public PreparedStatement pst;
    public Statement st;
    public ResultSet rs;
    
    public String agregarPlatillo(Connection conn, Platillo plt){
         pst = null;
        String Ssql = "INSERT INTO PLATILLO (PLATILLO_ID,PLATILLO_NOMBRE,"
                + "PLATILLO_DESCRIPCION,PLATILLO_COSTO)"
                + "VALUES (P_NEW_ID,?,?,?)" ;
        
        try{
            pst = conn.prepareStatement(Ssql);
            pst.setString(1, plt.getPt_nom());
            pst.setString(2, plt.getPt_desc());
            pst.setInt(3, plt.getPt_cost());
            
            mensaje = "Se agrego el Platillo correctamente";
            pst.execute();
            pst.close();
            
            JOptionPane.showMessageDialog(null, mensaje);
            
        }catch(SQLException e){
            mensaje = "Error al agregar el Platillo";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }
        return mensaje;
    }
    
    public String editarPlatillo(Connection conn, Platillo plt, int platillo_id ){
        pst = null;
        String Ssql = "UPDATE PLATILLO SET PLATILLO_NOMBRE = ?,PLATILLO_DESCRIPCION = ?,"
                + "PLATILLO_COSTO = ?"
                + "WHERE PLATILLO_ID = ?";
        
        try{
            pst = conn.prepareStatement(Ssql);
           
            pst.setString(1, plt.getPt_nom());
            pst.setString(2, plt.getPt_desc());
            pst.setInt(3, plt.getPt_cost());
            pst.setInt(4, platillo_id);
            
            mensaje = "Se edito el Platillo correctamente";
            pst.executeUpdate();
            pst.close();
            
            JOptionPane.showMessageDialog(null, mensaje);
            
        }catch(SQLException e){
            mensaje = "Error al editar el Platillo";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }
        return mensaje;
    }
    
    public String borrarPlatillo(Connection conn, int platillo_id){
         pst = null;
        String Ssql = "DELETE FROM PLATILLO WHERE PLATILLO_ID = ?";
        
        try{
            pst = conn.prepareStatement(Ssql);
            pst.setInt(1, platillo_id);
            pst.execute();
            pst.close();
            mensaje = "Se borro el Platillo correctamente";
            JOptionPane.showMessageDialog(null, mensaje);
            
        }catch(SQLException e){
            mensaje = "Error al borrar el Platillo";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }
        return mensaje;
    }
    
    public void mostrarPlatillo(Connection conn, JTable tabla){
        st = null;
        rs = null;
        
        String [] col = {"","Nombre","Descripcion","","Costo",""};
        DefaultTableModel model = new DefaultTableModel(null,col);
     
        
        String Ssql = "SELECT * FROM PLATILLO ORDER BY PLATILLO_ID";
        
        String [] filas = new String [6];
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(Ssql);
            while (rs.next()) {                
                
                for (int i = 0; i<6; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
            
        }catch (SQLException e){
            
            JOptionPane.showMessageDialog(null,"Error al listar los datos");
        }
        
    }
}
