package logico;

public class Cliente {
    public static void main(String[] args) {
        String expression = args.length > 0 ? args[0] : "2 / 2 + 3 * 4 - 5";

        Interpreter interpreter = new Interpreter(expression);
        int result = interpreter.interpret(expression);
        System.out.println("Resultado: " + result);
    }
}
