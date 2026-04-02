package logico;

public class AreaCalculator implements ShapeVisitor{
    double totalArea = 0;
    double radius = 5;
    double sideLength = 4;
    double base = 6;
    double height = 3;

    @Override
    public void visit(Circle circle) {
        totalArea += Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void visit(Square square) {
        totalArea += Math.pow(sideLength, 2);
    }

    @Override
    public void visit(Triangle triangle) {
        totalArea += 0.5 * base * height;
    }

    public double getTotalArea() {
        return totalArea;
    }
}
