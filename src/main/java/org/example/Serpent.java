package org.example;

import java.awt.*;
import java.util.LinkedList;

public class Serpent {

    private LinkedList<Case> serpent;
    private Direction direction;

    public Serpent() {
        this.serpent = new LinkedList<Case>();
        serpent.add(new Case(14, 15));
        serpent.add(new Case(15, 15));
        serpent.add(new Case(16, 15));
        direction = Direction.VERS_LA_GAUCHE;
    }

    public void calcul() {
        avance();
    }

    public void affichage(Graphics g) {
        // activer l'anti-aliasing du dessin
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // dessin du serpent
        for (Case bouts : serpent) {
            g.fillOval(bouts.getXPixel(), bouts.getYPixel(), bouts.getLargeur(), bouts.getHauteur());
        }
    }

    private Case nextCase() {
        Case tete = serpent.getFirst();
        switch (direction) {
            case VERS_LE_HAUT:
                return new Case(tete.getxIndice(), (tete.getyIndice() - 1));
            case VERS_LA_DROITE:
                return new Case(tete.getxIndice() + 1, tete.getyIndice());
            case VERS_LA_GAUCHE:
                return new Case(tete.getxIndice() - 1, tete.getyIndice());
            case VERS_LE_BAS:
                return new Case(tete.getxIndice(), tete.getyIndice() + 1);
        }
        return null;
    }

    public void avance(){
        serpent.addFirst(nextCase());
        serpent.removeLast();
    }

}

