package example_factory_method;

import example_factory_method.classes.Conductor;
import example_factory_method.classes.Vehiculo;
/*
* Un conductor puede pedir a la factoria que le cree un vehiculo, sin necesidad de conocer los detalles de su creación.
* El conductor solo necesita saber que tipo de vehiculo quiere, y la factoria se encarga de crear el vehiculo correspondiente.
* El conductor puede pedir un motor, un camion o un carro, y la factoria se encargara de crear el vehiculo correspondiente.
* */
public class Main {
    public static void main(String[] args) {
        // Motor
        FactoryVehiculo motorFactory = new MotorFactory();
        Conductor conductorMotor = new Conductor(motorFactory);
        Vehiculo motor = conductorMotor.getVehiculo();
        motor.mostrarInfo();

        //Camion
        FactoryVehiculo camionFactory = new CamionFactory();
        Conductor conductorCamion = new Conductor(camionFactory);
        Vehiculo camion = conductorCamion.getVehiculo();
        camion.mostrarInfo();

        //Carro
        FactoryVehiculo carroFactory = new CarroFactory();
        Conductor conductorCarro = new Conductor(carroFactory);
        Vehiculo carro = conductorCarro.getVehiculo();
        carro.mostrarInfo();
    }
}
