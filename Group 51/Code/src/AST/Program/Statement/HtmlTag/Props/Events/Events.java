package AST.Program.Statement.HtmlTag.Props.Events;

import AST.Program.Statement.HtmlTag.Props.Events.Onclick.Onclick;

public class Events implements Node {
    Onclick onclick;

    public Onclick getOnclick() {
        return onclick;
    }

    public void setOnclick(Onclick onclick) {
        this.onclick = onclick;
    }

    @Override
    public String toString() {
        return "Events{\n" +
                (onclick != null ? onclick + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        return onclick.generateJs();
    }
}
