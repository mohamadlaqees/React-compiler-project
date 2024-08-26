// Generated from F:/files/IT/compilerSlides/Project2/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		APP=1, JSX=2, DIV=3, P=4, IMG=5, SRC=6, COMPONENT=7, USESTATE=8, USEREF=9, 
		USEEFFECT=10, SETTIMEOUT=11, SETINTERVAL=12, ONCLICK=13, IF=14, ELSE=15, 
		FOR=16, IN=17, TRUE=18, FALSE=19, DASH=20, LPAREN=21, RPAREN=22, LBRACE=23, 
		RBRACE=24, LBRACK=25, RBRACK=26, COMMA=27, COLON=28, SEMI=29, EQUALS=30, 
		DOT=31, QUESTION=32, PLUS=33, MULTIPLY=34, DIVIDE=35, MODULO=36, CLASS=37, 
		POSITION=38, TOP=39, RIGHT=40, LEFT=41, BOTTOM=42, FLEX=43, FLEX_COLUMN=44, 
		FLEX_ROW=45, JUSTIFY_CENTER=46, JUSTIFY_START=47, JUSTIFY_END=48, JUSTIFY_AROUND=49, 
		JUSTIFY_EVENLY=50, JUSTIFY_BETWEEN=51, GAP=52, BORDER=53, BORDER_BOTTOM=54, 
		BORDER_RADIUS_SM=55, BORDER_RADIUS_MD=56, BORDER_RADIUS_LG=57, BORDER_RADIUS_XL=58, 
		BORDER_RADIUS_2XL=59, BORDER_RADIUS_3XL=60, BORDER_RADIUS_FULL=61, CURSOR_POINTER=62, 
		MARGIN=63, MARGIN_AUTO=64, TEXT=65, TEXT_SM=66, TEXT_LG=67, TEXT_XL=68, 
		TEXT_2XL=69, TEXT_3XL=70, FONT_BOLD=71, FONT_MEDIUM=72, WIDTH=73, HEIGHT=74, 
		IDENTIFIER=75, STRING=76, NUMBER=77, WS=78;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_component = 2, RULE_callComponent = 3, 
		RULE_assignment = 4, RULE_componentAttribute = 5, RULE_functionAttribute = 6, 
		RULE_ifStatement = 7, RULE_forStatement = 8, RULE_functionCall = 9, RULE_function = 10, 
		RULE_timeFunction = 11, RULE_array = 12, RULE_object = 13, RULE_htmlTag = 14, 
		RULE_div = 15, RULE_p = 16, RULE_img = 17, RULE_props = 18, RULE_events = 19, 
		RULE_onClick = 20, RULE_src = 21, RULE_className = 22, RULE_cssProps = 23, 
		RULE_gabDash = 24, RULE_borderDash = 25, RULE_borderBottomDash = 26, RULE_marginDash = 27, 
		RULE_pDash = 28, RULE_textDash = 29, RULE_widthDash = 30, RULE_heightDash = 31, 
		RULE_top = 32, RULE_bottom = 33, RULE_right = 34, RULE_left = 35, RULE_hooks = 36, 
		RULE_useStateHook = 37, RULE_useRefHook = 38, RULE_useEffectHook = 39, 
		RULE_hookContent = 40, RULE_jsx = 41, RULE_expression = 42, RULE_literal = 43, 
		RULE_boolean = 44, RULE_arithmaticOperator = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "component", "callComponent", "assignment", "componentAttribute", 
			"functionAttribute", "ifStatement", "forStatement", "functionCall", "function", 
			"timeFunction", "array", "object", "htmlTag", "div", "p", "img", "props", 
			"events", "onClick", "src", "className", "cssProps", "gabDash", "borderDash", 
			"borderBottomDash", "marginDash", "pDash", "textDash", "widthDash", "heightDash", 
			"top", "bottom", "right", "left", "hooks", "useStateHook", "useRefHook", 
			"useEffectHook", "hookContent", "jsx", "expression", "literal", "boolean", 
			"arithmaticOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'App'", "'JSX'", "'div'", "'p'", "'img'", "'src'", "'Component'", 
			"'useState'", "'useRef'", "'useEffect'", "'setTimeout'", "'setInterval'", 
			"'onClick'", "'if'", "'else'", "'for'", "'in'", "'true'", "'false'", 
			"'-'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "':'", "';'", 
			"'='", "'.'", "'?'", "'+'", "'*'", "'/'", "'%'", "'class'", "'relative'", 
			"'top'", "'right'", "'left'", "'bottom'", "'flex'", "'flex-col'", "'flex-row'", 
			"'justify-center'", "'justify-start'", "'justify-end'", "'justify-around'", 
			"'justify-evenly'", "'justify-between'", "'gap'", "'border'", "'border-b'", 
			"'rounded-sm'", "'rounded-md'", "'rounded-lg'", "'rounded-xl'", "'rounded-2xl'", 
			"'rounded-3xl'", "'rounded-full'", "'cursor-pointer'", "'m'", "'m-auto'", 
			"'text'", "'text-sm'", "'text-lg'", "'text-xl'", "'text-2xl'", "'text-3xl'", 
			"'font-bold'", "'font-medium'", "'w'", "'h'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "APP", "JSX", "DIV", "P", "IMG", "SRC", "COMPONENT", "USESTATE", 
			"USEREF", "USEEFFECT", "SETTIMEOUT", "SETINTERVAL", "ONCLICK", "IF", 
			"ELSE", "FOR", "IN", "TRUE", "FALSE", "DASH", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "COMMA", "COLON", "SEMI", "EQUALS", "DOT", 
			"QUESTION", "PLUS", "MULTIPLY", "DIVIDE", "MODULO", "CLASS", "POSITION", 
			"TOP", "RIGHT", "LEFT", "BOTTOM", "FLEX", "FLEX_COLUMN", "FLEX_ROW", 
			"JUSTIFY_CENTER", "JUSTIFY_START", "JUSTIFY_END", "JUSTIFY_AROUND", "JUSTIFY_EVENLY", 
			"JUSTIFY_BETWEEN", "GAP", "BORDER", "BORDER_BOTTOM", "BORDER_RADIUS_SM", 
			"BORDER_RADIUS_MD", "BORDER_RADIUS_LG", "BORDER_RADIUS_XL", "BORDER_RADIUS_2XL", 
			"BORDER_RADIUS_3XL", "BORDER_RADIUS_FULL", "CURSOR_POINTER", "MARGIN", 
			"MARGIN_AUTO", "TEXT", "TEXT_SM", "TEXT_LG", "TEXT_XL", "TEXT_2XL", "TEXT_3XL", 
			"FONT_BOLD", "FONT_MEDIUM", "WIDTH", "HEIGHT", "IDENTIFIER", "STRING", 
			"NUMBER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ReactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReactParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitProgram(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				statement();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 42033080L) != 0) || _la==IDENTIFIER );
			setState(97);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public CallComponentContext callComponent() {
			return getRuleContext(CallComponentContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TimeFunctionContext timeFunction() {
			return getRuleContext(TimeFunctionContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public HooksContext hooks() {
			return getRuleContext(HooksContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitStatement(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				component();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				callComponent();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
				function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				timeFunction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(107);
				array();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(108);
				object();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(109);
				htmlTag();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(110);
				hooks();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(ReactParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ReactParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ReactParser.LBRACE, i);
		}
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ReactParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ReactParser.RBRACE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitComponent(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_component);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(COMPONENT);
			setState(114);
			match(LPAREN);
			setState(115);
			match(STRING);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(116);
				match(COMMA);
				{
				{
				setState(117);
				match(LBRACE);
				{
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						{
						setState(118);
						match(IDENTIFIER);
						}
						setState(119);
						match(COMMA);
						}
						} 
					}
					setState(124);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				{
				setState(125);
				match(IDENTIFIER);
				}
				}
				setState(127);
				match(RBRACE);
				}
				}
				}
			}

			setState(130);
			match(RPAREN);
			setState(131);
			match(LBRACE);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42033080L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(132);
				statement();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			jsx();
			setState(139);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallComponentContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(ReactParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public TerminalNode LBRACE() { return getToken(ReactParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactParser.RBRACE, 0); }
		public List<ComponentAttributeContext> componentAttribute() {
			return getRuleContexts(ComponentAttributeContext.class);
		}
		public ComponentAttributeContext componentAttribute(int i) {
			return getRuleContext(ComponentAttributeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public CallComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCallComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCallComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitCallComponent(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final CallComponentContext callComponent() throws RecognitionException {
		CallComponentContext _localctx = new CallComponentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_callComponent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(COMPONENT);
			setState(142);
			match(LPAREN);
			setState(143);
			match(STRING);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(144);
				match(COMMA);
				setState(167);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					{
					setState(145);
					match(LBRACE);
					{
					setState(153);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(148);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
							case 1:
								{
								setState(146);
								match(IDENTIFIER);
								}
								break;
							case 2:
								{
								setState(147);
								componentAttribute();
								}
								break;
							}
							setState(150);
							match(COMMA);
							}
							} 
						}
						setState(155);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					}
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(156);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(157);
						componentAttribute();
						}
						break;
					}
					}
					setState(160);
					match(RBRACE);
					}
					}
					break;
				case RPAREN:
				case IDENTIFIER:
					{
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENTIFIER) {
						{
						{
						setState(161);
						componentAttribute();
						}
						}
						setState(166);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(171);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(ReactParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitAssignment(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(IDENTIFIER);
			setState(174);
			match(EQUALS);
			setState(175);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(ReactParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComponentAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponentAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponentAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComponentAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentAttributeContext componentAttribute() throws RecognitionException {
		ComponentAttributeContext _localctx = new ComponentAttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(IDENTIFIER);
			setState(178);
			match(EQUALS);
			setState(179);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(ReactParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionAttributeContext functionAttribute() throws RecognitionException {
		FunctionAttributeContext _localctx = new FunctionAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IDENTIFIER);
			setState(182);
			match(EQUALS);
			setState(183);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ReactParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> LBRACE() { return getTokens(ReactParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ReactParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ReactParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ReactParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ReactParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitIfStatement(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IF);
			setState(186);
			expression(0);
			setState(187);
			match(LBRACE);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42033080L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(188);
				statement();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(RBRACE);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(195);
				match(ELSE);
				setState(196);
				match(LBRACE);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42033080L) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(197);
					statement();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(RBRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ReactParser.FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(ReactParser.IN, 0); }
		public TerminalNode LBRACE() { return getToken(ReactParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitForStatement(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(FOR);
			setState(207);
			match(IDENTIFIER);
			setState(208);
			match(IN);
			setState(209);
			match(IDENTIFIER);
			setState(210);
			match(LBRACE);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42033080L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(211);
				statement();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX) {
				{
				setState(217);
				jsx();
				}
			}

			setState(220);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitFunctionCall(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(IDENTIFIER);
			setState(223);
			match(LPAREN);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & 1008806316530991147L) != 0)) {
				{
				setState(224);
				expression(0);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(225);
					match(COMMA);
					setState(226);
					expression(0);
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(234);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ReactParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public List<FunctionAttributeContext> functionAttribute() {
			return getRuleContexts(FunctionAttributeContext.class);
		}
		public FunctionAttributeContext functionAttribute(int i) {
			return getRuleContext(FunctionAttributeContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitFunction(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(IDENTIFIER);
			setState(237);
			match(LPAREN);
			{
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(238);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(239);
						functionAttribute();
						}
						break;
					}
					setState(242);
					match(COMMA);
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(248);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(249);
				functionAttribute();
				}
				break;
			}
			}
			setState(252);
			match(RPAREN);
			setState(253);
			match(LBRACE);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42033080L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(254);
				statement();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX) {
				{
				setState(260);
				jsx();
				}
			}

			setState(263);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeFunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ReactParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactParser.RBRACE, 0); }
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode SETTIMEOUT() { return getToken(ReactParser.SETTIMEOUT, 0); }
		public TerminalNode SETINTERVAL() { return getToken(ReactParser.SETINTERVAL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public TimeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTimeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitTimeFunction(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final TimeFunctionContext timeFunction() throws RecognitionException {
		TimeFunctionContext _localctx = new TimeFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_timeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==SETTIMEOUT || _la==SETINTERVAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(266);
			match(LPAREN);
			setState(267);
			match(LBRACE);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42033080L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(268);
				statement();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX) {
				{
				setState(274);
				jsx();
				}
			}

			setState(277);
			match(RBRACE);
			setState(278);
			match(COMMA);
			setState(279);
			match(NUMBER);
			setState(280);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ReactParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ReactParser.RBRACK, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitArray(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(282);
				match(IDENTIFIER);
				}
			}

			setState(285);
			match(LBRACK);
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(286);
				object();
				}
				break;
			case 2:
				{
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE) {
					{
					{
					setState(287);
					object();
					setState(288);
					match(COMMA);
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(297);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ReactParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ReactParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ReactParser.COLON, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ReactParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ReactParser.STRING, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReactParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReactParser.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitObject(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(LBRACE);
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(300);
				match(IDENTIFIER);
				setState(301);
				match(COLON);
				setState(302);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(303);
					match(IDENTIFIER);
					setState(304);
					match(COLON);
					setState(305);
					_la = _input.LA(1);
					if ( !(_la==STRING || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(306);
					match(COMMA);
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(314);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagContext extends ParserRuleContext {
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
		}
		public HtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHtmlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHtmlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitHtmlTag(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagContext htmlTag() throws RecognitionException {
		HtmlTagContext _localctx = new HtmlTagContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_htmlTag);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				div();
				}
				break;
			case P:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				p();
				}
				break;
			case IMG:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				img();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(ReactParser.DIV, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ReactParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactParser.RBRACE, 0); }
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitDiv(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(DIV);
			setState(322);
			match(LPAREN);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438961728L) != 0)) {
				{
				setState(323);
				props();
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(324);
					match(COMMA);
					setState(325);
					props();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(333);
			match(RPAREN);
			setState(334);
			match(LBRACE);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 44916664L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 7L) != 0)) {
				{
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(335);
					statement();
					}
					break;
				case 2:
					{
					setState(336);
					expression(0);
					}
					break;
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PContext extends ParserRuleContext {
		public TerminalNode P() { return getToken(ReactParser.P, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ReactParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactParser.RBRACE, 0); }
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitP(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_p);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(P);
			setState(345);
			match(LPAREN);
			setState(346);
			props();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(347);
				match(COMMA);
				setState(348);
				props();
				}
			}

			setState(351);
			match(RPAREN);
			setState(352);
			match(LBRACE);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 44916664L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 7L) != 0)) {
				{
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(353);
					statement();
					}
					break;
				case 2:
					{
					setState(354);
					expression(0);
					}
					break;
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImgContext extends ParserRuleContext {
		public TerminalNode IMG() { return getToken(ReactParser.IMG, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public ImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitImg(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ImgContext img() throws RecognitionException {
		ImgContext _localctx = new ImgContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_img);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(IMG);
			setState(363);
			match(LPAREN);
			setState(364);
			props();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(365);
				match(COMMA);
				setState(366);
				props();
				}
			}

			setState(369);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropsContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ReactParser.CLASS, 0); }
		public TerminalNode EQUALS() { return getToken(ReactParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EventsContext events() {
			return getRuleContext(EventsContext.class,0);
		}
		public SrcContext src() {
			return getRuleContext(SrcContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public PropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitProps(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final PropsContext props() throws RecognitionException {
		PropsContext _localctx = new PropsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_props);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(371);
				match(CLASS);
				setState(372);
				match(EQUALS);
				setState(373);
				expression(0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				events();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				src();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				className();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventsContext extends ParserRuleContext {
		public OnClickContext onClick() {
			return getRuleContext(OnClickContext.class,0);
		}
		public EventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_events; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEvents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitEvents(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final EventsContext events() throws RecognitionException {
		EventsContext _localctx = new EventsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_events);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			onClick();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnClickContext extends ParserRuleContext {
		public TerminalNode ONCLICK() { return getToken(ReactParser.ONCLICK, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public OnClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOnClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOnClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitOnClick(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final OnClickContext onClick() throws RecognitionException {
		OnClickContext _localctx = new OnClickContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_onClick);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(ONCLICK);
			setState(382);
			match(LPAREN);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42033080L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(383);
				statement();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX) {
				{
				setState(389);
				jsx();
				}
			}

			setState(392);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SrcContext extends ParserRuleContext {
		public TerminalNode SRC() { return getToken(ReactParser.SRC, 0); }
		public TerminalNode EQUALS() { return getToken(ReactParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_src; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitSrc(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final SrcContext src() throws RecognitionException {
		SrcContext _localctx = new SrcContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_src);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(SRC);
			setState(395);
			match(EQUALS);
			setState(396);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ReactParser.CLASS, 0); }
		public TerminalNode EQUALS() { return getToken(ReactParser.EQUALS, 0); }
		public List<CssPropsContext> cssProps() {
			return getRuleContexts(CssPropsContext.class);
		}
		public CssPropsContext cssProps(int i) {
			return getRuleContext(CssPropsContext.class,i);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitClassName(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(CLASS);
			setState(399);
			match(EQUALS);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -274877906928L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1791L) != 0)) {
				{
				{
				setState(400);
				cssProps();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssPropsContext extends ParserRuleContext {
		public TerminalNode FLEX() { return getToken(ReactParser.FLEX, 0); }
		public TerminalNode POSITION() { return getToken(ReactParser.POSITION, 0); }
		public TopContext top() {
			return getRuleContext(TopContext.class,0);
		}
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public BottomContext bottom() {
			return getRuleContext(BottomContext.class,0);
		}
		public TerminalNode FLEX_COLUMN() { return getToken(ReactParser.FLEX_COLUMN, 0); }
		public TerminalNode FLEX_ROW() { return getToken(ReactParser.FLEX_ROW, 0); }
		public TerminalNode JUSTIFY_CENTER() { return getToken(ReactParser.JUSTIFY_CENTER, 0); }
		public TerminalNode JUSTIFY_START() { return getToken(ReactParser.JUSTIFY_START, 0); }
		public TerminalNode JUSTIFY_END() { return getToken(ReactParser.JUSTIFY_END, 0); }
		public TerminalNode JUSTIFY_AROUND() { return getToken(ReactParser.JUSTIFY_AROUND, 0); }
		public TerminalNode JUSTIFY_EVENLY() { return getToken(ReactParser.JUSTIFY_EVENLY, 0); }
		public TerminalNode JUSTIFY_BETWEEN() { return getToken(ReactParser.JUSTIFY_BETWEEN, 0); }
		public GabDashContext gabDash() {
			return getRuleContext(GabDashContext.class,0);
		}
		public TerminalNode BORDER() { return getToken(ReactParser.BORDER, 0); }
		public BorderDashContext borderDash() {
			return getRuleContext(BorderDashContext.class,0);
		}
		public BorderBottomDashContext borderBottomDash() {
			return getRuleContext(BorderBottomDashContext.class,0);
		}
		public TerminalNode BORDER_RADIUS_SM() { return getToken(ReactParser.BORDER_RADIUS_SM, 0); }
		public TerminalNode BORDER_RADIUS_MD() { return getToken(ReactParser.BORDER_RADIUS_MD, 0); }
		public TerminalNode BORDER_RADIUS_LG() { return getToken(ReactParser.BORDER_RADIUS_LG, 0); }
		public TerminalNode BORDER_RADIUS_XL() { return getToken(ReactParser.BORDER_RADIUS_XL, 0); }
		public TerminalNode BORDER_RADIUS_2XL() { return getToken(ReactParser.BORDER_RADIUS_2XL, 0); }
		public TerminalNode BORDER_RADIUS_3XL() { return getToken(ReactParser.BORDER_RADIUS_3XL, 0); }
		public TerminalNode BORDER_RADIUS_FULL() { return getToken(ReactParser.BORDER_RADIUS_FULL, 0); }
		public TerminalNode CURSOR_POINTER() { return getToken(ReactParser.CURSOR_POINTER, 0); }
		public TerminalNode MARGIN_AUTO() { return getToken(ReactParser.MARGIN_AUTO, 0); }
		public MarginDashContext marginDash() {
			return getRuleContext(MarginDashContext.class,0);
		}
		public PDashContext pDash() {
			return getRuleContext(PDashContext.class,0);
		}
		public TextDashContext textDash() {
			return getRuleContext(TextDashContext.class,0);
		}
		public TerminalNode TEXT_SM() { return getToken(ReactParser.TEXT_SM, 0); }
		public TerminalNode TEXT_LG() { return getToken(ReactParser.TEXT_LG, 0); }
		public TerminalNode TEXT_XL() { return getToken(ReactParser.TEXT_XL, 0); }
		public TerminalNode TEXT_2XL() { return getToken(ReactParser.TEXT_2XL, 0); }
		public TerminalNode TEXT_3XL() { return getToken(ReactParser.TEXT_3XL, 0); }
		public TerminalNode FONT_BOLD() { return getToken(ReactParser.FONT_BOLD, 0); }
		public WidthDashContext widthDash() {
			return getRuleContext(WidthDashContext.class,0);
		}
		public HeightDashContext heightDash() {
			return getRuleContext(HeightDashContext.class,0);
		}
		public CssPropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCssProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCssProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitCssProps(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropsContext cssProps() throws RecognitionException {
		CssPropsContext _localctx = new CssPropsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cssProps);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(FLEX);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(POSITION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				top();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				right();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				left();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(411);
				bottom();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(412);
				match(FLEX_COLUMN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(413);
				match(FLEX_ROW);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(414);
				match(JUSTIFY_CENTER);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(415);
				match(JUSTIFY_START);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(416);
				match(JUSTIFY_END);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(417);
				match(JUSTIFY_AROUND);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(418);
				match(JUSTIFY_EVENLY);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(419);
				match(JUSTIFY_BETWEEN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(420);
				gabDash();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(421);
				match(BORDER);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(422);
				borderDash();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(423);
				borderBottomDash();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(424);
				match(BORDER_RADIUS_SM);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(425);
				match(BORDER_RADIUS_MD);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(426);
				match(BORDER_RADIUS_LG);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(427);
				match(BORDER_RADIUS_XL);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(428);
				match(BORDER_RADIUS_2XL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(429);
				match(BORDER_RADIUS_3XL);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(430);
				match(BORDER_RADIUS_FULL);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(431);
				match(CURSOR_POINTER);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(432);
				match(MARGIN_AUTO);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(433);
				marginDash();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(434);
				pDash();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(435);
				textDash();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(436);
				match(TEXT_SM);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(437);
				match(TEXT_LG);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(438);
				match(TEXT_XL);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(439);
				match(TEXT_2XL);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(440);
				match(TEXT_3XL);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(441);
				match(FONT_BOLD);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(442);
				widthDash();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(443);
				heightDash();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GabDashContext extends ParserRuleContext {
		public TerminalNode GAP() { return getToken(ReactParser.GAP, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public GabDashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gabDash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterGabDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitGabDash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitGabDash(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final GabDashContext gabDash() throws RecognitionException {
		GabDashContext _localctx = new GabDashContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_gabDash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(GAP);
			setState(447);
			match(DASH);
			setState(448);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderDashContext extends ParserRuleContext {
		public TerminalNode BORDER() { return getToken(ReactParser.BORDER, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public BorderDashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderDash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBorderDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBorderDash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitBorderDash(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final BorderDashContext borderDash() throws RecognitionException {
		BorderDashContext _localctx = new BorderDashContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_borderDash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(BORDER);
			setState(451);
			match(DASH);
			setState(452);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderBottomDashContext extends ParserRuleContext {
		public TerminalNode BORDER_BOTTOM() { return getToken(ReactParser.BORDER_BOTTOM, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public BorderBottomDashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderBottomDash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBorderBottomDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBorderBottomDash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitBorderBottomDash(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final BorderBottomDashContext borderBottomDash() throws RecognitionException {
		BorderBottomDashContext _localctx = new BorderBottomDashContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_borderBottomDash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(BORDER_BOTTOM);
			setState(455);
			match(DASH);
			setState(456);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MarginDashContext extends ParserRuleContext {
		public TerminalNode MARGIN() { return getToken(ReactParser.MARGIN, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public MarginDashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marginDash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMarginDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMarginDash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitMarginDash(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final MarginDashContext marginDash() throws RecognitionException {
		MarginDashContext _localctx = new MarginDashContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_marginDash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(MARGIN);
			setState(459);
			match(DASH);
			setState(460);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PDashContext extends ParserRuleContext {
		public TerminalNode P() { return getToken(ReactParser.P, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public PDashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pDash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPDash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitPDash(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final PDashContext pDash() throws RecognitionException {
		PDashContext _localctx = new PDashContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pDash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(P);
			setState(463);
			match(DASH);
			setState(464);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextDashContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(ReactParser.TEXT, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TextDashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textDash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTextDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTextDash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitTextDash(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final TextDashContext textDash() throws RecognitionException {
		TextDashContext _localctx = new TextDashContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_textDash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(TEXT);
			setState(467);
			match(DASH);
			setState(468);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WidthDashContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(ReactParser.WIDTH, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public WidthDashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthDash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWidthDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWidthDash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitWidthDash(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final WidthDashContext widthDash() throws RecognitionException {
		WidthDashContext _localctx = new WidthDashContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_widthDash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(WIDTH);
			setState(471);
			match(DASH);
			setState(472);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeightDashContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(ReactParser.HEIGHT, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public HeightDashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heightDash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHeightDash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHeightDash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitHeightDash(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final HeightDashContext heightDash() throws RecognitionException {
		HeightDashContext _localctx = new HeightDashContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_heightDash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(HEIGHT);
			setState(475);
			match(DASH);
			setState(476);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopContext extends ParserRuleContext {
		public TerminalNode TOP() { return getToken(ReactParser.TOP, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitTop(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_top);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(TOP);
			setState(479);
			match(DASH);
			setState(480);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BottomContext extends ParserRuleContext {
		public TerminalNode BOTTOM() { return getToken(ReactParser.BOTTOM, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public BottomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bottom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBottom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBottom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitBottom(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final BottomContext bottom() throws RecognitionException {
		BottomContext _localctx = new BottomContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bottom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(BOTTOM);
			setState(483);
			match(DASH);
			setState(484);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RightContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(ReactParser.RIGHT, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitRight(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(RIGHT);
			setState(487);
			match(DASH);
			setState(488);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeftContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(ReactParser.LEFT, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitLeft(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(LEFT);
			setState(491);
			match(DASH);
			setState(492);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HooksContext extends ParserRuleContext {
		public UseStateHookContext useStateHook() {
			return getRuleContext(UseStateHookContext.class,0);
		}
		public UseRefHookContext useRefHook() {
			return getRuleContext(UseRefHookContext.class,0);
		}
		public UseEffectHookContext useEffectHook() {
			return getRuleContext(UseEffectHookContext.class,0);
		}
		public HooksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hooks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHooks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHooks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitHooks(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final HooksContext hooks() throws RecognitionException {
		HooksContext _localctx = new HooksContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_hooks);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USESTATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				useStateHook();
				}
				break;
			case USEREF:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				useRefHook();
				}
				break;
			case USEEFFECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				useEffectHook();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseStateHookContext extends ParserRuleContext {
		public TerminalNode USESTATE() { return getToken(ReactParser.USESTATE, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public List<HookContentContext> hookContent() {
			return getRuleContexts(HookContentContext.class);
		}
		public HookContentContext hookContent(int i) {
			return getRuleContext(HookContentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public UseStateHookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStateHook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseStateHook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseStateHook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitUseStateHook(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateHookContext useStateHook() throws RecognitionException {
		UseStateHookContext _localctx = new UseStateHookContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_useStateHook);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(USESTATE);
			setState(500);
			match(LPAREN);
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				{
				setState(501);
				hookContent();
				setState(502);
				match(COMMA);
				setState(503);
				hookContent();
				setState(504);
				match(COMMA);
				setState(505);
				hookContent();
				}
				}
				break;
			case 2:
				{
				setState(507);
				hookContent();
				}
				break;
			}
			setState(510);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseRefHookContext extends ParserRuleContext {
		public TerminalNode USEREF() { return getToken(ReactParser.USEREF, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public HookContentContext hookContent() {
			return getRuleContext(HookContentContext.class,0);
		}
		public UseRefHookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRefHook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseRefHook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseRefHook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitUseRefHook(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefHookContext useRefHook() throws RecognitionException {
		UseRefHookContext _localctx = new UseRefHookContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_useRefHook);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(USEREF);
			setState(513);
			match(LPAREN);
			{
			setState(514);
			hookContent();
			}
			setState(515);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseEffectHookContext extends ParserRuleContext {
		public TerminalNode USEEFFECT() { return getToken(ReactParser.USEEFFECT, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ReactParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public UseEffectHookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffectHook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseEffectHook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseEffectHook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitUseEffectHook(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectHookContext useEffectHook() throws RecognitionException {
		UseEffectHookContext _localctx = new UseEffectHookContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_useEffectHook);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(USEEFFECT);
			setState(518);
			match(LPAREN);
			setState(519);
			match(LBRACE);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42033080L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(520);
				statement();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX) {
				{
				setState(526);
				jsx();
				}
			}

			setState(529);
			match(RBRACE);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(530);
				match(COMMA);
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(534);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HookContentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode LBRACE() { return getToken(ReactParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactParser.RBRACE, 0); }
		public TerminalNode TRUE() { return getToken(ReactParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ReactParser.FALSE, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public HookContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hookContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHookContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHookContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitHookContent(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final HookContentContext hookContent() throws RecognitionException {
		HookContentContext _localctx = new HookContentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_hookContent);
		try {
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				match(LBRACE);
				setState(540);
				match(RBRACE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(541);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(542);
				match(FALSE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(543);
				array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(544);
				object();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxContext extends ParserRuleContext {
		public TerminalNode JSX() { return getToken(ReactParser.JSX, 0); }
		public TerminalNode LBRACE() { return getToken(ReactParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactParser.RBRACE, 0); }
		public List<CallComponentContext> callComponent() {
			return getRuleContexts(CallComponentContext.class);
		}
		public CallComponentContext callComponent(int i) {
			return getRuleContext(CallComponentContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<HtmlTagContext> htmlTag() {
			return getRuleContexts(HtmlTagContext.class);
		}
		public HtmlTagContext htmlTag(int i) {
			return getRuleContext(HtmlTagContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public JsxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitJsx(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final JsxContext jsx() throws RecognitionException {
		JsxContext _localctx = new JsxContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_jsx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(JSX);
			setState(548);
			match(LBRACE);
			setState(553); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(553);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMPONENT:
					{
					setState(549);
					callComponent();
					}
					break;
				case IDENTIFIER:
					{
					setState(550);
					functionCall();
					}
					break;
				case DIV:
				case P:
				case IMG:
					{
					setState(551);
					htmlTag();
					}
					break;
				case IF:
					{
					setState(552);
					ifStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(555); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16568L) != 0) || _la==IDENTIFIER );
			setState(557);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode QUESTION() { return getToken(ReactParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CssPropsContext cssProps() {
			return getRuleContext(CssPropsContext.class,0);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmaticExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArithmaticOperatorContext arithmaticOperator() {
			return getRuleContext(ArithmaticOperatorContext.class,0);
		}
		public ArithmaticExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArithmaticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArithmaticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitArithmaticExpression(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketDotExpressionContext extends ExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACK() { return getToken(ReactParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ReactParser.RBRACK, 0); }
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public BracketDotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBracketDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBracketDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitBracketDotExpression(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ExpressionContext {
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitBooleanExpression(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionContext extends ExpressionContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyBraceExpressionContext extends ExpressionContext {
		public TerminalNode LBRACE() { return getToken(ReactParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ReactParser.RBRACE, 0); }
		public EmptyBraceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEmptyBraceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEmptyBraceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEmptyBraceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotExpressionContext extends ExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public DotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitDotExpression(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitParenExpression(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(560);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(561);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(562);
				function();
				}
				break;
			case 4:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(563);
				match(LPAREN);
				setState(565); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(564);
					expression(0);
					}
					}
					setState(567); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & 1008806316530991147L) != 0) );
				setState(569);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new EmptyBraceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(571);
				match(LBRACE);
				setState(572);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new DotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(573);
				match(IDENTIFIER);
				setState(574);
				match(DOT);
				setState(575);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				_localctx = new BracketDotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(576);
				match(IDENTIFIER);
				setState(577);
				match(LBRACK);
				setState(578);
				match(IDENTIFIER);
				setState(579);
				match(RBRACK);
				setState(580);
				match(DOT);
				setState(581);
				match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(582);
				boolean_();
				}
				break;
			case 9:
				{
				_localctx = new TernaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(583);
				match(IDENTIFIER);
				setState(584);
				match(QUESTION);
				setState(587);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case LPAREN:
				case LBRACE:
				case IDENTIFIER:
				case STRING:
				case NUMBER:
					{
					setState(585);
					expression(0);
					}
					break;
				case P:
				case POSITION:
				case TOP:
				case RIGHT:
				case LEFT:
				case BOTTOM:
				case FLEX:
				case FLEX_COLUMN:
				case FLEX_ROW:
				case JUSTIFY_CENTER:
				case JUSTIFY_START:
				case JUSTIFY_END:
				case JUSTIFY_AROUND:
				case JUSTIFY_EVENLY:
				case JUSTIFY_BETWEEN:
				case GAP:
				case BORDER:
				case BORDER_BOTTOM:
				case BORDER_RADIUS_SM:
				case BORDER_RADIUS_MD:
				case BORDER_RADIUS_LG:
				case BORDER_RADIUS_XL:
				case BORDER_RADIUS_2XL:
				case BORDER_RADIUS_3XL:
				case BORDER_RADIUS_FULL:
				case CURSOR_POINTER:
				case MARGIN:
				case MARGIN_AUTO:
				case TEXT:
				case TEXT_SM:
				case TEXT_LG:
				case TEXT_XL:
				case TEXT_2XL:
				case TEXT_3XL:
				case FONT_BOLD:
				case WIDTH:
				case HEIGHT:
					{
					setState(586);
					cssProps();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(589);
				match(COLON);
				setState(590);
				expression(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmaticExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(594);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(595);
					arithmaticOperator();
					setState(596);
					expression(2);
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitLiteral(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ReactParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ReactParser.FALSE, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitBoolean(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmaticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ReactParser.PLUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(ReactParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(ReactParser.DIVIDE, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode MODULO() { return getToken(ReactParser.MODULO, 0); }
		public ArithmaticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmaticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArithmaticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArithmaticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) {
				try {
					return ((ReactParserVisitor<? extends T>)visitor).visitArithmaticOperator(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmaticOperatorContext arithmaticOperator() throws RecognitionException {
		ArithmaticOperatorContext _localctx = new ArithmaticOperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arithmaticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 128850067456L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001N\u0262\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0004\u0000^\b\u0000\u000b\u0000\f\u0000_\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001p\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002y\b\u0002"+
		"\n\u0002\f\u0002|\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0081\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0086\b"+
		"\u0002\n\u0002\f\u0002\u0089\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0095\b\u0003\u0001\u0003\u0005\u0003\u0098\b"+
		"\u0003\n\u0003\f\u0003\u009b\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u009f\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00a3\b\u0003\n\u0003"+
		"\f\u0003\u00a6\t\u0003\u0003\u0003\u00a8\b\u0003\u0003\u0003\u00aa\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00be\b\u0007\n\u0007\f\u0007\u00c1\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c7\b\u0007\n\u0007\f\u0007"+
		"\u00ca\t\u0007\u0001\u0007\u0003\u0007\u00cd\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d5\b\b\n\b\f\b\u00d8\t\b\u0001\b"+
		"\u0003\b\u00db\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00e4\b\t\n\t\f\t\u00e7\t\t\u0003\t\u00e9\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f1\b\n\u0001\n\u0005\n\u00f4"+
		"\b\n\n\n\f\n\u00f7\t\n\u0001\n\u0001\n\u0003\n\u00fb\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0100\b\n\n\n\f\n\u0103\t\n\u0001\n\u0003\n\u0106\b"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u010e\b\u000b\n\u000b\f\u000b\u0111\t\u000b\u0001\u000b\u0003\u000b"+
		"\u0114\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0003\f\u011c\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0123\b\f\n\f\f\f\u0126\t\f\u0003\f\u0128\b\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0134"+
		"\b\r\n\r\f\r\u0137\t\r\u0003\r\u0139\b\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0140\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0147\b\u000f\n\u000f\f\u000f"+
		"\u014a\t\u000f\u0003\u000f\u014c\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0152\b\u000f\n\u000f\f\u000f\u0155\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u015e\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0164\b\u0010\n\u0010\f\u0010\u0167\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0170\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u017a"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0181\b\u0014\n\u0014\f\u0014\u0184\t\u0014\u0001\u0014\u0003\u0014"+
		"\u0187\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0192\b\u0016"+
		"\n\u0016\f\u0016\u0195\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01bd"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0003$\u01f2\b$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u01fd\b%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u020a\b"+
		"\'\n\'\f\'\u020d\t\'\u0001\'\u0003\'\u0210\b\'\u0001\'\u0001\'\u0001\'"+
		"\u0003\'\u0215\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0003(\u0222\b(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0004)\u022a\b)\u000b)\f)\u022b\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0004*\u0236\b*\u000b*\f*\u0237\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u024c\b*\u0001*\u0001"+
		"*\u0001*\u0003*\u0251\b*\u0001*\u0001*\u0001*\u0001*\u0005*\u0257\b*\n"+
		"*\f*\u025a\t*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0000\u0001"+
		"T.\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0006\u0001\u0000\u000b"+
		"\f\u0001\u0000LM\u0001\u0000KL\u0001\u0000KM\u0001\u0000\u0012\u0013\u0002"+
		"\u0000\u0014\u0014!$\u02ad\u0000]\u0001\u0000\u0000\u0000\u0002o\u0001"+
		"\u0000\u0000\u0000\u0004q\u0001\u0000\u0000\u0000\u0006\u008d\u0001\u0000"+
		"\u0000\u0000\b\u00ad\u0001\u0000\u0000\u0000\n\u00b1\u0001\u0000\u0000"+
		"\u0000\f\u00b5\u0001\u0000\u0000\u0000\u000e\u00b9\u0001\u0000\u0000\u0000"+
		"\u0010\u00ce\u0001\u0000\u0000\u0000\u0012\u00de\u0001\u0000\u0000\u0000"+
		"\u0014\u00ec\u0001\u0000\u0000\u0000\u0016\u0109\u0001\u0000\u0000\u0000"+
		"\u0018\u011b\u0001\u0000\u0000\u0000\u001a\u012b\u0001\u0000\u0000\u0000"+
		"\u001c\u013f\u0001\u0000\u0000\u0000\u001e\u0141\u0001\u0000\u0000\u0000"+
		" \u0158\u0001\u0000\u0000\u0000\"\u016a\u0001\u0000\u0000\u0000$\u0179"+
		"\u0001\u0000\u0000\u0000&\u017b\u0001\u0000\u0000\u0000(\u017d\u0001\u0000"+
		"\u0000\u0000*\u018a\u0001\u0000\u0000\u0000,\u018e\u0001\u0000\u0000\u0000"+
		".\u01bc\u0001\u0000\u0000\u00000\u01be\u0001\u0000\u0000\u00002\u01c2"+
		"\u0001\u0000\u0000\u00004\u01c6\u0001\u0000\u0000\u00006\u01ca\u0001\u0000"+
		"\u0000\u00008\u01ce\u0001\u0000\u0000\u0000:\u01d2\u0001\u0000\u0000\u0000"+
		"<\u01d6\u0001\u0000\u0000\u0000>\u01da\u0001\u0000\u0000\u0000@\u01de"+
		"\u0001\u0000\u0000\u0000B\u01e2\u0001\u0000\u0000\u0000D\u01e6\u0001\u0000"+
		"\u0000\u0000F\u01ea\u0001\u0000\u0000\u0000H\u01f1\u0001\u0000\u0000\u0000"+
		"J\u01f3\u0001\u0000\u0000\u0000L\u0200\u0001\u0000\u0000\u0000N\u0205"+
		"\u0001\u0000\u0000\u0000P\u0221\u0001\u0000\u0000\u0000R\u0223\u0001\u0000"+
		"\u0000\u0000T\u0250\u0001\u0000\u0000\u0000V\u025b\u0001\u0000\u0000\u0000"+
		"X\u025d\u0001\u0000\u0000\u0000Z\u025f\u0001\u0000\u0000\u0000\\^\u0003"+
		"\u0002\u0001\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0000\u0000\u0001b\u0001\u0001\u0000\u0000\u0000cp\u0003"+
		"\u0004\u0002\u0000dp\u0003\u0006\u0003\u0000ep\u0003\b\u0004\u0000fp\u0003"+
		"\u000e\u0007\u0000gp\u0003\u0010\b\u0000hp\u0003\u0012\t\u0000ip\u0003"+
		"\u0014\n\u0000jp\u0003\u0016\u000b\u0000kp\u0003\u0018\f\u0000lp\u0003"+
		"\u001a\r\u0000mp\u0003\u001c\u000e\u0000np\u0003H$\u0000oc\u0001\u0000"+
		"\u0000\u0000od\u0001\u0000\u0000\u0000oe\u0001\u0000\u0000\u0000of\u0001"+
		"\u0000\u0000\u0000og\u0001\u0000\u0000\u0000oh\u0001\u0000\u0000\u0000"+
		"oi\u0001\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000ok\u0001\u0000\u0000"+
		"\u0000ol\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000p\u0003\u0001\u0000\u0000\u0000qr\u0005\u0007\u0000\u0000"+
		"rs\u0005\u0015\u0000\u0000s\u0080\u0005L\u0000\u0000tu\u0005\u001b\u0000"+
		"\u0000uz\u0005\u0017\u0000\u0000vw\u0005K\u0000\u0000wy\u0005\u001b\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}~\u0005K\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0081\u0005\u0018\u0000\u0000\u0080t\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\u0016\u0000\u0000\u0083\u0087\u0005\u0017\u0000\u0000\u0084"+
		"\u0086\u0003\u0002\u0001\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0003R)\u0000\u008b\u008c\u0005"+
		"\u0018\u0000\u0000\u008c\u0005\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"\u0007\u0000\u0000\u008e\u008f\u0005\u0015\u0000\u0000\u008f\u00a9\u0005"+
		"L\u0000\u0000\u0090\u00a7\u0005\u001b\u0000\u0000\u0091\u0099\u0005\u0017"+
		"\u0000\u0000\u0092\u0095\u0005K\u0000\u0000\u0093\u0095\u0003\n\u0005"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0005\u001b\u0000"+
		"\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009e\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0005K\u0000\u0000\u009d\u009f\u0003\n\u0005\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a8\u0005\u0018\u0000\u0000"+
		"\u00a1\u00a3\u0003\n\u0005\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u0091\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9"+
		"\u0090\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0016\u0000\u0000\u00ac"+
		"\u0007\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005K\u0000\u0000\u00ae\u00af"+
		"\u0005\u001e\u0000\u0000\u00af\u00b0\u0003T*\u0000\u00b0\t\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005K\u0000\u0000\u00b2\u00b3\u0005\u001e\u0000"+
		"\u0000\u00b3\u00b4\u0003T*\u0000\u00b4\u000b\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005K\u0000\u0000\u00b6\u00b7\u0005\u001e\u0000\u0000\u00b7\u00b8"+
		"\u0003T*\u0000\u00b8\r\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u000e"+
		"\u0000\u0000\u00ba\u00bb\u0003T*\u0000\u00bb\u00bf\u0005\u0017\u0000\u0000"+
		"\u00bc\u00be\u0003\u0002\u0001\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00cc\u0005\u0018\u0000\u0000"+
		"\u00c3\u00c4\u0005\u000f\u0000\u0000\u00c4\u00c8\u0005\u0017\u0000\u0000"+
		"\u00c5\u00c7\u0003\u0002\u0001\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005\u0018\u0000\u0000"+
		"\u00cc\u00c3\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cd\u000f\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0010\u0000\u0000"+
		"\u00cf\u00d0\u0005K\u0000\u0000\u00d0\u00d1\u0005\u0011\u0000\u0000\u00d1"+
		"\u00d2\u0005K\u0000\u0000\u00d2\u00d6\u0005\u0017\u0000\u0000\u00d3\u00d5"+
		"\u0003\u0002\u0001\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d9\u00db\u0003R)\u0000\u00da\u00d9\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0005\u0018\u0000\u0000\u00dd\u0011\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005K\u0000\u0000\u00df\u00e8\u0005\u0015\u0000"+
		"\u0000\u00e0\u00e5\u0003T*\u0000\u00e1\u00e2\u0005\u001b\u0000\u0000\u00e2"+
		"\u00e4\u0003T*\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e0\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005"+
		"\u0016\u0000\u0000\u00eb\u0013\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005"+
		"K\u0000\u0000\u00ed\u00f5\u0005\u0015\u0000\u0000\u00ee\u00f1\u0005K\u0000"+
		"\u0000\u00ef\u00f1\u0003\f\u0006\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0005\u001b\u0000\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0005K\u0000\u0000\u00f9"+
		"\u00fb\u0003\f\u0006\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0016\u0000\u0000\u00fd\u0101"+
		"\u0005\u0017\u0000\u0000\u00fe\u0100\u0003\u0002\u0001\u0000\u00ff\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0105"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0106"+
		"\u0003R)\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0018"+
		"\u0000\u0000\u0108\u0015\u0001\u0000\u0000\u0000\u0109\u010a\u0007\u0000"+
		"\u0000\u0000\u010a\u010b\u0005\u0015\u0000\u0000\u010b\u010f\u0005\u0017"+
		"\u0000\u0000\u010c\u010e\u0003\u0002\u0001\u0000\u010d\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0114\u0003R)\u0000"+
		"\u0113\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u0018\u0000\u0000"+
		"\u0116\u0117\u0005\u001b\u0000\u0000\u0117\u0118\u0005M\u0000\u0000\u0118"+
		"\u0119\u0005\u0016\u0000\u0000\u0119\u0017\u0001\u0000\u0000\u0000\u011a"+
		"\u011c\u0005K\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0127"+
		"\u0005\u0019\u0000\u0000\u011e\u0128\u0003\u001a\r\u0000\u011f\u0120\u0003"+
		"\u001a\r\u0000\u0120\u0121\u0005\u001b\u0000\u0000\u0121\u0123\u0001\u0000"+
		"\u0000\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000"+
		"\u0000\u0000\u0127\u011e\u0001\u0000\u0000\u0000\u0127\u0124\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u001a"+
		"\u0000\u0000\u012a\u0019\u0001\u0000\u0000\u0000\u012b\u0138\u0005\u0017"+
		"\u0000\u0000\u012c\u012d\u0005K\u0000\u0000\u012d\u012e\u0005\u001c\u0000"+
		"\u0000\u012e\u0139\u0007\u0001\u0000\u0000\u012f\u0130\u0005K\u0000\u0000"+
		"\u0130\u0131\u0005\u001c\u0000\u0000\u0131\u0132\u0007\u0001\u0000\u0000"+
		"\u0132\u0134\u0005\u001b\u0000\u0000\u0133\u012f\u0001\u0000\u0000\u0000"+
		"\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000"+
		"\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u012c\u0001\u0000\u0000\u0000"+
		"\u0138\u0135\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0005\u0018\u0000\u0000\u013b\u001b\u0001\u0000\u0000\u0000"+
		"\u013c\u0140\u0003\u001e\u000f\u0000\u013d\u0140\u0003 \u0010\u0000\u013e"+
		"\u0140\u0003\"\u0011\u0000\u013f\u013c\u0001\u0000\u0000\u0000\u013f\u013d"+
		"\u0001\u0000\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u001d"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0003\u0000\u0000\u0142\u014b"+
		"\u0005\u0015\u0000\u0000\u0143\u0148\u0003$\u0012\u0000\u0144\u0145\u0005"+
		"\u001b\u0000\u0000\u0145\u0147\u0003$\u0012\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000"+
		"\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u0143\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005\u0016\u0000\u0000\u014e\u0153\u0005\u0017"+
		"\u0000\u0000\u014f\u0152\u0003\u0002\u0001\u0000\u0150\u0152\u0003T*\u0000"+
		"\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000"+
		"\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u0018\u0000\u0000"+
		"\u0157\u001f\u0001\u0000\u0000\u0000\u0158\u0159\u0005\u0004\u0000\u0000"+
		"\u0159\u015a\u0005\u0015\u0000\u0000\u015a\u015d\u0003$\u0012\u0000\u015b"+
		"\u015c\u0005\u001b\u0000\u0000\u015c\u015e\u0003$\u0012\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0016\u0000\u0000\u0160\u0165"+
		"\u0005\u0017\u0000\u0000\u0161\u0164\u0003\u0002\u0001\u0000\u0162\u0164"+
		"\u0003T*\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0162\u0001\u0000"+
		"\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168\u0001\u0000"+
		"\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u0018"+
		"\u0000\u0000\u0169!\u0001\u0000\u0000\u0000\u016a\u016b\u0005\u0005\u0000"+
		"\u0000\u016b\u016c\u0005\u0015\u0000\u0000\u016c\u016f\u0003$\u0012\u0000"+
		"\u016d\u016e\u0005\u001b\u0000\u0000\u016e\u0170\u0003$\u0012\u0000\u016f"+
		"\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u0016\u0000\u0000\u0172"+
		"#\u0001\u0000\u0000\u0000\u0173\u0174\u0005%\u0000\u0000\u0174\u0175\u0005"+
		"\u001e\u0000\u0000\u0175\u017a\u0003T*\u0000\u0176\u017a\u0003&\u0013"+
		"\u0000\u0177\u017a\u0003*\u0015\u0000\u0178\u017a\u0003,\u0016\u0000\u0179"+
		"\u0173\u0001\u0000\u0000\u0000\u0179\u0176\u0001\u0000\u0000\u0000\u0179"+
		"\u0177\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a"+
		"%\u0001\u0000\u0000\u0000\u017b\u017c\u0003(\u0014\u0000\u017c\'\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0005\r\u0000\u0000\u017e\u0182\u0005\u0015"+
		"\u0000\u0000\u017f\u0181\u0003\u0002\u0001\u0000\u0180\u017f\u0001\u0000"+
		"\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000"+
		"\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0187\u0003R)\u0000"+
		"\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u0016\u0000\u0000"+
		"\u0189)\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u0006\u0000\u0000\u018b"+
		"\u018c\u0005\u001e\u0000\u0000\u018c\u018d\u0003T*\u0000\u018d+\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0005%\u0000\u0000\u018f\u0193\u0005\u001e"+
		"\u0000\u0000\u0190\u0192\u0003.\u0017\u0000\u0191\u0190\u0001\u0000\u0000"+
		"\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194-\u0001\u0000\u0000\u0000"+
		"\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u01bd\u0005+\u0000\u0000\u0197"+
		"\u01bd\u0005&\u0000\u0000\u0198\u01bd\u0003@ \u0000\u0199\u01bd\u0003"+
		"D\"\u0000\u019a\u01bd\u0003F#\u0000\u019b\u01bd\u0003B!\u0000\u019c\u01bd"+
		"\u0005,\u0000\u0000\u019d\u01bd\u0005-\u0000\u0000\u019e\u01bd\u0005."+
		"\u0000\u0000\u019f\u01bd\u0005/\u0000\u0000\u01a0\u01bd\u00050\u0000\u0000"+
		"\u01a1\u01bd\u00051\u0000\u0000\u01a2\u01bd\u00052\u0000\u0000\u01a3\u01bd"+
		"\u00053\u0000\u0000\u01a4\u01bd\u00030\u0018\u0000\u01a5\u01bd\u00055"+
		"\u0000\u0000\u01a6\u01bd\u00032\u0019\u0000\u01a7\u01bd\u00034\u001a\u0000"+
		"\u01a8\u01bd\u00057\u0000\u0000\u01a9\u01bd\u00058\u0000\u0000\u01aa\u01bd"+
		"\u00059\u0000\u0000\u01ab\u01bd\u0005:\u0000\u0000\u01ac\u01bd\u0005;"+
		"\u0000\u0000\u01ad\u01bd\u0005<\u0000\u0000\u01ae\u01bd\u0005=\u0000\u0000"+
		"\u01af\u01bd\u0005>\u0000\u0000\u01b0\u01bd\u0005@\u0000\u0000\u01b1\u01bd"+
		"\u00036\u001b\u0000\u01b2\u01bd\u00038\u001c\u0000\u01b3\u01bd\u0003:"+
		"\u001d\u0000\u01b4\u01bd\u0005B\u0000\u0000\u01b5\u01bd\u0005C\u0000\u0000"+
		"\u01b6\u01bd\u0005D\u0000\u0000\u01b7\u01bd\u0005E\u0000\u0000\u01b8\u01bd"+
		"\u0005F\u0000\u0000\u01b9\u01bd\u0005G\u0000\u0000\u01ba\u01bd\u0003<"+
		"\u001e\u0000\u01bb\u01bd\u0003>\u001f\u0000\u01bc\u0196\u0001\u0000\u0000"+
		"\u0000\u01bc\u0197\u0001\u0000\u0000\u0000\u01bc\u0198\u0001\u0000\u0000"+
		"\u0000\u01bc\u0199\u0001\u0000\u0000\u0000\u01bc\u019a\u0001\u0000\u0000"+
		"\u0000\u01bc\u019b\u0001\u0000\u0000\u0000\u01bc\u019c\u0001\u0000\u0000"+
		"\u0000\u01bc\u019d\u0001\u0000\u0000\u0000\u01bc\u019e\u0001\u0000\u0000"+
		"\u0000\u01bc\u019f\u0001\u0000\u0000\u0000\u01bc\u01a0\u0001\u0000\u0000"+
		"\u0000\u01bc\u01a1\u0001\u0000\u0000\u0000\u01bc\u01a2\u0001\u0000\u0000"+
		"\u0000\u01bc\u01a3\u0001\u0000\u0000\u0000\u01bc\u01a4\u0001\u0000\u0000"+
		"\u0000\u01bc\u01a5\u0001\u0000\u0000\u0000\u01bc\u01a6\u0001\u0000\u0000"+
		"\u0000\u01bc\u01a7\u0001\u0000\u0000\u0000\u01bc\u01a8\u0001\u0000\u0000"+
		"\u0000\u01bc\u01a9\u0001\u0000\u0000\u0000\u01bc\u01aa\u0001\u0000\u0000"+
		"\u0000\u01bc\u01ab\u0001\u0000\u0000\u0000\u01bc\u01ac\u0001\u0000\u0000"+
		"\u0000\u01bc\u01ad\u0001\u0000\u0000\u0000\u01bc\u01ae\u0001\u0000\u0000"+
		"\u0000\u01bc\u01af\u0001\u0000\u0000\u0000\u01bc\u01b0\u0001\u0000\u0000"+
		"\u0000\u01bc\u01b1\u0001\u0000\u0000\u0000\u01bc\u01b2\u0001\u0000\u0000"+
		"\u0000\u01bc\u01b3\u0001\u0000\u0000\u0000\u01bc\u01b4\u0001\u0000\u0000"+
		"\u0000\u01bc\u01b5\u0001\u0000\u0000\u0000\u01bc\u01b6\u0001\u0000\u0000"+
		"\u0000\u01bc\u01b7\u0001\u0000\u0000\u0000\u01bc\u01b8\u0001\u0000\u0000"+
		"\u0000\u01bc\u01b9\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bd/\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u00054\u0000\u0000\u01bf\u01c0\u0005\u0014\u0000\u0000\u01c0"+
		"\u01c1\u0005M\u0000\u0000\u01c11\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005"+
		"5\u0000\u0000\u01c3\u01c4\u0005\u0014\u0000\u0000\u01c4\u01c5\u0005M\u0000"+
		"\u0000\u01c53\u0001\u0000\u0000\u0000\u01c6\u01c7\u00056\u0000\u0000\u01c7"+
		"\u01c8\u0005\u0014\u0000\u0000\u01c8\u01c9\u0005M\u0000\u0000\u01c95\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u0005?\u0000\u0000\u01cb\u01cc\u0005\u0014"+
		"\u0000\u0000\u01cc\u01cd\u0005M\u0000\u0000\u01cd7\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cf\u0005\u0004\u0000\u0000\u01cf\u01d0\u0005\u0014\u0000\u0000"+
		"\u01d0\u01d1\u0005M\u0000\u0000\u01d19\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0005A\u0000\u0000\u01d3\u01d4\u0005\u0014\u0000\u0000\u01d4\u01d5\u0005"+
		"K\u0000\u0000\u01d5;\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005I\u0000"+
		"\u0000\u01d7\u01d8\u0005\u0014\u0000\u0000\u01d8\u01d9\u0005M\u0000\u0000"+
		"\u01d9=\u0001\u0000\u0000\u0000\u01da\u01db\u0005J\u0000\u0000\u01db\u01dc"+
		"\u0005\u0014\u0000\u0000\u01dc\u01dd\u0005M\u0000\u0000\u01dd?\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0005\'\u0000\u0000\u01df\u01e0\u0005\u0014\u0000"+
		"\u0000\u01e0\u01e1\u0005M\u0000\u0000\u01e1A\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0005*\u0000\u0000\u01e3\u01e4\u0005\u0014\u0000\u0000\u01e4\u01e5"+
		"\u0005M\u0000\u0000\u01e5C\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005("+
		"\u0000\u0000\u01e7\u01e8\u0005\u0014\u0000\u0000\u01e8\u01e9\u0005M\u0000"+
		"\u0000\u01e9E\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005)\u0000\u0000\u01eb"+
		"\u01ec\u0005\u0014\u0000\u0000\u01ec\u01ed\u0005M\u0000\u0000\u01edG\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f2\u0003J%\u0000\u01ef\u01f2\u0003L&\u0000"+
		"\u01f0\u01f2\u0003N\'\u0000\u01f1\u01ee\u0001\u0000\u0000\u0000\u01f1"+
		"\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2"+
		"I\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005\b\u0000\u0000\u01f4\u01fc"+
		"\u0005\u0015\u0000\u0000\u01f5\u01f6\u0003P(\u0000\u01f6\u01f7\u0005\u001b"+
		"\u0000\u0000\u01f7\u01f8\u0003P(\u0000\u01f8\u01f9\u0005\u001b\u0000\u0000"+
		"\u01f9\u01fa\u0003P(\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01fd"+
		"\u0003P(\u0000\u01fc\u01f5\u0001\u0000\u0000\u0000\u01fc\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005\u0016"+
		"\u0000\u0000\u01ffK\u0001\u0000\u0000\u0000\u0200\u0201\u0005\t\u0000"+
		"\u0000\u0201\u0202\u0005\u0015\u0000\u0000\u0202\u0203\u0003P(\u0000\u0203"+
		"\u0204\u0005\u0016\u0000\u0000\u0204M\u0001\u0000\u0000\u0000\u0205\u0206"+
		"\u0005\n\u0000\u0000\u0206\u0207\u0005\u0015\u0000\u0000\u0207\u020b\u0005"+
		"\u0017\u0000\u0000\u0208\u020a\u0003\u0002\u0001\u0000\u0209\u0208\u0001"+
		"\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000\u0000\u020b\u0209\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020f\u0001"+
		"\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0210\u0003"+
		"R)\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000"+
		"\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0214\u0005\u0018\u0000"+
		"\u0000\u0212\u0213\u0005\u001b\u0000\u0000\u0213\u0215\u0007\u0002\u0000"+
		"\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0217\u0005\u0016\u0000"+
		"\u0000\u0217O\u0001\u0000\u0000\u0000\u0218\u0222\u0005K\u0000\u0000\u0219"+
		"\u0222\u0005L\u0000\u0000\u021a\u0222\u0005M\u0000\u0000\u021b\u021c\u0005"+
		"\u0017\u0000\u0000\u021c\u0222\u0005\u0018\u0000\u0000\u021d\u0222\u0005"+
		"\u0012\u0000\u0000\u021e\u0222\u0005\u0013\u0000\u0000\u021f\u0222\u0003"+
		"\u0018\f\u0000\u0220\u0222\u0003\u001a\r\u0000\u0221\u0218\u0001\u0000"+
		"\u0000\u0000\u0221\u0219\u0001\u0000\u0000\u0000\u0221\u021a\u0001\u0000"+
		"\u0000\u0000\u0221\u021b\u0001\u0000\u0000\u0000\u0221\u021d\u0001\u0000"+
		"\u0000\u0000\u0221\u021e\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000"+
		"\u0000\u0000\u0221\u0220\u0001\u0000\u0000\u0000\u0222Q\u0001\u0000\u0000"+
		"\u0000\u0223\u0224\u0005\u0002\u0000\u0000\u0224\u0229\u0005\u0017\u0000"+
		"\u0000\u0225\u022a\u0003\u0006\u0003\u0000\u0226\u022a\u0003\u0012\t\u0000"+
		"\u0227\u022a\u0003\u001c\u000e\u0000\u0228\u022a\u0003\u000e\u0007\u0000"+
		"\u0229\u0225\u0001\u0000\u0000\u0000\u0229\u0226\u0001\u0000\u0000\u0000"+
		"\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u0228\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000"+
		"\u022d\u022e\u0005\u0018\u0000\u0000\u022eS\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0006*\uffff\uffff\u0000\u0230\u0251\u0003V+\u0000\u0231\u0251"+
		"\u0003\u0012\t\u0000\u0232\u0251\u0003\u0014\n\u0000\u0233\u0235\u0005"+
		"\u0015\u0000\u0000\u0234\u0236\u0003T*\u0000\u0235\u0234\u0001\u0000\u0000"+
		"\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000"+
		"\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000"+
		"\u0000\u0239\u023a\u0005\u0016\u0000\u0000\u023a\u0251\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0005\u0017\u0000\u0000\u023c\u0251\u0005\u0018\u0000"+
		"\u0000\u023d\u023e\u0005K\u0000\u0000\u023e\u023f\u0005\u001f\u0000\u0000"+
		"\u023f\u0251\u0005K\u0000\u0000\u0240\u0241\u0005K\u0000\u0000\u0241\u0242"+
		"\u0005\u0019\u0000\u0000\u0242\u0243\u0005K\u0000\u0000\u0243\u0244\u0005"+
		"\u001a\u0000\u0000\u0244\u0245\u0005\u001f\u0000\u0000\u0245\u0251\u0005"+
		"K\u0000\u0000\u0246\u0251\u0003X,\u0000\u0247\u0248\u0005K\u0000\u0000"+
		"\u0248\u024b\u0005 \u0000\u0000\u0249\u024c\u0003T*\u0000\u024a\u024c"+
		"\u0003.\u0017\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024a\u0001"+
		"\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024e\u0005"+
		"\u001c\u0000\u0000\u024e\u024f\u0003T*\u0002\u024f\u0251\u0001\u0000\u0000"+
		"\u0000\u0250\u022f\u0001\u0000\u0000\u0000\u0250\u0231\u0001\u0000\u0000"+
		"\u0000\u0250\u0232\u0001\u0000\u0000\u0000\u0250\u0233\u0001\u0000\u0000"+
		"\u0000\u0250\u023b\u0001\u0000\u0000\u0000\u0250\u023d\u0001\u0000\u0000"+
		"\u0000\u0250\u0240\u0001\u0000\u0000\u0000\u0250\u0246\u0001\u0000\u0000"+
		"\u0000\u0250\u0247\u0001\u0000\u0000\u0000\u0251\u0258\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\n\u0001\u0000\u0000\u0253\u0254\u0003Z-\u0000\u0254"+
		"\u0255\u0003T*\u0002\u0255\u0257\u0001\u0000\u0000\u0000\u0256\u0252\u0001"+
		"\u0000\u0000\u0000\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259U\u0001\u0000"+
		"\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025b\u025c\u0007\u0003"+
		"\u0000\u0000\u025cW\u0001\u0000\u0000\u0000\u025d\u025e\u0007\u0004\u0000"+
		"\u0000\u025eY\u0001\u0000\u0000\u0000\u025f\u0260\u0007\u0005\u0000\u0000"+
		"\u0260[\u0001\u0000\u0000\u00008_oz\u0080\u0087\u0094\u0099\u009e\u00a4"+
		"\u00a7\u00a9\u00bf\u00c8\u00cc\u00d6\u00da\u00e5\u00e8\u00f0\u00f5\u00fa"+
		"\u0101\u0105\u010f\u0113\u011b\u0124\u0127\u0135\u0138\u013f\u0148\u014b"+
		"\u0151\u0153\u015d\u0163\u0165\u016f\u0179\u0182\u0186\u0193\u01bc\u01f1"+
		"\u01fc\u020b\u020f\u0214\u0221\u0229\u022b\u0237\u024b\u0250\u0258";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}