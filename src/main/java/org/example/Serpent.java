package org.example;

import java.awt.*;
import java.util.LinkedList;

public class Serpent {

    private LinkedList<Case> serpent;

    public Serpent(){
        this.serpent = new LinkedList<Case>();
        serpent.add(new Case(14,15));
        serpent.add(new Case(15,15));
        serpent.add(new Case(16,15));
    }

    public void calcul(){

    }

    public void affichage(Graphics g){
        // activer l'anti-aliasing du dessin
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        // dessin du serpent
        for (Case bouts: serpent){
            g.fillOval(bouts.getXPixel(),bouts.getYPixel(),bouts.getLargeur(),bouts.getHauteur());
        }
    }
}
