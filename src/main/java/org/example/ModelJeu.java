package org.example;

import java.awt.*;

/*Nous entendons par calcul du jeu plusieurs choses. Tout d'abord, la méthode aura pour tâche d'identifier les actions demandées par le joueur.
Dans notre jeu, il sera possible de changer la direction du serpent au clavier. Nous devrons donc « interroger » le clavier afin de connaître
les intentions du joueur (la « gestion des entrées »). Ensuite nous devrons calculer les positions des différents éléments
du jeu (les anneaux du serpent et la grenouille) en tenant compte des intentions du joueur. Le calcul de ces positions nous
permet de savoir s'il y a collision entre la tête du serpent et la grenouille, ou bien encore si la tête du serpent entre
en collision avec les limites du plateau de jeu ou avec un de ses anneaux ce qui entraîne une fin de partie.
La méthode doit donc aussi gérer la fin de partie.

L'affichage du modèle du jeu consiste à dessiner à l'écran les éléments du jeu, c'est-à-dire les anneaux du serpent
et la grenouille en utilisant les positions de ces éléments déterminés par la précédente méthode de calcul du modèle.

Le modèle du jeu est donc en fait le cœur du jeu, la partie centrale de notre application.

Pour l'instant, ce modèle ne fait rien, nous en avons seulement écrit la structure. Nous verrons au fur et à mesure comment implémenter ces deux méthodes.*/
public class ModelJeu {

    public void calcul(){

    }

    public void affichage(Graphics g){

    }

}
