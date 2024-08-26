package AST.Program.Expression.BooleanExpression;

import AST.Program.Expression.Boolean.Boolean;
import AST.Program.Expression.Expression;

public class BooleanExpression extends Expression {
    Boolean booleanA;

    public void setBoolean(Boolean booleanA) {
        this.booleanA = booleanA;
    }

    public Boolean getBooleanA() {
        return booleanA;
    }

    @Override
    public String toString() {
        return "BooleanExpression{\n" +
                (booleanA != null ? booleanA + "\n" : "") +
                '}'+ "\n";
    }

    @Override
    public String generateJs() {
        return  booleanA.generateJs();
    }
}
