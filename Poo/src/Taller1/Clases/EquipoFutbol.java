package Taller1.Clases;

public class EquipoFutbol {

    // Atributos

    public String nombre;
    public String ciudad;

    public Jugador[] jugadores;

    //Constructor

    public  EquipoFutbol(String nombre, String ciudad,Jugador[] jugadores){

        this.nombre= nombre;
        this.ciudad= ciudad;
        this.jugadores = jugadores;

    }

    // Metodos
    public void agregarJugador(Jugador jugador){

       // crear nuevo arreglo con el tamaño del arreglo
        Jugador[] nuevoArreglo = new Jugador[jugadores.length + 1];

        // Copiamos los elementos del arreglo original al nuevo arreglo
        for (int i = 0; i < jugadores.length; i++) {
            nuevoArreglo[i] = jugadores[i];
        }
        // Agrega un nuevo jugador al arreglo
        nuevoArreglo[nuevoArreglo.length - 1] = jugador;

        // Asignamos el nuevo arreglo al atributo jugadores
        jugadores = nuevoArreglo;

    }


    public void mostrarInformacion() {

        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Ciudad de origen: " + ciudad);

        System.out.println("Jugadores:");
        for (Jugador jugador : jugadores) {

            System.out.println(jugador.getNombre());
        }
    }


}
