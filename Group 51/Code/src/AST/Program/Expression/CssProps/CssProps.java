package AST.Program.Expression.CssProps;

import AST.Program.Expression.CssProps.BOTTOM.BOTTOM;
import AST.Program.Expression.CssProps.BorderBottomDash.BorderBottomDash;
import AST.Program.Expression.CssProps.BorderDash.BorderDash;
import AST.Program.Expression.CssProps.GabDash.GabDash;
import AST.Program.Expression.CssProps.HeightDash.HeightDash;
import AST.Program.Expression.CssProps.LEFT.LEFT;
import AST.Program.Expression.CssProps.MarginDash.MarginDash;
import AST.Program.Expression.CssProps.PDash.PDash;
import AST.Program.Expression.CssProps.RIGHT.RIGHT;
import AST.Program.Expression.CssProps.TOP.TOP;
import AST.Program.Expression.CssProps.TextDash.TextDash;
import AST.Program.Expression.CssProps.WidthDash.WidthDash;
import AST.Program.Expression.TernaryExpression.TernaryExpression;

public class CssProps implements Node {
    String FLEX;
    String POSITION;
    String FLEX_COLUMN;
    String FLEX_ROW;
    String JUSTIFY_CENTER;
    String JUSTIFY_START;
    String JUSTIFY_END;
    String JUSTIFY_AROUND;
    String JUSTIFY_EVENLY;
    String JUSTIFY_BETWEEN;
    String BORDER;
    String BORDER_RADIUS_SM;
    String BORDER_RADIUS_MD;
    String BORDER_RADIUS_LG;
    String BORDER_RADIUS_XL;
    String BORDER_RADIUS_2XL;
    String BORDER_RADIUS_3XL;
    String BORDER_RADIUS_FULL;
    String CURSOR_POINTER;
    String MARGIN_AUTO;
    String TEXT_SM;
    String TEXT_LG;
    String TEXT_XL;
    String TEXT_2XL;
    String TEXT_3XL;
    String FONT_BOLD;
    WidthDash widthDash;
    HeightDash heightDash;
    PDash pDash;
    TextDash textDash;
    MarginDash marginDash;
    BorderDash borderDash;
    BorderBottomDash borderBottomDash;
    GabDash gabDash;
    TOP top;
    RIGHT right;
    LEFT left;
    BOTTOM bottom;


    public String FLEX() {
        return FLEX;
    }

    public void setFLEX(String FLEX) {
        this.FLEX = FLEX;
    }

    public String POSITION() {
        return POSITION;
    }

    public void setPOSITION(String POSITION) {
        this.POSITION = POSITION;
    }

    public TOP top() {
        return top;
    }

    public void setTop(TOP top) {
        this.top = top;
    }

    public RIGHT right() {
        return right;
    }

    public void setRight(RIGHT right) {
        this.right = right;
    }

    public LEFT left() {
        return left;
    }

    public void setLeft(LEFT left) {
        this.left = left;
    }

    public BOTTOM bottom() {
        return bottom;
    }

    public void setBottom(BOTTOM bottom) {
        this.bottom = bottom;
    }

    public String FLEX_COLUMN() {
        return FLEX_COLUMN;
    }

    public void setFLEX_COLUMN(String FLEX_COLUMN) {
        this.FLEX_COLUMN = FLEX_COLUMN;
    }

    public String FLEX_ROW() {
        return FLEX_ROW;
    }

    public void setFLEX_ROW(String FLEX_ROW) {
        this.FLEX_ROW = FLEX_ROW;
    }

    public String JUSTIFY_CENTER() {
        return JUSTIFY_CENTER;
    }

    public void setJUSTIFY_CENTER(String JUSTIFY_CENTER) {
        this.JUSTIFY_CENTER = JUSTIFY_CENTER;
    }

    public String JUSTIFY_START() {
        return JUSTIFY_START;
    }

    public void setJUSTIFY_START(String JUSTIFY_START) {
        this.JUSTIFY_START = JUSTIFY_START;
    }

    public String JUSTIFY_END() {
        return JUSTIFY_END;
    }

    public void setJUSTIFY_END(String JUSTIFY_END) {
        this.JUSTIFY_END = JUSTIFY_END;
    }

    public String JUSTIFY_AROUND() {
        return JUSTIFY_AROUND;
    }

