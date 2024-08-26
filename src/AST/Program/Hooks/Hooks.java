package AST.Program.Hooks;


import AST.Program.Hooks.UseEffectHook.UseEffectHook;
import AST.Program.Hooks.UseRefHook.UseRefHook;
import AST.Program.Hooks.UseStateHook.UseStateHook;
import AST.Program.Node.Node;

public class Hooks implements Node {
    UseStateHook useStateHook;
    UseRefHook useRefHook;
    UseEffectHook useEffectHook;

    public void setUseStateHook(UseStateHook useStateHook) {
        this.useStateHook = useStateHook;
    }

    public void setUseRefHook(UseRefHook useRefHook) {
        this.useRefHook = useRefHook;
    }

    public void setUseEffectHook(UseEffectHook useEffectHook) {
        this.useEffectHook = useEffectHook;
    }

    public UseStateHook getUseStateHook() {
        return useStateHook;
    }

    public UseRefHook getUseRefHook() {
        return useRefHook;
    }

    public UseEffectHook getUseEffectHook() {
        return useEffectHook;
    }

    @Override
    public String toString() {
        return "\n" + "Hooks{\n" +
                (useStateHook != null ? useStateHook + "\n" : "") +
                (useRefHook != null ? useRefHook + "\n" : "") +
                (useEffectHook != null ? useEffectHook + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();

        if (useStateHook != null) {
            js.append(useStateHook.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        } else if (useRefHook != null) {
            js.append(useRefHook.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        } else if (useEffectHook != null) {
            js.append(useEffectHook.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
        }

        return js.toString();
    }

    @Override
    public void checkSemantic() {

    }


}
