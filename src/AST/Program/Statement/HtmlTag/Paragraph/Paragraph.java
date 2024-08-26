package AST.Program.Statement.HtmlTag.Paragraph;

import AST.Program.Expression.Expression;
import AST.Program.Node.Node;
import AST.Program.Statement.HtmlTag.Props.Props;
import AST.Program.Statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Node {
    String paragraph;
    List<Props> props = new ArrayList<Props>();
    List<Statement> statement = new ArrayList<Statement>();
    List<Expression> expression = new ArrayList<Expression>();

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
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
        return "Paragraph{\n" +
                (paragraph != null ? "div='" + paragraph + "'\n" : "") +
                (props != null && !props.isEmpty() ? props + "\n" : "") +
                (statement != null && !statement.isEmpty() ? statement + "\n" : "") +
                (expression != null && !expression.isEmpty() ? expression + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();
        if (paragraph != null) {
            js.append("var p = document.createElement('p');\n");
            if (!props.isEmpty()) {
                js.append("p").append(".style = '");
                for (Props prop : props) {
                    js.append(prop.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
                }
                js.append("';\n");
            }
            for (Statement stmt : statement) {
                js.append("p.innerHTML += ").append(stmt.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, "")).append(";");
            }
            for (Expression expr : expression) {
                js.append("p.innerHTML += ").append(expr.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, "")).append(";");
            }
        }
        return js.toString().trim();
    }

    @Override
    public void checkSemantic() {

    }


}
