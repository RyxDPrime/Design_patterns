package logico.comandos;

import logico.receptores.TV;

public class CambiarCanalCommand implements Command{
    private TV tv;

    public CambiarCanalCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void ejecutar() {
        tv.cambiarCanal();
    }
}
