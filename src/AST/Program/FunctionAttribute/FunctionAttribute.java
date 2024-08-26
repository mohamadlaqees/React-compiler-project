package AST.Program.FunctionAttribute;

import AST.Program.Expression.Expression;
import AST.Program.Node.Node;

public class FunctionAttribute implements Node {
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
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();
        js.append(identifier);
        js.append(" = ");
        js.append(expression.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        js.append(";");
        return js.toString();
    }

    @Override
    public void checkSemantic() {

    }


}
