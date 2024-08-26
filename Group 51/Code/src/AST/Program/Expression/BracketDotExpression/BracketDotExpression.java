package AST.Program.Expression.BracketDotExpression;

import AST.Program.Expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class BracketDotExpression extends Expression {
    List<String> identifier = new ArrayList<String>();

    public void setIdentifier(String identifier) {
        this.identifier.add(identifier);
    }

    public List<String> getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "DotExpression{\n" +
                (identifier != null && !identifier.isEmpty() ? "identifier='" + identifier + "'\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        for (int i = 0; i < identifier.size(); i++) {
            if (i == 0) {
                js.append(identifier.get(i));
            } else if (i == 1) {
                js.append("[");
                js.append(identifier.get(i));
                js.append("]");
            } else {
                js.append(".");
                js.append(identifier.get(i));
            }
        }
        return js.toString();
    }


}
