package logico;

public interface Soporte {
    void manejarRequests(Request request);
    void setSiguienteRequest(Soporte siguiente);

}
