package logico.comandos;

import logico.receptores.Dispositivo;

public class ApagarCommand implements Command{
    private Dispositivo dispositivo;

    public ApagarCommand(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ejecutar() {
        dispositivo.apagar();
    }
}
