package AST.Program.Statement.HtmlTag;

import AST.Program.Statement.HtmlTag.Div.Div;
import AST.Program.Statement.HtmlTag.Image.Image;
import AST.Program.Statement.HtmlTag.Paragraph.Paragraph;

import java.util.Objects;

public class HtmlTag implements Node {
    Div div;
    Paragraph p;
    Image img;


    public void setDiv(Div div) {
        this.div = div;
    }

    public void setP(Paragraph p) {
        this.p = p;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public Div getDiv() {
        return div;
    }

    public Paragraph getP() {
        return p;
    }

    public Image getImg() {
        return img;
    }

    @Override
    public String toString() {
        return "\n" + "HtmlTag{\n" +
                (div != null ? div + "\n" : "") +
                (p != null ? p + "\n" : "") +
                (img != null ? img + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        if (div != null) {
            js.append(div.generateJs()).append("\n");
        }
        if (p != null) {
            js.append(p.generateJs()).append("\n");
        }
        if (img != null) {
            js.append(img.generateJs()).append("\n");
        }

        return js.toString();
    }


}

