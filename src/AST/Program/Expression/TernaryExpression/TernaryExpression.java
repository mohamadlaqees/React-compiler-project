package AST.Program.Expression.TernaryExpression;

import AST.Program.Expression.CssProps.CssProps;
import AST.Program.Expression.Expression;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TernaryExpression extends Expression {
    String identifier;
    List<Expression> expression = new ArrayList<Expression>();
    CssProps cssProps;
    int line;
    SemanticCheck semanticCheck = new SemanticCheck();
    SymbolTable symbolTable;
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }


    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setExpression(Expression expression) {
        this.expression.add(expression);
    }

    public void setCssProps(CssProps cssProps) {
        this.cssProps = cssProps;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<Expression> getExpression() {
        return expression;
    }

    public CssProps getCssProps() {
        return cssProps;
    }

    @Override
    public String toString() {
        return "TernaryExpression{\n" +
                (identifier != null ? "identifier='" + identifier + "'\n" : "") +
                (expression != null && !expression.isEmpty() ? expression + "\n" : "") +
                (cssProps != null ? cssProps + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();
        js.append("`${");
        js.append(identifier);
        js.append(" ? ");
        js.append("\"");
        js.append(cssProps.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        if (js.length() >= 2 && js.substring(js.length() - 1).equals(";")) {
            js.delete(js.length() - 1, js.length());
        }
        js.append("\"");
        js.append(" : ");
        js.append(expression.get(0).generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        js.append("}`");

        return js.toString();
    }

    @Override
    public void checkSemantic() {
        try {
            semanticCheck.checkIfIdentifierNotExist(identifier,line, symbolTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
