package AST.Program.Expression.CssProps.WidthDash;

public class WidthDash implements Node {
    String width;
    String number;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "WidthDash{\n" +
                (width != null ? "width='" + width + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        return "width: " + number + "px;";

    }
}
