package AST.Program.Expression.Boolean;

import AST.Program.Expression.Expression;

public class Boolean extends Expression {
    String True;
    String False;

    public void setTrue(String aTrue) {
        True = aTrue;
    }

    public void setFalse(String aFalse) {
        False = aFalse;
    }

    public String getTrue() {
        return True;
    }

    public String getFalse() {
        return False;
    }

    @Override
    public String toString() {
        return "Boolean{\n" +
                (True != null ? "True='" + True + "'\n" : "") +
                (False != null ? "False='" + False + "'\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(java.lang.Boolean checkIfInDiv, java.lang.Boolean firstDiv, java.lang.Boolean isFatherFunction, String fatherName, java.lang.Boolean myFatherIsIf, java.lang.Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();

        if (True != null) {
            js.append("true");
        } else if (False != null) {
            js.append("false");
        }
        return js.toString();
    }

    @Override
    public void checkSemantic() {

    }


}
