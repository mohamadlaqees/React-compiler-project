package AST.Program.Expression.CssProps.BOTTOM;

import AST.Program.Node.Node;

public class BOTTOM implements Node {
    String bottom;
    String number;

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "BOTTOM{\n" +
                (bottom != null ? "bottom='" + bottom + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }


    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return "bottom: " + bottom + ";";
    }

    @Override
    public void checkSemantic() {

    }


}
