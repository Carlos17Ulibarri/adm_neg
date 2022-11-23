
package Tablas;

/**
 *
 * @author Carlos Ulibarri
 */
public class Platillo {
    private int pt_id;
    private String pt_nom;
    private String pt_desc;
    private int pt_neg_id;
    private String pt_nom_neg;
    private int pt_cost;
    private int pt_cla_id;
    private String cla;

    public Platillo() {
    }

    public Platillo(int pt_id, String pt_nom, String pt_desc, int pt_neg_id, String pt_nom_neg, int pt_cost, int pt_cla_id, String cla) {
        this.pt_id = pt_id;
        this.pt_nom = pt_nom;
        this.pt_desc = pt_desc;
        this.pt_neg_id = pt_neg_id;
        this.pt_nom_neg = pt_nom_neg;
        this.pt_cost = pt_cost;
        this.pt_cla_id = pt_cla_id;
        this.cla = cla;
    }

    public int getPt_id() {
        return pt_id;
    }

    public void setPt_id(int pt_id) {
        this.pt_id = pt_id;
    }

    public String getPt_nom() {
        return pt_nom;
    }

    public void setPt_nom(String pt_nom) {
        this.pt_nom = pt_nom;
    }

    public String getPt_desc() {
        return pt_desc;
    }

    public void setPt_desc(String pt_desc) {
        this.pt_desc = pt_desc;
    }

    public int getPt_neg_id() {
        return pt_neg_id;
    }

    public void setPt_neg_id(int pt_neg_id) {
        this.pt_neg_id = pt_neg_id;
    }

    public String getPt_nom_neg() {
        return pt_nom_neg;
    }

    public void setPt_nom_neg(String pt_nom_neg) {
        this.pt_nom_neg = pt_nom_neg;
    }

    public int getPt_cost() {
        return pt_cost;
    }

    public void setPt_cost(int pt_cost) {
        this.pt_cost = pt_cost;
    }

    public int getPt_cla_id() {
        return pt_cla_id;
    }

    public void setPt_cla_id(int pt_cla_id) {
        this.pt_cla_id = pt_cla_id;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    @Override
    public String toString() {
        return "Platillo{" + "pt_id=" + pt_id + ", pt_nom=" + pt_nom + ", pt_desc=" + pt_desc + ", pt_neg_id=" + pt_neg_id + ", pt_nom_neg=" + pt_nom_neg + ", pt_cost=" + pt_cost + ", pt_cla_id=" + pt_cla_id + ", cla=" + cla + '}';
    }

    
    
}
