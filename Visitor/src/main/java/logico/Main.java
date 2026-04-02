package logico;

import java.util.ArrayList;

public class Main {
    public static void main () {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Triangle());

        AreaCalculator areaCalculator = new AreaCalculator();
        for (Shape shape : shapes){
            shape.accept(areaCalculator);
        }

        System.out.println("Area Total: " + areaCalculator.getTotalArea());
    }
}
