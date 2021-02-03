package edu.pingpong.bicipalma.domain.estacion;

import java.util.concurrent.ThreadLocalRandom;

import edu.pingpong.bicipalma.domain.bicicleta.Bicicleta;

public class Anclajes{
    
    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes){
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    };

    private void crearAnclajes(){
        for (int i = 0; i < anclajes.length; i++){
            this.anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes(){
        return this.anclajes;
    }

    int numAnclajes(){
        return this.anclajes.length;
    }

    void ocuparAnclaje(int numAnclaje, Bicicleta bici){
        this.anclajes[numAnclaje].anclarBici(bici);
    }

    }
