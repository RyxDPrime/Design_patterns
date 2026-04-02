package logico;

public class Main {
    public static void main() {
        Documento doc = new Documento("Contenido inicial.\n");
        Historial historial = new Historial();

        doc.escribir("Contenido adicional.\n");
        historial.agregarMemento(doc.crearMemento());

        doc.escribir("Mas contenido.\n");
        historial.agregarMemento(doc.crearMemento());

        doc.restaurarMemento(historial.obtenerMemento(1));

        System.out.println(doc.getContenido());
    }
}
