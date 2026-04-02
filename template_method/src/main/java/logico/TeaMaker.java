package logico;

public class TeaMaker extends BeverageMaker{
    @Override
    void brew() {
        System.out.println("Remojando el te");
    }

    @Override
    void addCondiments() {
        System.out.println("Agregando limon");
    }

}
