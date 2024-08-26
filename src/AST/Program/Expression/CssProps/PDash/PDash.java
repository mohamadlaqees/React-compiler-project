package AST.Program.Expression.CssProps.PDash;

import AST.Program.Node.Node;

public class PDash implements Node {
    String p;
    String number;

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PDash{\n" +
                (p != null ? "p='" + p + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return "padding: " + number + "px;";
    }

    @Override
    public void checkSemantic() {

    }


}
