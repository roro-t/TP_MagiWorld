package com.roro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Bonjour ! bienvenue sur le jeu MagiWorld");

        System.out.println("");

        System.out.println("Création du joueur 1");
        Personnage joueur1 = initialisationPersonnage(1);

        System.out.println("");

        System.out.println("Création du joueur 2");
        Personnage joueur2 = initialisationPersonnage(2);

        System.out.println("");
        new Game(joueur1, joueur2);
    }
    /*-------------------------------------------------------------------------*/
    /**
     * Initialisation du personnage
     */
    public static Personnage initialisationPersonnage(int numeroJoueur) {

        Scanner entree = new Scanner(System.in);
        
        Personnage persoComplet = null;
        int joueur;
        int choixPersonnage;
        int niveau;
        int force;
        int agilite;
        int intelligence;
        int pointDeVie;
        int totalInitJoueur;


        try {
            do {
                System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rodeur, 3: Mage):");
                choixPersonnage = entree.nextInt();

                if (choixPersonnage < 1 || choixPersonnage > 3) {
                    System.out.println("Vous n'avez pas fait un choix entre les 3 personnages proposés");
                }

            } while (choixPersonnage < 1 || choixPersonnage > 3);


            do {
                System.out.println("Niveau du personnage?:");
                niveau = entree.nextInt();
                if (niveau < 0 || niveau > 100) {
                    System.out.println("Désolé le nombre doit etre compris entre 0 et 100.");
                    System.out.println("Niveau du personnage?:");
                    niveau = entree.nextInt();
                }

                System.out.println("Force du personnage?:");
                force = entree.nextInt();
                if (force < 0 || force > 100) {
                    System.out.println("Désolé le nombre doit etre compris entre 0 et 100.");
                    System.out.println("Force du personnage?:");
                    force = entree.nextInt();
                }
                System.out.println("Agilité du personnage?:");
                agilite = entree.nextInt();
                if (force < 0 || force > 100) {
                    System.out.println("Désolé le nombre doit etre compris entre 0 et 100.");
                    System.out.println("Agilité du personnage?:");
                    agilite = entree.nextInt();
                }

                System.out.println("Intelligence du personnage?:");
                intelligence = entree.nextInt();
                if (force < 0 || force > 100) {
                    System.out.println("Désolé le nombre doit etre compris entre 0 et 100.");
                    System.out.println("Intelligence du personnage?:");
                    intelligence = entree.nextInt();
                }

                totalInitJoueur = force + agilite + intelligence;
                if (totalInitJoueur > niveau) {
                    System.out.println("Désolé le total : force + agilité + intelligence ne doit pas dépasser le niveau de votre personnage.");
                }
            } while ((totalInitJoueur > niveau));

            pointDeVie = niveau * 5;
            joueur = numeroJoueur;

            // récapitulatif complet du personnage selon choix de l'utilisateur

            switch (choixPersonnage) {
                case 1:
                    persoComplet = new Guerrier(joueur, niveau, force, agilite, intelligence, pointDeVie);
                    break;
                case 2:
                    persoComplet = new Rodeur(joueur, niveau, force, agilite, intelligence, pointDeVie);
                    break;
                case 3:
                    persoComplet = new Mage(joueur, niveau, force, agilite, intelligence, pointDeVie);
                    break;
            }
            return persoComplet;
        } catch (Exception e) {
            System.out.println("Vous devez rentrer des nombres");

        }
    return null;
    }
    /*-------------------------------------------------------------------------*/
}
