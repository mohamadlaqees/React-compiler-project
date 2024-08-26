package AST.Program.ComponentAttribute;

import AST.Program.Expression.Expression;

public class ComponentAttribute implements Node {
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
        js.append(expression.generateJs());
        js.append(";");
        return js.toString();
    }

}

