package com.roro;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

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
        Mage mage = new Mage(1,50,30,10,10,250);
        assertEquals("Abracadabra je suis un Mage joueur 1 niveau 50, je possède 250 de vitalité, 30 de force, 10 d'agilité et 10 d'intelligence !\n",outContent.toString());
    }


}