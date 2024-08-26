// Generated from F:/files/IT/compilerSlides/Project2/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.io.IOException;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReactParser.ProgramContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ReactParser.StatementContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(ReactParser.ComponentContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#callComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallComponent(ReactParser.CallComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ReactParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#componentAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentAttribute(ReactParser.ComponentAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAttribute(ReactParser.FunctionAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ReactParser.IfStatementContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ReactParser.ForStatementContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ReactParser.FunctionCallContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ReactParser.FunctionContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#timeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeFunction(ReactParser.TimeFunctionContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ReactParser.ArrayContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(ReactParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTag(ReactParser.HtmlTagContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ReactParser.DivContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(ReactParser.PContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#img}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg(ReactParser.ImgContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(ReactParser.LinkContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#props}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProps(ReactParser.PropsContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#events}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvents(ReactParser.EventsContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#onClick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClick(ReactParser.OnClickContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#src}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrc(ReactParser.SrcContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#href}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHref(ReactParser.HrefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(ReactParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(ReactParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#cssProps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssProps(ReactParser.CssPropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#gabDash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGabDash(ReactParser.GabDashContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#borderDash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderDash(ReactParser.BorderDashContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#borderBottomDash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderBottomDash(ReactParser.BorderBottomDashContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#marginDash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarginDash(ReactParser.MarginDashContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#pDash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPDash(ReactParser.PDashContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#textDash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextDash(ReactParser.TextDashContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#widthDash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthDash(ReactParser.WidthDashContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#heightDash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeightDash(ReactParser.HeightDashContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop(ReactParser.TopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#bottom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBottom(ReactParser.BottomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(ReactParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(ReactParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(ReactParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#backGroundColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackGroundColor(ReactParser.BackGroundColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHooks(ReactParser.HooksContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#useStateHook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStateHook(ReactParser.UseStateHookContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#useRefHook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRefHook(ReactParser.UseRefHookContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#useEffectHook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffectHook(ReactParser.UseEffectHookContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#hookContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHookContent(ReactParser.HookContentContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsx(ReactParser.JsxContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(ReactParser.BracketExpressionContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(ReactParser.TernaryExpressionContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by the {@code ArithmaticExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmaticExpression(ReactParser.ArithmaticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketDotExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketDotExpression(ReactParser.BracketDotExpressionContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by the {@code BooleanExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(ReactParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(ReactParser.FunctionExpressionContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by the {@code EmptyBraceExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyBraceExpression(ReactParser.EmptyBraceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpression(ReactParser.DotExpressionContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(ReactParser.LiteralExpressionContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(ReactParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(ReactParser.FunctionCallExpressionContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ReactParser.LiteralContext ctx) throws IOException;
	/**
	 * Visit a parse tree produced by {@link ReactParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(ReactParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arithmaticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmaticOperator(ReactParser.ArithmaticOperatorContext ctx);
}