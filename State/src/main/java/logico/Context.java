package logico;

public class Context {
    private vendingMachineState state;

    public void setState(vendingMachineState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}
