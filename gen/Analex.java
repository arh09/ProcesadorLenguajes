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
		INSTRUCCIONES=7, VAR=8, NUMERO=9, DOS_PUNTOS=10, PARENTESIS_ABIERTO=11, 
		PARENTESIS_CERRADO=12, PyC=13, COMA=14, NUM=15, LOG=16, SEQ=17, DEV=18, 
		MAYOR=19, MENOR=20, MAYOR_QUE=21, MENOR_QUE=22, SUMA=23, RESTA=24, MULT=25, 
		DIV=26, IGUAL=27, SI=28, FSI=29, MAYORQ=30, MENORQ=31, MAY=32, MEN=33, 
		DISTINTO=34, IGUALDAD=35, AND=36, OR=37, NEGACION=38, ENTONCES=39, CORCHETE_ABIERTO=40, 
		CORCHETE_CERRADO=41, SINO=42, MIENTRAS=43, HACER=44, FMIENTRAS=45, RUPTURA=46, 
		VACIA=47, ULTIMAPOSICION=48, COMENTARIO_BLOQUE=49, COMENTARIO_LINEA=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "VARIABLES", "FUNCION", 
			"PROCEDIMIENTO", "INSTRUCCIONES", "VAR", "NUMERO", "DOS_PUNTOS", "PARENTESIS_ABIERTO", 
			"PARENTESIS_CERRADO", "PyC", "COMA", "NUM", "LOG", "SEQ", "DEV", "MAYOR", 
			"MENOR", "MAYOR_QUE", "MENOR_QUE", "SUMA", "RESTA", "MULT", "DIV", "IGUAL", 
			"SI", "FSI", "MAYORQ", "MENORQ", "MAY", "MEN", "DISTINTO", "IGUALDAD", 
			"AND", "OR", "NEGACION", "ENTONCES", "CORCHETE_ABIERTO", "CORCHETE_CERRADO", 
			"SINO", "MIENTRAS", "HACER", "FMIENTRAS", "RUPTURA", "VACIA", "ULTIMAPOSICION", 
			"COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'VARIABLES'", "'FUNCION'", "'PROCEDIMIENTO'", 
			"'INSTRUCCIONES'", null, null, "':'", "'('", "')'", "';'", "','", "'NUM'", 
			"'LOG'", "'SEQ'", "'DEV'", "'MAYOR'", "'MENOR'", null, null, "'+'", "'-'", 
			"'*'", "'/'", "'='", "'SI'", "'FSI'", "'>='", "'<='", "'>'", "'<'", "'!='", 
			"'=='", "'&&'", "'||'", "'!'", "'ENTONCES'", "'['", "']'", "'SINO'", 
			"'MIENTRAS'", "'HACER'", "'FMIENTRAS'", "'RUPTURA'", "'VACIA'", "'ULTIMAPOSICION'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "VARIABLES", "FUNCION", "PROCEDIMIENTO", 
			"INSTRUCCIONES", "VAR", "NUMERO", "DOS_PUNTOS", "PARENTESIS_ABIERTO", 
			"PARENTESIS_CERRADO", "PyC", "COMA", "NUM", "LOG", "SEQ", "DEV", "MAYOR", 
			"MENOR", "MAYOR_QUE", "MENOR_QUE", "SUMA", "RESTA", "MULT", "DIV", "IGUAL", 
			"SI", "FSI", "MAYORQ", "MENORQ", "MAY", "MEN", "DISTINTO", "IGUALDAD", 
			"AND", "OR", "NEGACION", "ENTONCES", "CORCHETE_ABIERTO", "CORCHETE_CERRADO", 
			"SINO", "MIENTRAS", "HACER", "FMIENTRAS", "RUPTURA", "VACIA", "ULTIMAPOSICION", 
			"COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0190\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4u\n\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\7\13\u00b0\n\13\f\13\16\13\u00b3\13\13\3\f\5\f\u00b6\n\f\3"+
		"\f\6\f\u00b9\n\f\r\f\16\f\u00ba\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\6\30\u00f0\n\30\r\30\16\30\u00f1\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u0101\n\31\r\31\16\31\u0102\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3("+
		"\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u017a\n\64\f\64"+
		"\16\64\u017d\13\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0188"+
		"\n\65\f\65\16\65\u018b\13\65\3\65\3\65\3\65\3\65\4\u017b\u0189\2\66\3"+
		"\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36"+
		"?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64\3\2\4\3\2\62"+
		";\3\2c|\2\u0198\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5o\3\2\2\2\7t\3\2\2"+
		"\2\tz\3\2\2\2\13|\3\2\2\2\r~\3\2\2\2\17\u0088\3\2\2\2\21\u0090\3\2\2\2"+
		"\23\u009e\3\2\2\2\25\u00ac\3\2\2\2\27\u00b5\3\2\2\2\31\u00bc\3\2\2\2\33"+
		"\u00be\3\2\2\2\35\u00c0\3\2\2\2\37\u00c2\3\2\2\2!\u00c4\3\2\2\2#\u00c6"+
		"\3\2\2\2%\u00ca\3\2\2\2\'\u00ce\3\2\2\2)\u00d2\3\2\2\2+\u00d6\3\2\2\2"+
		"-\u00dc\3\2\2\2/\u00e2\3\2\2\2\61\u00f3\3\2\2\2\63\u0104\3\2\2\2\65\u0106"+
		"\3\2\2\2\67\u0108\3\2\2\29\u010a\3\2\2\2;\u010c\3\2\2\2=\u010e\3\2\2\2"+
		"?\u0111\3\2\2\2A\u0115\3\2\2\2C\u0118\3\2\2\2E\u011b\3\2\2\2G\u011d\3"+
		"\2\2\2I\u011f\3\2\2\2K\u0122\3\2\2\2M\u0125\3\2\2\2O\u0128\3\2\2\2Q\u012b"+
		"\3\2\2\2S\u012d\3\2\2\2U\u0136\3\2\2\2W\u0138\3\2\2\2Y\u013a\3\2\2\2["+
		"\u013f\3\2\2\2]\u0148\3\2\2\2_\u014e\3\2\2\2a\u0158\3\2\2\2c\u0160\3\2"+
		"\2\2e\u0166\3\2\2\2g\u0175\3\2\2\2i\u0183\3\2\2\2kl\7\"\2\2lm\3\2\2\2"+
		"mn\b\2\2\2n\4\3\2\2\2op\7\13\2\2pq\3\2\2\2qr\b\3\2\2r\6\3\2\2\2su\7\17"+
		"\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\f\2\2wx\3\2\2\2xy\b\4\2\2y\b\3"+
		"\2\2\2z{\t\2\2\2{\n\3\2\2\2|}\t\3\2\2}\f\3\2\2\2~\177\7X\2\2\177\u0080"+
		"\7C\2\2\u0080\u0081\7T\2\2\u0081\u0082\7K\2\2\u0082\u0083\7C\2\2\u0083"+
		"\u0084\7D\2\2\u0084\u0085\7N\2\2\u0085\u0086\7G\2\2\u0086\u0087\7U\2\2"+
		"\u0087\16\3\2\2\2\u0088\u0089\7H\2\2\u0089\u008a\7W\2\2\u008a\u008b\7"+
		"P\2\2\u008b\u008c\7E\2\2\u008c\u008d\7K\2\2\u008d\u008e\7Q\2\2\u008e\u008f"+
		"\7P\2\2\u008f\20\3\2\2\2\u0090\u0091\7R\2\2\u0091\u0092\7T\2\2\u0092\u0093"+
		"\7Q\2\2\u0093\u0094\7E\2\2\u0094\u0095\7G\2\2\u0095\u0096\7F\2\2\u0096"+
		"\u0097\7K\2\2\u0097\u0098\7O\2\2\u0098\u0099\7K\2\2\u0099\u009a\7G\2\2"+
		"\u009a\u009b\7P\2\2\u009b\u009c\7V\2\2\u009c\u009d\7Q\2\2\u009d\22\3\2"+
		"\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7P\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2"+
		"\7V\2\2\u00a2\u00a3\7T\2\2\u00a3\u00a4\7W\2\2\u00a4\u00a5\7E\2\2\u00a5"+
		"\u00a6\7E\2\2\u00a6\u00a7\7K\2\2\u00a7\u00a8\7Q\2\2\u00a8\u00a9\7P\2\2"+
		"\u00a9\u00aa\7G\2\2\u00aa\u00ab\7U\2\2\u00ab\24\3\2\2\2\u00ac\u00b1\5"+
		"\13\6\2\u00ad\u00b0\5\13\6\2\u00ae\u00b0\5\t\5\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\26\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\7/\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\5\t\5\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\30\3\2\2\2\u00bc\u00bd\7<\2\2\u00bd\32\3\2\2\2\u00be\u00bf"+
		"\7*\2\2\u00bf\34\3\2\2\2\u00c0\u00c1\7+\2\2\u00c1\36\3\2\2\2\u00c2\u00c3"+
		"\7=\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7.\2\2\u00c5\"\3\2\2\2\u00c6\u00c7"+
		"\7P\2\2\u00c7\u00c8\7W\2\2\u00c8\u00c9\7O\2\2\u00c9$\3\2\2\2\u00ca\u00cb"+
		"\7N\2\2\u00cb\u00cc\7Q\2\2\u00cc\u00cd\7I\2\2\u00cd&\3\2\2\2\u00ce\u00cf"+
		"\7U\2\2\u00cf\u00d0\7G\2\2\u00d0\u00d1\7S\2\2\u00d1(\3\2\2\2\u00d2\u00d3"+
		"\7F\2\2\u00d3\u00d4\7G\2\2\u00d4\u00d5\7X\2\2\u00d5*\3\2\2\2\u00d6\u00d7"+
		"\7O\2\2\u00d7\u00d8\7C\2\2\u00d8\u00d9\7[\2\2\u00d9\u00da\7Q\2\2\u00da"+
		"\u00db\7T\2\2\u00db,\3\2\2\2\u00dc\u00dd\7O\2\2\u00dd\u00de\7G\2\2\u00de"+
		"\u00df\7P\2\2\u00df\u00e0\7Q\2\2\u00e0\u00e1\7T\2\2\u00e1.\3\2\2\2\u00e2"+
		"\u00e3\7O\2\2\u00e3\u00e4\7C\2\2\u00e4\u00e5\7[\2\2\u00e5\u00e6\7Q\2\2"+
		"\u00e6\u00e7\7T\2\2\u00e7\u00e8\7a\2\2\u00e8\u00e9\7S\2\2\u00e9\u00ea"+
		"\7W\2\2\u00ea\u00eb\7G\2\2\u00eb\u00ec\7a\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00f0\5\13\6\2\u00ee\u00f0\5\t\5\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3"+
		"\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\60\3\2\2\2\u00f3\u00f4\7O\2\2\u00f4\u00f5\7G\2\2\u00f5\u00f6\7P\2\2\u00f6"+
		"\u00f7\7Q\2\2\u00f7\u00f8\7T\2\2\u00f8\u00f9\7a\2\2\u00f9\u00fa\7S\2\2"+
		"\u00fa\u00fb\7W\2\2\u00fb\u00fc\7G\2\2\u00fc\u00fd\7a\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u0101\5\13\6\2\u00ff\u0101\5\t\5\2\u0100\u00fe\3\2\2\2"+
		"\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\62\3\2\2\2\u0104\u0105\7-\2\2\u0105\64\3\2\2\2\u0106\u0107"+
		"\7/\2\2\u0107\66\3\2\2\2\u0108\u0109\7,\2\2\u01098\3\2\2\2\u010a\u010b"+
		"\7\61\2\2\u010b:\3\2\2\2\u010c\u010d\7?\2\2\u010d<\3\2\2\2\u010e\u010f"+
		"\7U\2\2\u010f\u0110\7K\2\2\u0110>\3\2\2\2\u0111\u0112\7H\2\2\u0112\u0113"+
		"\7U\2\2\u0113\u0114\7K\2\2\u0114@\3\2\2\2\u0115\u0116\7@\2\2\u0116\u0117"+
		"\7?\2\2\u0117B\3\2\2\2\u0118\u0119\7>\2\2\u0119\u011a\7?\2\2\u011aD\3"+
		"\2\2\2\u011b\u011c\7@\2\2\u011cF\3\2\2\2\u011d\u011e\7>\2\2\u011eH\3\2"+
		"\2\2\u011f\u0120\7#\2\2\u0120\u0121\7?\2\2\u0121J\3\2\2\2\u0122\u0123"+
		"\7?\2\2\u0123\u0124\7?\2\2\u0124L\3\2\2\2\u0125\u0126\7(\2\2\u0126\u0127"+
		"\7(\2\2\u0127N\3\2\2\2\u0128\u0129\7~\2\2\u0129\u012a\7~\2\2\u012aP\3"+
		"\2\2\2\u012b\u012c\7#\2\2\u012cR\3\2\2\2\u012d\u012e\7G\2\2\u012e\u012f"+
		"\7P\2\2\u012f\u0130\7V\2\2\u0130\u0131\7Q\2\2\u0131\u0132\7P\2\2\u0132"+
		"\u0133\7E\2\2\u0133\u0134\7G\2\2\u0134\u0135\7U\2\2\u0135T\3\2\2\2\u0136"+
		"\u0137\7]\2\2\u0137V\3\2\2\2\u0138\u0139\7_\2\2\u0139X\3\2\2\2\u013a\u013b"+
		"\7U\2\2\u013b\u013c\7K\2\2\u013c\u013d\7P\2\2\u013d\u013e\7Q\2\2\u013e"+
		"Z\3\2\2\2\u013f\u0140\7O\2\2\u0140\u0141\7K\2\2\u0141\u0142\7G\2\2\u0142"+
		"\u0143\7P\2\2\u0143\u0144\7V\2\2\u0144\u0145\7T\2\2\u0145\u0146\7C\2\2"+
		"\u0146\u0147\7U\2\2\u0147\\\3\2\2\2\u0148\u0149\7J\2\2\u0149\u014a\7C"+
		"\2\2\u014a\u014b\7E\2\2\u014b\u014c\7G\2\2\u014c\u014d\7T\2\2\u014d^\3"+
		"\2\2\2\u014e\u014f\7H\2\2\u014f\u0150\7O\2\2\u0150\u0151\7K\2\2\u0151"+
		"\u0152\7G\2\2\u0152\u0153\7P\2\2\u0153\u0154\7V\2\2\u0154\u0155\7T\2\2"+
		"\u0155\u0156\7C\2\2\u0156\u0157\7U\2\2\u0157`\3\2\2\2\u0158\u0159\7T\2"+
		"\2\u0159\u015a\7W\2\2\u015a\u015b\7R\2\2\u015b\u015c\7V\2\2\u015c\u015d"+
		"\7W\2\2\u015d\u015e\7T\2\2\u015e\u015f\7C\2\2\u015fb\3\2\2\2\u0160\u0161"+
		"\7X\2\2\u0161\u0162\7C\2\2\u0162\u0163\7E\2\2\u0163\u0164\7K\2\2\u0164"+
		"\u0165\7C\2\2\u0165d\3\2\2\2\u0166\u0167\7W\2\2\u0167\u0168\7N\2\2\u0168"+
		"\u0169\7V\2\2\u0169\u016a\7K\2\2\u016a\u016b\7O\2\2\u016b\u016c\7C\2\2"+
		"\u016c\u016d\7R\2\2\u016d\u016e\7Q\2\2\u016e\u016f\7U\2\2\u016f\u0170"+
		"\7K\2\2\u0170\u0171\7E\2\2\u0171\u0172\7K\2\2\u0172\u0173\7Q\2\2\u0173"+
		"\u0174\7P\2\2\u0174f\3\2\2\2\u0175\u0176\7\61\2\2\u0176\u0177\7,\2\2\u0177"+
		"\u017b\3\2\2\2\u0178\u017a\13\2\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3"+
		"\2\2\2\u017b\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u017f\7,\2\2\u017f\u0180\7\61\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0182\b\64\2\2\u0182h\3\2\2\2\u0183\u0184\7\61\2\2\u0184\u0185"+
		"\7\61\2\2\u0185\u0189\3\2\2\2\u0186\u0188\13\2\2\2\u0187\u0186\3\2\2\2"+
		"\u0188\u018b\3\2\2\2\u0189\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018c"+
		"\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\5\7\4\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018f\b\65\2\2\u018fj\3\2\2\2\16\2t\u00af\u00b1\u00b5\u00ba\u00ef\u00f1"+
		"\u0100\u0102\u017b\u0189\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}