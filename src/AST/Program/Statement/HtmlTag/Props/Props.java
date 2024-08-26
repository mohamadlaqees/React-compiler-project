package AST.Program.Statement.HtmlTag.Props;

import AST.Program.Expression.Expression;
import AST.Program.Node.Node;
import AST.Program.Statement.HtmlTag.Props.ClassName.ClassName;
import AST.Program.Statement.HtmlTag.Props.Events.Events;
import AST.Program.Statement.HtmlTag.Props.Href.Href;
import AST.Program.Statement.HtmlTag.Props.SRC.SRC;
import AST.Program.Statement.HtmlTag.Props.Target.Target;

public class Props implements Node {
    String calss;
    Expression expression;
    Events events;
    SRC src;
    ClassName className;
    Href href;
    Target target;


    public Href getHref() {
        return href;
    }

    public void setHref(Href href) {
        this.href = href;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public String getCalss() {
        return calss;
    }

    public void setCalss(String calss) {
        this.calss = calss;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public SRC getSrc() {
        return src;
    }

    public void setSrc(SRC src) {
        this.src = src;
    }

    public ClassName getClassName() {
        return className;
    }

    public void setClassName(ClassName className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "\n" + "Props{\n" +
                (calss != null ? "calss='" + calss + "'\n" : "") +
                (expression != null ? expression + "\n" : "") +
                (events != null ? events + "\n" : "") +
                (src != null ? src + "\n" : "") +
                (className != null ? className + "\n" : "") +
                (href != null ? href + "\n" : "") +
                (target != null ? target + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();
        if (src != null) {
            js.append(src.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, ""));
        }
        if (className != null) {
            js.append(className.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, ""));
        }
        if (expression != null) {
            js.append(expression.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, ""));
        }
        if (events != null) {
            js.append(events.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, ""));
        }
        if (href != null) {
            js.append(href.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, ""));
        }
        if (target != null) {
            js.append(target.generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, ""));
        }
        return js.toString();
    }

    @Override
    public void checkSemantic() {

    }


    public String generateJs() {
        return null;
    }
}