import java.util.List;

public class Empresa implements Aggregate{
    private List<Empleado> empleados;

    public Empresa(List<Empleado> empleados){
        this.empleados = empleados;
    }

    @Override
    public Iterator createIterator() {
        return new EmpleadoIterator(empleados);
    }
}
