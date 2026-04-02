package logico;

public abstract class BeverageMaker {
    void makeBeverage() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        this.addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Hirviendo el agua");
    }

    void pourInCup() {
        System.out.println("Sirviendo en la taza");
    }
}
