package AST.Program.Statement.Array;

import AST.Program.Node.Node;
import AST.Program.Statement.CustomObject.CustomObject;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Array implements Node {
    String identifier;
    List<CustomObject> object = new ArrayList<CustomObject>();
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
        this.identifier = identifier;
    }

    public void setObject(CustomObject object) {
        this.object.add(object);
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<CustomObject> getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "Array{\n" +
                (identifier != null ? "identifier='" + identifier + "'\n" : "") +
                (object != null && !object.isEmpty() ? object + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder("let " + identifier + " = [\n");
        for (CustomObject customObject : object) {
            js.append(customObject.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, ""));
        }
        js.append("];\n");
        return js.toString();
    }

    @Override
    public void checkSemantic() {
        try {
            semanticCheck.checkIfIdentifierIsDefined(identifier, line, symbolTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
