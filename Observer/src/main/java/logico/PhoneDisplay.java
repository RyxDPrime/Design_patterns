package logico;

import java.util.Observable;

public class PhoneDisplay implements Observer{
    private String clima;

    @Override
    public void update(String clima) {
        this.clima = clima;
        display();
    }

    public void display(){
        System.out.println("Celular: Clima Actualizado - " + clima);
    }

}
