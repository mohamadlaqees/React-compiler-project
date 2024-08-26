package AST.Program.Hooks.UseRefHook;

import AST.Program.Hooks.HookContent.HookContent;
import AST.Program.Node.Node;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;

import java.io.IOException;

public class UseRefHook implements Node {
    String UseRef;
    HookContent hookContent;
    int line;
    SemanticCheck semanticCheck = new SemanticCheck();
    SymbolTable symbolTable;
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void setUseRef(String useRef) {
        UseRef = useRef;
    }

    public void setHookContent(HookContent hookContent) {
        this.hookContent = hookContent;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getUseRef() {
        return UseRef;
    }

    public int getLine() {
        return line;
    }


    public HookContent getHookContent() {
        return hookContent;
    }

    @Override
    public String toString() {
        return "UseRefHook{\n" +
                (UseRef != null ? "UseRef='" + UseRef + "'\n" : "") +
                (hookContent != null ? hookContent + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {

        StringBuilder js = new StringBuilder();

        // Generate JavaScript for useRef
        js.append("function createRef(initialValue) {\n");
        js.append("    return { current: initialValue };\n");
        js.append("}\n");

        // Generate JavaScript for creating ref
        js.append("let ").append(UseRef).append(" = createRef(");
        if (hookContent != null) {
            js.append(hookContent.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, ""));
        }
        js.append(");\n");

        return js.toString();
    }

    @Override
    public void checkSemantic() {
        try {
            semanticCheck.checkIfHooksIsOutside(UseRef, line, symbolTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
