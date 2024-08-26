package AST.Program.Statement.HtmlTag.Div;

import AST.Program.Expression.Expression;
import AST.Program.Statement.HtmlTag.HtmlTag;
import AST.Program.Statement.HtmlTag.Props.Props;
import AST.Program.Statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class Div implements Node {
    String div;
    List<Props> props = new ArrayList<Props>();
    List<Statement> statement = new ArrayList<Statement>();
    List<Expression> expression = new ArrayList<Expression>();


    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public List<Props> getProps() {
        return props;
    }

    public void setProps(Props props) {
        this.props.add(props);
    }

    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement.add(statement);
    }

    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression.add(expression);
    }

    @Override
    public String toString() {
        return "Div{\n" +
                (div != null ? "div='" + div + "'\n" : "") +
                (props != null && !props.isEmpty() ? props + "\n" : "") +
                (statement != null && !statement.isEmpty() ? statement + "\n" : "") +
                (expression != null && !expression.isEmpty() ? expression + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        if (div != null) {
            js.append("var div = document.createElement('div');\n");
            if (!props.isEmpty()) {
                for (Props value : props) {
                    if (value.getClassName() != null) {
                        js.append("div.style = '");
                        js.append(value.generateJs());
                        js.append("';\n");
                    }
                    if (value.getEvents() != null) {
                        js.append("div.onclick = ");
                        js.append(value.generateJs());
                        js.append(";\n");
                    } else if (value.getExpression() != null) {
                        js.append("div.style = ");
                        js.append(value.generateJs());
                        js.append(";\n");
                    }
                }

            }

            if (statement != null) {
                for (int i = 0; i < statement.size(); i++) {
                    Statement stmt = statement.get(i);
                    if (stmt.getHtmlTag() != null && stmt.getHtmlTag().getImg() != null) {
                        js.append(stmt.generateJs().trim());
                        js.append("\ndiv.appendChild(img);\n");
                    } else if (stmt.getHtmlTag() != null && stmt.getHtmlTag().getP() != null) {
                        js.append(stmt.generateJs().trim());
                        js.append("\ndiv.appendChild(p);\n");
                    } else if (stmt.getCallComponent() != null && stmt.getCallComponent().getComponent() != null) {
                        js.append("div.innerHTML = `${\n");
                        js.append(stmt.generateJs().trim());
                        js.append("}`;\n");
                    } else {
                        String stmtJs = stmt.generateJs().trim();
                        js.append(stmtJs);
                        if (!stmtJs.endsWith(";")) {
                            js.append(";");
                        }
                        js.append("\n");
                    }
                }
            }

            if (expression != null) {
                for (Expression expr : expression) {
                    js.append("div.innerHTML += ").append(expr.generateJs().trim()).append(";");
                }
            }
            js.append("\n");
            js.append("document.body.appendChild(div);");
        }

        return js.toString().trim();
    }

}
