package AST.Program.Expression.ParenExpression;

import AST.Program.Expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class ParenExpression extends Expression {
    List<Expression> expression = new ArrayList<Expression>();

    public void setExpression(Expression expression) {
        this.expression.add(expression);
    }

    public List<Expression> getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "\n" + "ParenExpression{\n" +
                (expression != null && !expression.isEmpty() ? expression + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        for (Expression expr : expression) {
            js.append("( ");
            js.append(expr.generateJs());
            js.append(" )");
        }
        return js.toString();
    }

}
