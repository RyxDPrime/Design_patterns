package logico;

public class ReadyState implements vendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Listo: puedes seleccionar un producto.");
    }
}