    public void setJUSTIFY_AROUND(String JUSTIFY_AROUND) {
        this.JUSTIFY_AROUND = JUSTIFY_AROUND;
    }

    public String JUSTIFY_EVENLY() {
        return JUSTIFY_EVENLY;
    }

    public void setJUSTIFY_EVENLY(String JUSTIFY_EVENLY) {
        this.JUSTIFY_EVENLY = JUSTIFY_EVENLY;
    }

    public String JUSTIFY_BETWEEN() {
        return JUSTIFY_BETWEEN;
    }

    public void setJUSTIFY_BETWEEN(String JUSTIFY_BETWEEN) {
        this.JUSTIFY_BETWEEN = JUSTIFY_BETWEEN;
    }

    public GabDash gabDash() {
        return gabDash;
    }

    public void setGabDash(GabDash gabDash) {
        this.gabDash = gabDash;
    }

    public String BORDER() {
        return BORDER;
    }

    public void setBORDER(String BORDER) {
        this.BORDER = BORDER;
    }

    public BorderDash borderDash() {
        return borderDash;
    }

    public void setBorderDash(BorderDash borderDash) {
        this.borderDash = borderDash;
    }

    public BorderBottomDash borderBottomDash() {
        return borderBottomDash;
    }

    public void setBorderBottomDash(BorderBottomDash borderBottomDash) {
        this.borderBottomDash = borderBottomDash;
    }

    public String BORDER_RADIUS_SM() {
        return BORDER_RADIUS_SM;
    }

    public void setBORDER_RADIUS_SM(String BORDER_RADIUS_SM) {
        this.BORDER_RADIUS_SM = BORDER_RADIUS_SM;
    }

    public String BORDER_RADIUS_MD() {
        return BORDER_RADIUS_MD;
    }

    public void setBORDER_RADIUS_MD(String BORDER_RADIUS_MD) {
        this.BORDER_RADIUS_MD = BORDER_RADIUS_MD;
    }

    public String BORDER_RADIUS_LG() {
        return BORDER_RADIUS_LG;
    }

    public void setBORDER_RADIUS_LG(String BORDER_RADIUS_LG) {
        this.BORDER_RADIUS_LG = BORDER_RADIUS_LG;
    }

    public String BORDER_RADIUS_XL() {
        return BORDER_RADIUS_XL;
    }

    public void setBORDER_RADIUS_XL(String BORDER_RADIUS_XL) {
        this.BORDER_RADIUS_XL = BORDER_RADIUS_XL;
    }

    public String BORDER_RADIUS_2XL() {
        return BORDER_RADIUS_2XL;
    }

    public void setBORDER_RADIUS_2XL(String BORDER_RADIUS_2XL) {
        this.BORDER_RADIUS_2XL = BORDER_RADIUS_2XL;
    }

    public String BORDER_RADIUS_3XL() {
        return BORDER_RADIUS_3XL;
    }

    public void setBORDER_RADIUS_3XL(String BORDER_RADIUS_3XL) {
        this.BORDER_RADIUS_3XL = BORDER_RADIUS_3XL;
    }

    public String BORDER_RADIUS_FULL() {
        return BORDER_RADIUS_FULL;
    }

    public void setBORDER_RADIUS_FULL(String BORDER_RADIUS_FULL) {
        this.BORDER_RADIUS_FULL = BORDER_RADIUS_FULL;
    }

    public String CURSOR_POINTER() {
        return CURSOR_POINTER;
    }

    public void setCURSOR_POINTER(String CURSOR_POINTER) {
        this.CURSOR_POINTER = CURSOR_POINTER;
    }

    public String MARGIN_AUTO() {
        return MARGIN_AUTO;
    }

    public void setMARGIN_AUTO(String MARGIN_AUTO) {
        this.MARGIN_AUTO = MARGIN_AUTO;
    }

    public MarginDash marginDash() {
        return marginDash;
    }

    public void setMarginDash(MarginDash marginDash) {
        this.marginDash = marginDash;
    }

    public PDash pDash() {
        return pDash;
    }

    public void setpDash(PDash pDash) {
        this.pDash = pDash;
    }

    public TextDash textDash() {
        return textDash;
    }

    public void setTextDash(TextDash textDash) {
        this.textDash = textDash;
    }

    public String TEXT_SM() {
        return TEXT_SM;
    }

    public void setTEXT_SM(String TEXT_SM) {
        this.TEXT_SM = TEXT_SM;
    }

