package AST.Program.Statement.IfStatement;

import AST.Program.Expression.Expression;
import AST.Program.Node.Node;
import AST.Program.Statement.Statement;

import java.util.ArrayList;
import java.util.List;

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
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();
        if (If != null && expression != null) {
            js.append("if (").append(expression.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, "")).append(") {\n");
            js.append(statement.get(0).generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, myFatherIsIf, false, ""));
            if (myFatherIsIf) {
                js.append("return div;\n");
            }
            js.append("}\n");
        }
        if (Else != null) {
            js.append("else {\n");
            js.append(statement.get(1).generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, myFatherIsIf, false, ""));
            js.append("}\n");
        }
        return js.toString();
    }

    @Override
    public void checkSemantic() {

    }

}
