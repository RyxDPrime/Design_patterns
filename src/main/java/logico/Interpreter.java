package logico;

public class Interpreter {
    private final Context context;
    private final String defaultExpression;

    public Interpreter(String expression) {
        this.context = new Context();
        this.defaultExpression = expression;
    }

    public int interpret(String expression) {
        String expressionToParse = expression != null ? expression : defaultExpression;
        Expression expressionTree = buildExpressionTree(expressionToParse);
        return expressionTree.interpret(context);
    }

    private Expression buildExpressionTree(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            throw new IllegalArgumentException("La expresion no puede estar vacia");
        }
        Parser parser = new Parser(expression);
        Expression result = parser.parseExpression();
        parser.ensureFullyParsed();
        return result;
    }

    private static final class Parser {
        private final String input;
        private int position;

        private Parser(String input) {
            this.input = input;
        }

        private Expression parseExpression() {
            Expression left = parseTerm();
            while (true) {
                skipWhitespace();
                if (match('+')) {
                    left = new AdittionExpression(left, parseTerm());
                } else if (match('-')) {
                    left = new SubstractionExpression(left, parseTerm());
                } else {
                    return left;
                }
            }
        }

        private Expression parseTerm() {
            Expression left = parseFactor();
            while (true) {
                skipWhitespace();
                if (match('*')) {
                    left = new MultiplicationExpression(left, parseFactor());
                } else if (match('/')) {
                    left = new DivisionExpression(left, parseFactor());
                } else {
                    return left;
                }
            }
        }

        private Expression parseFactor() {
            skipWhitespace();
            if (match('(')) {
                Expression nested = parseExpression();
                skipWhitespace();
                if (!match(')')) {
                    throw new IllegalArgumentException("Falta cerrar un parentesis");
                }
                return nested;
            }
            return parseNumber();
        }

        private Expression parseNumber() {
            skipWhitespace();
            int start = position;
            if (match('-')) {
                if (isAtEnd() || !Character.isDigit(currentChar())) {
                    throw new IllegalArgumentException("Se esperaba un numero despues del signo menos");
                }
            }
            while (!isAtEnd() && Character.isDigit(currentChar())) {
                position++;
            }
            if (start == position || (input.charAt(start) == '-' && start + 1 == position)) {
                throw new IllegalArgumentException("Se esperaba un numero");
            }
            return new NumberExpression(Integer.parseInt(input.substring(start, position).trim()));
        }

        private void ensureFullyParsed() {
            skipWhitespace();
            if (!isAtEnd()) {
                throw new IllegalArgumentException("Caracter inesperado en la posicion " + position);
            }
        }

        private void skipWhitespace() {
            while (!isAtEnd() && Character.isWhitespace(currentChar())) {
                position++;
            }
        }

        private boolean match(char expected) {
            if (!isAtEnd() && currentChar() == expected) {
                position++;
                return true;
            }
            return false;
        }

        private char currentChar() {
            return input.charAt(position);
        }

        private boolean isAtEnd() {
            return position >= input.length();
        }
    }
}
