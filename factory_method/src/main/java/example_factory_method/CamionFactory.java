package example_factory_method;

import example_factory_method.classes.Camion;
import example_factory_method.classes.Vehiculo;

public class CamionFactory implements FactoryVehiculo {
    @Override
    public Vehiculo crearVehiculo() {
        return new Camion();
    }
}
