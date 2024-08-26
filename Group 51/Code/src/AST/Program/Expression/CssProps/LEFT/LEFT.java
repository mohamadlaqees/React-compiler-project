package AST.Program.Expression.CssProps.LEFT;

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
    public String generateJs() {
        return "left: " + number + ";";

    }
}
