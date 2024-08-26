package AST.Program.Expression.TernaryExpression;

import AST.Program.Expression.CssProps.CssProps;
import AST.Program.Expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class TernaryExpression extends Expression {
    String identifier;
    List<Expression> expression = new ArrayList<Expression>();
    CssProps cssProps;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setExpression(Expression expression) {
        this.expression.add(expression);
    }

    public void setCssProps(CssProps cssProps) {
        this.cssProps = cssProps;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<Expression> getExpression() {
        return expression;
    }

    public CssProps getCssProps() {
        return cssProps;
    }

    @Override
    public String toString() {
        return "TernaryExpression{\n" +
                (identifier != null ? "identifier='" + identifier + "'\n" : "") +
                (expression != null && !expression.isEmpty() ? expression + "\n" : "") +
                (cssProps != null ? cssProps + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();
        js.append("`${");
        js.append(identifier);
        js.append(" ? ");
        js.append("\"");
        js.append(cssProps.generateJs());
        if (js.length() >= 2 && js.substring(js.length() - 1).equals(";")) {
            js.delete(js.length() - 1, js.length());
        }
        js.append("\"");
        js.append(" : ");
        js.append(expression.get(0).generateJs());
        js.append("}`");

        return js.toString();
    }

}
