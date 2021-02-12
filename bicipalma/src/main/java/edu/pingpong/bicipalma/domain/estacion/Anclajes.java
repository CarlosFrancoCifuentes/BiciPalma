package edu.pingpong.bicipalma.domain.estacion;

import java.util.concurrent.ThreadLocalRandom;

import edu.pingpong.bicipalma.domain.bicicleta.Bicicleta;

class Anclajes{
    
    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes){
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

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

    @Override
    public String toString(){
        return "Número de anclajes " + Integer.toString(numAnclajes());
    }

    void ocuparAnclaje(int numAnclaje, Bicicleta bici){
        this.anclajes[numAnclaje].anclarBici(bici);
    }

    boolean isAnclajeOcupado(int posicion){
        return this.anclajes[posicion].isOcupado();
    }

    void liberarAnclaje(int anclaje){
        this.anclajes[anclaje].liberarBici();
    }

    Bicicleta getBiciAt(int bici){
        return this.anclajes[bici].getBici();
    }

    int seleccionarAnclaje(){
        Integer idAnclaje = ThreadLocalRandom.current().nextInt(0, numAnclajes());
        return idAnclaje;
    }
    }
