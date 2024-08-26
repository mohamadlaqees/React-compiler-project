package Visitor;

import AST.Program.ComponentAttribute.ComponentAttribute;
import AST.Program.Expression.ArithmaticExpression.ArithmaticExpression;
import AST.Program.Expression.ArithmaticOperator.ArithmaticOperator;
import AST.Program.Expression.Boolean.Boolean;
import AST.Program.Expression.BooleanExpression.BooleanExpression;
import AST.Program.Expression.BracketDotExpression.BracketDotExpression;
import AST.Program.Expression.BracketExpression.BracketExpression;
import AST.Program.Expression.CssProps.BOTTOM.BOTTOM;
import AST.Program.Expression.CssProps.BackGroundColor.BackGroundColor;
import AST.Program.Expression.CssProps.BorderBottomDash.BorderBottomDash;
import AST.Program.Expression.CssProps.BorderDash.BorderDash;
import AST.Program.Expression.CssProps.Color.Color;
import AST.Program.Expression.CssProps.CssProps;
import AST.Program.Expression.CssProps.GabDash.GabDash;
import AST.Program.Expression.CssProps.HeightDash.HeightDash;
import AST.Program.Expression.CssProps.LEFT.LEFT;
import AST.Program.Expression.CssProps.MarginDash.MarginDash;
import AST.Program.Expression.CssProps.PDash.PDash;
import AST.Program.Expression.CssProps.RIGHT.RIGHT;
import AST.Program.Expression.CssProps.TOP.TOP;
import AST.Program.Expression.CssProps.TextDash.TextDash;
import AST.Program.Expression.CssProps.WidthDash.WidthDash;
import AST.Program.Expression.DotExpression.DotExpression;
import AST.Program.Expression.Expression;
import AST.Program.Expression.FunctionCallExpression.FunctionCallExpression;
import AST.Program.Expression.FunctionExpression.FunctionExpression;
import AST.Program.Expression.Literal.Literal;
import AST.Program.Expression.LiteralExpression.LiteralExpression;
import AST.Program.Expression.ParenExpression.ParenExpression;
import AST.Program.Expression.TernaryExpression.TernaryExpression;
import AST.Program.FunctionAttribute.FunctionAttribute;
import AST.Program.Hooks.HookContent.HookContent;
import AST.Program.Hooks.Hooks;
import AST.Program.Hooks.UseEffectHook.UseEffectHook;
import AST.Program.Hooks.UseRefHook.UseRefHook;
import AST.Program.Hooks.UseStateHook.UseStateHook;
import AST.Program.Node.Node;
import AST.Program.Program;
import AST.Program.Statement.Array.Array;
import AST.Program.Statement.Assignment.Assignment;
import AST.Program.Statement.CallComponent.CallComponent;
import AST.Program.Statement.Component.Component;
import AST.Program.Statement.Component.JSX.JSX;
import AST.Program.Statement.ForStatement.ForStatement;
import AST.Program.Statement.Function.Function;
import AST.Program.Statement.FunctionCall.FunctionCall;
import AST.Program.Statement.HtmlTag.Div.Div;
import AST.Program.Statement.HtmlTag.HtmlTag;
import AST.Program.Statement.HtmlTag.Image.Image;
import AST.Program.Statement.HtmlTag.Link.Link;
import AST.Program.Statement.HtmlTag.Paragraph.Paragraph;
import AST.Program.Statement.HtmlTag.Props.ClassName.ClassName;
import AST.Program.Statement.HtmlTag.Props.Events.Events;
import AST.Program.Statement.HtmlTag.Props.Events.Onclick.Onclick;
import AST.Program.Statement.HtmlTag.Props.Href.Href;
import AST.Program.Statement.HtmlTag.Props.Props;
import AST.Program.Statement.HtmlTag.Props.SRC.SRC;
import AST.Program.Statement.HtmlTag.Props.Target.Target;
import AST.Program.Statement.IfStatement.IfStatement;
import AST.Program.Statement.CustomObject.CustomObject;
import AST.Program.Statement.Statement;
import AST.Program.Statement.TimeFunction.TimeFunction;
import GenerateCode.GenerateCode;
import SemanticCheck.SemanticCheck;
import SymbolTable.SymbolTable;
import SymbolTable.Row;
import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;

import java.io.IOException;
import java.util.*;

public class Visitor extends ReactParserBaseVisitor {
    List<CallComponent> callComponentName = new ArrayList<>();
    List<Component> componentName = new ArrayList<>();

    public SymbolTable symbolTable = new SymbolTable();
    GenerateCode generateCode = new GenerateCode();
    private final List<Node> statements = new ArrayList<>();


    @Override
    public Program visitProgram(ReactParser.ProgramContext ctx) throws IOException {
        Program program = new Program();
        SemanticCheck semanticCheck = new SemanticCheck();

        if (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                program.setStatement(visitStatement(ctx.statement(i)));
            }
        }

        for (Component component : componentName) {
            semanticCheck.checkIfComponentIsDefined(component.getComponentName(), component.getLine(), symbolTable);
        }

        for (CallComponent callComponent : callComponentName) {
            semanticCheck.checkIfComponentNotExist(callComponent.getComponentName(), callComponent.getLine(), symbolTable);
        }

