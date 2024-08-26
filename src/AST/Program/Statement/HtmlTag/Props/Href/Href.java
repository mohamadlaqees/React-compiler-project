package AST.Program.Statement.HtmlTag.Props.Href;

import AST.Program.Expression.Expression;
import AST.Program.Node.Node;

public class Href implements Node {
    String href;
    Expression expression;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "HREF{\n" +
                (href != null ? "href='" + href + "'\n" : "") +
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
