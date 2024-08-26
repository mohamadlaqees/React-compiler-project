package AST.Program.Expression.ArithmaticOperator;

import AST.Program.Expression.Expression;

public class ArithmaticOperator extends Expression {
    String plus;
    String multiply;
    String divide;
    String dash;
    String modulo;

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public void setMultiply(String multiply) {
        this.multiply = multiply;
    }

    public void setDivide(String divide) {
        this.divide = divide;
    }

    public void setDash(String dash) {
        this.dash = dash;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getPlus() {
        return plus;
    }

    public String getMultiply() {
        return multiply;
    }

    public String getDivide() {
        return divide;
    }

    public String getDash() {
        return dash;
    }

    public String getModulo() {
        return modulo;
    }

    @Override
    public String toString() {
        return "ArithmaticOperator{\n" +
                (plus != null ? "plus='" + plus + "'\n" : "") +
                (multiply != null ? "multiply='" + multiply + "'\n" : "") +
                (divide != null ? "divide='" + divide + "'\n" : "") +
                (dash != null ? "dash='" + dash + "'\n" : "") +
                (modulo != null ? "modulo='" + modulo + "'\n" : "") +
                '}'+ "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        if (plus != null) {
            js.append(" + ");
        } else if (multiply != null) {
            js.append(" * ");
        } else if (divide != null) {
            js.append(" / ");
        } else if (dash != null) {
            js.append(" - ");
        } else if (modulo != null) {
            js.append(" % ");
        }

        return js.toString();
    }

}
