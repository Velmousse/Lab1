/**
 * Created by DufVi1731300 on 2018-01-15.
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int entree = 0, nbAllumettes = 0, nbTours = 0;
        boolean continuer = true;
        String entreeString = "";
        char entreeChar = ' ';

        Joueur j1 = new Joueur(false);
        Joueur j2 = new Joueur(false);
        Joueur jc = j1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bienvenue dans le jeu des allumettes.\n" +
                "1- VS IA\n" +
                "2- VS joueur\n" +
                "> ");
        entree = sc.nextInt();
        if (entree == 1) j2 = new Joueur(true);

        while (continuer) {
            nbAllumettes = (int)((Math.random() * 61) + 20);
            System.out.print("\nJoueur 1, veuillez entrer votre nom: ");
            j1.setNom(sc.next());
            if (!j2.isIA()) {
                System.out.print("Joueur 2, veuillez entrer votre nom: ");
                j2.setNom(sc.next());
            }

            while (nbAllumettes > 0) {
                if (Joueur.nbTours % 2 == 0) jc = j1;
                else jc = j2;
                Joueur.nbTours++;

                System.out.println("\nIl reste " + nbAllumettes + " allumettes.\n" +
                        jc.getNom() + ", combien d'allumettes (entre 1 et 3) voulez-vous retirer? ");
                if (!jc.isIA()) entree = sc.nextInt();
                else System.out.println(entree = jc.coupIA(nbAllumettes));
                if (entree > 3) entree = 3;
                else if (entree < 1) entree = 1;
                jc.setActions(entree);
                nbAllumettes -= entree;

                if (nbAllumettes <= 0) {
                    System.out.print("\n" + jc.getNom() + " perd la partie.\n\n" +
                            "Décisions prises par " + j1.getNom() + ": " + j1.getActions() + "\n" +
                            "Décisions prises par " + j2.getNom() + ": " + j2.getActions() + "\n" +
                            "\nVoulez-vous jouer de nouveau (o/n)? ");
                    entreeChar = sc.next().toLowerCase().charAt(0);
                    if (entreeChar == 'n') {
                        continuer = false;
                        System.out.print("Merci d'avoir joué, bonne journée.");
                    }
                }
            }
        }
    }
}