package logico;

public class Main {
    public static void main() {
        TraficoAereo torre = new TorreAeropuerto();

        Avion avion1 = new AvionComercial(torre);
        Avion avion2 = new AvionComercial(torre);

        avion1.SolicitarDespegue();
        avion2.SolicitarAterrizaje();
    }
}
