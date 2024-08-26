package AST.Program.Expression.FunctionExpression;

import AST.Program.Expression.Expression;
import AST.Program.Statement.Function.Function;

public class FunctionExpression extends Expression {
    Function function;

    public void setFunction(Function function) {
        this.function = function;
    }

    public Function getFunction() {
        return function;
    }

    @Override
    public String toString() {
        return "FunctionExpression{\n" +
                (function != null ? function + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        return function.generateJs();
    }
}
