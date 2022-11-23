
package DAOs;

import Tablas.Cliente;
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
public class ClienteDAO {
    private String mensaje;
    public PreparedStatement pst;
    public Statement st;
    public ResultSet rs;
    
    public String agregarCliente(Connection conn, Cliente cnt){
         pst = null;
        String Ssql = "INSERT INTO CLIENTE (CLIENTE_ID,CLIENTE_NOMBRE,CLIENTE_APELLIDOP,CLIENTE_APELLIDOM,"
                + "CLIENTE_CORREO,CLIENTE_TELEFONO,CLIENTE_USUARIO,CLIENTE_CONTRASENIA)"
                + "VALUES (C_NEW_ID,?,?,?,?,?,?,?)" ;
        
        try{
            pst = conn.prepareStatement(Ssql);
            pst.setString(1, cnt.getNombre_cliente());
            pst.setString(2, cnt.getAp_c());
            pst.setString(3, cnt.getAm_c());
            pst.setString(4, cnt.getCorreo_c());
            pst.setLong(5, cnt.getTelefono_c());
            pst.setString(6, cnt.getUsuario_c());
            pst.setString(7, cnt.getContra_c());
            mensaje = "Se agrego el cliente correctamente";
            pst.execute();
            pst.close();
            
            //JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
            
        }catch(SQLException e){
            mensaje = "Error al agregar el cliente";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }
        return mensaje;
    }
    
    public String editarCliente(Connection conn, Cliente cnt, int cliente_id ){
        pst = null;
        String Ssql = "UPDATE CLIENTE SET CLIENTE_NOMBRE = ?,CLIENTE_APELLIDOP = ?,"
                + "CLIENTE_APELLIDOM = ?,CLIENTE_CORREO = ?,CLIENTE_TELEFONO = ?,CLIENTE_USUARIO = ?,"
                + "CLIENTE_CONTRASENIA = ? WHERE CLIENTE_ID = ?";
        
        try{
            pst = conn.prepareStatement(Ssql);
           
            pst.setString(1, cnt.getNombre_cliente());
            pst.setString(2, cnt.getAp_c());
            pst.setString(3, cnt.getAm_c());
            pst.setString(4, cnt.getCorreo_c());
            pst.setLong(5, cnt.getTelefono_c());
            pst.setString(6, cnt.getUsuario_c());
            pst.setString(7, cnt.getContra_c());
            //pst.setInt(8, cnt.getDirec_id());
            pst.setInt(8, cliente_id);
            
            mensaje = "Se edito el cliente correctamente";
            pst.executeUpdate();
            pst.close();
            
            JOptionPane.showMessageDialog(null, mensaje);
            
        }catch(SQLException e){
            mensaje = "Error al editar el cliente";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }
        return mensaje;
    }
    
    public String borrarCliente(Connection conn, int c_id){
         pst = null;
        String Ssql = "DELETE FROM CLIENTE WHERE CLIENTE_ID = ?";
        
        try{
            pst = conn.prepareStatement(Ssql);
            pst.setInt(1, c_id);
            pst.execute();
            pst.close();
            mensaje = "Se borro el cliente correctamente";
            JOptionPane.showMessageDialog(null, mensaje);
            
        }catch(SQLException e){
            mensaje = "Error al borrar el cliente";
            JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
        }
        return mensaje;
    }
    
    public void mostrarCliente(Connection conn, JTable tabla){
        st = null;
        rs = null;
        
        String [] col = {"","Nombre","Apellido Paterno","Apellido materno","Correo","Telefono","Usuario","Contraseña",""};
        DefaultTableModel model = new DefaultTableModel(null,col);
     
        String Ssql = "SELECT * FROM CLIENTE ORDER BY CLIENTE_ID";
        
        String [] filas = new String [9];
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(Ssql);
            while (rs.next()) {               
                for (int i = 0; i<9; i++) {
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
