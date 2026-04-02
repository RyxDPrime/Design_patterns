package logico;

public class Main {
    public static void main () {
        Soporte nivel1 = new SoporteNivel1();
        Soporte nivel2 = new SoporteNivel2();
        Soporte nivel3 = new SoporteNivel3();

        nivel1.setSiguienteRequest(nivel2);
        nivel2.setSiguienteRequest(nivel3);

        Request request1 = new Request(Prioridad.BASICO);
        Request request2 = new Request(Prioridad.INTERMEDIO);
        Request request3 = new Request(Prioridad.AVANZADO);

        nivel1.manejarRequests(request1);
        nivel1.manejarRequests(request2);
        nivel1.manejarRequests(request3);
    }
}
