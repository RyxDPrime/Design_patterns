package example_factory_method.classes;

import example_factory_method.FactoryVehiculo;

public class Conductor {
    private Vehiculo vehiculo;

    public Conductor(FactoryVehiculo factory) {
        this.vehiculo = factory.crearVehiculo();
    }

    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
}
