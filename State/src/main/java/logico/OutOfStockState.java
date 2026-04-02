package logico;

public class OutOfStockState implements vendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Sin stock: No se pueden procesar pedidos hasta que se reponga el inventario.");
    }
}
