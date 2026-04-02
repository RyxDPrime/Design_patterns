
import java.util.List;
import java.util.NoSuchElementException;

public class EmpleadoIterator implements Iterator{
    private int posicion = 0;
    private List<Empleado> empleados;

    public EmpleadoIterator(List<Empleado> empleados){
        this.empleados = empleados;
    }

    @Override
    public boolean hasNext() {
        return posicion < empleados.size();
    }

    @Override
    public Empleado next() {
        if(!this.hasNext()){
            throw new NoSuchElementException();
        }
        return empleados.get(posicion++);
    }
}
