package example_no_factory_method;

import example_no_factory_method.classes.Conductor;
import example_no_factory_method.classes.Vehiculo;

public class Main {
    public static void main(){

        Conductor conductor = new Conductor(1);
        Vehiculo vehiculo = conductor.getVehiculo();
        if (vehiculo != null) {
            vehiculo.mostrarInfo();
        } else {
            System.out.println("No se pudo crear el vehículo.");
        }
        conductor.cleanup();
    }
}
