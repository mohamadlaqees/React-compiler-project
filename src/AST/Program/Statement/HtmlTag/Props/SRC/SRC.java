package AST.Program.Statement.HtmlTag.Props.SRC;

import AST.Program.Expression.Expression;
import AST.Program.Node.Node;

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
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();

        if (expression != null) {
            js.append(expression.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        }

        return js.toString();
    }

    @Override
    public void checkSemantic() {

    }


}
