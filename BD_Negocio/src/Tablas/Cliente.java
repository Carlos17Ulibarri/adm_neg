
package Tablas;

/**
 *
 * @author Carlos Ulibarri
 */
public class Cliente {
    private int cliente_id;
    private String nombre_cliente;
    private String ap_c;
    private String am_c;
    private String correo_c;
    private long telefono_c;
    private String usuario_c;
    private String contra_c;
    private int direc_id;
   

    public Cliente() {
    }

    public Cliente(int cliente_id, String nombre_cliente, String ap_c, String am_c, String correo_c, long telefono_c, String usuario_c, String contra_c, int direc_id) {
        this.cliente_id = cliente_id;
        this.nombre_cliente = nombre_cliente;
        this.ap_c = ap_c;
        this.am_c = am_c;
        this.correo_c = correo_c;
        this.telefono_c = telefono_c;
        this.usuario_c = usuario_c;
        this.contra_c = contra_c;
        this.direc_id = direc_id;
        
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getAp_c() {
        return ap_c;
    }

    public void setAp_c(String ap_c) {
        this.ap_c = ap_c;
    }

    public String getAm_c() {
        return am_c;
    }

    public void setAm_c(String am_c) {
        this.am_c = am_c;
    }

    public String getCorreo_c() {
        return correo_c;
    }

    public void setCorreo_c(String correo_c) {
        this.correo_c = correo_c;
    }

    public long getTelefono_c() {
        return telefono_c;
    }

    public void setTelefono_c(long telefono_c) {
        this.telefono_c = telefono_c;
    }

    public String getUsuario_c() {
        return usuario_c;
    }

    public void setUsuario_c(String usuario_c) {
        this.usuario_c = usuario_c;
    }

    public String getContra_c() {
        return contra_c;
    }

    public void setContra_c(String contra_c) {
        this.contra_c = contra_c;
    }
    
    public int getDirec_id() {
        return direc_id;
    }

    public void setDirec_id(int direc_id) {
        this.direc_id = direc_id;
    }

    

    @Override
    public String toString() {
        return "Cliente{" + "cliente_id=" + cliente_id + ", nombre_cliente=" + nombre_cliente + ", ap_c=" + ap_c + ", am_c=" + am_c + ", correo_c=" + correo_c + ", telefono_c=" + telefono_c + ", usuario_c=" + usuario_c + ", contra_c=" + contra_c + ",direc_id" + direc_id +'}';
    }
}
