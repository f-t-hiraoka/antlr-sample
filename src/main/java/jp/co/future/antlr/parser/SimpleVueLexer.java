// Generated from jp\co\future\antlr\parser\SimpleVueLexer.g4 by ANTLR 4.8
package jp.co.future.antlr.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleVueLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HtmlComment=1, WhiteSpaces=2, LineTerminator=3, TemplateOpen=4, ScriptOpen=5, 
		StyleOpen=6, CommentInTemplate=7, TemplateClose=8, MultiLineComment=9, 
		SingleLineComment=10, ScriptClose=11, ScriptText=12, CommentInStyle=13, 
		StyleClose=14;
	public static final int
		TEMPLATE=1, SCRIPT=2, STYLE=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TEMPLATE", "SCRIPT", "STYLE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HtmlComment", "WhiteSpaces", "LineTerminator", "TemplateOpen", "ScriptOpen", 
			"StyleOpen", "CommentInTemplate", "TemplateClose", "MultiLineComment", 
			"SingleLineComment", "ScriptClose", "ScriptText", "CommentInStyle", "StyleClose"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'</script>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HtmlComment", "WhiteSpaces", "LineTerminator", "TemplateOpen", 
			"ScriptOpen", "StyleOpen", "CommentInTemplate", "TemplateClose", "MultiLineComment", 
			"SingleLineComment", "ScriptClose", "ScriptText", "CommentInStyle", "StyleClose"
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


	public SimpleVueLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleVueLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00e6\b\1\b\1"+
		"\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3\65"+
		"\n\3\r\3\16\3\66\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\7\t\u0088\n\t\f\t\16\t\u008b\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u009f\n\n\f\n\16\n\u00a2"+
		"\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\6\r\u00c1\n\r\r\r\16\r\u00c2\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00cb"+
		"\n\16\f\16\16\16\u00ce\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\7\17\u00d7"+
		"\n\17\f\17\16\17\u00da\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\t*K]n}\u00a0\u00cc\2\20\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24"+
		"\n\26\13\30\f\32\r\34\16\36\17 \20\6\2\3\4\5\7\6\2\13\13\r\16\"\"\u00a2"+
		"\u00a2\5\2\f\f\17\17\u202a\u202b\4\2\61\61>>\3\2\61\61\4\2,,\61\61\2\u00f0"+
		"\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2"+
		"\2\2\3\22\3\2\2\2\3\24\3\2\2\2\4\26\3\2\2\2\4\30\3\2\2\2\4\32\3\2\2\2"+
		"\4\34\3\2\2\2\5\36\3\2\2\2\5 \3\2\2\2\6\"\3\2\2\2\b\64\3\2\2\2\n:\3\2"+
		"\2\2\f>\3\2\2\2\16R\3\2\2\2\20d\3\2\2\2\22u\3\2\2\2\24\u0089\3\2\2\2\26"+
		"\u009a\3\2\2\2\30\u00a6\3\2\2\2\32\u00af\3\2\2\2\34\u00c0\3\2\2\2\36\u00c4"+
		"\3\2\2\2 \u00d8\3\2\2\2\"#\7>\2\2#$\7#\2\2$%\7/\2\2%&\7/\2\2&*\3\2\2\2"+
		"\')\13\2\2\2(\'\3\2\2\2),\3\2\2\2*+\3\2\2\2*(\3\2\2\2+-\3\2\2\2,*\3\2"+
		"\2\2-.\7/\2\2./\7/\2\2/\60\7@\2\2\60\61\3\2\2\2\61\62\b\2\2\2\62\7\3\2"+
		"\2\2\63\65\t\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2"+
		"\2\2\678\3\2\2\289\b\3\2\29\t\3\2\2\2:;\t\3\2\2;<\3\2\2\2<=\b\4\2\2=\13"+
		"\3\2\2\2>?\7>\2\2?@\7v\2\2@A\7g\2\2AB\7o\2\2BC\7r\2\2CD\7n\2\2DE\7c\2"+
		"\2EF\7v\2\2FG\7g\2\2GK\3\2\2\2HJ\13\2\2\2IH\3\2\2\2JM\3\2\2\2KL\3\2\2"+
		"\2KI\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7@\2\2OP\3\2\2\2PQ\b\5\3\2Q\r\3\2\2"+
		"\2RS\7>\2\2ST\7u\2\2TU\7e\2\2UV\7t\2\2VW\7k\2\2WX\7r\2\2XY\7v\2\2Y]\3"+
		"\2\2\2Z\\\13\2\2\2[Z\3\2\2\2\\_\3\2\2\2]^\3\2\2\2][\3\2\2\2^`\3\2\2\2"+
		"_]\3\2\2\2`a\7@\2\2ab\3\2\2\2bc\b\6\4\2c\17\3\2\2\2de\7>\2\2ef\7u\2\2"+
		"fg\7v\2\2gh\7{\2\2hi\7n\2\2ij\7g\2\2jn\3\2\2\2km\13\2\2\2lk\3\2\2\2mp"+
		"\3\2\2\2no\3\2\2\2nl\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7@\2\2rs\3\2\2\2st"+
		"\b\7\5\2t\21\3\2\2\2uv\7>\2\2vw\7#\2\2wx\7/\2\2xy\7/\2\2y}\3\2\2\2z|\13"+
		"\2\2\2{z\3\2\2\2|\177\3\2\2\2}~\3\2\2\2}{\3\2\2\2~\u0080\3\2\2\2\177}"+
		"\3\2\2\2\u0080\u0081\7/\2\2\u0081\u0082\7/\2\2\u0082\u0083\7@\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\b\b\2\2\u0085\23\3\2\2\2\u0086\u0088\13\2\2"+
		"\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7>\2\2\u008d"+
		"\u008e\7\61\2\2\u008e\u008f\7v\2\2\u008f\u0090\7g\2\2\u0090\u0091\7o\2"+
		"\2\u0091\u0092\7r\2\2\u0092\u0093\7n\2\2\u0093\u0094\7c\2\2\u0094\u0095"+
		"\7v\2\2\u0095\u0096\7g\2\2\u0096\u0097\7@\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\b\t\6\2\u0099\25\3\2\2\2\u009a\u009b\7\61\2\2\u009b\u009c\7,\2"+
		"\2\u009c\u00a0\3\2\2\2\u009d\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a5\7\61\2\2\u00a5"+
		"\27\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00ac\3\2"+
		"\2\2\u00a9\u00ab\n\3\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\31\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7\61\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3"+
		"\7e\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7r\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\u00b8\7@\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\f\6"+
		"\2\u00ba\33\3\2\2\2\u00bb\u00c1\n\4\2\2\u00bc\u00bd\7>\2\2\u00bd\u00c1"+
		"\n\5\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c1\n\6\2\2\u00c0\u00bb\3\2\2\2"+
		"\u00c0\u00bc\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\35\3\2\2\2\u00c4\u00c5\7>\2\2\u00c5"+
		"\u00c6\7#\2\2\u00c6\u00c7\7/\2\2\u00c7\u00c8\7/\2\2\u00c8\u00cc\3\2\2"+
		"\2\u00c9\u00cb\13\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\7/\2\2\u00d0\u00d1\7/\2\2\u00d1\u00d2\7@\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d4\b\16\2\2\u00d4\37\3\2\2\2\u00d5\u00d7\13\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7>\2\2\u00dc"+
		"\u00dd\7\61\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7{\2"+
		"\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7@\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\b\17\6\2\u00e5!\3\2\2\2\23\2\3\4\5*\66K]n}\u0089"+
		"\u00a0\u00ac\u00c0\u00c2\u00cc\u00d8\7\b\2\2\7\3\2\7\4\2\7\5\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}