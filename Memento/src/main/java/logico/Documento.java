package logico;

public class Documento {
    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public void escribir (String texto) {
        this.contenido += texto;
    }

    public String getContenido() {
        return contenido;
    }

    public DocumentoMemento crearMemento() {
        return new DocumentoMemento(contenido);
    }

    public void restaurarMemento(DocumentoMemento memento) {
        this.contenido = memento.getContenidoGuardado();
    }
}
