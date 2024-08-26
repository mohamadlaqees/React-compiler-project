package AST.Program.Expression.BracketDotExpression;

import AST.Program.Expression.Expression;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BracketDotExpression extends Expression {
    List<String> identifier = new ArrayList<String>();
    String number;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setIdentifier(String identifier) {
        this.identifier.add(identifier);
    }

    public List<String> getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "BracketDotExpression{\n" +
                (identifier != null && !identifier.isEmpty() ? "identifier='" + identifier + "'\n" : "") +
                (number != null && !number.isEmpty() ? "number='" + number + "'\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();

        if (number != null) {
            js.append(identifier.get(0));
            js.append("[");
            js.append(number);
            js.append("]");
            js.append(".");
            js.append(identifier.get(1));
        } else {
            for (int i = 0; i < identifier.size(); i++) {
                if (i == 0) {
                    js.append(identifier.get(i));
                } else if (i == 1) {
                    js.append("[");
                    js.append(identifier.get(1));
                    js.append("]");
                } else {
                    js.append(".");
                    js.append(identifier.get(i));
                }
            }
        }
        return js.toString();
    }

    @Override
    public void checkSemantic() {
        try {
            semanticCheck.checkIfIdentifierNotExist(identifier.get(0), line, symbolTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
