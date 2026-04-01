package example_factory_method;

import example_factory_method.classes.Carro;
import example_factory_method.classes.Vehiculo;

public class CarroFactory implements FactoryVehiculo {

    @Override
    public Vehiculo crearVehiculo() {
        return new Carro();
    }
}
