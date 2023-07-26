import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class HtmlValidator {
    public static Stack<String> isValidHtml(Queue<String> tags) {
        Stack<String> openingTags = new Stack<>(); // Pila para almacenar las etiquetas de apertura

        while (!tags.isEmpty()) {
            String tag = tags.poll(); // Obtener la siguiente etiqueta de la cola

            if (tag.startsWith("</")) {
                // Si es una etiqueta de cierre, verificar si coincide con la etiqueta de apertura en la parte superior de la pila
                if (!openingTags.isEmpty() && tag.substring(2).equals(openingTags.peek())) {
                    openingTags.pop(); // La etiqueta de cierre coincide, quitar la etiqueta de apertura de la pila
                } else {
                    openingTags.push(tag); // La etiqueta de cierre no coincide, agregarla a la pila
                }
            } else if (!tag.endsWith("/>")) {
                // Si es una etiqueta de apertura que no es auto-cerrada, agregarla a la pila
                openingTags.push(tag);
            }
        }

        return openingTags; // Devolver la pila de etiquetas de apertura restantes
    }
}
