package AST.Program.Expression.Literal;

import AST.Program.Expression.Expression;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;

import java.io.IOException;

public class Literal extends Expression {
    String string;
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

    public void setString(String string) {
        this.string = string;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Literal{\n" +
                (string != null ? "string=" + string + "\n" : "") +
                (identifier != null ? "identifier=" + identifier + "\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();

        if (string != null) {
            js.append(string);
        } else if (number != null) {
            js.append(number);
        } else if (identifier != null) {
            if (!changeState.isEmpty() && changeState.equals(identifier)) {
                js.append(changeState).append("Instance.getValue() ");

            } else {
                js.append(identifier);

            }
        }
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


