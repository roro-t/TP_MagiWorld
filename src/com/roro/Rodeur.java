package com.roro;

public class Rodeur extends Personnage {

    /**
     * Initialisation du Personnage : Rodeur
     * @param joueur       Joueur 1 ou 2
     * @param niveau       Niveau choisi du personnage
     * @param force        Force choisi du personnage
     * @param agilite      Agilité choisi du personnage
     * @param intelligence Intelligence choisi du personnage
     * @param pointDeVie   Point de vie du personnage
     */
    public Rodeur(int joueur, int niveau, int force, int agilite, int intelligence, int pointDeVie) {
        super(joueur, niveau, force, agilite, intelligence, pointDeVie);
        System.out.println("Mouahahah je suis un Rodeur joueur " + joueur + " niveau " + niveau + " je possède " + pointDeVie + " de vitalité, " + force + " force " + agilite + " d'agilité " + intelligence + " d'intelligence !");
    }
    /*-------------------------------------------------------------------------*/
    @Override
    public void attaqueBasique(Personnage attaquant, Personnage victime) {
        int dommages = getAgilite();

        System.out.println("Joueur " +  attaquant.getJoueur() + " utilise le Tir à l'arc et inflige " + dommages + " dommages.");
        System.out.println("Joueur " +  victime.getJoueur() + " perd " + dommages + " point de vie.");

        victime.retraitPointDeVie(dommages);
    }
    /*-------------------------------------------------------------------------*/
    @Override
    public void attaqueSpeciale(Personnage attaquant, Personnage victime) {
        int ajoutAgilite = getNiveau() / 2;

        System.out.println("Joueur " + attaquant.getJoueur() + " utilise Concentration et gagne " + ajoutAgilite + " en agilité.");

        int newAgilite = getAgilite() + ajoutAgilite;
        attaquant.setAgilite(newAgilite);
    }
    /*-------------------------------------------------------------------------*/
}
