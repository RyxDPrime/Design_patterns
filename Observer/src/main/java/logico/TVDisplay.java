package logico;

public class TVDisplay implements Observer{
    private String clima;

    @Override
    public void update(String clima) {
        this.clima = clima;
        display();
    }

    public void display(){
        System.out.println("TV: Clima Actualizado - " + clima);
    }
}
