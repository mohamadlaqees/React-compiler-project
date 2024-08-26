package AST.Program.Statement.Function;

import AST.Program.Statement.Component.JSX.JSX;
import AST.Program.Statement.Statement;
import AST.Program.FunctionAttribute.FunctionAttribute;

import java.util.ArrayList;
import java.util.List;

public class Function implements Node {
    List<String> identifier = new ArrayList<String>();
    List<FunctionAttribute> functionAttribute = new ArrayList<FunctionAttribute>();
    List<Statement> statement = new ArrayList<Statement>();

    JSX jsx;

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
    public String generateJs() {
        StringBuilder js = new StringBuilder("function " + identifier.get(0) + " ( ");
        for (int i = 1; i < identifier.size(); i++) {
            js.append(identifier.get(i));
            if (i < identifier.size() - 1) {
                js.append(", ");
            }
        }
        js.append(" ) {\n");
        for (FunctionAttribute functionAttribute1 : functionAttribute) {
            js.append(functionAttribute1.generateJs());
        }
        for (Statement stmt : statement) {
            js.append(stmt.generateJs());
        }
        if (jsx != null) {
            js.append(jsx.generateJs());
        }
        js.append("}\n");
        return js.toString();
    }



}
