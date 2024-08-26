package AST.Program.Expression.CssProps.WidthDash;

import AST.Program.Node.Node;

public class WidthDash implements Node {
    String width;
    String number;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "WidthDash{\n" +
                (width != null ? "width='" + width + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return "width: " + number + "px;";

    }

    @Override
    public void checkSemantic() {

    }


}
