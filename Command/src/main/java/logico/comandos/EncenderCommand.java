package logico.comandos;

import logico.receptores.Dispositivo;

public class EncenderCommand implements Command{
    private Dispositivo dispositivo;

    public EncenderCommand(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void ejecutar() {
        dispositivo.encender();
    }
}
