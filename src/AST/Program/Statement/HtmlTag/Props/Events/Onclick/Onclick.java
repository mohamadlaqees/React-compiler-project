package AST.Program.Statement.HtmlTag.Props.Events.Onclick;

import AST.Program.Node.Node;
import AST.Program.Statement.Function.Function;
import AST.Program.Statement.FunctionCall.FunctionCall;
import AST.Program.Statement.TimeFunction.TimeFunction;

public class Onclick implements Node {
    String onClick;
    Function function;
    FunctionCall functionCall;
    TimeFunction timeFunction;

    public String getOnClick() {
        return onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public TimeFunction getTimeFunction() {
        return timeFunction;
    }

    public void setTimeFunction(TimeFunction timeFunction) {
        this.timeFunction = timeFunction;
    }


    @Override
    public String toString() {
        return "Onclick{\n" +
                (onClick != null ? "onClick='" + onClick + "'\n" : "") +
                (function != null ? function + "'\n" : "") +
                (functionCall != null ? functionCall + "'\n" : "") +
                (timeFunction != null ? timeFunction + "'\n" : "") +
                '}' + "\n";
    }

    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder jsCode = new StringBuilder();
        if (function != null) {
            jsCode.append(function.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        }
        if (functionCall != null) {
            jsCode.append(functionCall.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        }
        if (timeFunction != null) {
            jsCode.append(timeFunction.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        }

        return jsCode.toString();
    }

    @Override
    public void checkSemantic() {

    }


}
