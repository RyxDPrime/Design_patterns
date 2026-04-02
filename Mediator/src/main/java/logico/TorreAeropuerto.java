package logico;

public class TorreAeropuerto implements TraficoAereo{
    @Override
    public void SolicitarDespegue(Avion avion) {
        avion.NotificarTraficoAereo("Solicitando permiso para despegar.");
    }

    @Override
    public void SolicitarAterrizaje(Avion avion) {
        avion.NotificarTraficoAereo("Solicitando permiso para aterrizar.");
    }
}
