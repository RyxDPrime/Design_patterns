package logico;

import java.util.ArrayList;

public class EstacionClima implements Sujeto{
    private final ArrayList<Observer> observers = new ArrayList<>();
    private String clima = "";

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(clima);
        }
    }

    public void setClima(String clima) {
        this.clima = clima;
        notifyObservers();
    }
}
