package logico;

public class AppClima {
    public static void main () {
        EstacionClima ec = new EstacionClima();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        ec.addObserver(phoneDisplay);
        ec.addObserver(tvDisplay);

        ec.setClima("Soleado");
        ec.setClima("Lluvioso");
        ec.setClima("Nublado");

        ec.removeObserver(tvDisplay);

        ec.setClima("Tormenta");
    }
}
