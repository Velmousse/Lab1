/**
 * Created by DufVi1731300 on 2018-01-15.
 */
public class Joueur {
    private String nom = "";
    private String actions = "";
    private boolean IA;

    public Joueur(boolean _IA) {
        if (_IA) {
            this.IA = true;
            this.nom = "IA";
        }
        else this.IA = false;
    }

    public void setNom(String _nom) {this.nom = _nom;}
    public void setActions(int _action) {this.actions += (_action + ", ");}
    public String getNom() {return this.nom;}
    public String getActions() {return this.actions;}
    public boolean getIA() {return this.IA;}

    public int coupIA(int _nbAllumettes) {
        int sortie = 0;

        if (_nbAllumettes < 6) sortie = 3;
        else if (_nbAllumettes == 6)

        return sortie;
    }
}
