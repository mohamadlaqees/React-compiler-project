package AST.Program.Statement.Array;

import AST.Program.Statement.CustomObject.CustomObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Array implements Node {
    String identifier;
    List<CustomObject> object = new ArrayList<CustomObject>();

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setObject(CustomObject object) {
        this.object.add(object);
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<CustomObject> getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "Array{\n" +
                (identifier != null ? "identifier='" + identifier + "'\n" : "") +
                (object != null && !object.isEmpty() ? object + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder("let " + identifier + " = [\n");
        for (CustomObject customObject : object) {
            js.append(customObject.generateJs());
        }
        js.append("];\n");
        return js.toString();
    }


}
