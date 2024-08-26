package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List<Row> rows = new ArrayList<Row>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(Row rows) {
        this.rows.add(rows);
    }


    public void print() {
        System.out.println("<<SymbolTable>>");
        System.out.println();
        System.out.println("Type" + "\t\t\t\tValue" + "\t\t\t\tLine");
        System.out.println("___________________________________________________");
        for (int i = 0; i < rows.size(); i++) {
            if (rows.get(i) != null) {
                System.out.println(rows.get(i).getType() + "\t\t" + rows.get(i).getValue() + "\t\t\t\t" + rows.get(i).getLine());
                System.out.println("___________________________________________________");
            }
        }
        System.out.println();
        System.out.println();
    }
}
