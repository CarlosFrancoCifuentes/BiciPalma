package edu.pingpong.bicipalma;

import org.junit.Test;

public class AnclajesTest {

    @Test
    public void toStringTest() {
        Anclajes anclajes = new Anclajes(6);
        assertEquals("Numero de anclajes: 6", anclajes.toString());
    } 
}

