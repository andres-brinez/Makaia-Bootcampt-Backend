package ComposiciónAgregacion.Composicion;

public class Main {

    public static void main(String[] args) {

        Casa casa = new Casa();

        //Crear instancia
        Habitacion habitacion1 = new Habitacion(1, 10.6);
        Habitacion habitacion2 = new Habitacion(2, 20.1);
        Habitacion habitacion3 = new Habitacion(3, 30.3);
        Habitacion habitacion4 = new Habitacion(4, 40.2);

        // Agregar las habitaciones creadas a la casa
        casa.agregarHabitacion(habitacion1);
        casa.agregarHabitacion(habitacion2);
        casa.agregarHabitacion(habitacion3);
        casa.agregarHabitacion(habitacion4);

        // Mostrar la información de la casa
        System.out.println("Información de la casa:");
        casa.mostrarInformacionCasa();
        System.out.println();

        // Destruir la casa
        casa.destruirCasa();

        System.out.println("Información de la casa:");
        casa.mostrarInformacionCasa();


    }
}
