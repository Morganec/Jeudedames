package fr.kwidz.JeuDeDames.Client.Graphisme;

import fr.kwidz.JeuDeDames.Client.Jeu.Jeu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kwidz on 15-03-19.
 */
public class FenetreMenu extends JFrame implements ActionListener {

    public FenetreMenu(){
        this.getContentPane().setLayout(null);
        PanelMenu p = new PanelMenu();
        this.setTitle("Jeux de dames !");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(610, 630);
        this.setLayout(null);
        JButton jouer = new JButton("Commencer une partie");
        jouer.addActionListener(this);
        jouer.setBounds(200, 240, 200, 50);
        this.add(jouer);
        this.add(p);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Jeu monJeu = new Jeu();
        this.dispose();
    }
}
