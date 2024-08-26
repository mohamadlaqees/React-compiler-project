package SemanticCheck;

import SymbolTable.SymbolTable;

import java.io.IOException;
import java.util.Objects;


public class SemanticCheck {
    public void checkIfIdentifierNotExist(String identifier, int line, SymbolTable symbolTable) throws IOException {
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (Objects.equals(identifier, "undefined")) {
                return;
            } else if (symbolTable.getRows().get(i) != null) {
                if (Objects.equals(symbolTable.getRows().get(i).getValue(), identifier)) {
                    return;
                }
            }
        }
        throw new IOException("Identifier : " + identifier + " in line : " + line + " is not defined.");
    }

    public void checkIfComponentNotExist(String componentName, int line, SymbolTable symbolTable) throws IOException {
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (Objects.equals(symbolTable.getRows().get(i).getValue(), componentName)) {
                    return;
                }
            }
        }
        throw new IOException("Component : " + componentName + " in line : " + line + " is not defined.");

    }

    public void checkIfComponentIsDefined(String componentName, int line, SymbolTable symbolTable) throws IOException {
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getLine() != line) {
                    if (Objects.equals(symbolTable.getRows().get(i).getValue(), componentName)) {
                        throw new IOException("Component : " + componentName + " in line : " + symbolTable.getRows().get(i).getLine() + "  has already been declared in line : " + line);
                    }
                }
            }
        }
    }

    public void checkIfIdentifierIsDefined(String identifier, int line, SymbolTable symbolTable) throws IOException {
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (Objects.equals(symbolTable.getRows().get(i).getValue(), identifier)) {
                    throw new IOException("Identifier : " + identifier + " in line : " + line + "  has already been declared in line : " + symbolTable.getRows().get(i).getLine());
                }
            }
        }
    }

    public void checkIfHooksIsOutside(String hook, int line, SymbolTable symbolTable) throws IOException {
        if (symbolTable.getRows().isEmpty()) {
            throw new IOException("Hook : " + hook + " in line : " + line + " cannot be called at the top level.");

        } else if (symbolTable.getRows().get(0).getType() != "componentName") {
            System.out.println("type " + symbolTable.getRows().get(0).getType());
            throw new IOException("Hook : " + hook + " in line : " + line + " cannot be called at the top level.");

        }

    }

}

