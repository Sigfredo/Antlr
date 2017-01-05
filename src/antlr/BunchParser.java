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
		NOME=1, SUBMODULO=2;
	public static final String[] tokenNames = {
		"<INVALID>", "NOME", "SUBMODULO"
	};
	public static final int
		RULE_modulo = 0, RULE_nomeModulo = 1, RULE_nomeSubmodulo = 2;
	public static final String[] ruleNames = {
		"modulo", "nomeModulo", "nomeSubmodulo"
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
	public static class ModuloContext extends ParserRuleContext {
		public NomeModuloContext nomeModulo() {
			return getRuleContext(NomeModuloContext.class,0);
		}
		public NomeSubmoduloContext nomeSubmodulo() {
			return getRuleContext(NomeSubmoduloContext.class,0);
		}
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
		enterRule(_localctx, 0, RULE_modulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); nomeModulo();
			setState(7); nomeSubmodulo();
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

	public static class NomeModuloContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(BunchParser.NOME, 0); }
		public NomeModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeModulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BunchListener ) ((BunchListener)listener).enterNomeModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BunchListener ) ((BunchListener)listener).exitNomeModulo(this);
		}
	}

	public final NomeModuloContext nomeModulo() throws RecognitionException {
		NomeModuloContext _localctx = new NomeModuloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nomeModulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); match(NOME);
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

	public static class NomeSubmoduloContext extends ParserRuleContext {
		public TerminalNode SUBMODULO() { return getToken(BunchParser.SUBMODULO, 0); }
		public NomeSubmoduloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeSubmodulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BunchListener ) ((BunchListener)listener).enterNomeSubmodulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BunchListener ) ((BunchListener)listener).exitNomeSubmodulo(this);
		}
	}

	public final NomeSubmoduloContext nomeSubmodulo() throws RecognitionException {
		NomeSubmoduloContext _localctx = new NomeSubmoduloContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nomeSubmodulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); match(SUBMODULO);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\4\20\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\2\2\5\2\4\6\2\2\f\2\b\3\2"+
		"\2\2\4\13\3\2\2\2\6\r\3\2\2\2\b\t\5\4\3\2\t\n\5\6\4\2\n\3\3\2\2\2\13\f"+
		"\7\3\2\2\f\5\3\2\2\2\r\16\7\4\2\2\16\7\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}