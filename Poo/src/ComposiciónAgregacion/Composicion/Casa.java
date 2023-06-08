package ComposiciónAgregacion.Composicion;

public class Casa {

    // Atributos
    private Habitacion[] habitaciones;
    private int contador;
    private final int CAPACIDAD_MAXIMA = 100; // Constante por lo que se usa final para declararla


    public Casa() {

        //Inicializa los valores
        habitaciones = new Habitacion[CAPACIDAD_MAXIMA]; // Arreglo de habitaciones con la capacidad máxima
        contador = 0;
    }


    public void agregarHabitacion(Habitacion habitacion) {

        // Si hay capacidad disponible para agregar una habitación a la casa

        if (contador < CAPACIDAD_MAXIMA) {

            // Agrega la habitación al arreglo de habitaciones
            habitaciones[contador] = habitacion;
            contador++;

        } else

            // Si no hay capacidad disponible, muestra un mensaje de error
            System.out.println("No se  puede agregar mas  habitaciones  porque se alcanzó la capacidad disponible.");

    }


    public void destruirCasa() {

        habitaciones = new Habitacion[CAPACIDAD_MAXIMA];  // Crea un nuevo arreglo de habitaciones que elimina todas las habitaciones de la casa  porque se inicializa de  nuevo el arreglo
        contador = 0;    // Reinicia el contador

    }


    public void mostrarInformacionCasa() {

        if (contador == 0) {
            System.out.println("No hay habitaciones creadas");
        } else {
            // Recorre todas las habitaciones en el arreglo de habitaciones para mostrar su informacion

            for (int i = 0; i < contador; i++) {

                System.out.println("Habitación  #" + habitaciones[i].getNumero() + ": " + habitaciones[i].getTamano() + " metros cuadrados.");

            }
        }
    }

}
