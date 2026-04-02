package logico;

public class Main {
    public static void main() {
        VendingMachine machine = new VendingMachine();
        machine.handleRequest();
        machine.setState(new ProductSelectedState());
        machine.handleRequest();
        machine.setState(new PaymentPendingState());
        machine.handleRequest();
        machine.setState(new OutOfStockState());
        machine.handleRequest();
    }
}
