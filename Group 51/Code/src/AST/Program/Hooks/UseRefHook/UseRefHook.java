package AST.Program.Hooks.UseRefHook;

import AST.Program.Hooks.HookContent.HookContent;

public class UseRefHook implements Node {
    String UseRef;
    HookContent hookContent;
    int line;

    public void setUseRef(String useRef) {
        UseRef = useRef;
    }

    public void setHookContent(HookContent hookContent) {
        this.hookContent = hookContent;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getUseRef() {
        return UseRef;
    }

    public int getLine() {
        return line;
    }


    public HookContent getHookContent() {
        return hookContent;
    }

    @Override
    public String toString() {
        return "UseRefHook{\n" +
                (UseRef != null ? "UseRef='" + UseRef + "'\n" : "") +
                (hookContent != null ? hookContent + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        // Generate JavaScript for useRef
        js.append("function createRef(initialValue) {\n");
        js.append("    return { current: initialValue };\n");
        js.append("}\n");

        // Generate JavaScript for creating ref
        js.append("let ").append(UseRef).append(" = createRef(");
        if (hookContent != null) {
            js.append(hookContent.generateJs());
        }
        js.append(");\n");

        return js.toString();
    }

}
