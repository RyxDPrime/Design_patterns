package logico;

public class Main {
    public static void main () {
        SortingContext context = new SortingContext(new BubbleSort());
        String[] array1 = {"cpp","c","java","python3","csharp","html","css","javascript","php","cpp14","cobol","dart","go","julia","kotlin","lisp","matlab","node","objc","perl","r","rust","ruby","scala","swift","solidity","xml"};
        context.performSort(array1);
        System.out.println("Bubble Sort: " + String.join(", ", array1));

        context.setStrategy(new MergeSort());
        String[] array2 = {"cpp","c","java","python3","csharp","html","css","javascript","php","cpp14","cobol","dart","go","julia","kotlin","lisp","matlab","node","objc","perl","r","rust","ruby","scala","swift","solidity","xml"};
        context.performSort(array2);
        System.out.println("Bubble Sort: " + String.join(", ", array2));


        context.setStrategy(new QuickSort());
        String[] array3 = {"cpp","c","java","python3","csharp","html","css","javascript","php","cpp14","cobol","dart","go","julia","kotlin","lisp","matlab","node","objc","perl","r","rust","ruby","scala","swift","solidity","xml"};
        context.performSort(array3);
        System.out.println("Bubble Sort: " + String.join(", ", array3));
    }
}
