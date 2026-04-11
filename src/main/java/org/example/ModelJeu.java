package org.example;

import java.awt.*;

public class ModelJeu {
    private Serpent serpent;
    private boolean laPartieEstPerdu;
    //Les differents actons du user sur le serpent

    public ModelJeu() {
        serpent = new Serpent();
        laPartieEstPerdu = false;
    }


    public void calcul(){

        serpent.calcul();
        if (serpent.estMort()==true){
            laPartieEstPerdu = true;
        }
    }

    //Pour dessiner a l'ecran les elemnts de jeux
    public void affichage(Graphics g){

        serpent.affichage(g);
        if (laPartieEstPerdu){
            String str = "Game Over";
            g.setColor(Color.RED);
            g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
            FontMetrics fm = g.getFontMetrics();
            int x = (g.getClipBounds().width - fm.stringWidth(str)) / 2;
            int y = (g.getClipBounds().height / 2) + fm.getMaxDescent();
            g.drawString(str, x, y);
        }

    }

}
