package com.roro;

import java.util.Scanner;

public class Game {

    Scanner entree = new Scanner(System.in);
    protected int attaque;

    /**
     * Lancement du jeu
     * @param attaquant joueur attaquant
     * @param victime joueur victime
     */
    public Game(Personnage attaquant, Personnage victime){


        do {
            combat(attaquant, victime);
            System.out.println("");
            combat(victime,attaquant);
            System.out.println("");

        } while (attaquant.getPointDeVie() > 1 && victime.getPointDeVie() > 1);

        System.out.println("Le jeu est terminé.");

        if (attaquant.getPointDeVie() <= 0) {
            System.out.println("Le Joueur " + attaquant.getJoueur() + " a perdu.");
        } else if (victime.getPointDeVie() <= 0) {
            System.out.println("Le Joueur " + victime.getJoueur() + " a perdu.");
        }

        }

    /*-------------------------------------------------------------------------*/
    /**
     *  Choix de l'attaque selon personnage
     * @param attaquant joueur qui attaque
     * @param victime joueur adversaire
     */
    public void combat(Personnage attaquant, Personnage victime) {
        try {
            do {
                System.out.println("Joueur " + attaquant.joueur + " (" + attaquant.pointDeVie + " Vitalité) veuillez choisir votre action (1: Attaque Basique, 2: Attaque Spéciale)");
                attaque = entree.nextInt();

                if (attaque == 1) {
                    attaquant.attaqueBasique(attaquant, victime);
                } else if (attaque == 2) {
                    attaquant.attaqueSpeciale(attaquant, victime);
                } else {
                    System.out.println("Vous n'avez pas fait un choix correct");
                }

            } while (attaque < 1 || attaque > 2);
        } catch (Exception e) {
            System.out.println("Vous devez rentrer des nombres");
        }
    }
    /*-------------------------------------------------------------------------*/

}
