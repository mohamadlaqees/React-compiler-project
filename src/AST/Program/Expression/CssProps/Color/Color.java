package AST.Program.Expression.CssProps.Color;

import AST.Program.Node.Node;

public class Color implements Node {
    String color;
    String identifier;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Color{\n" +
                (color != null ? "color='" + color + "'\n" : "") +
                (identifier != null ? "identifier=" + identifier + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return "color: " + identifier + ";";
    }

    @Override
    public void checkSemantic() {

    }


}
