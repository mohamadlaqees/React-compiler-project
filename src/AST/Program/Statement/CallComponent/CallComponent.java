package AST.Program.Statement.CallComponent;

import AST.Program.ComponentAttribute.ComponentAttribute;
import AST.Program.Node.Node;

import java.util.ArrayList;
import java.util.List;

public class CallComponent implements Node {
    String component;
    String componentName;
    List<String> identifier = new ArrayList<String>();
    List<ComponentAttribute> componentAttribute = new ArrayList<ComponentAttribute>();
    int line;

    public void setComponent(String component) {
        this.component = component;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName.replace("\"", "");
    }

    public void setIdentifier(String identifier) {
        this.identifier.add(identifier);
    }

    public void setComponentAttribute(ComponentAttribute componentAttribute) {
        this.componentAttribute.add(componentAttribute);
    }

    public String getComponent() {
        return component;
    }

    public String getComponentName() {
        return componentName;
    }

    public List<String> getIdentifier(int i) {
        return identifier;
    }

    public List<ComponentAttribute> getComponentAttribute() {
        return componentAttribute;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "\n" + "CallComponent{\n" +
                (component != null ? "component='" + component + "'\n" : "") +
                (componentName != null ? "componentName=" + componentName + "\n" : "") +
                (identifier != null && !identifier.isEmpty() ? "identifier='" + identifier + "\n" : "") +
                (componentAttribute != null && !componentAttribute.isEmpty() ? componentAttribute + "\n" : "") +
                '}' + "\n";
    }
    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder jsCode = new StringBuilder();

        if (myFatherIsIf) {
            jsCode.append("div.appendChild( ");
        }

        jsCode.append(componentName).append("( ");

        for (int i = 0; i < identifier.size(); i++) {
            jsCode.append(identifier.get(i));
            if (i < identifier.size() - 1) {
                jsCode.append(", ");
            }
        }

        for (int i = 0; i < componentAttribute.size(); i++) {
            jsCode.append(componentAttribute.get(i).generateJs(checkIfInDiv, firstDiv, isFatherFunction, fatherName, false, false, changeState));
            if (jsCode.length() >= 2 && jsCode.substring(jsCode.length() - 1).equals(";")) {
                jsCode.delete(jsCode.length() - 1, jsCode.length());
            }
            if (i < componentAttribute.size() - 1) {
                jsCode.append(", ");
            }
        }

        jsCode.append(" )");

        if (myFatherIsIf) {
            jsCode.append(" );");
        }

        return jsCode.toString();
    }

    @Override
    public void checkSemantic() {

    }


}
