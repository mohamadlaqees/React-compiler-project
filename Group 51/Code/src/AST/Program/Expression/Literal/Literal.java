package AST.Program.Expression.Literal;

import AST.Program.Expression.Expression;

public class Literal extends Expression {
    String string;
    String identifier;
    String number;

    public void setString(String string) {
        this.string = string;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Literal{\n" +
                (string != null ? "string=" + string + "\n" : "") +
                (identifier != null ? "identifier=" + identifier + "\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        if (string != null) {
            js.append(string);
        } else if (number != null) {
            js.append(number);
        } else if (identifier != null) {
            js.append(identifier);
        }
        return js.toString();
    }

}
