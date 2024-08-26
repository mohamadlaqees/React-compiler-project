package AST.Program.Statement.HtmlTag.Props;

import AST.Program.Expression.Expression;
import AST.Program.Statement.HtmlTag.Props.ClassName.ClassName;
import AST.Program.Statement.HtmlTag.Props.Events.Events;
import AST.Program.Statement.HtmlTag.Props.SRC.SRC;

public class Props implements Node {
    String calss;
    Expression expression;
    Events events;
    SRC src;
    ClassName className;

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
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();
        if (src != null) {
            js.append(src.generateJs());
        }
        if (className != null) {
            js.append(className.generateJs());
        }
        if (expression != null) {
            js.append(expression.generateJs());
        }
        if (events != null) {
            js.append(events.generateJs());
        }
        return js.toString();
    }

}
