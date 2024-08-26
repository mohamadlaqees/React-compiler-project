package AST.Program.Expression.CssProps.TOP;

public class TOP implements Node {
    String top;
    String number;

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "TOP{\n" +
                (top != null ? "top='" + top + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        return "top: " + number + ";";

    }
}
