package AST.Program.Statement.HtmlTag.Link;

import AST.Program.Expression.Expression;
import AST.Program.Node.Node;
import AST.Program.Statement.HtmlTag.Props.Props;

import java.util.ArrayList;
import java.util.List;

public class Link implements Node {
    String link;
    List<Props> props = new ArrayList<Props>();
    List<Expression> expression = new ArrayList<Expression>();

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Props> getProps() {
        return props;
    }

    public void setProps(Props props) {
        this.props.add(props);
    }

    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression.add(expression);
    }

    @Override
    public String toString() {
        return "Link{\n" +
                (link != null ? "link='" + link + "'\n" : "") +
                (props != null && !props.isEmpty() ? props + "\n" : "") +
                (expression != null && !expression.isEmpty() ? expression + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();
        if (link != null) {
            js.append("var link = document.createElement('a');\n");
            if (!props.isEmpty()) {
                for (Props value : props) {
                    if (value.getClassName() != null) {
                        js.append("link.style = '");
                        js.append(value.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, myFatherIsIf, divAfterJSX, ""));
                        js.append("';\n");
                    }
                    if (value.getHref() != null) {
                        js.append("link.href = ");
                        js.append(value.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, myFatherIsIf, divAfterJSX, ""));
                        js.append("\n");
                    } else if (value.getTarget() != null) {
                        js.append("link.target = ");
                        js.append(value.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, myFatherIsIf, divAfterJSX, ""));
                        js.append(";\n");
                    }
                }

            }
            for (Expression expr : expression) {
                js.append("link.innerHTML += ").append(expr.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, "")).append(";");
            }
        }
        return js.toString().trim();
    }

    @Override
    public void checkSemantic() {

    }

}
