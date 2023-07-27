
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<String> tagString = new LinkedList<>();

        // Create a queue of HtmlTags y trae todos los tags del archivo
        Queue<HtmlTag> tags = HtmlReader.getTagsFromFile("C:\\Users\\brine\\Downloads\\Programas de estudio\\Makaia\\Proyecto\\PilasColas\\htmlTags\\src\\file.html");

        // Reccorer una cola tags tipo HtmlTag y agregarlos a una cola tagString tipo String
        for (HtmlTag elemento : tags) {
            System.out.println(elemento.getTag()); // muestra los tags guardados en la cola
            tagString.add(elemento.getTag()); // agrega los tags a la cola tagString
        }

        // Crear una instancia de HtmlValidator
        HtmlValidator htmlValidator = new HtmlValidator();

        // Validar las etiquetas HTML
        // No sirve todavia
        Stack<String> openingTags = htmlValidator.isValidHtml(tagString);


    }
}
