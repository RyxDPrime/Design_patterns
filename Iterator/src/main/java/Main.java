import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main() {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado ("Alice", 50000));
        empleados.add(new Empleado ("Bob", 60000));
        empleados.add(new Empleado ("Charlie", 55000));

        Empresa empresa = new Empresa(empleados);
        Iterator<Empleado> iterator = empresa.createIterator();

        double totalSalarios = 0;
        while (iterator.hasNext()) {
            totalSalarios += iterator.next().getSalario();
        }

        System.out.println("Total de salarios: " + totalSalarios);
    }


}
