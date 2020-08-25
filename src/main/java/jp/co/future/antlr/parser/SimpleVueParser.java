// Generated from jp\co\future\antlr\parser\SimpleVueParser.g4 by ANTLR 4.8
package jp.co.future.antlr.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleVueParser extends Parser {
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
		RULE_parse = 0, RULE_templateElement = 1, RULE_scriptElement = 2, RULE_scriptBody = 3, 
		RULE_styleElement = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "templateElement", "scriptElement", "scriptBody", "styleElement"
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

	@Override
	public String getGrammarFileName() { return "SimpleVueParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleVueParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public ScriptElementContext scriptElement() {
			return getRuleContext(ScriptElementContext.class,0);
		}
		public TemplateElementContext templateElement() {
			return getRuleContext(TemplateElementContext.class,0);
		}
		public StyleElementContext styleElement() {
			return getRuleContext(StyleElementContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVueParserListener ) ((SimpleVueParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVueParserListener ) ((SimpleVueParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVueParserVisitor ) return ((SimpleVueParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TemplateOpen) {
				{
				setState(10);
				templateElement();
				}
			}

			setState(13);
			scriptElement();
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StyleOpen) {
				{
				setState(14);
				styleElement();
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

	public static class TemplateElementContext extends ParserRuleContext {
		public TerminalNode TemplateOpen() { return getToken(SimpleVueParser.TemplateOpen, 0); }
		public TerminalNode TemplateClose() { return getToken(SimpleVueParser.TemplateClose, 0); }
		public TemplateElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVueParserListener ) ((SimpleVueParserListener)listener).enterTemplateElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVueParserListener ) ((SimpleVueParserListener)listener).exitTemplateElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVueParserVisitor ) return ((SimpleVueParserVisitor<? extends T>)visitor).visitTemplateElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateElementContext templateElement() throws RecognitionException {
		TemplateElementContext _localctx = new TemplateElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_templateElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(TemplateOpen);
			setState(18);
			match(TemplateClose);
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

	public static class ScriptElementContext extends ParserRuleContext {
		public TerminalNode ScriptOpen() { return getToken(SimpleVueParser.ScriptOpen, 0); }
		public ScriptBodyContext scriptBody() {
			return getRuleContext(ScriptBodyContext.class,0);
		}
		public TerminalNode ScriptClose() { return getToken(SimpleVueParser.ScriptClose, 0); }
		public ScriptElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVueParserListener ) ((SimpleVueParserListener)listener).enterScriptElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVueParserListener ) ((SimpleVueParserListener)listener).exitScriptElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVueParserVisitor ) return ((SimpleVueParserVisitor<? extends T>)visitor).visitScriptElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptElementContext scriptElement() throws RecognitionException {
		ScriptElementContext _localctx = new ScriptElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scriptElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(ScriptOpen);
			setState(21);
			scriptBody();
			setState(22);
			match(ScriptClose);
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

	public static class ScriptBodyContext extends ParserRuleContext {
		public List<TerminalNode> SingleLineComment() { return getTokens(SimpleVueParser.SingleLineComment); }
		public TerminalNode SingleLineComment(int i) {
			return getToken(SimpleVueParser.SingleLineComment, i);
		}
		public List<TerminalNode> MultiLineComment() { return getTokens(SimpleVueParser.MultiLineComment); }
		public TerminalNode MultiLineComment(int i) {
			return getToken(SimpleVueParser.MultiLineComment, i);
		}
		public List<TerminalNode> ScriptText() { return getTokens(SimpleVueParser.ScriptText); }
		public TerminalNode ScriptText(int i) {
			return getToken(SimpleVueParser.ScriptText, i);
		}
		public ScriptBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVueParserListener ) ((SimpleVueParserListener)listener).enterScriptBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVueParserListener ) ((SimpleVueParserListener)listener).exitScriptBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVueParserVisitor ) return ((SimpleVueParserVisitor<? extends T>)visitor).visitScriptBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptBodyContext scriptBody() throws RecognitionException {
		ScriptBodyContext _localctx = new ScriptBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scriptBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiLineComment) | (1L << SingleLineComment) | (1L << ScriptText))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiLineComment) | (1L << SingleLineComment) | (1L << ScriptText))) != 0) );
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

	public static class StyleElementContext extends ParserRuleContext {
		public TerminalNode StyleOpen() { return getToken(SimpleVueParser.StyleOpen, 0); }
		public TerminalNode StyleClose() { return getToken(SimpleVueParser.StyleClose, 0); }
		public StyleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVueParserListener ) ((SimpleVueParserListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVueParserListener ) ((SimpleVueParserListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVueParserVisitor ) return ((SimpleVueParserVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleElementContext styleElement() throws RecognitionException {
		StyleElementContext _localctx = new StyleElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_styleElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(StyleOpen);
			setState(30);
			match(StyleClose);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20#\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\5\2\16\n\2\3\2\3\2\5\2\22\n\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\6\5\34\n\5\r\5\16\5\35\3\6\3\6\3\6\3\6\2\2\7\2"+
		"\4\6\b\n\2\3\4\2\13\f\16\16\2 \2\r\3\2\2\2\4\23\3\2\2\2\6\26\3\2\2\2\b"+
		"\33\3\2\2\2\n\37\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\r\16\3\2\2\2\16\17\3"+
		"\2\2\2\17\21\5\6\4\2\20\22\5\n\6\2\21\20\3\2\2\2\21\22\3\2\2\2\22\3\3"+
		"\2\2\2\23\24\7\6\2\2\24\25\7\n\2\2\25\5\3\2\2\2\26\27\7\7\2\2\27\30\5"+
		"\b\5\2\30\31\7\r\2\2\31\7\3\2\2\2\32\34\t\2\2\2\33\32\3\2\2\2\34\35\3"+
		"\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\t\3\2\2\2\37 \7\b\2\2 !\7\20\2\2"+
		"!\13\3\2\2\2\5\r\21\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}