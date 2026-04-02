package logico;

import logico.comandos.*;
import logico.receptores.Stereo;
import logico.receptores.TV;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Stereo stereo = new Stereo();

        Command encenderTV = new EncenderCommand(tv);
        Command cambiarCanalTV = new CambiarCanalCommand(tv);
        Command apagarTV = new ApagarCommand(tv);
        Command ajustarVolumenStereo = new AjustarVolumenCommand(stereo);

        ControlRemoto remoto = new ControlRemoto();

        remoto.setCommand(encenderTV);
        remoto.presionarBoton();

        remoto.setCommand(ajustarVolumenStereo);
        remoto.presionarBoton();

        remoto.setCommand(cambiarCanalTV);
        remoto.presionarBoton();

        remoto.setCommand(apagarTV);
        remoto.presionarBoton();

    }
}
