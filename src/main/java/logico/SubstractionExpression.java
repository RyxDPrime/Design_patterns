package logico;

public class SubstractionExpression implements Expression{
    private Expression left;
    private Expression right;

    public SubstractionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}
