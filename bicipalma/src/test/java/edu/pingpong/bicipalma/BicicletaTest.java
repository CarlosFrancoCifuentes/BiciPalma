package domain.bicicleta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.bicicleta.Bicicleta;

public class BicicletaTest {
    
    @Test
    public void obtenerIdBici(){
        Bicicleta bicicleta = new Bicicleta(2);
        assertEquals(2, Bicicleta.toString());
    }
}
