package com.roro;

public abstract class Personnage {

    protected int joueur;
    protected int niveau;
    protected int force;
    protected int agilite;
    protected int intelligence;
    protected int pointDeVie;

    public Personnage(int joueur,int niveau, int force, int agilite, int intelligence, int pointDeVie){
        this.joueur       = joueur;
        this.niveau       = niveau;
        this.force        = force;
        this.agilite      = agilite;
        this.intelligence = intelligence;
        this.pointDeVie   = pointDeVie;

    }
    /*-----------------------------------------------------------------------------------*/
    public int getJoueur() {
        return joueur;
    }
    /*-----------------------------------------------------------------------------------*/
    public int getNiveau() {
        return niveau;
    }
    /*-----------------------------------------------------------------------------------*/
    public int getForce() {
        return force;
    }
    /*-----------------------------------------------------------------------------------*/
    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }
    /*-----------------------------------------------------------------------------------*/
    public int getIntelligence() {
        return intelligence;
    }
    /*-----------------------------------------------------------------------------------*/
    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }
    /*-----------------------------------------------------------------------------------*/
    public void retraitPointDeVie(int dommages){
        pointDeVie = pointDeVie - dommages;
    }
    /*-----------------------------------------------------------------------------------*/

    /**
     * Abstract method
     * @param attaquant joueur attaquant
     * @param adversaire joueur adversaire
     */
    public abstract void attaqueBasique(Personnage attaquant,Personnage adversaire);

    /**
     Abstract method
     * @param attaquant joueur attaquant
     * @param adversaire joueur adversaire
     */
    public abstract void attaqueSpeciale(Personnage attaquant,Personnage adversaire);
}


