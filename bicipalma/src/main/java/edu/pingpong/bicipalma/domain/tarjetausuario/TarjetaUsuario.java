package edu.pingpong.bicipalma.domain.tarjetausuario;

public class TarjetaUsuario {
    
    private final String id;
    private boolean activada = false;

    public TarjetaUsuario(String id, boolean activada){
        this.id = id;
        this.activada = activada;
    }

    public boolean isActivate(){
        return this.activada;
    }

    public void setActivada(boolean activada){
        this.activada = activada;
    }

    @Override
    public String toString(){
        return this.id;
    }
}
