// Generated from F:/files/IT/compilerSlides/Project2/src/antlr/ReactLexer.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ReactLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"APP", "JSX", "DIV", "P", "IMG", "SRC", "COMPONENT", "USESTATE", "USEREF", 
			"USEEFFECT", "SETTIMEOUT", "SETINTERVAL", "ONCLICK", "IF", "ELSE", "FOR", 
			"IN", "TRUE", "FALSE", "DASH", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "COMMA", "COLON", "SEMI", "EQUALS", "DOT", "QUESTION", 
			"PLUS", "MULTIPLY", "DIVIDE", "MODULO", "CLASS", "POSITION", "TOP", "RIGHT", 
			"LEFT", "BOTTOM", "FLEX", "FLEX_COLUMN", "FLEX_ROW", "JUSTIFY_CENTER", 
			"JUSTIFY_START", "JUSTIFY_END", "JUSTIFY_AROUND", "JUSTIFY_EVENLY", "JUSTIFY_BETWEEN", 
			"GAP", "BORDER", "BORDER_BOTTOM", "BORDER_RADIUS_SM", "BORDER_RADIUS_MD", 
			"BORDER_RADIUS_LG", "BORDER_RADIUS_XL", "BORDER_RADIUS_2XL", "BORDER_RADIUS_3XL", 
			"BORDER_RADIUS_FULL", "CURSOR_POINTER", "MARGIN", "MARGIN_AUTO", "TEXT", 
			"TEXT_SM", "TEXT_LG", "TEXT_XL", "TEXT_2XL", "TEXT_3XL", "FONT_BOLD", 
			"FONT_MEDIUM", "WIDTH", "HEIGHT", "IDENTIFIER", "STRING", "NUMBER", "WS"
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


	public ReactLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ReactLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000N\u02a7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0002J\u0007J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001H\u0001H\u0001I\u0001I\u0001J\u0001J\u0005J\u028e"+
		"\bJ\nJ\fJ\u0291\tJ\u0001K\u0001K\u0005K\u0295\bK\nK\fK\u0298\tK\u0001"+
		"K\u0001K\u0001L\u0004L\u029d\bL\u000bL\fL\u029e\u0001M\u0004M\u02a2\b"+
		"M\u000bM\fM\u02a3\u0001M\u0001M\u0000\u0000N\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e"+
		"3g4i5k6m7o8q9s:u;w<y={>}?\u007f@\u0081A\u0083B\u0085C\u0087D\u0089E\u008b"+
		"F\u008dG\u008fH\u0091I\u0093J\u0095K\u0097L\u0099M\u009bN\u0001\u0000"+
		"\u0005\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\n\n\r\r\"\"\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u02aa\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000"+
		"W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001"+
		"\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000"+
		"\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000"+
		"e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001"+
		"\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000"+
		"\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000"+
		"s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001"+
		"\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{\u0001\u0000\u0000"+
		"\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001\u0000\u0000\u0000"+
		"\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083\u0001\u0000\u0000\u0000"+
		"\u0000\u0085\u0001\u0000\u0000\u0000\u0000\u0087\u0001\u0000\u0000\u0000"+
		"\u0000\u0089\u0001\u0000\u0000\u0000\u0000\u008b\u0001\u0000\u0000\u0000"+
		"\u0000\u008d\u0001\u0000\u0000\u0000\u0000\u008f\u0001\u0000\u0000\u0000"+
		"\u0000\u0091\u0001\u0000\u0000\u0000\u0000\u0093\u0001\u0000\u0000\u0000"+
		"\u0000\u0095\u0001\u0000\u0000\u0000\u0000\u0097\u0001\u0000\u0000\u0000"+
		"\u0000\u0099\u0001\u0000\u0000\u0000\u0000\u009b\u0001\u0000\u0000\u0000"+
		"\u0001\u009d\u0001\u0000\u0000\u0000\u0003\u00a1\u0001\u0000\u0000\u0000"+
		"\u0005\u00a5\u0001\u0000\u0000\u0000\u0007\u00a9\u0001\u0000\u0000\u0000"+
		"\t\u00ab\u0001\u0000\u0000\u0000\u000b\u00af\u0001\u0000\u0000\u0000\r"+
		"\u00b3\u0001\u0000\u0000\u0000\u000f\u00bd\u0001\u0000\u0000\u0000\u0011"+
		"\u00c6\u0001\u0000\u0000\u0000\u0013\u00cd\u0001\u0000\u0000\u0000\u0015"+
		"\u00d7\u0001\u0000\u0000\u0000\u0017\u00e2\u0001\u0000\u0000\u0000\u0019"+
		"\u00ee\u0001\u0000\u0000\u0000\u001b\u00f6\u0001\u0000\u0000\u0000\u001d"+
		"\u00f9\u0001\u0000\u0000\u0000\u001f\u00fe\u0001\u0000\u0000\u0000!\u0102"+
		"\u0001\u0000\u0000\u0000#\u0105\u0001\u0000\u0000\u0000%\u010a\u0001\u0000"+
		"\u0000\u0000\'\u0110\u0001\u0000\u0000\u0000)\u0112\u0001\u0000\u0000"+
		"\u0000+\u0114\u0001\u0000\u0000\u0000-\u0116\u0001\u0000\u0000\u0000/"+
		"\u0118\u0001\u0000\u0000\u00001\u011a\u0001\u0000\u0000\u00003\u011c\u0001"+
		"\u0000\u0000\u00005\u011e\u0001\u0000\u0000\u00007\u0120\u0001\u0000\u0000"+
		"\u00009\u0122\u0001\u0000\u0000\u0000;\u0124\u0001\u0000\u0000\u0000="+
		"\u0126\u0001\u0000\u0000\u0000?\u0128\u0001\u0000\u0000\u0000A\u012a\u0001"+
		"\u0000\u0000\u0000C\u012c\u0001\u0000\u0000\u0000E\u012e\u0001\u0000\u0000"+
		"\u0000G\u0130\u0001\u0000\u0000\u0000I\u0132\u0001\u0000\u0000\u0000K"+
		"\u0138\u0001\u0000\u0000\u0000M\u0141\u0001\u0000\u0000\u0000O\u0145\u0001"+
		"\u0000\u0000\u0000Q\u014b\u0001\u0000\u0000\u0000S\u0150\u0001\u0000\u0000"+
		"\u0000U\u0157\u0001\u0000\u0000\u0000W\u015c\u0001\u0000\u0000\u0000Y"+
		"\u0165\u0001\u0000\u0000\u0000[\u016e\u0001\u0000\u0000\u0000]\u017d\u0001"+
		"\u0000\u0000\u0000_\u018b\u0001\u0000\u0000\u0000a\u0197\u0001\u0000\u0000"+
		"\u0000c\u01a6\u0001\u0000\u0000\u0000e\u01b5\u0001\u0000\u0000\u0000g"+
		"\u01c5\u0001\u0000\u0000\u0000i\u01c9\u0001\u0000\u0000\u0000k\u01d0\u0001"+
		"\u0000\u0000\u0000m\u01d9\u0001\u0000\u0000\u0000o\u01e4\u0001\u0000\u0000"+
		"\u0000q\u01ef\u0001\u0000\u0000\u0000s\u01fa\u0001\u0000\u0000\u0000u"+
		"\u0205\u0001\u0000\u0000\u0000w\u0211\u0001\u0000\u0000\u0000y\u021d\u0001"+
		"\u0000\u0000\u0000{\u022a\u0001\u0000\u0000\u0000}\u0239\u0001\u0000\u0000"+
		"\u0000\u007f\u023b\u0001\u0000\u0000\u0000\u0081\u0242\u0001\u0000\u0000"+
		"\u0000\u0083\u0247\u0001\u0000\u0000\u0000\u0085\u024f\u0001\u0000\u0000"+
		"\u0000\u0087\u0257\u0001\u0000\u0000\u0000\u0089\u025f\u0001\u0000\u0000"+
		"\u0000\u008b\u0268\u0001\u0000\u0000\u0000\u008d\u0271\u0001\u0000\u0000"+
		"\u0000\u008f\u027b\u0001\u0000\u0000\u0000\u0091\u0287\u0001\u0000\u0000"+
		"\u0000\u0093\u0289\u0001\u0000\u0000\u0000\u0095\u028b\u0001\u0000\u0000"+
		"\u0000\u0097\u0292\u0001\u0000\u0000\u0000\u0099\u029c\u0001\u0000\u0000"+
		"\u0000\u009b\u02a1\u0001\u0000\u0000\u0000\u009d\u009e\u0005A\u0000\u0000"+
		"\u009e\u009f\u0005p\u0000\u0000\u009f\u00a0\u0005p\u0000\u0000\u00a0\u0002"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005J\u0000\u0000\u00a2\u00a3\u0005"+
		"S\u0000\u0000\u00a3\u00a4\u0005X\u0000\u0000\u00a4\u0004\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005d\u0000\u0000\u00a6\u00a7\u0005i\u0000\u0000\u00a7"+
		"\u00a8\u0005v\u0000\u0000\u00a8\u0006\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005p\u0000\u0000\u00aa\b\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"i\u0000\u0000\u00ac\u00ad\u0005m\u0000\u0000\u00ad\u00ae\u0005g\u0000"+
		"\u0000\u00ae\n\u0001\u0000\u0000\u0000\u00af\u00b0\u0005s\u0000\u0000"+
		"\u00b0\u00b1\u0005r\u0000\u0000\u00b1\u00b2\u0005c\u0000\u0000\u00b2\f"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005C\u0000\u0000\u00b4\u00b5\u0005"+
		"o\u0000\u0000\u00b5\u00b6\u0005m\u0000\u0000\u00b6\u00b7\u0005p\u0000"+
		"\u0000\u00b7\u00b8\u0005o\u0000\u0000\u00b8\u00b9\u0005n\u0000\u0000\u00b9"+
		"\u00ba\u0005e\u0000\u0000\u00ba\u00bb\u0005n\u0000\u0000\u00bb\u00bc\u0005"+
		"t\u0000\u0000\u00bc\u000e\u0001\u0000\u0000\u0000\u00bd\u00be\u0005u\u0000"+
		"\u0000\u00be\u00bf\u0005s\u0000\u0000\u00bf\u00c0\u0005e\u0000\u0000\u00c0"+
		"\u00c1\u0005S\u0000\u0000\u00c1\u00c2\u0005t\u0000\u0000\u00c2\u00c3\u0005"+
		"a\u0000\u0000\u00c3\u00c4\u0005t\u0000\u0000\u00c4\u00c5\u0005e\u0000"+
		"\u0000\u00c5\u0010\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005u\u0000\u0000"+
		"\u00c7\u00c8\u0005s\u0000\u0000\u00c8\u00c9\u0005e\u0000\u0000\u00c9\u00ca"+
		"\u0005R\u0000\u0000\u00ca\u00cb\u0005e\u0000\u0000\u00cb\u00cc\u0005f"+
		"\u0000\u0000\u00cc\u0012\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005u\u0000"+
		"\u0000\u00ce\u00cf\u0005s\u0000\u0000\u00cf\u00d0\u0005e\u0000\u0000\u00d0"+
		"\u00d1\u0005E\u0000\u0000\u00d1\u00d2\u0005f\u0000\u0000\u00d2\u00d3\u0005"+
		"f\u0000\u0000\u00d3\u00d4\u0005e\u0000\u0000\u00d4\u00d5\u0005c\u0000"+
		"\u0000\u00d5\u00d6\u0005t\u0000\u0000\u00d6\u0014\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0005s\u0000\u0000\u00d8\u00d9\u0005e\u0000\u0000\u00d9\u00da"+
		"\u0005t\u0000\u0000\u00da\u00db\u0005T\u0000\u0000\u00db\u00dc\u0005i"+
		"\u0000\u0000\u00dc\u00dd\u0005m\u0000\u0000\u00dd\u00de\u0005e\u0000\u0000"+
		"\u00de\u00df\u0005o\u0000\u0000\u00df\u00e0\u0005u\u0000\u0000\u00e0\u00e1"+
		"\u0005t\u0000\u0000\u00e1\u0016\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		"s\u0000\u0000\u00e3\u00e4\u0005e\u0000\u0000\u00e4\u00e5\u0005t\u0000"+
		"\u0000\u00e5\u00e6\u0005I\u0000\u0000\u00e6\u00e7\u0005n\u0000\u0000\u00e7"+
		"\u00e8\u0005t\u0000\u0000\u00e8\u00e9\u0005e\u0000\u0000\u00e9\u00ea\u0005"+
		"r\u0000\u0000\u00ea\u00eb\u0005v\u0000\u0000\u00eb\u00ec\u0005a\u0000"+
		"\u0000\u00ec\u00ed\u0005l\u0000\u0000\u00ed\u0018\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0005o\u0000\u0000\u00ef\u00f0\u0005n\u0000\u0000\u00f0\u00f1"+
		"\u0005C\u0000\u0000\u00f1\u00f2\u0005l\u0000\u0000\u00f2\u00f3\u0005i"+
		"\u0000\u0000\u00f3\u00f4\u0005c\u0000\u0000\u00f4\u00f5\u0005k\u0000\u0000"+
		"\u00f5\u001a\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005i\u0000\u0000\u00f7"+
		"\u00f8\u0005f\u0000\u0000\u00f8\u001c\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0005e\u0000\u0000\u00fa\u00fb\u0005l\u0000\u0000\u00fb\u00fc\u0005s"+
		"\u0000\u0000\u00fc\u00fd\u0005e\u0000\u0000\u00fd\u001e\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0005f\u0000\u0000\u00ff\u0100\u0005o\u0000\u0000\u0100"+
		"\u0101\u0005r\u0000\u0000\u0101 \u0001\u0000\u0000\u0000\u0102\u0103\u0005"+
		"i\u0000\u0000\u0103\u0104\u0005n\u0000\u0000\u0104\"\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0005t\u0000\u0000\u0106\u0107\u0005r\u0000\u0000\u0107"+
		"\u0108\u0005u\u0000\u0000\u0108\u0109\u0005e\u0000\u0000\u0109$\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0005f\u0000\u0000\u010b\u010c\u0005a\u0000"+
		"\u0000\u010c\u010d\u0005l\u0000\u0000\u010d\u010e\u0005s\u0000\u0000\u010e"+
		"\u010f\u0005e\u0000\u0000\u010f&\u0001\u0000\u0000\u0000\u0110\u0111\u0005"+
		"-\u0000\u0000\u0111(\u0001\u0000\u0000\u0000\u0112\u0113\u0005(\u0000"+
		"\u0000\u0113*\u0001\u0000\u0000\u0000\u0114\u0115\u0005)\u0000\u0000\u0115"+
		",\u0001\u0000\u0000\u0000\u0116\u0117\u0005{\u0000\u0000\u0117.\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0005}\u0000\u0000\u01190\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0005[\u0000\u0000\u011b2\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005]\u0000\u0000\u011d4\u0001\u0000\u0000\u0000\u011e\u011f\u0005"+
		",\u0000\u0000\u011f6\u0001\u0000\u0000\u0000\u0120\u0121\u0005:\u0000"+
		"\u0000\u01218\u0001\u0000\u0000\u0000\u0122\u0123\u0005;\u0000\u0000\u0123"+
		":\u0001\u0000\u0000\u0000\u0124\u0125\u0005=\u0000\u0000\u0125<\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0005.\u0000\u0000\u0127>\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0005?\u0000\u0000\u0129@\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0005+\u0000\u0000\u012bB\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		"*\u0000\u0000\u012dD\u0001\u0000\u0000\u0000\u012e\u012f\u0005/\u0000"+
		"\u0000\u012fF\u0001\u0000\u0000\u0000\u0130\u0131\u0005%\u0000\u0000\u0131"+
		"H\u0001\u0000\u0000\u0000\u0132\u0133\u0005c\u0000\u0000\u0133\u0134\u0005"+
		"l\u0000\u0000\u0134\u0135\u0005a\u0000\u0000\u0135\u0136\u0005s\u0000"+
		"\u0000\u0136\u0137\u0005s\u0000\u0000\u0137J\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0005r\u0000\u0000\u0139\u013a\u0005e\u0000\u0000\u013a\u013b\u0005"+
		"l\u0000\u0000\u013b\u013c\u0005a\u0000\u0000\u013c\u013d\u0005t\u0000"+
		"\u0000\u013d\u013e\u0005i\u0000\u0000\u013e\u013f\u0005v\u0000\u0000\u013f"+
		"\u0140\u0005e\u0000\u0000\u0140L\u0001\u0000\u0000\u0000\u0141\u0142\u0005"+
		"t\u0000\u0000\u0142\u0143\u0005o\u0000\u0000\u0143\u0144\u0005p\u0000"+
		"\u0000\u0144N\u0001\u0000\u0000\u0000\u0145\u0146\u0005r\u0000\u0000\u0146"+
		"\u0147\u0005i\u0000\u0000\u0147\u0148\u0005g\u0000\u0000\u0148\u0149\u0005"+
		"h\u0000\u0000\u0149\u014a\u0005t\u0000\u0000\u014aP\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0005l\u0000\u0000\u014c\u014d\u0005e\u0000\u0000\u014d"+
		"\u014e\u0005f\u0000\u0000\u014e\u014f\u0005t\u0000\u0000\u014fR\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0005b\u0000\u0000\u0151\u0152\u0005o\u0000"+
		"\u0000\u0152\u0153\u0005t\u0000\u0000\u0153\u0154\u0005t\u0000\u0000\u0154"+
		"\u0155\u0005o\u0000\u0000\u0155\u0156\u0005m\u0000\u0000\u0156T\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0005f\u0000\u0000\u0158\u0159\u0005l\u0000"+
		"\u0000\u0159\u015a\u0005e\u0000\u0000\u015a\u015b\u0005x\u0000\u0000\u015b"+
		"V\u0001\u0000\u0000\u0000\u015c\u015d\u0005f\u0000\u0000\u015d\u015e\u0005"+
		"l\u0000\u0000\u015e\u015f\u0005e\u0000\u0000\u015f\u0160\u0005x\u0000"+
		"\u0000\u0160\u0161\u0005-\u0000\u0000\u0161\u0162\u0005c\u0000\u0000\u0162"+
		"\u0163\u0005o\u0000\u0000\u0163\u0164\u0005l\u0000\u0000\u0164X\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0005f\u0000\u0000\u0166\u0167\u0005l\u0000"+
		"\u0000\u0167\u0168\u0005e\u0000\u0000\u0168\u0169\u0005x\u0000\u0000\u0169"+
		"\u016a\u0005-\u0000\u0000\u016a\u016b\u0005r\u0000\u0000\u016b\u016c\u0005"+
		"o\u0000\u0000\u016c\u016d\u0005w\u0000\u0000\u016dZ\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0005j\u0000\u0000\u016f\u0170\u0005u\u0000\u0000\u0170"+
		"\u0171\u0005s\u0000\u0000\u0171\u0172\u0005t\u0000\u0000\u0172\u0173\u0005"+
		"i\u0000\u0000\u0173\u0174\u0005f\u0000\u0000\u0174\u0175\u0005y\u0000"+
		"\u0000\u0175\u0176\u0005-\u0000\u0000\u0176\u0177\u0005c\u0000\u0000\u0177"+
		"\u0178\u0005e\u0000\u0000\u0178\u0179\u0005n\u0000\u0000\u0179\u017a\u0005"+
		"t\u0000\u0000\u017a\u017b\u0005e\u0000\u0000\u017b\u017c\u0005r\u0000"+
		"\u0000\u017c\\\u0001\u0000\u0000\u0000\u017d\u017e\u0005j\u0000\u0000"+
		"\u017e\u017f\u0005u\u0000\u0000\u017f\u0180\u0005s\u0000\u0000\u0180\u0181"+
		"\u0005t\u0000\u0000\u0181\u0182\u0005i\u0000\u0000\u0182\u0183\u0005f"+
		"\u0000\u0000\u0183\u0184\u0005y\u0000\u0000\u0184\u0185\u0005-\u0000\u0000"+
		"\u0185\u0186\u0005s\u0000\u0000\u0186\u0187\u0005t\u0000\u0000\u0187\u0188"+
		"\u0005a\u0000\u0000\u0188\u0189\u0005r\u0000\u0000\u0189\u018a\u0005t"+
		"\u0000\u0000\u018a^\u0001\u0000\u0000\u0000\u018b\u018c\u0005j\u0000\u0000"+
		"\u018c\u018d\u0005u\u0000\u0000\u018d\u018e\u0005s\u0000\u0000\u018e\u018f"+
		"\u0005t\u0000\u0000\u018f\u0190\u0005i\u0000\u0000\u0190\u0191\u0005f"+
		"\u0000\u0000\u0191\u0192\u0005y\u0000\u0000\u0192\u0193\u0005-\u0000\u0000"+
		"\u0193\u0194\u0005e\u0000\u0000\u0194\u0195\u0005n\u0000\u0000\u0195\u0196"+
		"\u0005d\u0000\u0000\u0196`\u0001\u0000\u0000\u0000\u0197\u0198\u0005j"+
		"\u0000\u0000\u0198\u0199\u0005u\u0000\u0000\u0199\u019a\u0005s\u0000\u0000"+
		"\u019a\u019b\u0005t\u0000\u0000\u019b\u019c\u0005i\u0000\u0000\u019c\u019d"+
		"\u0005f\u0000\u0000\u019d\u019e\u0005y\u0000\u0000\u019e\u019f\u0005-"+
		"\u0000\u0000\u019f\u01a0\u0005a\u0000\u0000\u01a0\u01a1\u0005r\u0000\u0000"+
		"\u01a1\u01a2\u0005o\u0000\u0000\u01a2\u01a3\u0005u\u0000\u0000\u01a3\u01a4"+
		"\u0005n\u0000\u0000\u01a4\u01a5\u0005d\u0000\u0000\u01a5b\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0005j\u0000\u0000\u01a7\u01a8\u0005u\u0000\u0000"+
		"\u01a8\u01a9\u0005s\u0000\u0000\u01a9\u01aa\u0005t\u0000\u0000\u01aa\u01ab"+
		"\u0005i\u0000\u0000\u01ab\u01ac\u0005f\u0000\u0000\u01ac\u01ad\u0005y"+
		"\u0000\u0000\u01ad\u01ae\u0005-\u0000\u0000\u01ae\u01af\u0005e\u0000\u0000"+
		"\u01af\u01b0\u0005v\u0000\u0000\u01b0\u01b1\u0005e\u0000\u0000\u01b1\u01b2"+
		"\u0005n\u0000\u0000\u01b2\u01b3\u0005l\u0000\u0000\u01b3\u01b4\u0005y"+
		"\u0000\u0000\u01b4d\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005j\u0000\u0000"+
		"\u01b6\u01b7\u0005u\u0000\u0000\u01b7\u01b8\u0005s\u0000\u0000\u01b8\u01b9"+
		"\u0005t\u0000\u0000\u01b9\u01ba\u0005i\u0000\u0000\u01ba\u01bb\u0005f"+
		"\u0000\u0000\u01bb\u01bc\u0005y\u0000\u0000\u01bc\u01bd\u0005-\u0000\u0000"+
		"\u01bd\u01be\u0005b\u0000\u0000\u01be\u01bf\u0005e\u0000\u0000\u01bf\u01c0"+
		"\u0005t\u0000\u0000\u01c0\u01c1\u0005w\u0000\u0000\u01c1\u01c2\u0005e"+
		"\u0000\u0000\u01c2\u01c3\u0005e\u0000\u0000\u01c3\u01c4\u0005n\u0000\u0000"+
		"\u01c4f\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005g\u0000\u0000\u01c6\u01c7"+
		"\u0005a\u0000\u0000\u01c7\u01c8\u0005p\u0000\u0000\u01c8h\u0001\u0000"+
		"\u0000\u0000\u01c9\u01ca\u0005b\u0000\u0000\u01ca\u01cb\u0005o\u0000\u0000"+
		"\u01cb\u01cc\u0005r\u0000\u0000\u01cc\u01cd\u0005d\u0000\u0000\u01cd\u01ce"+
		"\u0005e\u0000\u0000\u01ce\u01cf\u0005r\u0000\u0000\u01cfj\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d1\u0005b\u0000\u0000\u01d1\u01d2\u0005o\u0000\u0000"+
		"\u01d2\u01d3\u0005r\u0000\u0000\u01d3\u01d4\u0005d\u0000\u0000\u01d4\u01d5"+
		"\u0005e\u0000\u0000\u01d5\u01d6\u0005r\u0000\u0000\u01d6\u01d7\u0005-"+
		"\u0000\u0000\u01d7\u01d8\u0005b\u0000\u0000\u01d8l\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0005r\u0000\u0000\u01da\u01db\u0005o\u0000\u0000\u01db\u01dc"+
		"\u0005u\u0000\u0000\u01dc\u01dd\u0005n\u0000\u0000\u01dd\u01de\u0005d"+
		"\u0000\u0000\u01de\u01df\u0005e\u0000\u0000\u01df\u01e0\u0005d\u0000\u0000"+
		"\u01e0\u01e1\u0005-\u0000\u0000\u01e1\u01e2\u0005s\u0000\u0000\u01e2\u01e3"+
		"\u0005m\u0000\u0000\u01e3n\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005r"+
		"\u0000\u0000\u01e5\u01e6\u0005o\u0000\u0000\u01e6\u01e7\u0005u\u0000\u0000"+
		"\u01e7\u01e8\u0005n\u0000\u0000\u01e8\u01e9\u0005d\u0000\u0000\u01e9\u01ea"+
		"\u0005e\u0000\u0000\u01ea\u01eb\u0005d\u0000\u0000\u01eb\u01ec\u0005-"+
		"\u0000\u0000\u01ec\u01ed\u0005m\u0000\u0000\u01ed\u01ee\u0005d\u0000\u0000"+
		"\u01eep\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005r\u0000\u0000\u01f0\u01f1"+
		"\u0005o\u0000\u0000\u01f1\u01f2\u0005u\u0000\u0000\u01f2\u01f3\u0005n"+
		"\u0000\u0000\u01f3\u01f4\u0005d\u0000\u0000\u01f4\u01f5\u0005e\u0000\u0000"+
		"\u01f5\u01f6\u0005d\u0000\u0000\u01f6\u01f7\u0005-\u0000\u0000\u01f7\u01f8"+
		"\u0005l\u0000\u0000\u01f8\u01f9\u0005g\u0000\u0000\u01f9r\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0005r\u0000\u0000\u01fb\u01fc\u0005o\u0000\u0000"+
		"\u01fc\u01fd\u0005u\u0000\u0000\u01fd\u01fe\u0005n\u0000\u0000\u01fe\u01ff"+
		"\u0005d\u0000\u0000\u01ff\u0200\u0005e\u0000\u0000\u0200\u0201\u0005d"+
		"\u0000\u0000\u0201\u0202\u0005-\u0000\u0000\u0202\u0203\u0005x\u0000\u0000"+
		"\u0203\u0204\u0005l\u0000\u0000\u0204t\u0001\u0000\u0000\u0000\u0205\u0206"+
		"\u0005r\u0000\u0000\u0206\u0207\u0005o\u0000\u0000\u0207\u0208\u0005u"+
		"\u0000\u0000\u0208\u0209\u0005n\u0000\u0000\u0209\u020a\u0005d\u0000\u0000"+
		"\u020a\u020b\u0005e\u0000\u0000\u020b\u020c\u0005d\u0000\u0000\u020c\u020d"+
		"\u0005-\u0000\u0000\u020d\u020e\u00052\u0000\u0000\u020e\u020f\u0005x"+
		"\u0000\u0000\u020f\u0210\u0005l\u0000\u0000\u0210v\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0005r\u0000\u0000\u0212\u0213\u0005o\u0000\u0000\u0213\u0214"+
		"\u0005u\u0000\u0000\u0214\u0215\u0005n\u0000\u0000\u0215\u0216\u0005d"+
		"\u0000\u0000\u0216\u0217\u0005e\u0000\u0000\u0217\u0218\u0005d\u0000\u0000"+
		"\u0218\u0219\u0005-\u0000\u0000\u0219\u021a\u00053\u0000\u0000\u021a\u021b"+
		"\u0005x\u0000\u0000\u021b\u021c\u0005l\u0000\u0000\u021cx\u0001\u0000"+
		"\u0000\u0000\u021d\u021e\u0005r\u0000\u0000\u021e\u021f\u0005o\u0000\u0000"+
		"\u021f\u0220\u0005u\u0000\u0000\u0220\u0221\u0005n\u0000\u0000\u0221\u0222"+
		"\u0005d\u0000\u0000\u0222\u0223\u0005e\u0000\u0000\u0223\u0224\u0005d"+
		"\u0000\u0000\u0224\u0225\u0005-\u0000\u0000\u0225\u0226\u0005f\u0000\u0000"+
		"\u0226\u0227\u0005u\u0000\u0000\u0227\u0228\u0005l\u0000\u0000\u0228\u0229"+
		"\u0005l\u0000\u0000\u0229z\u0001\u0000\u0000\u0000\u022a\u022b\u0005c"+
		"\u0000\u0000\u022b\u022c\u0005u\u0000\u0000\u022c\u022d\u0005r\u0000\u0000"+
		"\u022d\u022e\u0005s\u0000\u0000\u022e\u022f\u0005o\u0000\u0000\u022f\u0230"+
		"\u0005r\u0000\u0000\u0230\u0231\u0005-\u0000\u0000\u0231\u0232\u0005p"+
		"\u0000\u0000\u0232\u0233\u0005o\u0000\u0000\u0233\u0234\u0005i\u0000\u0000"+
		"\u0234\u0235\u0005n\u0000\u0000\u0235\u0236\u0005t\u0000\u0000\u0236\u0237"+
		"\u0005e\u0000\u0000\u0237\u0238\u0005r\u0000\u0000\u0238|\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0005m\u0000\u0000\u023a~\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0005m\u0000\u0000\u023c\u023d\u0005-\u0000\u0000\u023d\u023e"+
		"\u0005a\u0000\u0000\u023e\u023f\u0005u\u0000\u0000\u023f\u0240\u0005t"+
		"\u0000\u0000\u0240\u0241\u0005o\u0000\u0000\u0241\u0080\u0001\u0000\u0000"+
		"\u0000\u0242\u0243\u0005t\u0000\u0000\u0243\u0244\u0005e\u0000\u0000\u0244"+
		"\u0245\u0005x\u0000\u0000\u0245\u0246\u0005t\u0000\u0000\u0246\u0082\u0001"+
		"\u0000\u0000\u0000\u0247\u0248\u0005t\u0000\u0000\u0248\u0249\u0005e\u0000"+
		"\u0000\u0249\u024a\u0005x\u0000\u0000\u024a\u024b\u0005t\u0000\u0000\u024b"+
		"\u024c\u0005-\u0000\u0000\u024c\u024d\u0005s\u0000\u0000\u024d\u024e\u0005"+
		"m\u0000\u0000\u024e\u0084\u0001\u0000\u0000\u0000\u024f\u0250\u0005t\u0000"+
		"\u0000\u0250\u0251\u0005e\u0000\u0000\u0251\u0252\u0005x\u0000\u0000\u0252"+
		"\u0253\u0005t\u0000\u0000\u0253\u0254\u0005-\u0000\u0000\u0254\u0255\u0005"+
		"l\u0000\u0000\u0255\u0256\u0005g\u0000\u0000\u0256\u0086\u0001\u0000\u0000"+
		"\u0000\u0257\u0258\u0005t\u0000\u0000\u0258\u0259\u0005e\u0000\u0000\u0259"+
		"\u025a\u0005x\u0000\u0000\u025a\u025b\u0005t\u0000\u0000\u025b\u025c\u0005"+
		"-\u0000\u0000\u025c\u025d\u0005x\u0000\u0000\u025d\u025e\u0005l\u0000"+
		"\u0000\u025e\u0088\u0001\u0000\u0000\u0000\u025f\u0260\u0005t\u0000\u0000"+
		"\u0260\u0261\u0005e\u0000\u0000\u0261\u0262\u0005x\u0000\u0000\u0262\u0263"+
		"\u0005t\u0000\u0000\u0263\u0264\u0005-\u0000\u0000\u0264\u0265\u00052"+
		"\u0000\u0000\u0265\u0266\u0005x\u0000\u0000\u0266\u0267\u0005l\u0000\u0000"+
		"\u0267\u008a\u0001\u0000\u0000\u0000\u0268\u0269\u0005t\u0000\u0000\u0269"+
		"\u026a\u0005e\u0000\u0000\u026a\u026b\u0005x\u0000\u0000\u026b\u026c\u0005"+
		"t\u0000\u0000\u026c\u026d\u0005-\u0000\u0000\u026d\u026e\u00053\u0000"+
		"\u0000\u026e\u026f\u0005x\u0000\u0000\u026f\u0270\u0005l\u0000\u0000\u0270"+
		"\u008c\u0001\u0000\u0000\u0000\u0271\u0272\u0005f\u0000\u0000\u0272\u0273"+
		"\u0005o\u0000\u0000\u0273\u0274\u0005n\u0000\u0000\u0274\u0275\u0005t"+
		"\u0000\u0000\u0275\u0276\u0005-\u0000\u0000\u0276\u0277\u0005b\u0000\u0000"+
		"\u0277\u0278\u0005o\u0000\u0000\u0278\u0279\u0005l\u0000\u0000\u0279\u027a"+
		"\u0005d\u0000\u0000\u027a\u008e\u0001\u0000\u0000\u0000\u027b\u027c\u0005"+
		"f\u0000\u0000\u027c\u027d\u0005o\u0000\u0000\u027d\u027e\u0005n\u0000"+
		"\u0000\u027e\u027f\u0005t\u0000\u0000\u027f\u0280\u0005-\u0000\u0000\u0280"+
		"\u0281\u0005m\u0000\u0000\u0281\u0282\u0005e\u0000\u0000\u0282\u0283\u0005"+
		"d\u0000\u0000\u0283\u0284\u0005i\u0000\u0000\u0284\u0285\u0005u\u0000"+
		"\u0000\u0285\u0286\u0005m\u0000\u0000\u0286\u0090\u0001\u0000\u0000\u0000"+
		"\u0287\u0288\u0005w\u0000\u0000\u0288\u0092\u0001\u0000\u0000\u0000\u0289"+
		"\u028a\u0005h\u0000\u0000\u028a\u0094\u0001\u0000\u0000\u0000\u028b\u028f"+
		"\u0007\u0000\u0000\u0000\u028c\u028e\u0007\u0001\u0000\u0000\u028d\u028c"+
		"\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d"+
		"\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0096"+
		"\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0296"+
		"\u0005\"\u0000\u0000\u0293\u0295\b\u0002\u0000\u0000\u0294\u0293\u0001"+
		"\u0000\u0000\u0000\u0295\u0298\u0001\u0000\u0000\u0000\u0296\u0294\u0001"+
		"\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0299\u0001"+
		"\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0299\u029a\u0005"+
		"\"\u0000\u0000\u029a\u0098\u0001\u0000\u0000\u0000\u029b\u029d\u0007\u0003"+
		"\u0000\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000"+
		"\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000"+
		"\u0000\u0000\u029f\u009a\u0001\u0000\u0000\u0000\u02a0\u02a2\u0007\u0004"+
		"\u0000\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a6\u0006M\u0000"+
		"\u0000\u02a6\u009c\u0001\u0000\u0000\u0000\u0005\u0000\u028f\u0296\u029e"+
		"\u02a3\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}