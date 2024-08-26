package AST.Program.Expression.CssProps.MarginDash;

import AST.Program.Node.Node;

public class MarginDash implements Node {

    String margin;
    String number;

    public String getMargin() {
        return margin;
    }

    public void setMargin(String margin) {
        this.margin = margin;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MarginDash{\n" +
                (margin != null ? "margin='" + margin + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return "margin: " + number + ";";
    }

    @Override
    public void checkSemantic() {

    }


}
