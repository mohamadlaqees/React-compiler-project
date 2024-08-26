package AST.Program.Statement.CustomObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomObject implements Node {
    List<String> identifier = new ArrayList<String>();
    List<String> string = new ArrayList<String>();
    List<String> number = new ArrayList<String>();

    public void setIdentifier(String identifier) {
        this.identifier.add(identifier);
    }

    public void setString(String string) {
        this.string.add(string);
    }

    public void setNumber(String number) {
        this.number.add(number);
    }

    public List<String> getIdentifier() {
        return identifier;
    }

    public List<String> getString() {
        return string;
    }

    public List<String> getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "\n" + "Object{\n" +
                (identifier != null && !identifier.isEmpty() ? "identifier=" + identifier + "\n" : "") +
                (string != null && !string.isEmpty() ? "string=" + string + "\n" : "") +
                (number != null && !number.isEmpty() ? "number=" + number + "\n" : "") +
                '}' + "\n";
    }


    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder("{\n");
        for (int i = 0; i < identifier.size(); i++) {
            js.append(identifier.get(i)).append(": ");
            if (i < number.size() && Objects.equals(identifier.get(i), "id")) {
                js.append(number.get(i));
            } else if (i <= string.size() && (i - 1) >= 0) {
                js.append(string.get(i - 1));
            }
            js.append(",\n");
        }
        if (js.charAt(js.length() - 2) == ',') {
            js.setLength(js.length() - 2);
        }
        js.append("\n},\n");
        return js.toString();
    }


}
