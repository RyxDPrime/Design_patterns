package logico.receptores;

public class TV implements Dispositivo{
    @Override
    public void encender() {
        System.out.println("TV encendida");
    }

    @Override
    public void apagar() {
        System.out.println("TV apagada");
    }

    public void cambiarCanal() {
        System.out.println("Canal cambiado");
    }
}
