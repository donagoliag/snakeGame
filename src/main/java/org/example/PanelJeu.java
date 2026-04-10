package org.example;

import javax.swing.*;
import java.awt.*;

import static org.example.Constantes.*;
import static org.example.ModelJeu.*;

//C'est ici que je gere la fenetre et la grille Java

public class PanelJeu extends JPanel {

    //Afficher Mon Panel de Jeux
    public static void afficherPanel(){

        JFrame fenetre = new JFrame();
        fenetre.setTitle("Snake Game");

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fenetre.setResizable(false);


        ModelJeu modelJeu = new ModelJeu();
        final JPanel panel= new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                modelJeu.affichage(g);
            }
        };
        panel.setPreferredSize(new Dimension(NB_COL*CASE_EN_PIXEL,NB_LINES*CASE_EN_PIXEL));


        fenetre.setContentPane(panel);
        fenetre.pack();
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);

        // Créer un thread infini
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true){
                    // à chaque fois que la boucle est exécutée, la
                    // méthode de calcul du jeu est appelée.
                    // Comme la boucle est infinie, la méthode de calcul
                    // sera appelée en cycle perpétuel.
                    modelJeu.calcul();
                    panel.repaint();


                    //Le temps d'attente du thread
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException e){

                    }
                }


            }
        });

        thread.start();
    }

    //PaintComponent, méthode que Java appelle automatiquement chaque fois qu'il faut redessiner le panel.

    //Dessin de la grille

}
