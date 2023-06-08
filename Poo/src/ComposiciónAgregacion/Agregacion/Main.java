package ComposiciónAgregacion.Agregacion;

public class Main {

    public static void main(String[] args) {

        Universidad universidad = new Universidad("Universidad XYZ");

        // Crear instancias de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Juan", 20, 032);
        Estudiante estudiante2 = new Estudiante("Maria", 22, 232);
        Estudiante estudiante3 = new Estudiante("Andres", 18, 156);
        Estudiante estudiante4 = new Estudiante("Felipe", 24, 231);


        // Agregar estudiantes a la universidad
        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);
        universidad.agregarEstudiante(estudiante3);
        universidad.agregarEstudiante(estudiante4);


        System.out.println("Nombre universidad: " + universidad.getNombre());
        System.out.println(" ");


        Estudiante[] estudiantes = universidad.getEstudiantes(); // Trae todos los estudiantes

        //Recorre cada estudiante del vector y  muestra su información
        for (int i = 0; i < universidad.getCantidadEstudiantes(); i++) {

            System.out.println("Nombre estudiante: " + estudiantes[i].getNombre());
            System.out.println("Edad estudiante: " + estudiantes[i].getEdad());
            System.out.println("Número de estudiante: " + estudiantes[i].getNumEstudiante());
            System.out.println();

        }
    }


}
