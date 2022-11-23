
package Tablas;

/**
 *
 * @author Carlos Ulibarri
 */
public class Repartidor {
    private int rep_id;
    private String rep_nom;
    private String rep_ap;
    private String rep_am;
    private String rep_correo;
    private long rep_tel;
    private String rep_usu;
    private String rep_contra;
    private String rep_met_ent;
    private String rep_cal;

    public Repartidor() {
    }

    public Repartidor(int rep_id, String rep_nom, String rep_ap, String rep_am, String rep_correo, long rep_tel, String rep_usu, String rep_contra, String rep_met_ent, String rep_cal) {
        this.rep_id = rep_id;
        this.rep_nom = rep_nom;
        this.rep_ap = rep_ap;
        this.rep_am = rep_am;
        this.rep_correo = rep_correo;
        this.rep_tel = rep_tel;
        this.rep_usu = rep_usu;
        this.rep_contra = rep_contra;
        this.rep_met_ent = rep_met_ent;
        this.rep_cal = rep_cal;
    }

    public int getRep_id() {
        return rep_id;
    }

    public void setRep_id(int rep_id) {
        this.rep_id = rep_id;
    }

    public String getRep_nom() {
        return rep_nom;
    }

    public void setRep_nom(String rep_nom) {
        this.rep_nom = rep_nom;
    }

    public String getRep_ap() {
        return rep_ap;
    }

    public void setRep_ap(String rep_ap) {
        this.rep_ap = rep_ap;
    }

    public String getRep_am() {
        return rep_am;
    }

    public void setRep_am(String rep_am) {
        this.rep_am = rep_am;
    }

    public String getRep_correo() {
        return rep_correo;
    }

    public void setRep_correo(String rep_correo) {
        this.rep_correo = rep_correo;
    }

    public long getRep_tel() {
        return rep_tel;
    }

    public void setRep_tel(long rep_tel) {
        this.rep_tel = rep_tel;
    }

    public String getRep_usu() {
        return rep_usu;
    }

    public void setRep_usu(String rep_usu) {
        this.rep_usu = rep_usu;
    }

    public String getRep_contra() {
        return rep_contra;
    }

    public void setRep_contra(String rep_contra) {
        this.rep_contra = rep_contra;
    }

    public String getRep_met_ent() {
        return rep_met_ent;
    }

    public void setRep_met_ent(String rep_met_ent) {
        this.rep_met_ent = rep_met_ent;
    }

    public String getRep_cal() {
        return rep_cal;
    }

    public void setRep_cal(String rep_cal) {
        this.rep_cal = rep_cal;
    }

    @Override
    public String toString() {
        return "Repartidor{" + "rep_id=" + rep_id + ", rep_nom=" + rep_nom + ", rep_ap=" + rep_ap + ", rep_am=" + rep_am + ", rep_correo=" + rep_correo + ", rep_tel=" + rep_tel + ", rep_usu=" + rep_usu + ", rep_contra=" + rep_contra + ", rep_met_ent=" + rep_met_ent + ", rep_cal=" + rep_cal + '}';
    }
    
    
    
}
