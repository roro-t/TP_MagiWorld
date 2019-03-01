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

    public void setJoueur(int joueur) {
        this.joueur = joueur;
    }
    /*-----------------------------------------------------------------------------------*/
    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    /*-----------------------------------------------------------------------------------*/
    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
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

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
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
    public abstract void attaqueBasic(Personnage attaquant,Personnage enemy);

    public abstract void attaqueSpecial(Personnage attaquant,Personnage enemy);
}


