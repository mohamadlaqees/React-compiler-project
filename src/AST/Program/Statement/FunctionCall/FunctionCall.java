package AST.Program.Statement.FunctionCall;

import AST.Program.Expression.Expression;
import AST.Program.Node.Node;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionCall implements Node {
    String functionName;
    SymbolTable symbolTable;
    List<Expression> expression = new ArrayList<Expression>();
    int line;
    SemanticCheck semanticCheck = new SemanticCheck();

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

    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }

    public void setFunctionName(String identifier) {
        this.functionName = identifier;
    }

    public void setExpression(Expression expression) {
        this.expression.add(expression);
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<Expression> getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "FunctionCall{\n" +
                (functionName != null ? "functionName='" + functionName + "'\n" : "") +
                (expression != null && !expression.isEmpty() ? expression + "\n" : "") +
                '}' + "\n";
    }


    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();
        boolean same = false;
        if (checkIfInDiv) {
            js.append(functionName);
            return js.toString();
        } else {
            js.append(functionName).append("( ");
            for (int i = 0; i < expression.size(); i++) {
                if (!changeState.isEmpty() && i == 0) {
                    js.append(changeState).append("Instance.getValue();\n");
                } else {
                    js.append(expression.get(i).generateJs(false, firstDiv, isFatherFunction, fatherName, false, false, ""));
                }
                if (i < expression.size() - 1) {
                    js.append(", ");
                }
            }
            js.append(" ) \n");
        }

        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i).getValue().contains("set") && Objects.equals(symbolTable.getRows().get(i).getValue(), functionName)) {
                same = true;
                break;
            }
        }
        if (same) {
            js.append("renderUI();\n");
        }


        return js.toString();
    }

    @Override
    public void checkSemantic() {
        try {
            semanticCheck.checkIfIdentifierNotExist(functionName, line, symbolTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

