package com.roro;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    Mage mageJ1 = new Mage(1,50,30,10,10,250);
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
    public void Given_NewCharacter_WhenChooseMage_Then_DisplayDescriptionCharacterMage(){
        Mage mageJ1 = new Mage(1,50,30,10,10,250);
        assertEquals("Abracadabra je suis un Mage joueur 1 niveau 50 je possède 250 de vitalité, 30 force 10 d'agilité 10 d'intelligence !\n",outContent.toString());
    }

    @Test
    public void Given_Attack1_WhenChooseAttackBasic_Then_DisplayCorrectlyDamage(){
        mageJ1.attaqueBasic(mageJ1,guerrierJ2);
        assertEquals(390,guerrierJ2.getPointDeVie());
        assertEquals("Joueur 1 utilise Boule de feu et inflige 10 dommages.\nJoueur 2 perd 10 point de vie.\n",outContent.toString());
    }

    @Test
    public void Given_Attack2_WhenChooseAttackSpecial_Then_DisplayCorrectlyDamage(){
        mageJ1.attaqueSpecial(mageJ1,guerrierJ2);
        assertEquals(400,guerrierJ2.getPointDeVie());
        assertEquals("Joueur 1 utilise le Soin et gagne 20 en point de vie.\nJoueur 1 gagne 20 en point de vie.\n",outContent.toString());
    }


}