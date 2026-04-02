package logico;

public class DocumentoMemento {
    private String contenido;

    public DocumentoMemento(String contenido) {
        this.contenido = contenido;
    }

    public String getContenidoGuardado() {
        return contenido;
    }
}
