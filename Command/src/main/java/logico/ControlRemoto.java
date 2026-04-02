package logico;

import logico.comandos.Command;

public class ControlRemoto {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void presionarBoton() {
        if (command != null) {
            command.ejecutar();
        } else {
            System.out.println("No se ha asignado ningún comando.");
        }
    }
}
