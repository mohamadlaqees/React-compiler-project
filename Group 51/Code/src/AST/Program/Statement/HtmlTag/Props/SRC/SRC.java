package AST.Program.Statement.HtmlTag.Props.SRC;

import AST.Program.Expression.Expression;

public class SRC implements Node {
    String src;
    Expression expression;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "SRC{\n" +
                (src != null ? "src='" + src + "'\n" : "") +
                (expression != null ? expression + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        if (expression != null) {
            js.append(expression.generateJs());
        }

        return js.toString();
    }


}
