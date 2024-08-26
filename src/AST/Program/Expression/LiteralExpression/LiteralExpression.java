package AST.Program.Expression.LiteralExpression;

import AST.Program.Expression.Expression;
import AST.Program.Expression.Literal.Literal;

public class LiteralExpression extends Expression {
    Literal literal;

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    public Literal getLiteral() {
        return literal;
    }

    @Override
    public String toString() {
        return "\n" + "LiteralExpression{\n" +
                (literal != null ? literal + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return literal.generateJs(checkIfInDiv,firstDiv,firstDiv, fatherName, false, false, changeState);
    }

    @Override
    public void checkSemantic() {

    }

}
