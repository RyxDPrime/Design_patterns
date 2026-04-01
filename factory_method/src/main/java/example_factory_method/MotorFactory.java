package example_factory_method;

import example_factory_method.classes.Motor;
import example_factory_method.classes.Vehiculo;

public class MotorFactory implements FactoryVehiculo{

    @Override
    public Vehiculo crearVehiculo() {
        return new Motor();
    }
}
