package AST.Program.Expression.ArithmaticExpression;

import AST.Program.Expression.ArithmaticOperator.ArithmaticOperator;
import AST.Program.Expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class ArithmaticExpression extends Expression {
    List<Expression> expression = new ArrayList<Expression>();
    ArithmaticOperator arithmaticOperator;

    public void setExpression(Expression expression) {
        this.expression.add(expression);
    }

    public void setArithmaticOperator(ArithmaticOperator arithmaticOperator) {
        this.arithmaticOperator = arithmaticOperator;
    }

    public List<Expression> getExpression() {
        return expression;
    }

    public ArithmaticOperator getArithmaticOperator() {
        return arithmaticOperator;
    }

    @Override
    public String toString() {
        return "\n" + "ArithmaticExpression{\n" +
                (expression != null && !expression.isEmpty() ? expression + "\n" : "") +
                (arithmaticOperator != null ? arithmaticOperator + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        js.append(expression.get(0).generateJs());

        for (int i = 1; i < expression.size(); i++) {
            js.append(" ");
            js.append(arithmaticOperator.generateJs());
            js.append(" ");
            js.append(expression.get(i).generateJs());
        }
        return js.toString();
    }

}
