package AST.Program.Statement;

import AST.Program.Hooks.Hooks;
import AST.Program.Statement.Array.Array;
import AST.Program.Statement.Assignment.Assignment;
import AST.Program.Statement.CallComponent.CallComponent;
import AST.Program.Statement.Component.Component;
import AST.Program.Statement.ForStatement.ForStatement;
import AST.Program.Statement.Function.Function;
import AST.Program.Statement.FunctionCall.FunctionCall;
import AST.Program.Statement.HtmlTag.HtmlTag;
import AST.Program.Statement.IfStatement.IfStatement;
import AST.Program.Statement.CustomObject.CustomObject;
import AST.Program.Statement.TimeFunction.TimeFunction;

public class Statement implements Node {
    Component component;
    CallComponent callComponent;
    Assignment assignment;
    IfStatement ifStatement;
    ForStatement forStatement;
    FunctionCall functionCall;
    Function function;
    TimeFunction timeFunction;
    Array array;
    CustomObject object;
    HtmlTag htmlTag;
    Hooks hooks;


    public void setComponent(Component component) {
        this.component = component;
    }

    public void setCallComponent(CallComponent callComponent) {
        this.callComponent = callComponent;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public void setForStatement(ForStatement forStatement) {
        this.forStatement = forStatement;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public void setTimeFunction(TimeFunction timeFunction) {
        this.timeFunction = timeFunction;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public void setObject(CustomObject object) {
        this.object = object;
    }

    public void setHtmlTag(HtmlTag htmlTag) {
        this.htmlTag = htmlTag;
    }

    public void setHooks(Hooks hooks) {
        this.hooks = hooks;
    }

    public Component getComponent() {
        return component;
    }

    public CallComponent getCallComponent() {
        return callComponent;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public ForStatement getForStatement() {
        return forStatement;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public Function getFunction() {
        return function;
    }

    public TimeFunction getTimeFunction() {
        return timeFunction;
    }

    public Array getArray() {
        return array;
    }

    public Object getObject() {
        return object;
    }

    public HtmlTag getHtmlTag() {
        return htmlTag;
    }

    public Hooks getHooks() {
        return hooks;
    }

    @Override
    public String toString() {
        return "\n" + "Statement{\n" +
                (component != null ? component + "\n" : "") +
                (callComponent != null ? callComponent + "\n" : "") +
                (assignment != null ? assignment + "\n" : "") +
                (ifStatement != null ? ifStatement + "\n" : "") +
                (forStatement != null ? forStatement + "\n" : "") +
                (functionCall != null ? functionCall + "\n" : "") +
                (function != null ? function + "\n" : "") +
                (timeFunction != null ? timeFunction + "\n" : "") +
                (array != null ? array + "\n" : "") +
                (object != null ? object + "\n" : "") +
                (htmlTag != null ? htmlTag + "\n" : "") +
                (hooks != null ? hooks + "\n" : "") +
                '}';
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        if (component != null) {
            js.append(component.generateJs()).append("\n");
        }
        if (callComponent != null) {
            js.append(callComponent.generateJs()).append("\n");
        }
        if (assignment != null) {
            js.append(assignment.generateJs()).append("\n");
        }
        if (ifStatement != null) {
            js.append(ifStatement.generateJs()).append("\n");
        }
        if (forStatement != null) {
            js.append(forStatement.generateJs()).append("\n");
        }
        if (functionCall != null) {
            js.append(functionCall.generateJs()).append("\n");
        }
        if (function != null) {
            js.append(function.generateJs()).append("\n");
        }
        if (timeFunction != null) {
            js.append(timeFunction.generateJs()).append("\n");
        }
        if (array != null) {
            js.append(array.generateJs()).append("\n");
        }
        if (object != null) {
            js.append(object.generateJs()).append("\n");
        }
        if (htmlTag != null) {
            js.append(htmlTag.generateJs()).append("\n");
        }
        if (hooks != null) {
            js.append(hooks.generateJs()).append("\n");
        }

        return js.toString();
    }


}
