package logico.comandos;

import logico.receptores.Stereo;

public class AjustarVolumenCommand implements Command{
    private Stereo stereo;

    public AjustarVolumenCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void ejecutar() {
        stereo.cambiarVolumen();
    }
}
