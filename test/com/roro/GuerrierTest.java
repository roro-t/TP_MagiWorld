package com.roro;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GuerrierTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    Guerrier guerrierJ1 = new Guerrier(1,80,30,30,20,400);
    Mage mageJ2 = new Mage(2,50,30,10,10,250);

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
    public void Given_NewCharacter_WhenChooseGuerrier_Then_DisplayDescriptionCharacterGuerrier(){
        Guerrier guerrier = new Guerrier(1,80,30,30,20,400);
        assertEquals("Woarg je suis un Guerrier joueur 1 niveau 80 je possède 400 de vitalité, 30 force 30 d'agilité 20 d'intelligence !\n",outContent.toString());
    }
    @Test
    public void Given_Attack1_WhenChooseAttackBasic_Then_DisplayCorrectlyDamage(){
        guerrierJ1.attaqueBasique(guerrierJ1,mageJ2);
        assertEquals(220,mageJ2.getPointDeVie());
        assertEquals("Joueur 1 utilise Coup d'Epee et inflige 30 dommages.\nJoueur 2 perd 30 point de vie.\n",outContent.toString());
    }

    @Test
    public void Given_Attack2_WhenChooseAttackSpecial_Then_DisplayCorrectlyDamage(){
        guerrierJ1.attaqueSpeciale(guerrierJ1,mageJ2);
        assertEquals(190,mageJ2.getPointDeVie());
        assertEquals("Joueur 1 utilise Coup de rage et inflige 60 dommages.\nJoueur 2 perd 60 point de vie.\nJoueur 1 perd 15 point de vie.\n",outContent.toString());
    }



}