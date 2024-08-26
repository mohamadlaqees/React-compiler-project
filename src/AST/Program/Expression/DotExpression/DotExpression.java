package AST.Program.Expression.DotExpression;

import AST.Program.Expression.Expression;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DotExpression extends Expression {
    List<String> identifier = new ArrayList<String>();
    int line;
    SemanticCheck semanticCheck = new SemanticCheck();
    SymbolTable symbolTable;

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

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
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();
        for (int i = 0; i < identifier.size(); i++) {
            js.append(identifier.get(i));
            if (i < identifier.size() - 1) {
                js.append(".");
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
