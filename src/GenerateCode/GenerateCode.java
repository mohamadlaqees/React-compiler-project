package GenerateCode;

import AST.Program.Node.Node;
import SymbolTable.SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenerateCode {
    private String projectName;
    private FileWriter fileWriterJs;

    public void generate(SymbolTable symbolTable, List<Node> statements) throws IOException {
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (Objects.equals(symbolTable.getRows().get(i).getType(), "componentName")) {
                this.projectName = symbolTable.getRows().get(i).getValue();
                break;
            }
        }
        generateHtmlFile();
        writeJsFile(statements);
        formatJSFile(projectName);
    }

    private void generateHtmlFile() {
        String htmlFilePath = "F:\\files\\IT\\compilerSlides\\Project2\\src\\FinalCode\\" + projectName + ".html";
        try (FileWriter fileWriterHtml = new FileWriter(htmlFilePath)) {
            fileWriterHtml.write("<!DOCTYPE html>\n");
            fileWriterHtml.write("<html>\n");
            fileWriterHtml.write("<body>\n");
            fileWriterHtml.write("<div id=\"root\"></div>\n");
            fileWriterHtml.write("<script src=\"" + projectName + ".js\"></script>\n");
            fileWriterHtml.write("</body>\n");
            fileWriterHtml.write("</html>\n");
        } catch (IOException e) {
            System.err.println("Error writing HTML file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void generateJsFile() throws IOException {
        if (fileWriterJs == null) {
            String jsFilePath = "F:\\files\\IT\\compilerSlides\\Project2\\src\\FinalCode\\" + projectName + ".js";
            fileWriterJs = new FileWriter(jsFilePath);
        }
    }

    public void writeJsFile(List<Node> statements) throws IOException {
        if (fileWriterJs == null) {
            generateJsFile();
        }
        try (FileWriter writer = fileWriterJs) {
            for (Node statement : statements) {
                writer.write(statement.generateJs(false,false,false, "", false, false, "") + "\n");
            }
            writer.write(projectName+"( )");
        } catch (IOException e) {
            System.err.println("Error writing JS file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void formatJSFile(String projectName) throws IOException {
        String filePath = "F:\\files\\IT\\compilerSlides\\Project2\\src\\FinalCode\\" + projectName + ".js";

        List<String> lines = Files.readAllLines(Paths.get(filePath));
        List<String> newLines = new ArrayList<>();

        boolean foundFunction = false;

        for (String line : lines) {
            if (line.contains("function " + projectName + "()")) {
                foundFunction = true;
            }
            if (foundFunction) {
                newLines.add(line);
            }
        }

        Files.write(Paths.get(filePath), newLines);
    }
}
