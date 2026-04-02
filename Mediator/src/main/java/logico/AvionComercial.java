package logico;

public class AvionComercial implements Avion{
    private TraficoAereo mediator;

    public AvionComercial(TraficoAereo mediator) {
        this.mediator = mediator;
    }

    @Override
    public void SolicitarDespegue() {
        mediator.SolicitarDespegue(this);
    }

    @Override
    public void SolicitarAterrizaje() {
        mediator.SolicitarAterrizaje(this);
    }

    @Override
    public void NotificarTraficoAereo(String mensaje) {
        System.out.println("Avion Comercial: " + mensaje);
    }
}
