package com.roro;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bonjour ! bienvenue sur le jeu MagiWorld");

        System.out.println("");

        System.out.println("Création du joueur 1");
        Personnage joueur1 = new Personnage();
        joueur1.setJoueur(1);
        joueur1.initialisationPersonnage();

        System.out.println("");

        System.out.println("Création du joueur 2");
        Personnage joueur2 = new Personnage();
        joueur2.setJoueur(2);
        joueur2.initialisationPersonnage();
    }
}
