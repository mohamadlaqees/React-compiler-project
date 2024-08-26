package AST.Program.Statement.HtmlTag.Image;

import AST.Program.Expression.Expression;
import AST.Program.Statement.HtmlTag.Props.Props;
import AST.Program.Statement.Statement;

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
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        if (image != null) {
            js.append("var img = document.createElement('img');\n");

            StringBuilder styleProps = new StringBuilder();
            String srcProp = null;

            for (Props prop : props) {
                if (prop.getSrc() != null) {
                    srcProp = prop.generateJs();
                } else {
                    styleProps.append(prop.generateJs());
                }
            }

            if (styleProps.length() > 0) {
                js.append("img.style = '").append(styleProps.toString().trim()).append("';\n");
            }

            if (srcProp != null) {
                js.append("img.src = `${").append(srcProp).append("}`;\n");
            }
        }

        return js.toString().trim();
    }

}
