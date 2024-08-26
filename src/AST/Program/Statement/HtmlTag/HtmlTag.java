package AST.Program.Statement.HtmlTag;

import AST.Program.Node.Node;
import AST.Program.Statement.HtmlTag.Div.Div;
import AST.Program.Statement.HtmlTag.Image.Image;
import AST.Program.Statement.HtmlTag.Link.Link;
import AST.Program.Statement.HtmlTag.Paragraph.Paragraph;

public class HtmlTag implements Node {
    Div div;
    Paragraph p;
    Image img;
    Link link;


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

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "\n" + "HtmlTag{\n" +
                (div != null ? div + "\n" : "") +
                (p != null ? p + "\n" : "") +
                (img != null ? img + "\n" : "") +
                (link != null ? link + "\n" : "") +
                '}' + "\n";
    }


    @Override
    public String generateJs(Boolean checkIfInDiv, Boolean firstDiv, Boolean isFatherFunction, String fatherName, Boolean myFatherIsIf, Boolean divAfterJSX, String changeState) {
        StringBuilder js = new StringBuilder();

        if (div != null) {
            js.append(div.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, divAfterJSX, changeState)).append("\n");
        }
        if (p != null) {
            js.append(p.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, "")).append("\n");
        }
        if (img != null) {
            js.append(img.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, "")).append("\n");
        }
        if (link != null) {
            js.append(link.generateJs(checkIfInDiv,firstDiv,isFatherFunction, fatherName, false, false, "")).append("\n");
        }

        return js.toString();
    }

    @Override
    public void checkSemantic() {

    }


}

