/**
 * Created by DufVi1731300 on 2018-01-15.
 */
public class Joueur {
    private String nom = "";
    private String actions = "";

    public Joueur() {}

    public void setNom(String _nom) {this.nom = _nom;}
    public void setActions(int _action) {this.actions += (_action + ", ");}
    public String getNom() {return this.nom;}
    public String getActions() {return this.actions;}
}
