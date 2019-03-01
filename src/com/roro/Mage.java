package com.roro;

public class Mage extends Personnage {

    /**
     * Initialisation du Personnage : MAGE
     * @param joueur       Joueur 1 ou 2
     * @param niveau       Niveau choisi du personnage
     * @param force        Force choisi du personnage
     * @param agilite      Agilité choisi du personnage
     * @param intelligence Intelligence choisi du personnage
     * @param pointDeVie   Point de vie du personnage
     */
    public Mage(int joueur,int niveau, int force, int agilite, int intelligence, int pointDeVie) {
        super(joueur,niveau,force,agilite,intelligence,pointDeVie);
        System.out.println("Abracadabra je suis un Mage joueur " + joueur + " niveau " + niveau + " je possède " + pointDeVie + " de vitalité, " + force + " force " + agilite + " d'agilité " + intelligence + " d'intelligence !");
    }
    /*-------------------------------------------------------------------------*/
    @Override
    public void attaqueBasique(Personnage attaquant, Personnage victime) {
        int dommages = getIntelligence();

        System.out.println("Joueur " +  attaquant.getJoueur() + " utilise Boule de feu et inflige " + dommages + " dommages.");
        System.out.println("Joueur " +  victime.getJoueur() + " perd " + dommages + " point de vie.");

        victime.retraitPointDeVie(dommages);
    }
    /*-------------------------------------------------------------------------*/
    @Override
    public void attaqueSpeciale(Personnage attaquant, Personnage victime) {
        int ajoutPointDeVie = getIntelligence() * 2;

        System.out.println("Joueur " + attaquant.getJoueur() + " utilise le Soin et gagne " + ajoutPointDeVie + " en point de vie.");
        System.out.println("Joueur " +  attaquant.getJoueur() + " gagne " + ajoutPointDeVie + " en point de vie.");

        int newPointDeVie = getPointDeVie() + ajoutPointDeVie;
        attaquant.setPointDeVie(newPointDeVie);
    }
    /*-------------------------------------------------------------------------*/
}
