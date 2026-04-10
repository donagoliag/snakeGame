package org.example;

import static org.example.Constantes.CASE_EN_PIXEL;
//Les indices d'une case
public class Case {

    private int xIndice;
    private int yIndice;

    public Case(int x, int y){
        this.xIndice = x;
        this.yIndice= y;
    }

    public int getxIndice() {
        return xIndice;
    }

    public void setxIndice(int xIndice) {
        this.xIndice = xIndice;
    }

    public int getyIndice() {
        return yIndice;
    }

    public void setyIndice(int yIndice) {
        this.yIndice = yIndice;
    }

    //Les coordonnees en pixels

    public int getXPixel(){
        return this.xIndice*CASE_EN_PIXEL;
    }

    public int getYPixel(){
        return this.yIndice*CASE_EN_PIXEL;
    }

    //Largeur et Longueur d'une Case
    public int getLargeur() {
        return CASE_EN_PIXEL;
    }

    public int getHauteur() {
        return CASE_EN_PIXEL;
    }

}
