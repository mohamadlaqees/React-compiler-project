package AST.Program;

import AST.Program.Statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class Program {
    List<Statement> statement = new ArrayList<Statement>();

    public void setStatement(Statement statement) {
        this.statement.add(statement);
    }

    public List<Statement> getStatement() {
        return statement;
    }


    @Override
    public String toString() {
        return "Program{" + "\n" +
                statement + "\n" +
                '}' + "\n";
    }
}

