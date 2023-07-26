
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
            System.out.println(elemento.getTag());
            tagString.add(elemento.getTag());
        }

        // Crear una instancia de HtmlValidator
        HtmlValidator htmlValidator = new HtmlValidator();

        // Validar las etiquetas HTML
        Stack<String> openingTags = htmlValidator.isValidHtml(tagString);

        // Imprimir las etiquetas de apertura restantes
//        System.out.println(openingTags);


    }
}
