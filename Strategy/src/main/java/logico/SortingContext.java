package logico;

public class SortingContext {
    private SortingStrategy strategy;

    public SortingContext(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void performSort(String[] array) {
        strategy.sort(array);
    }

    public void setStrategy(SortingStrategy strategy) {
            this.strategy = strategy;
    }
}
