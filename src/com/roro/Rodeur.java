package com.roro;

public class Rodeur extends Personnage {

    /**
     * Initialisation du Personnage : Rodeur
     * @param joueur Joueur 1 ou 2
     * @param niveau Niveau choisi du personnage
     * @param force Force choisi du personnage
     * @param agilite Agilité choisi du personnage
     * @param intelligence Intelligence choisi du personnage
     * @param pointDeVie Point de vie du personnage
     */
    public Rodeur(int joueur, int niveau, int force, int agilite, int intelligence, int pointDeVie) {
        System.out.println("Mouahahah je suis un Rodeur joueur " + joueur + " niveau " + niveau + " je possède " + pointDeVie + " de vitalité, " + force + " force " + agilite + " d'agilité " + intelligence + " d'intelligence !");
    }
}
