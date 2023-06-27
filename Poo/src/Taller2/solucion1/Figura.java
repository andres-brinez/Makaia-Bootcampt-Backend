package Taller2.solucion1;

public class Figura {

    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String dibujar() {
        return "Esta es una figura de tipo " + nombre;
    }
}

