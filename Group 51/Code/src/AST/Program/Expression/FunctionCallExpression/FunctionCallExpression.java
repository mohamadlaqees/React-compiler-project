package AST.Program.Expression.FunctionCallExpression;

import AST.Program.Expression.Expression;
import AST.Program.Statement.FunctionCall.FunctionCall;

public class FunctionCallExpression extends Expression {
    FunctionCall functionCall;

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    @Override
    public String toString() {
        return "FunctionCallExpression{\n" +
                (functionCall != null ? functionCall + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        return functionCall.generateJs();
    }
}