        generateCode.generate(symbolTable, statements);
        symbolTable.print();
        return program;
    }

    @Override
    public Statement visitStatement(ReactParser.StatementContext ctx) throws IOException {
        Statement statement = new Statement();
        if (ctx.component() != null) {
            Component tempComponent = visitComponent(ctx.component());
            statement.setComponent(tempComponent);
            statements.add(tempComponent);
        }
        if (ctx.callComponent() != null) {
            statement.setCallComponent(visitCallComponent(ctx.callComponent()));
        }
        if (ctx.assignment() != null) {
            statement.setAssignment(visitAssignment(ctx.assignment()));
        }
        if (ctx.ifStatement() != null) {
            statement.setIfStatement(visitIfStatement(ctx.ifStatement()));
        }
        if (ctx.forStatement() != null) {
            statement.setForStatement(visitForStatement(ctx.forStatement()));
        }
        if (ctx.functionCall() != null) {
            statement.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        }
        if (ctx.function() != null) {
            statement.setFunction(visitFunction(ctx.function()));
        }
        if (ctx.timeFunction() != null) {
            statement.setTimeFunction(visitTimeFunction(ctx.timeFunction()));
        }
        if (ctx.array() != null) {
            statement.setArray(visitArray(ctx.array()));
        }
        if (ctx.object() != null) {
            statement.setObject(visitObject(ctx.object()));
        }
        if (ctx.htmlTag() != null) {
            statement.setHtmlTag(visitHtmlTag(ctx.htmlTag()));
        }
        if (ctx.hooks() != null) {
            statement.setHooks(visitHooks(ctx.hooks()));
        }
        return statement;

    }

    @Override
    public Component visitComponent(ReactParser.ComponentContext ctx) throws IOException {
        Component component = new Component();
        component.setSymbolTable(symbolTable);

        if (ctx != null) {
            component.setComponent(ctx.COMPONENT().getText());
            component.setComponentName(ctx.STRING().getText());
            component.setLine(ctx.STRING().getSymbol().getLine());
            componentName.add(component);

            Row row1 = new Row();
            row1.setType("componentName");
            row1.setValue(component.getComponentName());
            row1.setLine(component.getLine());
            symbolTable.setRows(row1);

            if (ctx.IDENTIFIER() != null) {
                for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                    component.setIdentifier(ctx.IDENTIFIER().get(i).getText());
                    Row row2 = new Row();
                    row2.setType("identifier");
                    row2.setValue(ctx.IDENTIFIER().get(i).getText());
                    row2.setLine(ctx.IDENTIFIER().get(i).getSymbol().getLine());
                    symbolTable.setRows(row2);
                }
            }

            if (ctx.statement() != null) {
                for (int i = 0; i < ctx.statement().size(); i++) {
                    component.setStatement(visitStatement(ctx.statement(i)));
                }
            }
            if (ctx.jsx() != null) {
                component.setJsx(visitJsx(ctx.jsx()));
            }
        }
        return component;
    }

    @Override
    public CallComponent visitCallComponent(ReactParser.CallComponentContext ctx) {
        CallComponent callComponent = new CallComponent();
        callComponent.setComponent(ctx.COMPONENT().getText());
        callComponent.setComponentName(ctx.STRING().getText());
        callComponent.setLine(ctx.STRING().getSymbol().getLine());
        callComponentName.add(callComponent);


        if (ctx.IDENTIFIER() != null) {
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                callComponent.setIdentifier(ctx.IDENTIFIER().get(i).getText());
            }
        }
        if (ctx.componentAttribute() != null) {
            for (int i = 0; i < ctx.componentAttribute().size(); i++) {
                callComponent.setComponentAttribute(visitComponentAttribute(ctx.componentAttribute(i)));
            }
        }
        return callComponent;
    }


    @Override
    public ComponentAttribute visitComponentAttribute(ReactParser.ComponentAttributeContext ctx) {
        ComponentAttribute componentAttribute = new ComponentAttribute();
        componentAttribute.setIdentifier(ctx.IDENTIFIER().getText());
        componentAttribute.setExpression((Expression) visit(ctx.expression()));
        return componentAttribute;
    }

    @Override
    public FunctionAttribute visitFunctionAttribute(ReactParser.FunctionAttributeContext ctx) {
        FunctionAttribute functionAttribute = new FunctionAttribute();
        functionAttribute.setIdentifier(ctx.IDENTIFIER().getText());
        functionAttribute.setExpression((Expression) visit(ctx.expression()));
        return functionAttribute;
    }

    @Override
    public Assignment visitAssignment(ReactParser.AssignmentContext ctx) {
        Assignment assignment = new Assignment();
        assignment.setIdentifier(ctx.IDENTIFIER().getText());
        assignment.setExpression((Expression) visit(ctx.expression()));
        return assignment;
    }


    @Override
    public IfStatement visitIfStatement(ReactParser.IfStatementContext ctx) throws IOException {
        IfStatement ifStatement = new IfStatement();
        ifStatement.setIf(ctx.IF().getText());
        if (ctx.ELSE() != null) {
            ifStatement.setElse(ctx.ELSE().getText());
        }
        ifStatement.setExpression((Expression) visit(ctx.expression()));
        if (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                ifStatement.setStatement(visitStatement(ctx.statement(i)));
            }
        }
        return ifStatement;
    }

    @Override
    public ForStatement visitForStatement(ReactParser.ForStatementContext ctx) throws IOException {
        ForStatement forStatement = new ForStatement();
        SemanticCheck semanticCheck = new SemanticCheck();
        semanticCheck.checkIfIdentifierNotExist(ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(1).getSymbol().getLine(), symbolTable);
        Row row = new Row();
        row.setType("identifier");
        row.setValue(ctx.IDENTIFIER(0).getText());
        row.setLine(ctx.IDENTIFIER(0).getSymbol().getLine());
        symbolTable.setRows(row);


        forStatement.setFor(ctx.FOR().getText());
        forStatement.setJsx(visitJsx(ctx.jsx()));

        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            forStatement.setIdentifier(ctx.IDENTIFIER(i).getText());
        }
        if (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                forStatement.setStatement(visitStatement(ctx.statement(i)));
            }
        }
        return forStatement;
    }

    @Override
    public FunctionCall visitFunctionCall(ReactParser.FunctionCallContext ctx) throws IOException {
        FunctionCall functionCall = new FunctionCall();
        functionCall.setFunctionName(ctx.IDENTIFIER().getText());

        SemanticCheck semanticCheck = new SemanticCheck();
        functionCall.setSymbolTable(symbolTable);
        semanticCheck.checkIfIdentifierNotExist(ctx.IDENTIFIER().getText(), ctx.IDENTIFIER().getSymbol().getLine(), symbolTable);

        if (ctx.expression() != null) {
            for (int i = 0; i < ctx.expression().size(); i++) {
                functionCall.setExpression((Expression) visit(ctx.expression(i)));
            }
        }
        return functionCall;
    }

    @Override
    public Function visitFunction(ReactParser.FunctionContext ctx) throws IOException {
        Function function = new Function();
        SemanticCheck semanticCheck = new SemanticCheck();
        if (ctx.IDENTIFIER() != null) {
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                function.setIdentifier(ctx.IDENTIFIER(i).getText());
                Row row = new Row();
                if (i == 0) {
                    semanticCheck.checkIfIdentifierIsDefined(ctx.IDENTIFIER(i).getText(), ctx.IDENTIFIER(i).getSymbol().getLine(), symbolTable);
                    row.setType("functionName");
                    row.setValue(ctx.IDENTIFIER(i).getText());
                    row.setLine(ctx.IDENTIFIER(i).getSymbol().getLine());
                    symbolTable.setRows(row);
                }
            }
        }
        if (ctx.functionAttribute() != null) {
            for (int i = 0; i < ctx.functionAttribute().size(); i++) {
                function.setFunctionAttribute(visitFunctionAttribute(ctx.functionAttribute(i)));
            }
        }
        if (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                function.setStatement(visitStatement(ctx.statement(i)));
            }
        }
        if (ctx.jsx() != null) {
            function.setJsx(visitJsx(ctx.jsx()));
        }
        return function;
    }

    @Override
    public TimeFunction visitTimeFunction(ReactParser.TimeFunctionContext ctx) throws IOException {
        TimeFunction timeFunction = new TimeFunction();
        timeFunction.setNumber(ctx.NUMBER().getText());
        if (ctx.SETINTERVAL() != null) {
            timeFunction.setSetInterval(ctx.SETINTERVAL().getText());
        }
        if (ctx.SETTIMEOUT() != null) {
            timeFunction.setSetTimeOut(ctx.SETTIMEOUT().getText());
        }
        if (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                timeFunction.setStatement(visitStatement(ctx.statement(i)));
            }
        }
        if (ctx.jsx() != null) {
            timeFunction.setJsx(visitJsx(ctx.jsx()));
        }
        return timeFunction;
    }

    @Override
    public Hooks visitHooks(ReactParser.HooksContext ctx) throws IOException {
        Hooks hooks = new Hooks();
        if (ctx.useStateHook() != null) {
            hooks.setUseStateHook(visitUseStateHook(ctx.useStateHook()));
        }
        if (ctx.useRefHook() != null) {
            hooks.setUseRefHook(visitUseRefHook(ctx.useRefHook()));
        }
        if (ctx.useEffectHook() != null) {
            hooks.setUseEffectHook(visitUseEffectHook(ctx.useEffectHook()));
        }
        return hooks;
    }

    @Override
    public UseStateHook visitUseStateHook(ReactParser.UseStateHookContext ctx) throws IOException {
        UseStateHook useStateHook = new UseStateHook();
        SemanticCheck semanticCheck = new SemanticCheck();
        useStateHook.setUseState(ctx.USESTATE().getText());
        semanticCheck.checkIfHooksIsOutside(ctx.USESTATE().getText(), ctx.USESTATE().getSymbol().getLine(), symbolTable);

        if (ctx.hookContent() != null) {
            for (int i = 0; i < ctx.hookContent().size(); i++) {
                useStateHook.setHookContent(visitHookContent(ctx.hookContent(i)));
            }
        }
        return useStateHook;
    }

    @Override
    public UseRefHook visitUseRefHook(ReactParser.UseRefHookContext ctx) throws IOException {
        UseRefHook useRefHook = new UseRefHook();
        SemanticCheck semanticCheck = new SemanticCheck();
        useRefHook.setUseRef(ctx.USEREF().getText());
        semanticCheck.checkIfHooksIsOutside(ctx.USEREF().getText(), ctx.USEREF().getSymbol().getLine(), symbolTable);

        useRefHook.setHookContent(visitHookContent(ctx.hookContent()));

        return useRefHook;
    }

    @Override
    public UseEffectHook visitUseEffectHook(ReactParser.UseEffectHookContext ctx) throws IOException {
        UseEffectHook useEffectHook = new UseEffectHook();
        SemanticCheck semanticCheck = new SemanticCheck();
        useEffectHook.setUseEffect(ctx.USEEFFECT().getText());
        semanticCheck.checkIfHooksIsOutside(ctx.USEEFFECT().getText(), ctx.USEEFFECT().getSymbol().getLine(), symbolTable);

        if (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                useEffectHook.setStatement(visitStatement(ctx.statement(i)));
            }
        }
        if (ctx.jsx() != null) {
            useEffectHook.setJsx(visitJsx(ctx.jsx()));
        }
        if (ctx.STRING() != null) {
            useEffectHook.setString(ctx.STRING().getText());
        }
        if (ctx.IDENTIFIER() != null) {
            useEffectHook.setIdentifier(ctx.IDENTIFIER().getText());
            Row row = new Row();
            row.setType("identifier");
            row.setValue(useEffectHook.getIdentifier());
            row.setLine(ctx.IDENTIFIER().getSymbol().getLine());
            symbolTable.setRows(row);
        }
        return useEffectHook;
    }

    @Override
    public HookContent visitHookContent(ReactParser.HookContentContext ctx) throws IOException {
        HookContent hookContent = new HookContent();
        SemanticCheck semanticCheck = new SemanticCheck();


        if (ctx.IDENTIFIER() != null) {
            hookContent.setIdentifier(ctx.IDENTIFIER().getText());
            semanticCheck.checkIfIdentifierIsDefined(ctx.IDENTIFIER().getText(), ctx.IDENTIFIER().getSymbol().getLine(), symbolTable);
            Row row = new Row();
            row.setType("changeState");
            row.setValue(hookContent.getIdentifier());
            row.setLine(ctx.IDENTIFIER().getSymbol().getLine());
            symbolTable.setRows(row);
        }
        if (ctx.STRING() != null) {
            hookContent.setString(ctx.STRING().getText());
        }
        if (ctx.NUMBER() != null) {
            hookContent.setNumber(ctx.NUMBER().getText());
        }
        if (ctx.TRUE() != null) {
            hookContent.setTrue(ctx.TRUE().getText());
        }
        if (ctx.FALSE() != null) {
            hookContent.setFalse(ctx.FALSE().getText());
        }
        if (ctx.array() != null) {
            hookContent.setArray(visitArray(ctx.array()));
        }
        if (ctx.object() != null) {
            hookContent.setObject(visitObject(ctx.object()));
        }
        return hookContent;
    }

    @Override
    public TernaryExpression visitTernaryExpression(ReactParser.TernaryExpressionContext ctx) throws IOException {
        TernaryExpression ternaryExpression = new TernaryExpression();
        SemanticCheck semanticCheck = new SemanticCheck();
        ternaryExpression.setIdentifier(ctx.IDENTIFIER().getText());
        semanticCheck.checkIfIdentifierNotExist(ctx.IDENTIFIER().getText(), ctx.IDENTIFIER().getSymbol().getLine(), symbolTable);
        if (ctx.expression() != null) {
            for (int i = 0; i < ctx.expression().size(); i++) {
                ternaryExpression.setExpression((Expression) visit(ctx.expression(i)));
            }
        }
        if (ctx.cssProps() != null) {
            ternaryExpression.setCssProps(visitCssProps(ctx.cssProps()));
        }
        return ternaryExpression;
    }

    @Override
    public ArithmaticExpression visitArithmaticExpression(ReactParser.ArithmaticExpressionContext ctx) {
        ArithmaticExpression arithmaticExpression = new ArithmaticExpression();
        for (int i = 0; i < ctx.expression().size(); i++) {
            arithmaticExpression.setExpression((Expression) visit(ctx.expression(i)));
        }
        arithmaticExpression.setArithmaticOperator(visitArithmaticOperator(ctx.arithmaticOperator()));
        return arithmaticExpression;
    }

    @Override
    public BracketDotExpression visitBracketDotExpression(ReactParser.BracketDotExpressionContext ctx) throws IOException {
        BracketDotExpression bracketDotExpression = new BracketDotExpression();
        SemanticCheck semanticCheck = new SemanticCheck();
        semanticCheck.checkIfIdentifierNotExist(ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(0).getSymbol().getLine(), symbolTable);

        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            bracketDotExpression.setIdentifier(ctx.IDENTIFIER(i).getText());
        }
        bracketDotExpression.setNumber(ctx.NUMBER().getText());
        return bracketDotExpression;
    }

    @Override
    public BracketExpression visitBracketExpression(ReactParser.BracketExpressionContext ctx) throws IOException {
        BracketExpression bracketExpression = new BracketExpression();
        SemanticCheck semanticCheck = new SemanticCheck();
        semanticCheck.checkIfIdentifierNotExist(ctx.IDENTIFIER().getText(), ctx.IDENTIFIER().getSymbol().getLine(), symbolTable);

        bracketExpression.setIdentifier(ctx.IDENTIFIER().getText());
        bracketExpression.setNumber(ctx.NUMBER().getText());

        return bracketExpression;
    }

    @Override
    public BooleanExpression visitBooleanExpression(ReactParser.BooleanExpressionContext ctx) {
        BooleanExpression booleanExpression = new BooleanExpression();
        booleanExpression.setBoolean(visitBoolean(ctx.boolean_()));
        return booleanExpression;
    }

    @Override
    public FunctionExpression visitFunctionExpression(ReactParser.FunctionExpressionContext ctx) throws IOException {
        FunctionExpression functionExpression = new FunctionExpression();
        functionExpression.setFunction(visitFunction(ctx.function()));
        return functionExpression;
    }


    @Override
    public DotExpression visitDotExpression(ReactParser.DotExpressionContext ctx) throws IOException {
        DotExpression dotExpression = new DotExpression();
        SemanticCheck semanticCheck = new SemanticCheck();
        semanticCheck.checkIfIdentifierNotExist(ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(0).getSymbol().getLine(), symbolTable);
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            dotExpression.setIdentifier(ctx.IDENTIFIER(i).getText());
        }
        return dotExpression;
    }

    @Override
    public LiteralExpression visitLiteralExpression(ReactParser.LiteralExpressionContext ctx) throws IOException {
        LiteralExpression literalExpression = new LiteralExpression();
        literalExpression.setLiteral(visitLiteral(ctx.literal()));
        return literalExpression;
    }

    @Override
    public ParenExpression visitParenExpression(ReactParser.ParenExpressionContext ctx) {
        ParenExpression parenExpression = new ParenExpression();
        for (int i = 0; i < ctx.expression().size(); i++) {
            parenExpression.setExpression((Expression) visit(ctx.expression(i)));
        }
        return parenExpression;

    }

    @Override
    public FunctionCallExpression visitFunctionCallExpression(ReactParser.FunctionCallExpressionContext ctx) throws IOException {
        FunctionCallExpression functionCallExpression = new FunctionCallExpression();
        functionCallExpression.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        return functionCallExpression;
    }

    @Override
    public Literal visitLiteral(ReactParser.LiteralContext ctx) throws IOException {
        Literal literal = new Literal();
        SemanticCheck semanticCheck = new SemanticCheck();
        if (ctx.STRING() != null) {
            literal.setString(ctx.STRING().getText());
        }
        if (ctx.NUMBER() != null) {
            literal.setNumber(ctx.NUMBER().getText());
        }
        if (ctx.IDENTIFIER() != null) {
            literal.setIdentifier(ctx.IDENTIFIER().getText());
            semanticCheck.checkIfIdentifierNotExist(ctx.IDENTIFIER().getText(), ctx.IDENTIFIER().getSymbol().getLine(), symbolTable);

        }
        return literal;

    }

    @Override
    public Boolean visitBoolean(ReactParser.BooleanContext ctx) {
        Boolean boolean_ = new Boolean();
        if (ctx.TRUE() != null) {
            boolean_.setTrue(ctx.TRUE().getText());
        }
        if (ctx.FALSE() != null) {
            boolean_.setFalse(ctx.FALSE().getText());
        }
        return boolean_;
    }

    @Override
    public ArithmaticOperator visitArithmaticOperator(ReactParser.ArithmaticOperatorContext ctx) {
        ArithmaticOperator arithmaticOperator = new ArithmaticOperator();
        if (ctx.PLUS() != null) {
            arithmaticOperator.setPlus(ctx.PLUS().getText());
        }
        if (ctx.MULTIPLY() != null) {
            arithmaticOperator.setMultiply(ctx.MULTIPLY().getText());
        }
        if (ctx.DIVIDE() != null) {
            arithmaticOperator.setDivide(ctx.DIVIDE().getText());
        }
        if (ctx.DASH() != null) {
            arithmaticOperator.setDash(ctx.DASH().getText());
        }
        if (ctx.MODULO() != null) {
            arithmaticOperator.setModulo(ctx.MODULO().getText());
        }
        return arithmaticOperator;
    }

    @Override
    public Array visitArray(ReactParser.ArrayContext ctx) throws IOException {
        Array array = new Array();
        SemanticCheck semanticCheck = new SemanticCheck();

        if (ctx.IDENTIFIER() != null) {
            array.setIdentifier(ctx.IDENTIFIER().getText());
            semanticCheck.checkIfIdentifierIsDefined(ctx.IDENTIFIER().getText(), ctx.IDENTIFIER().getSymbol().getLine(), symbolTable);
            Row row = new Row();
            row.setType("arrayName");
            row.setValue(ctx.IDENTIFIER().getText());
            row.setLine(ctx.IDENTIFIER().getSymbol().getLine());
            symbolTable.setRows(row);
        }
        for (int i = 0; i < ctx.object().size(); i++) {
            array.setObject(visitObject(ctx.object(i)));
        }
        return array;
    }


    @Override
    public CustomObject visitObject(ReactParser.ObjectContext ctx) {
        CustomObject object = new CustomObject();

        if (ctx.IDENTIFIER() != null) {
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                object.setIdentifier(ctx.IDENTIFIER().get(i).getText());
            }
        }
        if (ctx.STRING() != null) {
            for (int i = 0; i < ctx.STRING().size(); i++) {
                object.setString(ctx.STRING().get(i).getText());
            }
        }
        if (ctx.NUMBER() != null) {
            for (int i = 0; i < ctx.NUMBER().size(); i++) {
                object.setNumber(ctx.NUMBER().get(i).getText());
            }
        }
        return object;
    }

    @Override
    public JSX visitJsx(ReactParser.JsxContext ctx) throws IOException {
        JSX jsx = new JSX();
        jsx.setJSX(ctx.JSX().getText());
        jsx.setComponentName(symbolTable.getRows().get(0).getValue());
        jsx.setSymbolTable(symbolTable);

        if (ctx.callComponent() != null) {
            jsx.setCallComponent(visitCallComponent(ctx.callComponent()));
        }

        if (ctx.functionCall() != null) {
            jsx.setFunctionCall(visitFunctionCall(ctx.functionCall()));

        }
        if (ctx.htmlTag() != null) {
            jsx.setHtmlTag(visitHtmlTag(ctx.htmlTag()));
        }

        if (ctx.ifStatement() != null) {
            jsx.setIfStatement(visitIfStatement(ctx.ifStatement()));
        }
        return jsx;
    }

    @Override
    public HtmlTag visitHtmlTag(ReactParser.HtmlTagContext ctx) throws IOException {
        HtmlTag htmlTag = new HtmlTag();

        if (ctx.div() != null) {
            htmlTag.setDiv(visitDiv(ctx.div()));
        }
        if (ctx.p() != null) {
            htmlTag.setP(visitP(ctx.p()));
        }
        if (ctx.img() != null) {
            htmlTag.setImg(visitImg(ctx.img()));
        }
        if (ctx.link() != null) {
            htmlTag.setLink(visitLink(ctx.link()));
        }

        return htmlTag;
    }

    @Override
    public Link visitLink(ReactParser.LinkContext ctx) throws IOException {
        Link link = new Link();
        link.setLink(ctx.LINK().getText());
        if (ctx.props() != null) {
            for (int i = 0; i < ctx.props().size(); i++) {
                link.setProps(visitProps(ctx.props(i)));
            }
        }
        if (ctx.expression() != null) {
            for (int i = 0; i < ctx.expression().size(); i++) {
                link.setExpression((Expression) visit(ctx.expression(i)));
            }
        }
        return link;
    }

    @Override
    public Div visitDiv(ReactParser.DivContext ctx) throws IOException {
        Div div = new Div();
        div.setDiv(ctx.DIV().getText());
        div.setComponentName(symbolTable.getRows().get(0).getValue());

        if (ctx.props() != null) {
            for (int i = 0; i < ctx.props().size(); i++) {
                div.setProps(visitProps(ctx.props(i)));
            }
        }
        if (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                div.setStatement(visitStatement(ctx.statement(i)));
            }
        }
        if (ctx.expression() != null) {
            for (int i = 0; i < ctx.expression().size(); i++) {
                div.setExpression((Expression) visit(ctx.expression(i)));
            }
        }
        return div;
    }

    @Override
    public Paragraph visitP(ReactParser.PContext ctx) throws IOException {
        Paragraph paragraph = new Paragraph();
        paragraph.setParagraph(ctx.P().getText());
        if (ctx.props() != null) {
            for (int i = 0; i < ctx.props().size(); i++) {
                paragraph.setProps(visitProps(ctx.props(i)));
            }
        }
        if (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                paragraph.setStatement(visitStatement(ctx.statement(i)));
            }
        }
        if (ctx.expression() != null) {
            for (int i = 0; i < ctx.expression().size(); i++) {
                paragraph.setExpression((Expression) visit(ctx.expression(i)));
            }
        }
        return paragraph;
    }

    @Override
    public Image visitImg(ReactParser.ImgContext ctx) throws IOException {
        Image image = new Image();
        image.setImage(ctx.IMG().getText());
        if (ctx.props() != null) {
            for (int i = 0; i < ctx.props().size(); i++) {
                image.setProps(visitProps(ctx.props(i)));
            }
        }
        return image;
    }

    @Override
    public Props visitProps(ReactParser.PropsContext ctx) throws IOException {
        Props props = new Props();

        if (ctx.CLASS() != null) {
            props.setCalss(ctx.CLASS().getText());
        }
        if (ctx.expression() != null) {
            props.setExpression((Expression) visit(ctx.expression()));
        }
        if (ctx.events() != null) {
            props.setEvents(visitEvents(ctx.events()));
        }
        if (ctx.src() != null) {
            props.setSrc(visitSrc(ctx.src()));
        }
        if (ctx.className() != null) {
            props.setClassName(visitClassName(ctx.className()));
        }
        if (ctx.href() != null) {
            props.setHref(visitHref(ctx.href()));
        }
        if (ctx.target() != null) {
            props.setTarget(visitTarget(ctx.target()));
        }
        return props;
    }

    @Override
    public SRC visitSrc(ReactParser.SrcContext ctx) {
        SRC src = new SRC();

        src.setSrc(ctx.SRC().getText());
        src.setExpression((Expression) visit(ctx.expression()));
        return src;
    }

    @Override
    public ClassName visitClassName(ReactParser.ClassNameContext ctx) {
        ClassName className = new ClassName();
        className.setClasss(ctx.CLASS().getText());
        if (ctx.cssProps() != null) {
            for (int i = 0; i < ctx.cssProps().size(); i++) {
                className.setCssProps(visitCssProps(ctx.cssProps(i)));
            }
        }
        return className;
    }

    @Override
    public Href visitHref(ReactParser.HrefContext ctx) {
        Href href = new Href();
        href.setHref(ctx.HREF().getText());
        href.setExpression((Expression) visit(ctx.expression()));
        return href;
    }

    @Override
    public Target visitTarget(ReactParser.TargetContext ctx) {
        Target target = new Target();
        target.setTarget(ctx.TARGET().getText());
        target.set_blank(ctx.BLANK().getText());
        return target;
    }

    @Override
    public CssProps visitCssProps(ReactParser.CssPropsContext ctx) {
        CssProps cssProps = new CssProps();

        if (ctx.FLEX() != null) {
            cssProps.setFLEX(ctx.FLEX().getText());
        }
        if (ctx.POSITION() != null) {
            cssProps.setPOSITION(ctx.POSITION().getText());
        }
        if (ctx.top() != null) {
            cssProps.setTop(visitTop(ctx.top()));
        }
        if (ctx.right() != null) {
            cssProps.setRight(visitRight(ctx.right()));
        }
        if (ctx.left() != null) {
            cssProps.setLeft(visitLeft(ctx.left()));
        }
        if (ctx.bottom() != null) {
            cssProps.setBottom(visitBottom(ctx.bottom()));
        }
        if (ctx.FLEX_COLUMN() != null) {
            cssProps.setFLEX_COLUMN(ctx.FLEX_COLUMN().getText());
        }
        if (ctx.FLEX_ROW() != null) {
            cssProps.setFLEX_ROW(ctx.FLEX_ROW().getText());
        }
        if (ctx.JUSTIFY_CENTER() != null) {
            cssProps.setJUSTIFY_CENTER(ctx.JUSTIFY_CENTER().getText());
        }
        if (ctx.JUSTIFY_START() != null) {
            cssProps.setJUSTIFY_START(ctx.JUSTIFY_START().getText());
        }
        if (ctx.JUSTIFY_END() != null) {
            cssProps.setJUSTIFY_END(ctx.JUSTIFY_END().getText());
        }
        if (ctx.JUSTIFY_AROUND() != null) {
            cssProps.setJUSTIFY_AROUND(ctx.JUSTIFY_AROUND().getText());
        }
        if (ctx.JUSTIFY_EVENLY() != null) {
            cssProps.setJUSTIFY_EVENLY(ctx.JUSTIFY_EVENLY().getText());
        }
        if (ctx.JUSTIFY_BETWEEN() != null) {
            cssProps.setJUSTIFY_BETWEEN(ctx.JUSTIFY_BETWEEN().getText());
        }
        if (ctx.gabDash() != null) {
            cssProps.setGabDash(visitGabDash(ctx.gabDash()));
        }
        if (ctx.BORDER() != null) {
            cssProps.setBORDER(ctx.BORDER().getText());
        }
        if (ctx.borderDash() != null) {
            cssProps.setBorderDash(visitBorderDash(ctx.borderDash()));
        }
        if (ctx.borderBottomDash() != null) {
            cssProps.setBorderBottomDash(visitBorderBottomDash(ctx.borderBottomDash()));
        }
        if (ctx.BORDER_RADIUS_SM() != null) {
            cssProps.setBORDER_RADIUS_SM(ctx.BORDER_RADIUS_SM().getText());
        }
        if (ctx.BORDER_RADIUS_MD() != null) {
            cssProps.setBORDER_RADIUS_MD(ctx.BORDER_RADIUS_MD().getText());
        }
        if (ctx.BORDER_RADIUS_LG() != null) {
            cssProps.setBORDER_RADIUS_LG(ctx.BORDER_RADIUS_LG().getText());
        }
        if (ctx.BORDER_RADIUS_XL() != null) {
            cssProps.setBORDER_RADIUS_XL(ctx.BORDER_RADIUS_XL().getText());
        }
        if (ctx.BORDER_RADIUS_2XL() != null) {
            cssProps.setBORDER_RADIUS_2XL(ctx.BORDER_RADIUS_2XL().getText());
        }
        if (ctx.BORDER_RADIUS_3XL() != null) {
            cssProps.setBORDER_RADIUS_3XL(ctx.BORDER_RADIUS_3XL().getText());
        }
        if (ctx.BORDER_RADIUS_FULL() != null) {
            cssProps.setBORDER_RADIUS_FULL(ctx.BORDER_RADIUS_FULL().getText());
        }
        if (ctx.CURSOR_POINTER() != null) {
            cssProps.setCURSOR_POINTER(ctx.CURSOR_POINTER().getText());
        }
        if (ctx.MARGIN_AUTO() != null) {
            cssProps.setMARGIN_AUTO(ctx.MARGIN_AUTO().getText());
        }
        if (ctx.marginDash() != null) {
            cssProps.setMarginDash(visitMarginDash(ctx.marginDash()));
        }
        if (ctx.pDash() != null) {
            cssProps.setpDash(visitPDash(ctx.pDash()));
        }
        if (ctx.textDash() != null) {
            cssProps.setTextDash(visitTextDash(ctx.textDash()));
        }
        if (ctx.TEXT_SM() != null) {
            cssProps.setTEXT_SM(ctx.TEXT_SM().getText());
        }
        if (ctx.TEXT_LG() != null) {
            cssProps.setTEXT_LG(ctx.TEXT_LG().getText());
        }
        if (ctx.TEXT_XL() != null) {
            cssProps.setTEXT_XL(ctx.TEXT_XL().getText());
        }
        if (ctx.TEXT_2XL() != null) {
            cssProps.setTEXT_2XL(ctx.TEXT_2XL().getText());
        }
        if (ctx.TEXT_3XL() != null) {
            cssProps.setTEXT_3XL(ctx.TEXT_3XL().getText());
        }
        if (ctx.FONT_BOLD() != null) {
            cssProps.setFONT_BOLD(ctx.FONT_BOLD().getText());
        }
        if (ctx.widthDash() != null) {
            cssProps.setWidthDash(visitWidthDash(ctx.widthDash()));
        }
        if (ctx.heightDash() != null) {
            cssProps.setHeightDash(visitHeightDash(ctx.heightDash()));
        }
        if (ctx.color() != null) {
            cssProps.setColor(visitColor(ctx.color()));
        }
        if (ctx.backGroundColor() != null) {
            cssProps.setBackGroundColor(visitBackGroundColor(ctx.backGroundColor()));
        }
        return cssProps;
    }


    @Override
    public Color visitColor(ReactParser.ColorContext ctx) {
        Color color = new Color();

        color.setColor(ctx.COLOR().getText());
        color.setIdentifier(ctx.IDENTIFIER().getText());
        return color;
    }

    @Override
    public BackGroundColor visitBackGroundColor(ReactParser.BackGroundColorContext ctx) {
        BackGroundColor backGroundColor = new BackGroundColor();

        backGroundColor.setBackGroundColor(ctx.BACKGROUNDCOLOR().getText());
        backGroundColor.setIdentifier(ctx.IDENTIFIER().getText());
        return backGroundColor;
    }

    @Override
    public GabDash visitGabDash(ReactParser.GabDashContext ctx) {
        GabDash gabDash = new GabDash();

        gabDash.setGap(ctx.GAP().getText());
        gabDash.setNumber(ctx.NUMBER().getText());
        return gabDash;
    }

    @Override
    public BorderDash visitBorderDash(ReactParser.BorderDashContext ctx) {
        BorderDash borderDash = new BorderDash();

        borderDash.setBorder(ctx.BORDER().getText());
        borderDash.setNumber(ctx.NUMBER().getText());
        return borderDash;
    }

    @Override
    public BorderBottomDash visitBorderBottomDash(ReactParser.BorderBottomDashContext ctx) {
        BorderBottomDash borderBottomDash = new BorderBottomDash();

        borderBottomDash.setBorderBottom(ctx.BORDER_BOTTOM().getText());
        borderBottomDash.setNumber(ctx.NUMBER().getText());
        return borderBottomDash;
    }

    @Override
    public MarginDash visitMarginDash(ReactParser.MarginDashContext ctx) {
        MarginDash marginDash = new MarginDash();
        marginDash.setMargin(ctx.MARGIN().getText());
        marginDash.setNumber(ctx.NUMBER().getText());
        return marginDash;
    }

    @Override
    public PDash visitPDash(ReactParser.PDashContext ctx) {
        PDash pDash = new PDash();
        pDash.setP(ctx.P().getText());
        pDash.setNumber(ctx.NUMBER().getText());
        return pDash;
    }

    @Override
    public TextDash visitTextDash(ReactParser.TextDashContext ctx) {
        TextDash textDash = new TextDash();
        textDash.setText(ctx.TEXT().getText());
        textDash.setIdentifier(ctx.IDENTIFIER().getText());
        return textDash;
    }

    @Override
    public WidthDash visitWidthDash(ReactParser.WidthDashContext ctx) {
        WidthDash widthDash = new WidthDash();
        widthDash.setWidth(ctx.WIDTH().getText());
        widthDash.setNumber(ctx.NUMBER().getText());
        return widthDash;
    }

    @Override
    public HeightDash visitHeightDash(ReactParser.HeightDashContext ctx) {
        HeightDash heightDash = new HeightDash();
        heightDash.setHeight(ctx.HEIGHT().getText());
        heightDash.setNumber(ctx.NUMBER().getText());
        return heightDash;
    }

    @Override
    public Events visitEvents(ReactParser.EventsContext ctx) throws IOException {
        Events events = new Events();
        events.setOnclick(visitOnClick(ctx.onClick()));
        return events;
    }

    @Override
    public Onclick visitOnClick(ReactParser.OnClickContext ctx) throws IOException {
        Onclick onclick = new Onclick();
        onclick.setOnClick(ctx.ONCLICK().getText());
        if (ctx.function() != null) {
            onclick.setFunction(visitFunction(ctx.function()));
        }
        if (ctx.functionCall() != null) {
            onclick.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        }
        if (ctx.timeFunction() != null) {
            onclick.setTimeFunction(visitTimeFunction(ctx.timeFunction()));
        }

        return onclick;
    }

    @Override
    public TOP visitTop(ReactParser.TopContext ctx) {
        TOP top = new TOP();
        top.setTop(ctx.TOP().getText());
        top.setNumber(ctx.NUMBER().getText());
        return top;
    }

    @Override
    public BOTTOM visitBottom(ReactParser.BottomContext ctx) {
        BOTTOM bottom = new BOTTOM();
        bottom.setBottom(ctx.BOTTOM().getText());
        bottom.setNumber(ctx.NUMBER().getText());
        return bottom;
    }

    @Override
    public RIGHT visitRight(ReactParser.RightContext ctx) {
        RIGHT right = new RIGHT();
        right.setRight(ctx.RIGHT().getText());
        right.setNumber(ctx.NUMBER().getText());
        return right;
    }

    @Override
    public LEFT visitLeft(ReactParser.LeftContext ctx) {
        LEFT left = new LEFT();
        left.setLeft(ctx.LEFT().getText());
        left.setNumber(ctx.NUMBER().getText());
        return left;
    }
}
