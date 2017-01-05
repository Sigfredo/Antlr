package antlr;
// Generated from Bunch.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BunchLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOME=1, SUBMODULO=2;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'"
	};
	public static final String[] ruleNames = {
		"NOME", "SUBMODULO"
	};


	public BunchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bunch.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\4\33\b\1\4\2\t\2"+
		"\4\3\t\3\3\2\3\2\3\2\3\2\3\2\6\2\r\n\2\r\2\16\2\16\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\6\3\30\n\3\r\3\16\3\31\2\2\4\3\3\5\4\3\2\3\5\2\60\60c|~~\34\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\3\7\3\2\2\2\5\22\3\2\2\2\7\b\7U\2\2\b\t\7U\2\2"+
		"\t\n\7*\2\2\n\f\3\2\2\2\13\r\t\2\2\2\f\13\3\2\2\2\r\16\3\2\2\2\16\f\3"+
		"\2\2\2\16\17\3\2\2\2\17\20\3\2\2\2\20\21\7+\2\2\21\4\3\2\2\2\22\23\7\""+
		"\2\2\23\24\7?\2\2\24\25\7\"\2\2\25\27\3\2\2\2\26\30\t\2\2\2\27\26\3\2"+
		"\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\6\3\2\2\2\5\2\16\31"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}