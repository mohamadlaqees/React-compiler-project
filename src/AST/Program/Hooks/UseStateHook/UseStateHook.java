package AST.Program.Hooks.UseStateHook;


import AST.Program.Hooks.HookContent.HookContent;
import AST.Program.Node.Node;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UseStateHook implements Node {
    String UseState;
    int line;
    SemanticCheck semanticCheck = new SemanticCheck();
    SymbolTable symbolTable;
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    List<HookContent> hookContent = new ArrayList<HookContent>();

    public void setUseState(String useState) {
        UseState = useState;
    }

    public void setHookContent(HookContent hookContent) {
        this.hookContent.add(hookContent);
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getUseState() {
        return UseState;
    }

    public int getLine() {
        return line;
    }

    public List<HookContent> getHookContent() {
        return hookContent;
    }

    @Override
    public String toString() {
        return "UseStateHook{\n" +
                (UseState != null ? "UseState='" + UseState + "'\n" : "") +
                (hookContent != null && !hookContent.isEmpty() ? hookContent + "\n" : "") +
                '}' + "\n";
    }


    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();

        js.append("function createState(initialValue) {\n");
        js.append("    let _val = initialValue;\n");
        js.append("    return {\n");
        js.append("        getValue: function() {\n");
        js.append("            return _val;\n");
        js.append("        },\n");
        js.append("        setValue: function(newValue) {\n");
        js.append("            _val = newValue;\n");
        js.append("        }\n");
        js.append("    };\n");
        js.append("}\n");

        if (hookContent != null && hookContent.size() >= 3) {
            String stateVar = hookContent.get(0).generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, "");
            String setStateVar = hookContent.get(1).generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, "");
            String initialValue = hookContent.get(2).generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, "");

            js.append("let ").append(stateVar).append("Instance = createState(").append(initialValue).append(");\n");
            js.append("const ").append(stateVar).append(" = ").append(stateVar).append("Instance.getValue();\n");
            js.append("const ").append(setStateVar).append(" = ").append(stateVar).append("Instance.setValue;\n");
        }

        return js.toString();
    }

    @Override
    public void checkSemantic() {
        try {
            semanticCheck.checkIfHooksIsOutside(UseState, line, symbolTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}


