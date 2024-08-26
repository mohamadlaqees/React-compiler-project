package AST.Program.Expression.CssProps.BorderDash;

import AST.Program.Node.Node;

public class BorderDash implements Node {
    String border;
    String number;

    public void setBorder(String border) {
        this.border = border;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBorder() {
        return border;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "BorderDash{\n" +
                (border != null ? "border='" + border + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return "border: " + number + ";";
    }

    @Override
    public void checkSemantic() {

    }

}
