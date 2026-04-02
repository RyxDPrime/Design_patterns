package logico;

public class Main {
    public static void main(String[] args) {
        System.out.println("Haciendo te...");
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();

        System.out.println("\nHaciendo Cafe...");

        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();
    }
}
