package AST.Program.Statement.HtmlTag.Props.Events.Onclick;

import AST.Program.Statement.Component.JSX.JSX;
import AST.Program.Statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class Onclick implements Node {
    String onClick;
    List<Statement> statement = new ArrayList<Statement>();
    JSX jsx;

    public String getOnClick() {
        return onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement.add(statement);
    }

    public JSX getJsx() {
        return jsx;
    }

    public void setJsx(JSX jsx) {
        this.jsx = jsx;
    }

    @Override
    public String toString() {
        return "Onclick{\n" +
                (onClick != null ? "onClick='" + onClick + "'\n" : "") +
                (statement != null && !statement.isEmpty() ? statement + "\n" : "") +
                (jsx != null ? jsx + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder jsCode = new StringBuilder();

        jsCode.append("function() {\n");

        for (Statement stmt : statement) {
            jsCode.append(stmt.generateJs()).append("\n");
        }

        if (jsx != null) {
            jsCode.append(jsx.generateJs());
        }

        jsCode.append("}");

        return jsCode.toString();
    }

}
