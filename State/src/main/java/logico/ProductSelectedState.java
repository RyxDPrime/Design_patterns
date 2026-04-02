package logico;

public class ProductSelectedState  implements vendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Producto seleccionado: puedes proceder al pago.");
    }
}
