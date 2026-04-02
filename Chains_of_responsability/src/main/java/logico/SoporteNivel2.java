package logico;

public class SoporteNivel2 implements Soporte{
    private Soporte siguiente;

    public void setSiguienteRequest(Soporte siguiente) {
        this.siguiente = siguiente;
    }

    public void manejarRequests(Request request) {
        if(request.getPrioridad() == Prioridad.INTERMEDIO) {
            System.out.println("Soporte Nivel 2 maneja la solicitud");
        } else {
            if (siguiente != null) {
                siguiente.manejarRequests(request);
            } else {
                System.out.println("No hay soporte disponible para manejar la solicitud");
            }
        }
    }
}
