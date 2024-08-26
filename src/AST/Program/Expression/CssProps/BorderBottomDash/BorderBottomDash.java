package AST.Program.Expression.CssProps.BorderBottomDash;

import AST.Program.Node.Node;

public class BorderBottomDash implements Node {
    String borderBottom;
    String number;

    public void setBorderBottom(String borderBottom) {
        this.borderBottom = borderBottom;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBorderBottom() {
        return borderBottom;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "BorderBottomDash{\n" +
                (borderBottom != null ? "borderBottom='" + borderBottom + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return "border-bottom: " + number + "px;";
    }

    @Override
    public void checkSemantic() {

    }

}
