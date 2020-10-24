// Generated from C:/Users/arubi/IdeaProjects/PL/proyectoPL/src\Analex.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, VARIABLES=4, FUNCION=5, PROCEDIMIENTO=6, 
		VAR=7, DOS_PUNTOS=8, PARENTESIS_ABIERTO=9, PARENTESIS_CERRADO=10, PyC=11, 
		COMA=12, NUM=13, LOG=14, SEQ=15, DEV=16, MAYOR=17, MENOR=18, MAYOR_QUE=19, 
		MENOR_QUE=20, VACIA=21, ULTIMAPOSICION=22, MAS=23, MENOS=24, POR=25, COMENTARIO_BLOQUE=26, 
		COMENTARIO_LINEA=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "VARIABLES", "FUNCION", 
			"PROCEDIMIENTO", "VAR", "DOS_PUNTOS", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", 
			"PyC", "COMA", "NUM", "LOG", "SEQ", "DEV", "MAYOR", "MENOR", "MAYOR_QUE", 
			"MENOR_QUE", "VACIA", "ULTIMAPOSICION", "MAS", "MENOS", "POR", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'VARIABLES'", "'FUNCION'", "'PROCEDIMIENTO'", 
			null, "':'", "'('", "')'", "';'", "','", "'NUM'", "'LOG'", "'SEQ'", "'DEV'", 
			"'MAYOR'", "'MENOR'", null, null, "'VACIA'", "'ULTIMAPOSICION'", "'+'", 
			"'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "VARIABLES", "FUNCION", "PROCEDIMIENTO", 
			"VAR", "DOS_PUNTOS", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", "PyC", 
			"COMA", "NUM", "LOG", "SEQ", "DEV", "MAYOR", "MENOR", "MAYOR_QUE", "MENOR_QUE", 
			"VACIA", "ULTIMAPOSICION", "MAS", "MENOS", "POR", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00f6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\5\4G\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nt"+
		"\n\n\f\n\16\nw\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u00ac"+
		"\n\26\r\26\16\26\u00ad\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\6\27\u00bd\n\27\r\27\16\27\u00be\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\7\35"+
		"\u00e0\n\35\f\35\16\35\u00e3\13\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\7\36\u00ee\n\36\f\36\16\36\u00f1\13\36\3\36\3\36\3\36\3\36"+
		"\4\u00e1\u00ef\2\37\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13"+
		"\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65"+
		"\32\67\339\34;\35\3\2\4\3\2\62;\3\2c|\2\u00fc\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5A\3\2\2\2\7F\3\2\2\2\tL\3\2\2\2"+
		"\13N\3\2\2\2\rP\3\2\2\2\17Z\3\2\2\2\21b\3\2\2\2\23p\3\2\2\2\25x\3\2\2"+
		"\2\27z\3\2\2\2\31|\3\2\2\2\33~\3\2\2\2\35\u0080\3\2\2\2\37\u0082\3\2\2"+
		"\2!\u0086\3\2\2\2#\u008a\3\2\2\2%\u008e\3\2\2\2\'\u0092\3\2\2\2)\u0098"+
		"\3\2\2\2+\u009e\3\2\2\2-\u00af\3\2\2\2/\u00c0\3\2\2\2\61\u00c6\3\2\2\2"+
		"\63\u00d5\3\2\2\2\65\u00d7\3\2\2\2\67\u00d9\3\2\2\29\u00db\3\2\2\2;\u00e9"+
		"\3\2\2\2=>\7\"\2\2>?\3\2\2\2?@\b\2\2\2@\4\3\2\2\2AB\7\13\2\2BC\3\2\2\2"+
		"CD\b\3\2\2D\6\3\2\2\2EG\7\17\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\f\2"+
		"\2IJ\3\2\2\2JK\b\4\2\2K\b\3\2\2\2LM\t\2\2\2M\n\3\2\2\2NO\t\3\2\2O\f\3"+
		"\2\2\2PQ\7X\2\2QR\7C\2\2RS\7T\2\2ST\7K\2\2TU\7C\2\2UV\7D\2\2VW\7N\2\2"+
		"WX\7G\2\2XY\7U\2\2Y\16\3\2\2\2Z[\7H\2\2[\\\7W\2\2\\]\7P\2\2]^\7E\2\2^"+
		"_\7K\2\2_`\7Q\2\2`a\7P\2\2a\20\3\2\2\2bc\7R\2\2cd\7T\2\2de\7Q\2\2ef\7"+
		"E\2\2fg\7G\2\2gh\7F\2\2hi\7K\2\2ij\7O\2\2jk\7K\2\2kl\7G\2\2lm\7P\2\2m"+
		"n\7V\2\2no\7Q\2\2o\22\3\2\2\2pu\5\13\6\2qt\5\13\6\2rt\5\t\5\2sq\3\2\2"+
		"\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\24\3\2\2\2wu\3\2\2\2xy\7<"+
		"\2\2y\26\3\2\2\2z{\7*\2\2{\30\3\2\2\2|}\7+\2\2}\32\3\2\2\2~\177\7=\2\2"+
		"\177\34\3\2\2\2\u0080\u0081\7.\2\2\u0081\36\3\2\2\2\u0082\u0083\7P\2\2"+
		"\u0083\u0084\7W\2\2\u0084\u0085\7O\2\2\u0085 \3\2\2\2\u0086\u0087\7N\2"+
		"\2\u0087\u0088\7Q\2\2\u0088\u0089\7I\2\2\u0089\"\3\2\2\2\u008a\u008b\7"+
		"U\2\2\u008b\u008c\7G\2\2\u008c\u008d\7S\2\2\u008d$\3\2\2\2\u008e\u008f"+
		"\7F\2\2\u008f\u0090\7G\2\2\u0090\u0091\7X\2\2\u0091&\3\2\2\2\u0092\u0093"+
		"\7O\2\2\u0093\u0094\7C\2\2\u0094\u0095\7[\2\2\u0095\u0096\7Q\2\2\u0096"+
		"\u0097\7T\2\2\u0097(\3\2\2\2\u0098\u0099\7O\2\2\u0099\u009a\7G\2\2\u009a"+
		"\u009b\7P\2\2\u009b\u009c\7Q\2\2\u009c\u009d\7T\2\2\u009d*\3\2\2\2\u009e"+
		"\u009f\7O\2\2\u009f\u00a0\7C\2\2\u00a0\u00a1\7[\2\2\u00a1\u00a2\7Q\2\2"+
		"\u00a2\u00a3\7T\2\2\u00a3\u00a4\7a\2\2\u00a4\u00a5\7S\2\2\u00a5\u00a6"+
		"\7W\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8\7a\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00ac\5\13\6\2\u00aa\u00ac\5\t\5\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		",\3\2\2\2\u00af\u00b0\7O\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2\7P\2\2\u00b2"+
		"\u00b3\7Q\2\2\u00b3\u00b4\7T\2\2\u00b4\u00b5\7a\2\2\u00b5\u00b6\7S\2\2"+
		"\u00b6\u00b7\7W\2\2\u00b7\u00b8\7G\2\2\u00b8\u00b9\7a\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00bd\5\13\6\2\u00bb\u00bd\5\t\5\2\u00bc\u00ba\3\2\2\2"+
		"\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7X\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3"+
		"\7E\2\2\u00c3\u00c4\7K\2\2\u00c4\u00c5\7C\2\2\u00c5\60\3\2\2\2\u00c6\u00c7"+
		"\7W\2\2\u00c7\u00c8\7N\2\2\u00c8\u00c9\7V\2\2\u00c9\u00ca\7K\2\2\u00ca"+
		"\u00cb\7O\2\2\u00cb\u00cc\7C\2\2\u00cc\u00cd\7R\2\2\u00cd\u00ce\7Q\2\2"+
		"\u00ce\u00cf\7U\2\2\u00cf\u00d0\7K\2\2\u00d0\u00d1\7E\2\2\u00d1\u00d2"+
		"\7K\2\2\u00d2\u00d3\7Q\2\2\u00d3\u00d4\7P\2\2\u00d4\62\3\2\2\2\u00d5\u00d6"+
		"\7-\2\2\u00d6\64\3\2\2\2\u00d7\u00d8\7/\2\2\u00d8\66\3\2\2\2\u00d9\u00da"+
		"\7,\2\2\u00da8\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc\u00dd\7,\2\2\u00dd\u00e1"+
		"\3\2\2\2\u00de\u00e0\13\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2"+
		"\u00e1\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\b\35\2\2\u00e8:\3\2\2\2\u00e9\u00ea\7\61\2\2\u00ea\u00eb\7\61\2"+
		"\2\u00eb\u00ef\3\2\2\2\u00ec\u00ee\13\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5\7\4\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\b\36\2\2\u00f5<\3\2\2\2\f\2Fsu\u00ab\u00ad\u00bc\u00be\u00e1\u00ef"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}