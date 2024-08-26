package AST.Program.Expression.CssProps.BackGroundColor;

import AST.Program.Node.Node;

public class BackGroundColor implements Node {
    String backGroundColor;
    String identifier;

    public String getBackGroundColor() {
        return backGroundColor;
    }

    public void setBackGroundColor(String backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "BackGroundColor{\n" +
                (backGroundColor != null ? "backGroundColor='" + backGroundColor + "'\n" : "") +
                (identifier != null ? "identifier=" + identifier + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return "backGroundColor: " + identifier + ";";
    }

    @Override
    public void checkSemantic() {

    }

}
