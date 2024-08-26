package AST.Program.Expression.CssProps.TextDash;

import AST.Program.Node.Node;

public class TextDash implements Node {
    String text;
    String identifier;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "TextDash{\n" +
                (text != null ? "text='" + text + "'\n" : "") +
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
