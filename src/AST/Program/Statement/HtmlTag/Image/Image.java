package AST.Program.Statement.HtmlTag.Image;

import AST.Program.Node.Node;
import AST.Program.Statement.HtmlTag.Props.Props;

import java.util.ArrayList;
import java.util.List;

public class Image implements Node {
    String image;
    List<Props> props = new ArrayList<Props>();

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Props> getProps() {
        return props;
    }

    public void setProps(Props props) {
        this.props.add(props);
    }

    @Override
    public String toString() {
        return "Image{\n" +
                (image != null ? "image='" + image + "'\n" : "") +
                (props != null && !props.isEmpty() ? props + "\n" : "") +
                '}' + "\n";
    }


    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();

        if (image != null) {
            js.append("var img = document.createElement('img');\n");

            StringBuilder styleProps = new StringBuilder();
            String srcProp = null;

            for (Props prop : props) {
                if (prop.getSrc() != null) {
                    srcProp = prop.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, "");
                } else {
                    styleProps.append(prop.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, ""));
                }
            }

            if (!styleProps.isEmpty()) {
                js.append("img.style = '").append(styleProps.toString().trim()).append("';\n");
            }

            if (srcProp != null) {
                js.append("img.src = `${").append(srcProp).append("}`;\n");
            }
        }

        return js.toString().trim();
    }

    @Override
    public void checkSemantic() {

    }


}
