package logico;

public class VendingMachine {
    private vendingMachineState currentState;

    public VendingMachine() {
        currentState = new ReadyState(); // Estado inicial
    }

    public void setState(vendingMachineState state) {
        this.currentState = state;
    }

    public void handleRequest() {
        currentState.handleRequest();
    }
}