    public String TEXT_LG() {
        return TEXT_LG;
    }

    public void setTEXT_LG(String TEXT_LG) {
        this.TEXT_LG = TEXT_LG;
    }

    public String TEXT_XL() {
        return TEXT_XL;
    }

    public void setTEXT_XL(String TEXT_XL) {
        this.TEXT_XL = TEXT_XL;
    }

    public String TEXT_2XL() {
        return TEXT_2XL;
    }

    public void setTEXT_2XL(String TEXT_2XL) {
        this.TEXT_2XL = TEXT_2XL;
    }

    public String TEXT_3XL() {
        return TEXT_3XL;
    }

    public void setTEXT_3XL(String TEXT_3XL) {
        this.TEXT_3XL = TEXT_3XL;
    }

    public String FONT_BOLD() {
        return FONT_BOLD;
    }

    public void setFONT_BOLD(String FONT_BOLD) {
        this.FONT_BOLD = FONT_BOLD;
    }

    public WidthDash widthDash() {
        return widthDash;
    }

    public void setWidthDash(WidthDash widthDash) {
        this.widthDash = widthDash;
    }

    public HeightDash heightDash() {
        return heightDash;
    }

    public void setHeightDash(HeightDash heightDash) {
        this.heightDash = heightDash;
    }

    @Override
    public String toString() {
        return "\n" + "CssProps{\n" +
                (FLEX != null ? "FLEX='" + FLEX + "'\n" : "") +
                (POSITION != null ? "POSITION='" + POSITION + "'\n" : "") +
                (top != null ? top + "'\n" : "") +
                (right != null ? right + "'\n" : "") +
                (left != null ? left + "'\n" : "") +
                (bottom != null ? bottom + "'\n" : "") +
                (FLEX_COLUMN != null ? "FLEX_COLUMN='" + FLEX_COLUMN + "'\n" : "") +
                (FLEX_ROW != null ? "FLEX_ROW='" + FLEX_ROW + "'\n" : "") +
                (JUSTIFY_CENTER != null ? "JUSTIFY_CENTER='" + JUSTIFY_CENTER + "'\n" : "") +
                (JUSTIFY_START != null ? "JUSTIFY_START='" + JUSTIFY_START + "'\n" : "") +
                (JUSTIFY_END != null ? "JUSTIFY_END='" + JUSTIFY_END + "'\n" : "") +
                (JUSTIFY_AROUND != null ? "JUSTIFY_AROUND='" + JUSTIFY_AROUND + "'\n" : "") +
                (JUSTIFY_EVENLY != null ? "JUSTIFY_EVENLY='" + JUSTIFY_EVENLY + "'\n" : "") +
                (JUSTIFY_BETWEEN != null ? "JUSTIFY_BETWEEN='" + JUSTIFY_BETWEEN + "'\n" : "") +
                (gabDash != null ? gabDash + "\n" : "") +
                (BORDER != null ? "BORDER='" + BORDER + "'\n" : "") +
                (borderDash != null ? borderDash + "\n" : "") +
                (borderBottomDash != null ? borderBottomDash + "\n" : "") +
                (BORDER_RADIUS_SM != null ? "BORDER_RADIUS_SM='" + BORDER_RADIUS_SM + "'\n" : "") +
                (BORDER_RADIUS_MD != null ? "BORDER_RADIUS_MD='" + BORDER_RADIUS_MD + "'\n" : "") +
                (BORDER_RADIUS_LG != null ? "BORDER_RADIUS_LG='" + BORDER_RADIUS_LG + "'\n" : "") +
                (BORDER_RADIUS_XL != null ? "BORDER_RADIUS_XL='" + BORDER_RADIUS_XL + "'\n" : "") +
                (BORDER_RADIUS_2XL != null ? "BORDER_RADIUS_2XL='" + BORDER_RADIUS_2XL + "'\n" : "") +
                (BORDER_RADIUS_3XL != null ? "BORDER_RADIUS_3XL='" + BORDER_RADIUS_3XL + "'\n" : "") +
                (BORDER_RADIUS_FULL != null ? "BORDER_RADIUS_FULL='" + BORDER_RADIUS_FULL + "'\n" : "") +
                (CURSOR_POINTER != null ? "CURSOR_POINTER='" + CURSOR_POINTER + "'\n" : "") +
                (MARGIN_AUTO != null ? "MARGIN_AUTO='" + MARGIN_AUTO + "'\n" : "") +
                (marginDash != null ? marginDash + "\n" : "") +
                (pDash != null ? pDash + "\n" : "") +
                (textDash != null ? textDash + "\n" : "") +
                (TEXT_SM != null ? "TEXT_SM='" + TEXT_SM + "'\n" : "") +
                (TEXT_LG != null ? "TEXT_LG='" + TEXT_LG + "'\n" : "") +
                (TEXT_XL != null ? "TEXT_XL='" + TEXT_XL + "'\n" : "") +
                (TEXT_2XL != null ? "TEXT_2XL='" + TEXT_2XL + "'\n" : "") +
                (TEXT_3XL != null ? "TEXT_3XL='" + TEXT_3XL + "'\n" : "") +
                (FONT_BOLD != null ? "FONT_BOLD='" + FONT_BOLD + "'\n" : "") +
                (widthDash != null ? widthDash + "\n" : "") +
                (heightDash != null ? heightDash + "\n" : "") +
                '}' + "\n";
    }

