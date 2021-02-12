package edu.pingpong.bicipalma;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.bicipalma.domain.bicicleta.Bicicleta;

public class BicicletaTest {

    Bicicleta bici = null;
    
    @Before
    public void setup() {
        this.bici = new Bicicleta(999);
    }

    @Test
    public void constructorBiciTest() {
        assertEquals(999, bici.getId());
    }

    @Test
    public void toStringTest() {
        assertEquals("999", bici.toString());
    }

    @Test
    public void implementationMovilTest() {
        Bicicleta movil = bici;
        assertEquals(999, movil.getId());
    }
}