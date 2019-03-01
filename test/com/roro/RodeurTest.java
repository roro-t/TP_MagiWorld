package com.roro;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class RodeurTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    Rodeur rodeurJ1 = new Rodeur(1,100,40,40,20,500);
    Guerrier guerrierJ2 = new Guerrier(2,80,30,30,20,400);

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    /*----------------------------------------------------------------------------------*/
    @Test
    public void Given_NewCharacter_WhenChooseRodeur_Then_DisplayDescriptionCharacterRodeur(){
        Rodeur rodeur = new Rodeur(1,100,50,30,20,500);
        assertEquals("Mouahahah je suis un Rodeur joueur 1 niveau 100 je possède 500 de vitalité, 50 force 30 d'agilité 20 d'intelligence !\n",outContent.toString());
    }
    @Test
    public void Given_Attack1_WhenChooseAttackBasic_Then_DisplayCorrectlyDamage(){
        rodeurJ1.attaqueBasic(rodeurJ1,guerrierJ2);
        assertEquals(360,guerrierJ2.getPointDeVie());
        assertEquals("Joueur 1 utilise le Tir à l'arc et inflige 40 dommages.\nJoueur 2 perd 40 point de vie.\n",outContent.toString());
    }

    @Test
    public void Given_Attack2_WhenChooseAttackSpecial_Then_DisplayCorrectlyDamage(){
        rodeurJ1.attaqueSpecial(rodeurJ1,guerrierJ2);
        assertEquals(400,guerrierJ2.getPointDeVie());
        assertEquals("Joueur 1 utilise Concentration et gagne 50 en agilité.\n",outContent.toString());
    }

}