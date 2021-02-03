package edu.pingpong.bicipalma;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.pingpong.bicipalma.domain.bicicleta.Bicicleta;
import edu.pingpong.bicipalma.domain.estacion.Anclajes;

public class AnclajeTest {
    
    @Test
    public void getBiciTest(){
        Bicicleta bici = new Bicicleta(3);
        assertEquals(3, Anclaje.getBici());
    }

    
}
