package fr.kwidz.JeuDeDames.Jeu;


import java.util.ArrayList;

/**
 * Created by kwidz on 27/01/15.
 */
public class Damier {
    public Case[][] lesCases = new Case[10][10]; //Le dammier contient un tableau de 10*10 cases
    ArrayList<Case> chemin = new ArrayList<Case>();
    public Damier(){
        boolean white=true;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (white) {
                    lesCases[i][j] = new CaseBlanche();
                    white = !white;
                }
                else {
                    lesCases[i][j] = new CaseNoire();
                    if(j<4){
                        lesCases[i][j].pion = new Pion(true);
                    }
                    if(j>5){
                        lesCases[i][j].pion = new Pion(false);
                    }
                    white = !white;
                }


            }
            white=!white;
        }
    }

    public void TrouverCheminPossible(int casex, int casey){  //pour l'instant cette methode renvois une case aleatoire
        lesCases[casex+1][casey+1].choisissable = true;
        chemin.add(lesCases[casex][casey]);
        chemin.add(lesCases[casex+1][casey+1]);
        chemin.add(lesCases[casex-1][casey+1]);

    }

    public ArrayList<Case> getChemin(){
        return this.chemin;
    }

    public void EffacerChemin(){
        this.chemin = new ArrayList<Case>();
    }
}
