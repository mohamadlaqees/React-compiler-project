package AST.Program.Statement.IfStatement;

import AST.Program.Expression.Expression;
import AST.Program.Statement.Component.Component;
import AST.Program.Statement.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IfStatement implements Node {
    String If;
    String Else;
    Expression expression;
    List<Statement> statement = new ArrayList<Statement>();

    public void setIf(String anIf) {
        If = anIf;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setStatement(Statement statement) {
        this.statement.add(statement);
    }

    public String getIf() {
        return If;
    }

    public String getElse() {
        return Else;
    }

    public void setElse(String anElse) {
        Else = anElse;
    }

    public Expression getExpression() {
        return expression;
    }

    public List<Statement> getStatement() {
        return statement;
    }

    @Override
    public String toString() {
        return "\n" + "IfStatement{\n" +
                (If != null ? "If='" + If + "'\n" : "") +
                (Else != null ? "Else='" + Else + "'\n" : "") +
                (expression != null ? expression + "\n" : "") +
                (statement != null && !statement.isEmpty() ? statement + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();
        if (If != null && expression != null) {
            js.append("if (").append(expression.generateJs()).append(") {\n");
            js.append(statement.get(0).generateJs());
            js.append("}\n");
        }
        if (Else != null) {
            js.append("else {\n");
            js.append(statement.get(1).generateJs());
            js.append("}\n");
        }
        return js.toString();
    }


}
