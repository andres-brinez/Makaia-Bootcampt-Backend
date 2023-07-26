import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class HtmlReader {
    public static Queue<HtmlTag> getTagsFromFile(String filePath) {

        Queue<HtmlTag> tags = new LinkedList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {

                // Separar la línea en tokens
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
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tags;
    }
}
