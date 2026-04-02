package logico;

public class PaymentPendingState implements vendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Pago procesado: Dispensando el producto seleccionado.");
    }
}
