package AST.Program.Expression.LiteralExpression;

import AST.Program.Expression.Expression;
import AST.Program.Expression.Literal.Literal;

public class LiteralExpression extends Expression {
    Literal literal;

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    public Literal getLiteral() {
        return literal;
    }

    @Override
    public String toString() {
        return "\n" + "LiteralExpression{\n" +
                (literal != null ? literal + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        return literal.generateJs();
    }
}
