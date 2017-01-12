package antlr;
// Generated from Bunch.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BunchParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, LABEL=6;
	public static final String[] tokenNames = {
		"<INVALID>", "'= '", "' '", "') '", "'SS('", "','", "LABEL"
	};
	public static final int
		RULE_arquivo = 0, RULE_line = 1, RULE_modulo = 2, RULE_submodulo = 3;
	public static final String[] ruleNames = {
		"arquivo", "line", "modulo", "submodulo"
	};

	@Override
	public String getGrammarFileName() { return "Bunch.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BunchParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ArquivoContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ArquivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arquivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BunchListener ) ((BunchListener)listener).enterArquivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BunchListener ) ((BunchListener)listener).exitArquivo(this);
		}
	}

	public final ArquivoContext arquivo() throws RecognitionException {
		ArquivoContext _localctx = new ArquivoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arquivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8); line();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__3) | (1L << T__1))) != 0) );
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

	public static class LineContext extends ParserRuleContext {
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public SubmoduloContext submodulo() {
			return getRuleContext(SubmoduloContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BunchListener ) ((BunchListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BunchListener ) ((BunchListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(15);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(13); modulo();
				}
				break;
			case T__4:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(14); submodulo();
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

	public static class ModuloContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(BunchParser.LABEL, 0); }
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BunchListener ) ((BunchListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BunchListener ) ((BunchListener)listener).exitModulo(this);
		}
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); match(T__1);
			setState(18); match(LABEL);
			setState(19); match(T__2);
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

	public static class SubmoduloContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(BunchParser.LABEL, 0); }
		public SubmoduloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_submodulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BunchListener ) ((BunchListener)listener).enterSubmodulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BunchListener ) ((BunchListener)listener).exitSubmodulo(this);
		}
	}

	public final SubmoduloContext submodulo() throws RecognitionException {
		SubmoduloContext _localctx = new SubmoduloContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_submodulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(22); match(LABEL);
			setState(24);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(23); match(T__0);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b\35\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\3\3\3\5\3\22\n\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\5\5\33\n\5\3\5\2\2\6\2\4\6\b\2\3\3\2\3\4\33\2\13"+
		"\3\2\2\2\4\21\3\2\2\2\6\23\3\2\2\2\b\27\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2"+
		"\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\22\5\6\4\2\20"+
		"\22\5\b\5\2\21\17\3\2\2\2\21\20\3\2\2\2\22\5\3\2\2\2\23\24\7\6\2\2\24"+
		"\25\7\b\2\2\25\26\7\5\2\2\26\7\3\2\2\2\27\30\t\2\2\2\30\32\7\b\2\2\31"+
		"\33\7\7\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33\t\3\2\2\2\5\r\21\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}