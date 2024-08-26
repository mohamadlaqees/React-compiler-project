package AST.Program.Expression.FunctionCallExpression;

import AST.Program.Expression.Expression;
import AST.Program.Statement.FunctionCall.FunctionCall;

public class FunctionCallExpression extends Expression {
    FunctionCall functionCall;

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    @Override
    public String toString() {
        return "FunctionCallExpression{\n" +
                (functionCall != null ? functionCall + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return functionCall.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, "");
    }

    @Override
    public void checkSemantic() {

    }


}
