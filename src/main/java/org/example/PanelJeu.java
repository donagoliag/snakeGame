package org.example;

import javax.swing.*;
import java.awt.*;

//C'est ici que je gere la fenetre et la grille Java

public class PanelJeu extends JPanel {

    //Afficher Mon Panel de Jeux
    public static void afficherPanel(){

        //La classe Jframe pour les fenetre graphiques en Java, so j'instancie un objec jframe
        JFrame fenetre = new JFrame();

        fenetre.setSize(400,400);
        fenetre.setBackground(Color.BLACK);
        //Rendre le panel capable de recevoir les touches clavier
        fenetre.setFocusable(true);

        //Afficher le titre de la fenetre
        fenetre.setTitle("Snake Game");
        //Actu si je ferme la fenetre, elle ne va pas quitter le programme
        //Il va continuer de tourner en arriere plan donc je regle ca.
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creer le panneau
        JPanel panel= new JPanel();
        panel.setBackground(Color.BLACK);
        //Composant de mon panneau
        panel.add(new JLabel("Panel de Snake Game"));
        panel.add(new JButton("Bouton"));
        //J'ajoute mon paneau au Jframe
        fenetre.setContentPane(panel);
        //ajuste la fenêtre à la taille du panel automatiquement
        //fenetre.pack();
        //Ici je rends la fenetre visible
        fenetre.setVisible(true);

        // Créer un thread infini

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true);
            }
        });
    }

    //PaintComponent, méthode que Java appelle automatiquement chaque fois qu'il faut redessiner le panel.

    //Dessin de la grille

}
