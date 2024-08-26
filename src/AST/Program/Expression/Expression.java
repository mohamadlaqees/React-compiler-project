package AST.Program.Expression;

import AST.Program.Node.Node;

public abstract class Expression implements Node {
    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        return null;
    }
}
