package com.roro;

public class Guerrier extends Personnage{

    /**
     * Initialisation du Personnage : Guerrier
     * @param joueur Joueur 1 ou 2
     * @param niveau Niveau choisi du personnage
     * @param force Force choisi du personnage
     * @param agilite Agilité choisi du personnage
     * @param intelligence Intelligence choisi du personnage
     * @param pointDeVie Point de vie du personnage
     */
    public Guerrier(int joueur,int niveau, int force, int agilite, int intelligence, int pointDeVie) {
        super(joueur,niveau,force,agilite,intelligence,pointDeVie);
        System.out.println("Woarg je suis un Guerrier joueur " + joueur + " niveau " + niveau + " je possède " + pointDeVie + " de vitalité, " + force + " force " + agilite + " d'agilité " + intelligence + " d'intelligence !");
    }
    /*-------------------------------------------------------------------------*/
    @Override
    public void attaqueBasique(Personnage attaquant, Personnage victime) {
        int dommages = getForce();

        System.out.println("Joueur " +  attaquant.getJoueur() + " utilise Coup d'Epee et inflige " + dommages + " dommages.");
        System.out.println("Joueur " +  victime.getJoueur() + " perd " + dommages + " point de vie.");

        victime.retraitPointDeVie(dommages);
    }
    /*-------------------------------------------------------------------------*/
    @Override
    public void attaqueSpeciale(Personnage attaquant, Personnage victime) {
        int dommages = getForce() * 2;
        int dommageAttaquant = getForce() / 2;

        System.out.println("Joueur " + attaquant.getJoueur() + " utilise Coup de rage et inflige " + dommages + " dommages.");
        System.out.println("Joueur " +  victime.getJoueur() + " perd " + dommages + " point de vie.");
        System.out.println("Joueur " +  attaquant.getJoueur() + " perd " + dommageAttaquant + " point de vie.");

        victime.retraitPointDeVie(dommages);
        attaquant.retraitPointDeVie(dommageAttaquant);
    }
    /*-------------------------------------------------------------------------*/
}
