package AST.Program.Expression.CssProps.LEFT;

import AST.Program.Node.Node;

public class LEFT implements Node {
    String left;
    String number;

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "LEFT{\n" +
                (left != null ? "left='" + left + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }


    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return "left: " + number + ";";
    }

    @Override
    public void checkSemantic() {

    }


}
