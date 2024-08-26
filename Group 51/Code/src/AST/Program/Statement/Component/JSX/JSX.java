package AST.Program.Statement.Component.JSX;

import AST.Program.Statement.CallComponent.CallComponent;
import AST.Program.Statement.FunctionCall.FunctionCall;
import AST.Program.Statement.HtmlTag.HtmlTag;
import AST.Program.Statement.IfStatement.IfStatement;

import java.util.ArrayList;
import java.util.List;

public class JSX implements Node {
    String JSX;
    List<CallComponent> callComponent = new ArrayList<CallComponent>();
    List<FunctionCall> functionCall = new ArrayList<FunctionCall>();
    List<HtmlTag> htmlTag = new ArrayList<HtmlTag>();
    List<IfStatement> ifStatement = new ArrayList<IfStatement>();

    public String getJSX() {
        return JSX;
    }

    public void setJSX(String JSX) {
        this.JSX = JSX;
    }

    public List<CallComponent> getCallComponent() {
        return callComponent;
    }

    public void setCallComponent(CallComponent callComponent) {
        this.callComponent.add(callComponent);
    }

    public List<FunctionCall> getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall.add(functionCall);
    }

    public List<HtmlTag> getHtmlTag() {
        return htmlTag;
    }

    public void setHtmlTag(HtmlTag htmlTag) {
        this.htmlTag.add(htmlTag);
    }

    public List<IfStatement> getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement.add(ifStatement);
    }

    @Override
    public String toString() {
        return "JSX{\n" +
                (JSX != null ? "JSX='" + JSX + "'\n" : "") +
                (callComponent != null && !callComponent.isEmpty() ? callComponent + "\n" : "") +
                (functionCall != null && !functionCall.isEmpty() ? functionCall + "\n" : "") +
                (htmlTag != null && !htmlTag.isEmpty() ? htmlTag + "\n" : "") +
                (ifStatement != null && !ifStatement.isEmpty() ? ifStatement + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        if (callComponent != null && !callComponent.isEmpty()) {
            for (CallComponent cc : callComponent) {
                js.append(cc.generateJs()).append("\n");
            }
        }

        if (functionCall != null && !functionCall.isEmpty()) {
            for (FunctionCall fc : functionCall) {
                js.append(fc.generateJs()).append("\n");
            }
        }

        if (ifStatement != null && !ifStatement.isEmpty()) {
            for (IfStatement ifs : ifStatement) {
                js.append(ifs.generateJs()).append("\n");
            }
        }

        if (htmlTag != null && !htmlTag.isEmpty()) {
            for (HtmlTag ht : htmlTag) {
                js.append(ht.generateJs()).append("\n");
            }
        }

        return js.toString();
    }


}
