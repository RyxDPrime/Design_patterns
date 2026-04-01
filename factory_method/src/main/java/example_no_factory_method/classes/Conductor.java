package example_no_factory_method.classes;

public class Conductor {

    private Vehiculo vehiculo;

    public Conductor (int tipo){
        if (tipo == 1) {
            this.vehiculo = new Motor();
        } else if (tipo == 2) {
            this.vehiculo = new Camion();
        } else if (tipo == 3) {
            this.vehiculo = new Carro();
        } else {
            System.out.println("Tipo de vehículo no válido.");
            this.vehiculo = null;
        }
    }

    public void cleanup() {
        if(vehiculo != null) vehiculo = null;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
