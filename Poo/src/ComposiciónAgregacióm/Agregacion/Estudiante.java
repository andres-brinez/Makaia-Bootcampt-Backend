package ComposiciónAgregacióm.Agregacion;

public class Estudiante {

    // Atributos
    private String nombre;
    private int edad;
    private int numEstudiante;

    // Constructor
    public Estudiante(String nombre, int edad, int numEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.numEstudiante = numEstudiante;
    }

    // Métodos

    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

}
