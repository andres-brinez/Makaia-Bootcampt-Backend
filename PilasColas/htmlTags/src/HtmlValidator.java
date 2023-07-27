import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class HtmlValidator {
    /**
     * El método isValidHtml(Queue<String> tags) recibe una cola de etiquetas en forma de cadenas y
     * devuelve una pila (Stack) de etiquetas de apertura que no tienen una etiqueta de cierre correspondiente.
     * Utiliza un enfoque de pila para verificar si las etiquetas de cierre coinciden con las etiquetas de apertura en el orden correcto.
     * Si una etiqueta de cierre no coincide con la etiqueta de apertura superior en la pila, se agrega a la pila.
     * Al finalizar, la pila contendrá las etiquetas de apertura que no tienen una etiqueta de cierre correspondiente.
     */
    public static Stack<String> isValidHtml(Queue<String> tags) {

        // ! ES UNA ESTRUCTURA DE LAS VALIDACIONES PERO NO FUNCIONA

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
