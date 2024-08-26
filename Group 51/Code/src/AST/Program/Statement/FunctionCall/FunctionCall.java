package AST.Program.Statement.FunctionCall;

import AST.Program.Expression.Expression;
import AST.Program.Statement.IfStatement.IfStatement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionCall implements Node {
    String functionName;
    List<Expression> expression = new ArrayList<Expression>();

    public void setFunctionName(String identifier) {
        this.functionName = identifier;
    }

    public void setExpression(Expression expression) {
        this.expression.add(expression);
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<Expression> getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "FunctionCall{\n" +
                (functionName != null ? "functionName='" + functionName + "'\n" : "") +
                (expression != null && !expression.isEmpty() ? expression + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder(functionName + "(");
        for (int i = 0; i < expression.size(); i++) {
            js.append(expression.get(i).generateJs());
            if (i < expression.size() - 1) {
                js.append(", ");
            }
        }
        js.append(");");
        return js.toString();
    }

}
