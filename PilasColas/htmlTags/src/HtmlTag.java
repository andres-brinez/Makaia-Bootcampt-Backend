public class HtmlTag {

    /**
     * representa una etiqueta HTML.
     * La clase proporciona métodos para obtener el nombre de la etiqueta,
     * verificar si es una etiqueta de apertura o cierre,
     * y obtener la cadena de la etiqueta completa.
     */

    private String tag;

    public HtmlTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public boolean isOpeningTag() {
        return !tag.startsWith("</");
    }

    public boolean isClosingTag() {
        return tag.startsWith("</");
    }

    public String getTagName() {
        if (isOpeningTag() || isClosingTag()) {
            int startIndex = tag.indexOf('<') + 1;
            int endIndex = tag.indexOf('>');
            //  asegurarse de que se haya encontrado tanto el carácter < como el carácter >
            if (startIndex != -1 && endIndex != -1) {
                // retorna el tag
                return tag.substring(startIndex, endIndex);
            }
        }
        return null;
    }

}
