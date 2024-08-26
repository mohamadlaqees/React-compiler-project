package AST.Program.Statement.HtmlTag.Props.ClassName;

import AST.Program.Expression.CssProps.CssProps;

import java.util.ArrayList;
import java.util.List;

public class ClassName implements Node {
    String Classs;
    List<CssProps> cssProps = new ArrayList<CssProps>();

    public String getClasss() {
        return Classs;
    }

    public void setClasss(String aClass) {
        Classs = aClass;
    }

    public List<CssProps> getCssProps() {
        return cssProps;
    }

    public void setCssProps(CssProps cssProps) {
        this.cssProps.add(cssProps);
    }

    @Override
    public String toString() {
        return "ClassName{\n" +
                (Classs != null ? "Class='" + Classs + "'\n" : "") +
                (cssProps != null && !cssProps.isEmpty() ? cssProps + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();
        if (cssProps != null) {
            for (CssProps prop : cssProps) {
                js.append(prop.generateJs());
            }
        }
        return js.toString();
    }

}
