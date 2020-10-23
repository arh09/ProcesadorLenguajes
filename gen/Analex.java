// Generated from C:/Users/dioni/IdeaProjects/proyectoPL/src\Analex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Analex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, VARIABLES=4, VAR=5, DOS_PUNTOS=6, 
		PARENTESIS_ABIERTO=7, PARENTESIS_CERRADO=8, PyC=9, COMA=10, NUM=11, LOG=12, 
		SEQ=13, COMENTARIO_BLOQUE=14, COMENTARIO_LINEA=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "VARIABLES", "VAR", 
			"DOS_PUNTOS", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", "PyC", "COMA", 
			"NUM", "LOG", "SEQ", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'VARIABLES'", null, "':'", "'('", "')'", 
			"';'", "','", "'NUM'", "'LOG'", "'SEQ'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "VARIABLES", "VAR", "DOS_PUNTOS", 
			"PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", "PyC", "COMA", "NUM", "LOG", 
			"SEQ", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4/\n\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bF\n\b"+
		"\f\b\16\bI\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7"+
		"\21e\n\21\f\21\16\21h\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\7\22s\n\22\f\22\16\22v\13\22\3\22\3\22\3\22\3\22\4ft\2\23\3\3\5\4"+
		"\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20"+
		"#\21\3\2\4\3\2\62;\4\2C\\c|\2}\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\3%\3\2\2\2\5)\3\2\2\2\7.\3\2\2\2\t\64\3\2\2\2\13\66\3\2\2\2"+
		"\r8\3\2\2\2\17B\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27P\3\2\2"+
		"\2\31R\3\2\2\2\33T\3\2\2\2\35X\3\2\2\2\37\\\3\2\2\2!`\3\2\2\2#n\3\2\2"+
		"\2%&\7\"\2\2&\'\3\2\2\2\'(\b\2\2\2(\4\3\2\2\2)*\7\13\2\2*+\3\2\2\2+,\b"+
		"\3\2\2,\6\3\2\2\2-/\7\17\2\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\f"+
		"\2\2\61\62\3\2\2\2\62\63\b\4\2\2\63\b\3\2\2\2\64\65\t\2\2\2\65\n\3\2\2"+
		"\2\66\67\t\3\2\2\67\f\3\2\2\289\7X\2\29:\7C\2\2:;\7T\2\2;<\7K\2\2<=\7"+
		"C\2\2=>\7D\2\2>?\7N\2\2?@\7G\2\2@A\7U\2\2A\16\3\2\2\2BG\5\13\6\2CF\5\13"+
		"\6\2DF\5\t\5\2EC\3\2\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\20\3"+
		"\2\2\2IG\3\2\2\2JK\7<\2\2K\22\3\2\2\2LM\7*\2\2M\24\3\2\2\2NO\7+\2\2O\26"+
		"\3\2\2\2PQ\7=\2\2Q\30\3\2\2\2RS\7.\2\2S\32\3\2\2\2TU\7P\2\2UV\7W\2\2V"+
		"W\7O\2\2W\34\3\2\2\2XY\7N\2\2YZ\7Q\2\2Z[\7I\2\2[\36\3\2\2\2\\]\7U\2\2"+
		"]^\7G\2\2^_\7S\2\2_ \3\2\2\2`a\7\61\2\2ab\7,\2\2bf\3\2\2\2ce\13\2\2\2"+
		"dc\3\2\2\2eh\3\2\2\2fg\3\2\2\2fd\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7,\2\2"+
		"jk\7\61\2\2kl\3\2\2\2lm\b\21\2\2m\"\3\2\2\2no\7\61\2\2op\7\61\2\2pt\3"+
		"\2\2\2qs\13\2\2\2rq\3\2\2\2sv\3\2\2\2tu\3\2\2\2tr\3\2\2\2uw\3\2\2\2vt"+
		"\3\2\2\2wx\5\7\4\2xy\3\2\2\2yz\b\22\2\2z$\3\2\2\2\b\2.EGft\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}