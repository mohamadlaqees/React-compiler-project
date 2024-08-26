package AST.Program.Expression.CssProps.RIGHT;

public class RIGHT implements Node {
    String right;
    String number;

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "RIGHT{\n" +
                (right != null ? "right='" + right + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        return "right: " + number + ";";

    }
}
