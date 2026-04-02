package logico;

public class Request {
    private Prioridad prioridad;

    public Request (Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }
}
