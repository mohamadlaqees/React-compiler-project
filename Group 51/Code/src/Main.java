
import AST.Program.Program;
import Visitor.Visitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "Tests/test1.txt";
        CharStream charStream = fromFileName(source);
        ReactLexer lexer = new ReactLexer(charStream);
        CommonTokenStream token = new CommonTokenStream((TokenSource) lexer);
        ReactParser parser = new ReactParser(token);
        ParseTree tree = parser.program();
        Program react = (Program) new Visitor().visit(tree);
        System.out.println(react);
    }
}