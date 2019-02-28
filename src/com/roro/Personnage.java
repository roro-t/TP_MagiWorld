package com.roro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Personnage {

    Scanner entree = new Scanner(System.in);

    protected int joueur;
    protected int choixPersonnage;
    protected int niveau;
    protected int force;
    protected int agilite;
    protected int intelligence;
    protected int pointDeVie;

    /*-----------------------------------------------------------------------------------*/
    public int getJoueur() {
        return joueur;
    }

    public void setJoueur(int joueur) {
        this.joueur = joueur;
    }
    /*-----------------------------------------------------------------------------------*/

    /*-----------------------------------------------------------------------------------*/
    /**
     * Initialisation du personnage
     */
    public void initialisationPersonnage(){
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
            joueur = getJoueur();

            // récapitulatif complet du personnage selon choix de l'utilisateur
            switch (choixPersonnage) {
                case 1:
                    new Guerrier(joueur,niveau,force,agilite,intelligence,pointDeVie);
                    break;
                case 2:
                    new Rodeur(joueur,niveau,force,agilite,intelligence,pointDeVie);
                    break;
                case 3:
                    new Mage(joueur,niveau,force,agilite,intelligence,pointDeVie);
                    break;
            }
        } catch(InputMismatchException e){
                System.out.println("Vous pouvez seulement entrer des nombres !");
            }
        }
    /*-----------------------------------------------------------------------------------*/
    public void attaqueBasique() {}

    public void attaqueSpeciale() {}

}
