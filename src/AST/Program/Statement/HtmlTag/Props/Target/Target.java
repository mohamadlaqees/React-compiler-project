package AST.Program.Statement.HtmlTag.Props.Target;

import AST.Program.Node.Node;

public class Target implements Node {
    String target;
    String _blank;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String get_blank() {
        return _blank;
    }

    public void set_blank(String _blank) {
        this._blank = _blank;
    }

    @Override
    public String toString() {
        return "Target{\n" +
                (target != null ? "target='" + target + "'\n" : "") +
                (_blank != null ? "_blank='" + _blank + "'\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {

        return _blank;
    }

    @Override
    public void checkSemantic() {

    }
}
