package AST.Program.Statement.Function;

import AST.Program.Node.Node;
import AST.Program.Statement.Component.JSX.JSX;
import AST.Program.Statement.Statement;
import AST.Program.FunctionAttribute.FunctionAttribute;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Function implements Node {
    List<String> identifier = new ArrayList<String>();
    List<FunctionAttribute> functionAttribute = new ArrayList<FunctionAttribute>();
    List<Statement> statement = new ArrayList<Statement>();

    JSX jsx;
    SemanticCheck semanticCheck = new SemanticCheck();
    SymbolTable symbolTable;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    int line;

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setIdentifier(String identifier) {
        this.identifier.add(identifier);
    }

    public void setFunctionAttribute(FunctionAttribute functionAttribute) {
        this.functionAttribute.add(functionAttribute);
    }

    public void setStatement(Statement statement) {
        this.statement.add(statement);
    }

    public void setJsx(JSX jsx) {
        this.jsx = jsx;
    }

    public List<String> getIdentifier() {
        return identifier;
    }

    public List<FunctionAttribute> getFunctionAttribute() {
        return functionAttribute;
    }

    public List<Statement> getStatement() {
        return statement;
    }

    public JSX getJsx() {
        return jsx;
    }

    @Override
    public String toString() {
        return "Function{\n" +
                (identifier != null && !identifier.isEmpty() ? "identifier=" + identifier + "\n" : "") +
                (functionAttribute != null && !functionAttribute.isEmpty() ? functionAttribute + "\n" : "") +
                (statement != null && !statement.isEmpty() ? statement + "\n" : "") +
                (jsx != null ? jsx + "\n" : "") +
                '}' + "\n";
    }


    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder("function " + identifier.get(0) + " ( ");
        for (int i = 1; i < identifier.size(); i++) {
            js.append(identifier.get(i));
            if (i < identifier.size() - 1) {
                js.append(", ");
            }
        }
        js.append(" ) {\n");
        for (FunctionAttribute functionAttribute1 : functionAttribute) {
            js.append(functionAttribute1.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        }
        for (Statement stmt : statement) {
            js.append(stmt.generateJs(checkIfInDiv,firstDiv,true, fatherName, false, false, ""));
        }
        if (jsx != null) {
            js.append(jsx.generateJs(checkIfInDiv,isFatherFunction,true, fatherName, false, false, ""));
        }
        js.append("}\n");
        return js.toString();
    }

    @Override
    public void checkSemantic() {
        for (String s : identifier) {
            try {
                semanticCheck.checkIfIdentifierIsDefined(s, line, symbolTable);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
