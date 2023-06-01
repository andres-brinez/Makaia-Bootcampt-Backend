package Taller1.Clases;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // CARRO

        System.out.println("Clase carro");
        System.out.println(" ");

        // Instanciar clases
        Carro carro1 = new Carro("Ford", "Mustang", "Rojo", 2019);
        Carro carro2 = new Carro("Toyota", "Camry", "Plateado", 2022);

        // Metodos
        carro1.acelerar();
        carro1.frenar();
        carro1.girar("Derecha");
        carro1.setColor("Negro");
        carro1.mostrarInformacion();

        System.out.println(" ");

        carro2.acelerar();
        carro2.frenar();
        carro2.girar("Izquieda");
        carro2.setAnio(2021);
        carro2.mostrarInformacion();

        // EQUIPO DE FUTBOL

        System.out.println("Clase equipo de jugadores");
        System.out.println(" ");


        // Arreglo con los jugadores iniciales del equipo

        Jugador[] jugadores = new Jugador[3];

        // Agregar jugadores al arreglo
        jugadores[0] = new Jugador("Lionel Messi");
        jugadores[1] = new Jugador("Sergio Ramos");
        jugadores[2]= new Jugador("Kevin De Bruyne");


        //instancia de la clase EquipoFutbol
        EquipoFutbol equipo = new EquipoFutbol("FC Barcelona", "Barcelona", jugadores);


        // Agregamos un nuevo jugador al equipo
        Jugador jugador4 = new Jugador("Neymar Jr.");
        equipo.agregarJugador(jugador4);

        // Información del equipo
        equipo.mostrarInformacion();


        }
    }
