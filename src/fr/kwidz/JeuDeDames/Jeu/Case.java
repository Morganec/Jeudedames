package fr.kwidz.JeuDeDames.Jeu;

import fr.kwidz.JeuDeDames.Graphisme.CaseDrawable;

import java.awt.*;

/**
 * Created by morgane on 27/01/15.
 */
public class Case{
    public CaseDrawable caseDrawableContenu;
    public Pion pion;
    public Boolean estSelectionne;
    public Case(){

        caseDrawableContenu = new CaseDrawable();
        estSelectionne =false;
    }

    public void Selectionner(){
        this.estSelectionne =true;
        this.caseDrawableContenu.Selectionner();
        this.caseDrawableContenu.repaint();
        //Ici nous appelerons la fonction qui dira sur quelle case on peut cliquer
    }
    public void DeSelectionner(){
        this.estSelectionne =false;
        this.caseDrawableContenu.DeSelectionner();
        this.caseDrawableContenu.repaint();
    }
}
