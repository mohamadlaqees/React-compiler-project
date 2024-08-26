package AST.Program.Expression.CssProps.GabDash;

public class GabDash implements Node {
    String gap;
    String number;

    public void setGap(String gap) {
        this.gap = gap;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGap() {
        return gap;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "GabDash{\n" +
                (gap != null ? "gap='" + gap + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        return "gap: " + number + "px;";

    }
}
