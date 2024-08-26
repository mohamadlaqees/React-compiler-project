// Generated from F:/files/IT/compilerSlides/Project2/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactParser}.
 */
public interface ReactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReactParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ReactParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ReactParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(ReactParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(ReactParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#callComponent}.
	 * @param ctx the parse tree
	 */
	void enterCallComponent(ReactParser.CallComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#callComponent}.
	 * @param ctx the parse tree
	 */
	void exitCallComponent(ReactParser.CallComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ReactParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ReactParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#componentAttribute}.
	 * @param ctx the parse tree
	 */
	void enterComponentAttribute(ReactParser.ComponentAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#componentAttribute}.
	 * @param ctx the parse tree
	 */
	void exitComponentAttribute(ReactParser.ComponentAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionAttribute}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAttribute(ReactParser.FunctionAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionAttribute}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAttribute(ReactParser.FunctionAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ReactParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ReactParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ReactParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ReactParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ReactParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ReactParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#timeFunction}.
	 * @param ctx the parse tree
	 */
	void enterTimeFunction(ReactParser.TimeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#timeFunction}.
	 * @param ctx the parse tree
	 */
	void exitTimeFunction(ReactParser.TimeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ReactParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ReactParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ReactParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ReactParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTag(ReactParser.HtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTag(ReactParser.HtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(ReactParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(ReactParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(ReactParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(ReactParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#img}.
	 * @param ctx the parse tree
	 */
	void enterImg(ReactParser.ImgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#img}.
	 * @param ctx the parse tree
	 */
	void exitImg(ReactParser.ImgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(ReactParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(ReactParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#props}.
	 * @param ctx the parse tree
	 */
	void enterProps(ReactParser.PropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#props}.
	 * @param ctx the parse tree
	 */
	void exitProps(ReactParser.PropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#events}.
	 * @param ctx the parse tree
	 */
	void enterEvents(ReactParser.EventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#events}.
	 * @param ctx the parse tree
	 */
	void exitEvents(ReactParser.EventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#onClick}.
	 * @param ctx the parse tree
	 */
	void enterOnClick(ReactParser.OnClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#onClick}.
	 * @param ctx the parse tree
	 */
	void exitOnClick(ReactParser.OnClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#src}.
	 * @param ctx the parse tree
	 */
	void enterSrc(ReactParser.SrcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#src}.
	 * @param ctx the parse tree
	 */
	void exitSrc(ReactParser.SrcContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#href}.
	 * @param ctx the parse tree
	 */
	void enterHref(ReactParser.HrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#href}.
	 * @param ctx the parse tree
	 */
	void exitHref(ReactParser.HrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(ReactParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(ReactParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(ReactParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(ReactParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#cssProps}.
	 * @param ctx the parse tree
	 */
	void enterCssProps(ReactParser.CssPropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#cssProps}.
	 * @param ctx the parse tree
	 */
	void exitCssProps(ReactParser.CssPropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#gabDash}.
	 * @param ctx the parse tree
	 */
	void enterGabDash(ReactParser.GabDashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#gabDash}.
	 * @param ctx the parse tree
	 */
	void exitGabDash(ReactParser.GabDashContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#borderDash}.
	 * @param ctx the parse tree
	 */
	void enterBorderDash(ReactParser.BorderDashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#borderDash}.
	 * @param ctx the parse tree
	 */
	void exitBorderDash(ReactParser.BorderDashContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#borderBottomDash}.
	 * @param ctx the parse tree
	 */
	void enterBorderBottomDash(ReactParser.BorderBottomDashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#borderBottomDash}.
	 * @param ctx the parse tree
	 */
	void exitBorderBottomDash(ReactParser.BorderBottomDashContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#marginDash}.
	 * @param ctx the parse tree
	 */
	void enterMarginDash(ReactParser.MarginDashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#marginDash}.
	 * @param ctx the parse tree
	 */
	void exitMarginDash(ReactParser.MarginDashContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#pDash}.
	 * @param ctx the parse tree
	 */
	void enterPDash(ReactParser.PDashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#pDash}.
	 * @param ctx the parse tree
	 */
	void exitPDash(ReactParser.PDashContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#textDash}.
	 * @param ctx the parse tree
	 */
	void enterTextDash(ReactParser.TextDashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#textDash}.
	 * @param ctx the parse tree
	 */
	void exitTextDash(ReactParser.TextDashContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#widthDash}.
	 * @param ctx the parse tree
	 */
	void enterWidthDash(ReactParser.WidthDashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#widthDash}.
	 * @param ctx the parse tree
	 */
	void exitWidthDash(ReactParser.WidthDashContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#heightDash}.
	 * @param ctx the parse tree
	 */
	void enterHeightDash(ReactParser.HeightDashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#heightDash}.
	 * @param ctx the parse tree
	 */
	void exitHeightDash(ReactParser.HeightDashContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#top}.
	 * @param ctx the parse tree
	 */
	void enterTop(ReactParser.TopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#top}.
	 * @param ctx the parse tree
	 */
	void exitTop(ReactParser.TopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#bottom}.
	 * @param ctx the parse tree
	 */
	void enterBottom(ReactParser.BottomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#bottom}.
	 * @param ctx the parse tree
	 */
	void exitBottom(ReactParser.BottomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(ReactParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(ReactParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#left}.
	 * @param ctx the parse tree
	 */
	void enterLeft(ReactParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#left}.
	 * @param ctx the parse tree
	 */
	void exitLeft(ReactParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(ReactParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(ReactParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#backGroundColor}.
	 * @param ctx the parse tree
	 */
	void enterBackGroundColor(ReactParser.BackGroundColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#backGroundColor}.
	 * @param ctx the parse tree
	 */
	void exitBackGroundColor(ReactParser.BackGroundColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 */
	void enterHooks(ReactParser.HooksContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 */
	void exitHooks(ReactParser.HooksContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useStateHook}.
	 * @param ctx the parse tree
	 */
	void enterUseStateHook(ReactParser.UseStateHookContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useStateHook}.
	 * @param ctx the parse tree
	 */
	void exitUseStateHook(ReactParser.UseStateHookContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useRefHook}.
	 * @param ctx the parse tree
	 */
	void enterUseRefHook(ReactParser.UseRefHookContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useRefHook}.
	 * @param ctx the parse tree
	 */
	void exitUseRefHook(ReactParser.UseRefHookContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useEffectHook}.
	 * @param ctx the parse tree
	 */
	void enterUseEffectHook(ReactParser.UseEffectHookContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useEffectHook}.
	 * @param ctx the parse tree
	 */
	void exitUseEffectHook(ReactParser.UseEffectHookContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#hookContent}.
	 * @param ctx the parse tree
	 */
	void enterHookContent(ReactParser.HookContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#hookContent}.
	 * @param ctx the parse tree
	 */
	void exitHookContent(ReactParser.HookContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsx}.
	 * @param ctx the parse tree
	 */
	void enterJsx(ReactParser.JsxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsx}.
	 * @param ctx the parse tree
	 */
	void exitJsx(ReactParser.JsxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(ReactParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(ReactParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(ReactParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(ReactParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmaticExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmaticExpression(ReactParser.ArithmaticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmaticExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmaticExpression(ReactParser.ArithmaticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketDotExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketDotExpression(ReactParser.BracketDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketDotExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketDotExpression(ReactParser.BracketDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(ReactParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(ReactParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(ReactParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(ReactParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyBraceExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEmptyBraceExpression(ReactParser.EmptyBraceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyBraceExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEmptyBraceExpression(ReactParser.EmptyBraceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDotExpression(ReactParser.DotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDotExpression(ReactParser.DotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(ReactParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(ReactParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(ReactParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(ReactParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(ReactParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(ReactParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ReactParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ReactParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(ReactParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(ReactParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arithmaticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmaticOperator(ReactParser.ArithmaticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arithmaticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmaticOperator(ReactParser.ArithmaticOperatorContext ctx);
}