package edu.pingpong.bicipalma.domain.estacion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

import edu.pingpong.bicipalma.domain.bicicleta.Bicicleta;
import edu.pingpong.bicipalma.domain.tarjetausuario.TarjetaUsuario;

public class Estacion {

    private final int id;
    private final String direccion;
    private final Anclajes anclajes;

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

    @Override
    public String toString(){
        return String.format("id: %d %ndireccion: %s %nanclajes: %s", getId(), getDireccion(), numAnclajes());
    }

    private Anclaje[] getAnclajes() {
        return this.anclajes.anclajes();
    }

    private int numAnclajes(){
        return this.anclajes.numAnclajes();
    }

    public void consultarEstacion(){
        System.out.println(this)
    }
    
    public long anclajesLibres(){
        return Arrays.stream(anclajes()).filter(a -> !a.isOcupado()).count;    
    }

    public void anclarBicicleta(Bicicleta bicicleta){
        
        Optional<Anclaje> anclajeLibre = Arrays.stream(anclajes()).filter(a -> !a.isOcupado()).findAny();

        if (anclajeLibre.isPresent()){
            anclajeLibre.get().anclarBici(bicicleta);
        }
        else{
            System.out.println("No existe ningún anclaje libre para " + bicicleta);
        }
    }

    public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
        return tarjetaUsuario.isActivate()
    }

    public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){

        if (tarjetaUsuario.isActivate()){

            Optional<Anclaje> anclajeOcupado = Arrays.stream(anclajes()).filter(Anclaje::isOcupado()).findAny();
             
            if (anclajeOcupado.isPresent()){
                mostrarBicicleta(anclajeOcupado.get().getBici());
            }
            else{
                System.out.println("No hay bicicletas disponibles");
            }}

        else{
            System.out.println("La tarjeta no está activada");
        }
    }

    private void mostrarBicicleta(Bicicleta bici){
        System.out.println("Bicicleta retirada: " + bici.getId());
    }

    private void mostrarAnclaje(Bicicleta id, int numeroAnclaje){
        System.out.println("Bicicleta " + id.getId() + "anclada en " + numeroAnclaje)
    }

    public void consultarAnclajes(){
        Array.stream(anclajes()).map(a -> Optional.ofNullable(a.getBici())).forEach(bici -> System.out.println("Anclaje " + (bici.isPresent()? bici.get(): "libre") + "\n"));
    }
}
