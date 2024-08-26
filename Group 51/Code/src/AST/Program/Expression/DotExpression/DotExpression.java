package AST.Program.Expression.DotExpression;

import AST.Program.Expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class DotExpression extends Expression {
    List<String> identifier = new ArrayList<String>();

    public void setIdentifier(String identifier) {
        this.identifier.add(identifier);
    }

    public List<String> getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "\n" + "DotExpression{\n" +
                (identifier != null && !identifier.isEmpty() ? "identifier='" + identifier + "'\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();
        for (int i = 0; i < identifier.size(); i++) {
            js.append(identifier.get(i));
            if (i < identifier.size() - 1) {
                js.append(".");
            }
        }
        return js.toString();
    }

}