    @Override
    public String generateJs() {
        StringBuilder js = new StringBuilder();

        if (FLEX != null) {
            js.append("display: flex;");
        }

        if (POSITION != null) {
            js.append("position: ").append(POSITION).append(";");
        }

        if (top != null) {
            js.append(top.generateJs());
        }

        if (bottom != null) {
            js.append(bottom.generateJs());
        }

        if (right != null) {
            js.append(right.generateJs());
        }

        if (left != null) {
            js.append(left.generateJs());
        }

        if (FLEX_COLUMN != null) {
            js.append("flex-direction: column;");
        }

        if (FLEX_ROW != null) {
            js.append("flex-direction: row;");
        }

        if (JUSTIFY_CENTER != null) {
            js.append("justify-content: center;");
        }

        if (JUSTIFY_START != null) {
            js.append("justify-content: start;");
        }

        if (JUSTIFY_END != null) {
            js.append("justify-content: end;");
        }

        if (JUSTIFY_EVENLY != null) {
            js.append("justify-content: space-evenly;");
        }

        if (JUSTIFY_AROUND != null) {
            js.append("justify-content: space-around;");
        }

        if (JUSTIFY_BETWEEN != null) {
            js.append("justify-content: space-between;");
        }

        if (gabDash != null) {
            js.append(gabDash.generateJs());
        }

        if (borderDash != null) {
            js.append(borderDash.generateJs());
        }

        if (borderBottomDash != null) {
            js.append(borderBottomDash.generateJs());
        }

        if (BORDER_RADIUS_SM != null) {
            js.append("border-radius: 2px;");
        }

        if (BORDER_RADIUS_MD != null) {
            js.append("border-radius: 6px;");
        }

        if (BORDER_RADIUS_LG != null) {
            js.append("border-radius: 8px;");
        }

        if (BORDER_RADIUS_XL != null) {
            js.append("border-radius: 12px;");
        }

        if (BORDER_RADIUS_2XL != null) {
            js.append("border-radius: 16px;");
        }

        if (BORDER_RADIUS_3XL != null) {
            js.append("border-radius: 24px;");
        }

        if (BORDER_RADIUS_FULL != null) {
            js.append("border-radius: 9999px;");
        }

        if (CURSOR_POINTER != null) {
            js.append("cursor: pointer;");
        }

        if (MARGIN_AUTO != null) {
            js.append("margin: auto;");
        }

        if (marginDash != null) {
            js.append(marginDash.generateJs());
        }

        if (pDash != null) {
            js.append(pDash.generateJs());
        }

        if (textDash != null) {
            js.append(textDash.generateJs());
        }

        if (TEXT_SM != null) {
            js.append("font-size: 14px;");
        }

        if (TEXT_LG != null) {
            js.append("font-size: 18px;");
        }

        if (TEXT_XL != null) {
            js.append("font-size: 20px;");
        }

        if (TEXT_2XL != null) {
            js.append("font-size: 24px;");
        }

        if (TEXT_3XL != null) {
            js.append("font-size: 30px;");
        }

        if (FONT_BOLD != null) {
            js.append("font-weight: bold;");
        }

        if (widthDash != null) {
            js.append(widthDash.generateJs());
        }

        if (heightDash != null) {
            js.append(heightDash.generateJs());
        }

        return js.toString();
    }

}


