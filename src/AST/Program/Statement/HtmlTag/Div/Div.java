package AST.Program.Statement.HtmlTag.Div;

import AST.Program.Expression.Expression;
import AST.Program.Node.Node;
import AST.Program.Statement.HtmlTag.Props.Props;
import AST.Program.Statement.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Div implements Node {
    String div;
    String ComponentName;
    List<Props> props = new ArrayList<Props>();
    List<Statement> statement = new ArrayList<Statement>();
    List<Expression> expression = new ArrayList<Expression>();

    public String getComponentName() {
        return ComponentName;
    }

    public void setComponentName(String componentName) {
        this.ComponentName = componentName;
    }

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
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();
        if (div != null) {
            if (firstDiv) {
                js.append("var div = document.createElement('div');\n");
            } else {
                js.append("var childDiv = document.createElement('div');\n");
            }
            if (!props.isEmpty()) {
                for (Props value : props) {
                    if (value.getClassName() != null) {
                        js.append("div.style = '");
                        js.append(value.generateJs(checkIfInDiv, false, false, fatherName, false, false, ""));
                        js.append("';\n");
                    }
                    if (value.getEvents() != null) {
                        js.append("div.onclick = ");
                        js.append(value.generateJs(true, false, false, fatherName, false, false, ""));
                        js.append("\n");
                    } else if (value.getExpression() != null) {
                        js.append("div.style = ");
                        js.append(value.generateJs(checkIfInDiv, false, false, fatherName, false, false, ""));
                        js.append(";\n");
                    }
                }

            }

            if (statement != null) {
                for (int i = 0; i < statement.size(); i++) {
                    Statement stmt = statement.get(i);
                    if (stmt.getHtmlTag() != null && stmt.getHtmlTag().getImg() != null) {
                        js.append(stmt.generateJs(false, false, false, fatherName, false, false, "").trim());
                        js.append("\ndiv.appendChild(img);\n");
                    } else if (stmt.getHtmlTag() != null && stmt.getHtmlTag().getP() != null) {
                        js.append(stmt.generateJs(false, false, false, fatherName, false, false, "").trim());
                        js.append("\ndiv.appendChild(p);\n");
                    } else if (stmt.getHtmlTag() != null && stmt.getHtmlTag().getLink() != null) {
                        js.append(stmt.generateJs(false, false, false, fatherName, false, false, "").trim());
                        js.append("\ndiv.appendChild(link);\n");
                    } else if (stmt.getCallComponent() != null && stmt.getCallComponent().getComponent() != null) {
                        js.append("div.appendChild( ");
                        js.append(stmt.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, changeState).trim());
                        js.append(");\n");
                    } else {
                        String stmtJs = stmt.generateJs(checkIfInDiv, false, isFatherFunction, fatherName, false, divAfterJSX, changeState).trim();
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
                    if (firstDiv) {
                        js.append("div.innerHTML += ").append(expr.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, "").trim()).append(";");
                    } else {
                        js.append("childDiv.innerHTML += ").append(expr.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, "").trim()).append(";");
                    }
                }
            }
            js.append("\n");

            if (Objects.equals(this.getComponentName(), fatherName) && firstDiv) {
                js.append("document.body.appendChild(div);");
            } else if (isFatherFunction && firstDiv) {
                js.append("return div;");
            } else if (isFatherFunction) {
                js.append("div.appendChild(childDiv);");
            }
        }


        return js.toString().trim();
    }

    @Override
    public void checkSemantic() {

    }


}
