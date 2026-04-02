package logico;

public class CoffeeMaker extends BeverageMaker{
    @Override
    void brew() {
        System.out.println("Colando el cafe");
    }

    @Override
    void addCondiments() {
        System.out.println("Agregando leche y azucar");
    }
}
