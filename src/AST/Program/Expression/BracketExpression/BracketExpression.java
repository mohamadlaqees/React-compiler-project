package AST.Program.Expression.BracketExpression;

import AST.Program.Expression.Expression;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;

import java.io.IOException;

public class BracketExpression extends Expression {
    String identifier;
    String number;
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

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "BracketExpression{\n" +
                (identifier != null && !identifier.isEmpty() ? "identifier='" + identifier + "'\n" : "") +
                (number != null && !number.isEmpty() ? "number='" + number + "'\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();

        js.append(identifier);
        js.append("[");
        js.append(number);
        js.append("]");

        return js.toString();
    }

    @Override
    public void checkSemantic() {
        try {
            semanticCheck.checkIfIdentifierNotExist(identifier, line, symbolTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
