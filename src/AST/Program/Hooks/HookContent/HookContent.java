package AST.Program.Hooks.HookContent;

import AST.Program.Node.Node;
import AST.Program.Statement.Array.Array;
import AST.Program.Statement.CustomObject.CustomObject;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;

import java.io.IOException;

public class HookContent implements Node {
    String string;
    String identifier;
    String number;
    String True;
    String False;
    Array array;
    CustomObject object;
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

    public void setString(String string) {
        this.string = string;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTrue(String aTrue) {
        True = aTrue;
    }

    public void setFalse(String aFalse) {
        False = aFalse;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public void setObject(CustomObject object) {
        this.object = object;
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

    public String getTrue() {
        return True;
    }

    public String getFalse() {
        return False;
    }

    public Array getArray() {
        return array;
    }

    public Object getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "\n" + "HookContent{\n" +
                (string != null ? "string='" + string + "'\n" : "") +
                (identifier != null ? "identifier='" + identifier + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                (True != null ? "True='" + True + "'\n" : "") +
                (False != null ? "False='" + False + "'\n" : "") +
                (array != null ? array + "\n" : "") +
                (object != null ? object + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();

        if (string != null) {
            js.append(string);
        } else if (identifier != null) {
            js.append(identifier);
        } else if (number != null) {
            js.append(number);
        } else if (True != null) {
            js.append(True);
        } else if (False != null) {
            js.append(False);
        } else if (array != null) {
            js.append(array.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        } else if (object != null) {
            js.append(object.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        }

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
