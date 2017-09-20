// Generated from D:/learn/����������/Calculator/src\Calculator.g4 by ANTLR 4.7
package out;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, MUL=6, DIV=7, ADD=8, SUB=9, ID=10, 
		INT=11, NEWLINE=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "MUL", "DIV", "ADD", "SUB", "ID", 
		"INT", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'print'", "'('", "')'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "ID", 
		"INT", "NEWLINE", "WS"
	};
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13\65\n\13\r\13"+
		"\16\13\66\3\13\7\13:\n\13\f\13\16\13=\13\13\3\f\5\f@\n\f\3\f\6\fC\n\f"+
		"\r\f\16\fD\3\f\5\fH\n\f\3\f\6\fK\n\f\r\f\16\fL\3\f\3\f\6\fQ\n\f\r\f\16"+
		"\fR\5\fU\n\f\3\r\5\rX\n\r\3\r\3\r\3\r\3\r\3\16\6\16_\n\16\r\16\16\16`"+
		"\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\3\2\5\4\2C\\c|\3\2\62;\4\2\13\13\"\"\2m\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3"+
		"\2\2\2\17-\3\2\2\2\21/\3\2\2\2\23\61\3\2\2\2\25\64\3\2\2\2\27T\3\2\2\2"+
		"\31W\3\2\2\2\33^\3\2\2\2\35\36\7=\2\2\36\4\3\2\2\2\37 \7?\2\2 \6\3\2\2"+
		"\2!\"\7r\2\2\"#\7t\2\2#$\7k\2\2$%\7p\2\2%&\7v\2\2&\b\3\2\2\2\'(\7*\2\2"+
		"(\n\3\2\2\2)*\7+\2\2*\f\3\2\2\2+,\7,\2\2,\16\3\2\2\2-.\7\61\2\2.\20\3"+
		"\2\2\2/\60\7-\2\2\60\22\3\2\2\2\61\62\7/\2\2\62\24\3\2\2\2\63\65\t\2\2"+
		"\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67;\3\2\2\2"+
		"8:\t\3\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\26\3\2\2\2=;\3\2\2"+
		"\2>@\7/\2\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2\2AC\t\3\2\2BA\3\2\2\2CD\3\2\2"+
		"\2DB\3\2\2\2DE\3\2\2\2EU\3\2\2\2FH\7/\2\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2"+
		"\2IK\t\3\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NP\7\60"+
		"\2\2OQ\t\3\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2T?\3\2"+
		"\2\2TG\3\2\2\2U\30\3\2\2\2VX\7\17\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ"+
		"\7\f\2\2Z[\3\2\2\2[\\\b\r\2\2\\\32\3\2\2\2]_\t\4\2\2^]\3\2\2\2_`\3\2\2"+
		"\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\16\2\2c\34\3\2\2\2\r\2\66;?DGLRT"+
		"W`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}