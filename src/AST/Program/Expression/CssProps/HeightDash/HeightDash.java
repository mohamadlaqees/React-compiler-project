package AST.Program.Expression.CssProps.HeightDash;

import AST.Program.Node.Node;

public class HeightDash implements Node {
    String height;
    String number;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "HeightDash{\n" +
                (height != null ? "height='" + height + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return "height: " + number + "px;";
    }

    @Override
    public void checkSemantic() {

    }

}
