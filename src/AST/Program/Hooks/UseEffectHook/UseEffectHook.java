package AST.Program.Hooks.UseEffectHook;

import AST.Program.Node.Node;
import AST.Program.Statement.Component.JSX.JSX;
import AST.Program.Statement.Statement;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UseEffectHook implements Node {
    String UseEffect;
    List<Statement> statement = new ArrayList<Statement>();
    JSX jsx;
    String string;
    String identifier;
    int line;
    SemanticCheck semanticCheck = new SemanticCheck();
    SymbolTable symbolTable;
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void setUseEffect(String useEffect) {
        UseEffect = useEffect;
    }

    public void setStatement(Statement statement) {
        this.statement.add(statement);
    }

    public void setJsx(JSX jsx) {
        this.jsx = jsx;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getUseEffect() {
        return UseEffect;
    }

    public List<Statement> getStatement() {
        return statement;
    }

    public JSX getJsx() {
        return jsx;
    }

    public String getString() {
        return string;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getLine() {
        return line;
    }


    @Override
    public String toString() {
        return "UseEffectHook{\n" +
                (UseEffect != null ? "UseEffect='" + UseEffect + "'\n" : "") +
                (statement != null && !statement.isEmpty() ? statement + "\n" : "") +
                (jsx != null ? jsx + "\n" : "") +
                (string != null ? "string='" + string + "'\n" : "") +
                (identifier != null ? "identifier='" + identifier + "'\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();

        js.append("let depsArray = [];\n");
        js.append("function useEffect(effectFunc, deps) {\n");
        js.append("    const hasNoDeps = !deps;\n");
        js.append("    const hasDepsChanged = deps ? !depsArray.every((el, i) => el === deps[i]) : true;\n");
        js.append("    if (hasNoDeps || hasDepsChanged) {\n");
        js.append("        effectFunc();\n");
        js.append("        depsArray = deps;\n");
        js.append("    }\n");
        js.append("}\n");

        js.append("useEffect(function() {\n");
        js.append('\n');

        if (statement != null) {
            for (Statement stmt : statement) {
                js.append(stmt.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, "")).append("\n");
            }
        }

        if (jsx != null) {
            js.append(jsx.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, "")).append('\n');
        }

        js.append("}, [");

        if (string != null) {
            js.append(string);
            if (identifier != null) {
                js.append(", ");
            }
        }
        if (identifier != null) {
            js.append(identifier);
        }

        js.append("]);\n");

        return js.toString();
    }

    @Override
    public void checkSemantic() {
        try {
            semanticCheck.checkIfHooksIsOutside(UseEffect, line, symbolTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
