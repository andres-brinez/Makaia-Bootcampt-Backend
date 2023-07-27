import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class HtmlReader {

    public static Queue<HtmlTag> getTagsFromFile(String filePath) {

        Queue<HtmlTag> tags = new LinkedList<>(); // Cola para almacenar las etiquetas HTML

        // Leer el archivo línea por línea y agregar las etiquetas a la cola
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {

                // Separar la línea en tokens usando expresiones regulares
                // //s+ significa que se dividirá la cadena en cualquier cantidad de espacios en blanco
                String[] tokens = line.split("\\s+");

                for (String token : tokens) {
                    // Eliminar cualquier carácter no deseado
                    token = token.trim();

                    // Verificar si es una etiqueta HTML válida
                    if (token.startsWith("<") && token.endsWith(">")) {
                        // Crear un objeto HtmlTag y agregarlo a la cola
                        HtmlTag tag = new HtmlTag(token);
                        tags.add(tag);
                    }
                }
            }
            // Lanza  un error  por si no se encuentra el archivo
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Devolver la cola de etiquetas HTML
        return tags;
    }
}
