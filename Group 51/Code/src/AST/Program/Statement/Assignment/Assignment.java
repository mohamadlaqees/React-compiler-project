package AST.Program.Statement.Assignment;

import AST.Program.Expression.Expression;
import AST.Program.Statement.Component.Component;

import java.util.Objects;

public class Assignment implements Node {
    String identifier;
    Expression expression;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "\n" + "Assignment{\n" +
                (identifier != null ? "identifier='" + identifier + "'\n" : "") +
                (expression != null ? expression + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();
        js.append("let ");
        js.append(identifier);
        js.append(" = ");
        js.append(expression.generateJs());
        js.append(";");
        return js.toString();
    }


}
