package com.roro;

public class Mage extends Personnage {

    protected int joueur;
    protected int niveau;
    protected int force;
    protected int agilite;
    protected int intelligence;
    protected int pointDeVie;

    /**
     * Initialisation du Personnage : MAGE
     * @param joueur Joueur 1 ou 2
     * @param niveau Niveau choisi du personnage
     * @param force Force choisi du personnage
     * @param agilite Agilité choisi du personnage
     * @param intelligence Intelligence choisi du personnage
     * @param pointDeVie Point de vie du personnage
     */
    public Mage(int joueur, int niveau, int force, int agilite, int intelligence, int pointDeVie) {
        System.out.println("Abracadabra je suis un Mage joueur " + joueur + " niveau " + niveau + ", je possède " + pointDeVie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + intelligence + " d'intelligence !");

    }



}
