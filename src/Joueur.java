/**
 * Created by DufVi1731300 on 2018-01-15.
 */
public class Joueur {
    private String nom = "";
    private String actions = "";
    private boolean IA;
    static int nbTours = 0;

    public Joueur(boolean _IA) {
        if (_IA) {
            this.IA = true;
            this.nom = "IA";
        }
        else this.IA = false;
    }

    public void setNom(String _nom) {this.nom = _nom;}
    public void setActions(int _action) {
        if (nbTours == 1 || nbTours == 2) this.actions += (_action);
        else this.actions += (", " + _action);
    }
    public String getNom() {return this.nom;}
    public String getActions() {
        String actionsTemp = this.actions;
        this.actions = "";
        return actionsTemp;
    }
    public boolean isIA() {return this.IA;}

    public int coupIA(int _nbAllumettes) {
        int sortie = 0;
        if (((_nbAllumettes - 1) % 4) == 0) sortie = 3;
        else if ((_nbAllumettes % 6) == 0) sortie = 1;
        else if ((_nbAllumettes % 5) == 0) sortie = 1;
        else if ((_nbAllumettes % 4) == 0) sortie = 3;
        else if ((_nbAllumettes % 3) == 0) sortie = 2;
        else sortie = 1;
        return sortie;
    }
}
