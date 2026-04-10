package org.example;

import java.awt.*;

public class ModelJeu {
    private static int entier = 0;
    //Les differents actons du user sur le serpent

    Serpent serpent = new Serpent();

    public void calcul(){
        serpent.calcul();
    }

    //Pour dessiner a l'ecran les elemnts de jeux
    public void affichage(Graphics g){

        serpent.affichage(g);

    }

}
