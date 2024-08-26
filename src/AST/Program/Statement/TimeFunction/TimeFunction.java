package AST.Program.Statement.TimeFunction;

import AST.Program.Node.Node;
import AST.Program.Statement.Component.JSX.JSX;
import AST.Program.Statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class TimeFunction implements Node {
    String setTimeOut;
    String setInterval;
    List<Statement> statement = new ArrayList<Statement>();
    JSX jsx;
    String number;

    public void setSetTimeOut(String setTimeOut) {
        this.setTimeOut = setTimeOut;
    }

    public void setSetInterval(String setInterval) {
        this.setInterval = setInterval;
    }

    public void setStatement(Statement statement) {
        this.statement.add(statement);
    }

    public void setJsx(JSX jsx) {
        this.jsx = jsx;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSetTimeOut() {
        return setTimeOut;
    }

    public String getSetInterval() {
        return setInterval;
    }

    public List<Statement> getStatement() {
        return statement;
    }

    public JSX getJsx() {
        return jsx;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "TimeFunction{\n" +
                (setTimeOut != null ? "setTimeOut='" + setTimeOut + "'\n" : "") +
                (setInterval != null ? "setInterval='" + setInterval + "'\n" : "") +
                (statement != null && !statement.isEmpty() ? statement + "\n" : "") +
                (jsx != null ? jsx + "\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }


    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();
        if (setTimeOut != null) {
            js.append(setTimeOut).append("(() => {\n");
        } else if (setInterval != null) {
            js.append(setInterval).append("(() => {\n");
        }
        for (Statement stmt : statement) {
            js.append(stmt.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        }
        if (jsx != null) {
            js.append(jsx.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        }
        js.append("}, ").append(number).append(");");
        return js.toString();
    }

    @Override
    public void checkSemantic() {

    }
}




