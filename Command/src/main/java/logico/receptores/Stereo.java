package logico.receptores;

public class Stereo implements Dispositivo{
    @Override
    public void encender() {
        System.out.println("Stereo encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Stereo apagado");
    }

    public void cambiarVolumen() {
        System.out.println("Volumen cambiado");
    }
}
