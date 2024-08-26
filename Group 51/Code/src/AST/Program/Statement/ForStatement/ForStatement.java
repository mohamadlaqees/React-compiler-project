package AST.Program.Statement.ForStatement;

import AST.Program.Statement.Component.JSX.JSX;
import AST.Program.Statement.IfStatement.IfStatement;
import AST.Program.Statement.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ForStatement implements Node {
    String For;
    List<String> identifier = new ArrayList<String>();
    String In;
    List<Statement> statement = new ArrayList<Statement>();
    JSX jsx;

    public void setFor(String aFor) {
        For = aFor;
    }

    public void setIdentifier(String identifier) {
        this.identifier.add(identifier);
    }

    public void setIn(String in) {
        In = in;
    }

    public void setStatement(Statement statement) {
        this.statement.add(statement);
    }

    public void setJsx(JSX jsx) {
        this.jsx = jsx;
    }

    public String getFor() {
        return For;
    }

    public List<String> getIdentifier() {
        return identifier;
    }

    public String getIn() {
        return In;
    }

    public List<Statement> getStatement() {
        return statement;
    }

    public JSX getJsx() {
        return jsx;
    }

    @Override
    public String toString() {
        return "ForStatement{\n" +
                (For != null ? "For='" + For + "'\n" : "") +
                (identifier != null && !identifier.isEmpty() ? "identifier='" + identifier + "'\n" : "") +
                (In != null ? "In='" + In + "'\n" : "") +
                (statement != null && !statement.isEmpty() ? statement + "\n" : "") +
                (jsx != null ? jsx + "\n" : "") +
                '}' + "\n";
    }
    @Override
    public String generateJs() {
        StringBuilder jsCode = new StringBuilder();

        jsCode.append("for (let ").append(identifier.get(0)).append(" of ").append(identifier.get(1)).append(") {\n");
        for (Statement stmt : statement) {
            jsCode.append(stmt.generateJs());
        }
        if (jsx != null) {
            jsCode.append(jsx.generateJs());
        }
        jsCode.append("}\n");

        return jsCode.toString();
    }




}
