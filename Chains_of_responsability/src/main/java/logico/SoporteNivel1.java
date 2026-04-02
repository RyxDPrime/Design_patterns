package logico;

public class SoporteNivel1 implements Soporte{
    private Soporte siguiente;

    public void setSiguienteRequest(Soporte siguiente) {
        this.siguiente = siguiente;
    }

    public void manejarRequests(Request request) {
        if(request.getPrioridad() == Prioridad.BASICO) {
            System.out.println("Soporte Nivel 1 maneja la solicitud");
        } else {
            if (siguiente != null) {
                siguiente.manejarRequests(request);
            } else {
                System.out.println("No hay soporte disponible para manejar la solicitud");
            }
        }
    }
}
