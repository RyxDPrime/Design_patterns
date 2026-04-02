package logico;

import java.util.ArrayList;

public class Historial {
    private ArrayList<DocumentoMemento> mementos;

    public Historial() {
        this.mementos = new ArrayList<>();
    }

    public void agregarMemento(DocumentoMemento memento) {
        mementos.add(memento);
    }

    public DocumentoMemento obtenerMemento(int index) {
        return this.mementos.get(index);
    }
}
