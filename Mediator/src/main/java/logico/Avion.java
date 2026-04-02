package logico;

public interface Avion {
    void SolicitarDespegue();
    void SolicitarAterrizaje();
    void NotificarTraficoAereo(String mensaje);
}
