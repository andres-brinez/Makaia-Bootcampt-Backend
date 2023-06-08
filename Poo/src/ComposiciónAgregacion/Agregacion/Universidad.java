package ComposiciónAgregacion.Agregacion;

public class Universidad {

    private String nombre;
    private Estudiante[] estudiantes;
    private int contador;


    public Universidad(String nombre) {

        this.nombre = nombre;

        // Inicializa valores
        this.estudiantes = new Estudiante[100]; // la cantida  máxima de estudiantes es 100
        this.contador = 0; // se inicializa el contador en cero
    }

    // Métodos

    public void agregarEstudiante(Estudiante estudiante) {

        // Valida si hay disponibilidad para agregar estudiantes

        if (contador < 100) {

            // Agrega el estudiante al vector de estudiantes en la posición disponible del contador
            estudiantes[contador] = estudiante;
            contador++;

        } else

            // Muestra mensaje de error
            System.out.println("No se puede agregar más estudiantes porque  se ha alcanzado la capacidad máxima.");

    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public int getCantidadEstudiantes() {
        return contador;
    }

    public String getNombre() {
        return nombre;
    }


}

