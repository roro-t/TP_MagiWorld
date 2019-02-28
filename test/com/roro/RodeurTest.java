package com.roro;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class RodeurTest {
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
    public void Given_NewCharacter_WhenChooseRodeur_Then_DisplayDescriptionCharacterRodeur(){
        Rodeur rodeur = new Rodeur(1,100,50,30,20,500);
        assertEquals("Mouahahah je suis un Rodeur joueur 1 niveau 100 je possède 500 de vitalité, 50 force 30 d'agilité 20 d'intelligence !\n",outContent.toString());
    }

}