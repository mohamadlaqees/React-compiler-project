package AST.Program.Hooks.HookContent;

import AST.Program.Statement.Array.Array;
import AST.Program.Statement.CustomObject.CustomObject;

public class HookContent implements Node {
    String string;
    String identifier;
    String number;
    String True;
    String False;
    Array array;
    CustomObject object;

    public void setString(String string) {
        this.string = string;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTrue(String aTrue) {
        True = aTrue;
    }

    public void setFalse(String aFalse) {
        False = aFalse;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public void setObject(CustomObject object) {
        this.object = object;
    }

    public String getString() {
        return string;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getNumber() {
        return number;
    }

    public String getTrue() {
        return True;
    }

    public String getFalse() {
        return False;
    }

    public Array getArray() {
        return array;
    }

    public Object getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "\n" + "HookContent{\n" +
                (string != null ? "string='" + string + "'\n" : "") +
                (identifier != null ? "identifier='" + identifier + "'\n" : "") +
                (number != null ? "number=" + number + "\n" : "") +
                (True != null ? "True='" + True + "'\n" : "") +
                (False != null ? "False='" + False + "'\n" : "") +
                (array != null ? array + "\n" : "") +
                (object != null ? object + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        if (string != null) {
            js.append(string);
        } else if (identifier != null) {
            js.append(identifier);
        } else if (number != null) {
            js.append(number);
        } else if (True != null) {
            js.append(True);
        } else if (False != null) {
            js.append(False);
        } else if (array != null) {
            js.append(array.generateJs());
        } else if (object != null) {
            js.append(object.generateJs());
        }

        return js.toString();
    }

}
