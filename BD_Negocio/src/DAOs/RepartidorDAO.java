
package DAOs;

import Tablas.Repartidor;
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
public class RepartidorDAO {
    private String mensaje;
    public PreparedStatement pst;
    public Statement st;
    public ResultSet rs;
    
    public String agregarRep(Connection conn, Repartidor rep){
         pst = null;
        String Ssql = "INSERT INTO REPARTIDOR VALUES (R_NEW_ID,?,?,?,?,?,?,?,?,?)" ;
        
        try{
            pst = conn.prepareStatement(Ssql);
            pst.setString(1, rep.getRep_nom());
            pst.setString(2, rep.getRep_ap());
            pst.setString(3, rep.getRep_am());
            pst.setLong(4, rep.getRep_tel());
            pst.setString(5, rep.getRep_correo());
            pst.setString(6, rep.getRep_usu());
            pst.setString(7, rep.getRep_contra());
            pst.setString(8, rep.getRep_met_ent());
            pst.setString(9, rep.getRep_cal());
            mensaje = "Se agrego el Repartidor correctamente";
            pst.execute();
            pst.close();
            
            JOptionPane.showMessageDialog(null, mensaje);
            
        }catch(SQLException e){
            mensaje = "Error al agregar el cliente";
            JOptionPane.showMessageDialog(null, mensaje + ":" + e.getMessage());
        }
        return mensaje;
    }
    
    public String editarRep(Connection conn, Repartidor rep, int rep_id ){
        pst = null;
        String Ssql = "UPDATE REPARTIDOR SET REPARTIDOR_NOMBRE = ?,REPARTIDOR_APELLIDOP = ?,"
                + "REPARTIDOR_APELLIDOM = ?,REPARTIDOR_TELEFONO = ?,REPARTIDOR_CORREO = ?,REPARTIDOR_USUARIO = ?,"
                + "REPARTIDOR_CONTRASENIA = ?, REPARTIDOR_MET_ENTREGA = ?,REPARTIDOR_CALIFICACION = ?"
                + "WHERE REPARTIDOR_ID = ?";
        
        try{
            pst = conn.prepareStatement(Ssql);
           
            pst.setString(1, rep.getRep_nom());
            pst.setString(2, rep.getRep_ap());
            pst.setString(3, rep.getRep_am());
            pst.setLong(4, rep.getRep_tel());
            pst.setString(5, rep.getRep_correo());
            pst.setString(6, rep.getRep_usu());
            pst.setString(7, rep.getRep_contra());
            pst.setString(8, rep.getRep_met_ent());
            pst.setString(9,rep.getRep_cal());
            pst.setInt(10, rep.getRep_id());
            
            mensaje = "Se edito el Repartidor correctamente";
            pst.execute();
            pst.close();
            
            JOptionPane.showMessageDialog(null, mensaje);
            
        }catch(SQLException e){
            mensaje = "Error al editar el Repartidor";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }
        return mensaje;
    }
    
    public String borrarRep(Connection conn, int rep_id){
        pst = null;
        String Ssql = "DELETE FROM REPARTIDOR WHERE REPARTIDOR_ID = ?";
        
        try{
            pst = conn.prepareStatement(Ssql);
            pst.setInt(1, rep_id);
            pst.execute();
            pst.close();
            mensaje = "Se borro el Repartidor correctamente";
            JOptionPane.showMessageDialog(null, mensaje);
            
        }catch(SQLException e){
            mensaje = "Error al borrar el Repartidor";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }
        return mensaje;
    }
    
    public void mostrarRep(Connection conn, JTable tabla){
        st = null;
        rs = null;
        
        String [] col = {"","Nombre","Apellido Paterno","Apellido materno","Telefono","Correo","Usuario",
            "Contraseña","Metodo de entrega","Calificacion"};
        DefaultTableModel model = new DefaultTableModel(null,col);
     

        String Ssql = "SELECT * FROM REPARTIDOR ORDER BY REPARTIDOR_ID";
        
        String [] filas = new String [10];
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(Ssql);
            while (rs.next()) {                
                
                for (int i = 0; i<10; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
            
        }catch (SQLException e){
            
            JOptionPane.showMessageDialog(null,"Error al lstar los datos");
        }
        
    }
}