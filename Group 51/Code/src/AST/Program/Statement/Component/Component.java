package AST.Program.Statement.Component;

import AST.Program.Statement.Assignment.Assignment;
import AST.Program.Hooks.Hooks;
import AST.Program.Statement.Component.JSX.JSX;
import AST.Program.Statement.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Component implements Node {
    String component;
    String componentName;
    List<String> identifier = new ArrayList<String>();
    List<Assignment> assignment = new ArrayList<Assignment>();
    List<Statement> statement = new ArrayList<Statement>();
    JSX jsx;
    int line;



    public void setComponent(String component) {
        this.component = component;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName.replace("\"", "");
    }

    public void setIdentifier(String identifier) {
        this.identifier.add(identifier);
    }

    public void setAssignment(Assignment assignment) {
        this.assignment.add(assignment);
    }

    public void setStatement(Statement statement) {
        this.statement.add(statement);
    }

    public void setJsx(JSX jsx) {
        this.jsx = jsx;
    }

    public String getComponent() {
        return component;
    }

    public String getComponentName() {
        return componentName;
    }

    public List<String> getIdentifier(int i) {
        return identifier;
    }

    public List<Assignment> getAssignment() {
        return assignment;
    }

    public List<Statement> getStatement() {
        return statement;
    }

    public JSX getJsx() {
        return jsx;
    }
    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "\n" + "Component{\n" +
                (component != null ? "component='" + component + "'\n" : "") +
                (componentName != null ? "componentName=" + componentName + "\n" : "") +
                (identifier != null && !identifier.isEmpty() ? "identifier='" + identifier + "\n" : "") +
                (assignment != null && !assignment.isEmpty() ? assignment + "\n" : "") +
                (statement != null && !statement.isEmpty() ? statement + "\n" : "") +
                (jsx != null ? jsx + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder jsCode = new StringBuilder();

        jsCode.append("function ").append(componentName).append("(");

        if (identifier != null) {
            for (int i = 0; i < identifier.size(); i++) {
                jsCode.append(identifier.get(i));
                if (i < identifier.size() - 1) {
                    jsCode.append(", ");
                }
            }
        }

        if (assignment != null) {
            for (int i = 0; i < assignment.size(); i++) {
                jsCode.append(assignment.get(i).generateJs());
                if (i < assignment.size() - 1) {
                    jsCode.append(", ");
                }
            }

        }
        jsCode.append(") {\n");

        if (statement != null) {
            for (Statement statement : statement) {
                jsCode.append(statement.generateJs());
            }
        }

        if (jsx != null) {
            jsCode.append(jsx.generateJs());
        }

        jsCode.append("}\n");


        return jsCode.toString();

    }


}
