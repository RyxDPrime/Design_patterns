package logico;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
