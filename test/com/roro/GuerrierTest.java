package com.roro;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GuerrierTest {
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
        Guerrier guerrier = new Guerrier(1,80,30,30,20,400);
        assertEquals("Woarg je suis un Guerrier joueur 1 niveau 80 je possède 400 de vitalité, 30 force 30 d'agilité 20 d'intelligence !\n",outContent.toString());
    }

}