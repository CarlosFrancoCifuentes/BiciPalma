package edu.pingpong.bicipalma.domain.estacion;

public class Estacion {

    private final int id;
    private final String direccion;
    private Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes){
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    private int getId(){
        return id;
    }

    private String getDireccion(){
        return direccion;
    }

    private Anclajes[] getAnclajes(){
        return 
    }

    @Override
    public String toString(){
        ;
    }
}
