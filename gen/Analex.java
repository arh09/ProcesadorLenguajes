// Generated from C:/Users/Alberto Rubio/OneDrive/Desktop/ALBERTOU/ETSII/PL/proyectoPL/src\Analex.g4 by ANTLR 4.8
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, NUMERO=4, VARIABLES=5, FUNCION=6, 
		PROCEDIMIENTO=7, INSTRUCCIONES=8, PROGRAMA=9, SUBPROGRAMAS=10, DOS_PUNTOS=11, 
		PARENTESIS_ABIERTO=12, PARENTESIS_CERRADO=13, PyC=14, COMA=15, BB=16, 
		CORCHETE_ABIERTO=17, CORCHETE_CERRADO=18, NUM=19, LOG=20, SEQ=21, DEV=22, 
		SUMA=23, RESTA=24, MULT=25, DIV=26, IGUAL=27, SI=28, FSI=29, MAYORQ=30, 
		MENORQ=31, MAY=32, MEN=33, DISTINTO=34, IGUALDAD=35, AND=36, OR=37, NEGACION=38, 
		ENTONCES=39, SINO=40, MIENTRAS=41, HACER=42, FMIENTRAS=43, RUPTURA=44, 
		VACIA=45, ULTIMAPOSICION=46, FFUNCION=47, FPROCEDIMIENTO=48, T=49, F=50, 
		SEQ_NUM=51, SEQ_LOG=52, CIERTO=53, FALSO=54, MOSTRAR=55, VAR=56, COMENTARIO_BLOQUE=57, 
		COMENTARIO_LINEA=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "NUMERO", "VARIABLES", 
			"FUNCION", "PROCEDIMIENTO", "INSTRUCCIONES", "PROGRAMA", "SUBPROGRAMAS", 
			"DOS_PUNTOS", "PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", "PyC", "COMA", 
			"BB", "CORCHETE_ABIERTO", "CORCHETE_CERRADO", "NUM", "LOG", "SEQ", "DEV", 
			"SUMA", "RESTA", "MULT", "DIV", "IGUAL", "SI", "FSI", "MAYORQ", "MENORQ", 
			"MAY", "MEN", "DISTINTO", "IGUALDAD", "AND", "OR", "NEGACION", "ENTONCES", 
			"SINO", "MIENTRAS", "HACER", "FMIENTRAS", "RUPTURA", "VACIA", "ULTIMAPOSICION", 
			"FFUNCION", "FPROCEDIMIENTO", "T", "F", "SEQ_NUM", "SEQ_LOG", "CIERTO", 
			"FALSO", "MOSTRAR", "VAR", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, null, "'VARIABLES'", "'FUNCION'", "'PROCEDIMIENTO'", 
			"'INSTRUCCIONES'", "'PROGRAMA'", "'SUBPROGRAMAS'", "':'", "'('", "')'", 
			"';'", "','", "'_'", "'['", "']'", "'NUM'", "'LOG'", "'SEQ'", "'dev'", 
			"'+'", "'-'", "'*'", "'/'", "'='", "'si'", "'fsi'", "'>='", "'<='", "'>'", 
			"'<'", "'!='", "'=='", "'&&'", "'||'", "'!'", "'entonces'", "'sino'", 
			"'mientras'", "'hacer'", "'fmientras'", "'ruptura'", "'vacia'", "'ultima_posicion'", 
			"'FFUNCION'", "'FPROCEDIMIENTO'", "'T'", "'F'", "'SEQ(NUM)'", "'SEQ(LOG)'", 
			"'cierto'", "'falso'", "'mostrar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "NUMERO", "VARIABLES", "FUNCION", 
			"PROCEDIMIENTO", "INSTRUCCIONES", "PROGRAMA", "SUBPROGRAMAS", "DOS_PUNTOS", 
			"PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", "PyC", "COMA", "BB", "CORCHETE_ABIERTO", 
			"CORCHETE_CERRADO", "NUM", "LOG", "SEQ", "DEV", "SUMA", "RESTA", "MULT", 
			"DIV", "IGUAL", "SI", "FSI", "MAYORQ", "MENORQ", "MAY", "MEN", "DISTINTO", 
			"IGUALDAD", "AND", "OR", "NEGACION", "ENTONCES", "SINO", "MIENTRAS", 
			"HACER", "FMIENTRAS", "RUPTURA", "VACIA", "ULTIMAPOSICION", "FFUNCION", 
			"FPROCEDIMIENTO", "T", "F", "SEQ_NUM", "SEQ_LOG", "CIERTO", "FALSO", 
			"MOSTRAR", "VAR", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01ce\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4\u0085\n\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\5\7\u0090\n\7\3\7\6\7\u0093\n\7\r\7\16\7\u0094\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%"+
		"\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39"+
		"\39\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\7;\u01af\n;\f;\16;\u01b2\13;\3<\3"+
		"<\3<\3<\7<\u01b8\n<\f<\16<\u01bb\13<\3<\3<\3<\3<\3<\3=\3=\3=\3=\7=\u01c6"+
		"\n=\f=\16=\u01c9\13=\3=\3=\3=\3=\4\u01b9\u01c7\2>\3\3\5\4\7\5\t\2\13\2"+
		"\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23"+
		")\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%"+
		"M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67q8s9u:w;y<\3\2\4"+
		"\3\2\62;\4\2C\\c|\2\u01d2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3"+
		"{\3\2\2\2\5\177\3\2\2\2\7\u0084\3\2\2\2\t\u008a\3\2\2\2\13\u008c\3\2\2"+
		"\2\r\u008f\3\2\2\2\17\u0096\3\2\2\2\21\u00a0\3\2\2\2\23\u00a8\3\2\2\2"+
		"\25\u00b6\3\2\2\2\27\u00c4\3\2\2\2\31\u00cd\3\2\2\2\33\u00da\3\2\2\2\35"+
		"\u00dc\3\2\2\2\37\u00de\3\2\2\2!\u00e0\3\2\2\2#\u00e2\3\2\2\2%\u00e4\3"+
		"\2\2\2\'\u00e6\3\2\2\2)\u00e8\3\2\2\2+\u00ea\3\2\2\2-\u00ee\3\2\2\2/\u00f2"+
		"\3\2\2\2\61\u00f6\3\2\2\2\63\u00fa\3\2\2\2\65\u00fc\3\2\2\2\67\u00fe\3"+
		"\2\2\29\u0100\3\2\2\2;\u0102\3\2\2\2=\u0104\3\2\2\2?\u0107\3\2\2\2A\u010b"+
		"\3\2\2\2C\u010e\3\2\2\2E\u0111\3\2\2\2G\u0113\3\2\2\2I\u0115\3\2\2\2K"+
		"\u0118\3\2\2\2M\u011b\3\2\2\2O\u011e\3\2\2\2Q\u0121\3\2\2\2S\u0123\3\2"+
		"\2\2U\u012c\3\2\2\2W\u0131\3\2\2\2Y\u013a\3\2\2\2[\u0140\3\2\2\2]\u014a"+
		"\3\2\2\2_\u0152\3\2\2\2a\u0158\3\2\2\2c\u0168\3\2\2\2e\u0171\3\2\2\2g"+
		"\u0180\3\2\2\2i\u0182\3\2\2\2k\u0184\3\2\2\2m\u018d\3\2\2\2o\u0196\3\2"+
		"\2\2q\u019d\3\2\2\2s\u01a3\3\2\2\2u\u01ab\3\2\2\2w\u01b3\3\2\2\2y\u01c1"+
		"\3\2\2\2{|\7\"\2\2|}\3\2\2\2}~\b\2\2\2~\4\3\2\2\2\177\u0080\7\13\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\b\3\2\2\u0082\6\3\2\2\2\u0083\u0085\7\17\2"+
		"\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\7\f\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\4\2\2\u0089\b\3\2\2\2\u008a"+
		"\u008b\t\2\2\2\u008b\n\3\2\2\2\u008c\u008d\t\3\2\2\u008d\f\3\2\2\2\u008e"+
		"\u0090\7/\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2"+
		"\2\2\u0091\u0093\5\t\5\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\16\3\2\2\2\u0096\u0097\7X\2\2"+
		"\u0097\u0098\7C\2\2\u0098\u0099\7T\2\2\u0099\u009a\7K\2\2\u009a\u009b"+
		"\7C\2\2\u009b\u009c\7D\2\2\u009c\u009d\7N\2\2\u009d\u009e\7G\2\2\u009e"+
		"\u009f\7U\2\2\u009f\20\3\2\2\2\u00a0\u00a1\7H\2\2\u00a1\u00a2\7W\2\2\u00a2"+
		"\u00a3\7P\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7Q\2\2"+
		"\u00a6\u00a7\7P\2\2\u00a7\22\3\2\2\2\u00a8\u00a9\7R\2\2\u00a9\u00aa\7"+
		"T\2\2\u00aa\u00ab\7Q\2\2\u00ab\u00ac\7E\2\2\u00ac\u00ad\7G\2\2\u00ad\u00ae"+
		"\7F\2\2\u00ae\u00af\7K\2\2\u00af\u00b0\7O\2\2\u00b0\u00b1\7K\2\2\u00b1"+
		"\u00b2\7G\2\2\u00b2\u00b3\7P\2\2\u00b3\u00b4\7V\2\2\u00b4\u00b5\7Q\2\2"+
		"\u00b5\24\3\2\2\2\u00b6\u00b7\7K\2\2\u00b7\u00b8\7P\2\2\u00b8\u00b9\7"+
		"U\2\2\u00b9\u00ba\7V\2\2\u00ba\u00bb\7T\2\2\u00bb\u00bc\7W\2\2\u00bc\u00bd"+
		"\7E\2\2\u00bd\u00be\7E\2\2\u00be\u00bf\7K\2\2\u00bf\u00c0\7Q\2\2\u00c0"+
		"\u00c1\7P\2\2\u00c1\u00c2\7G\2\2\u00c2\u00c3\7U\2\2\u00c3\26\3\2\2\2\u00c4"+
		"\u00c5\7R\2\2\u00c5\u00c6\7T\2\2\u00c6\u00c7\7Q\2\2\u00c7\u00c8\7I\2\2"+
		"\u00c8\u00c9\7T\2\2\u00c9\u00ca\7C\2\2\u00ca\u00cb\7O\2\2\u00cb\u00cc"+
		"\7C\2\2\u00cc\30\3\2\2\2\u00cd\u00ce\7U\2\2\u00ce\u00cf\7W\2\2\u00cf\u00d0"+
		"\7D\2\2\u00d0\u00d1\7R\2\2\u00d1\u00d2\7T\2\2\u00d2\u00d3\7Q\2\2\u00d3"+
		"\u00d4\7I\2\2\u00d4\u00d5\7T\2\2\u00d5\u00d6\7C\2\2\u00d6\u00d7\7O\2\2"+
		"\u00d7\u00d8\7C\2\2\u00d8\u00d9\7U\2\2\u00d9\32\3\2\2\2\u00da\u00db\7"+
		"<\2\2\u00db\34\3\2\2\2\u00dc\u00dd\7*\2\2\u00dd\36\3\2\2\2\u00de\u00df"+
		"\7+\2\2\u00df \3\2\2\2\u00e0\u00e1\7=\2\2\u00e1\"\3\2\2\2\u00e2\u00e3"+
		"\7.\2\2\u00e3$\3\2\2\2\u00e4\u00e5\7a\2\2\u00e5&\3\2\2\2\u00e6\u00e7\7"+
		"]\2\2\u00e7(\3\2\2\2\u00e8\u00e9\7_\2\2\u00e9*\3\2\2\2\u00ea\u00eb\7P"+
		"\2\2\u00eb\u00ec\7W\2\2\u00ec\u00ed\7O\2\2\u00ed,\3\2\2\2\u00ee\u00ef"+
		"\7N\2\2\u00ef\u00f0\7Q\2\2\u00f0\u00f1\7I\2\2\u00f1.\3\2\2\2\u00f2\u00f3"+
		"\7U\2\2\u00f3\u00f4\7G\2\2\u00f4\u00f5\7S\2\2\u00f5\60\3\2\2\2\u00f6\u00f7"+
		"\7f\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7x\2\2\u00f9\62\3\2\2\2\u00fa\u00fb"+
		"\7-\2\2\u00fb\64\3\2\2\2\u00fc\u00fd\7/\2\2\u00fd\66\3\2\2\2\u00fe\u00ff"+
		"\7,\2\2\u00ff8\3\2\2\2\u0100\u0101\7\61\2\2\u0101:\3\2\2\2\u0102\u0103"+
		"\7?\2\2\u0103<\3\2\2\2\u0104\u0105\7u\2\2\u0105\u0106\7k\2\2\u0106>\3"+
		"\2\2\2\u0107\u0108\7h\2\2\u0108\u0109\7u\2\2\u0109\u010a\7k\2\2\u010a"+
		"@\3\2\2\2\u010b\u010c\7@\2\2\u010c\u010d\7?\2\2\u010dB\3\2\2\2\u010e\u010f"+
		"\7>\2\2\u010f\u0110\7?\2\2\u0110D\3\2\2\2\u0111\u0112\7@\2\2\u0112F\3"+
		"\2\2\2\u0113\u0114\7>\2\2\u0114H\3\2\2\2\u0115\u0116\7#\2\2\u0116\u0117"+
		"\7?\2\2\u0117J\3\2\2\2\u0118\u0119\7?\2\2\u0119\u011a\7?\2\2\u011aL\3"+
		"\2\2\2\u011b\u011c\7(\2\2\u011c\u011d\7(\2\2\u011dN\3\2\2\2\u011e\u011f"+
		"\7~\2\2\u011f\u0120\7~\2\2\u0120P\3\2\2\2\u0121\u0122\7#\2\2\u0122R\3"+
		"\2\2\2\u0123\u0124\7g\2\2\u0124\u0125\7p\2\2\u0125\u0126\7v\2\2\u0126"+
		"\u0127\7q\2\2\u0127\u0128\7p\2\2\u0128\u0129\7e\2\2\u0129\u012a\7g\2\2"+
		"\u012a\u012b\7u\2\2\u012bT\3\2\2\2\u012c\u012d\7u\2\2\u012d\u012e\7k\2"+
		"\2\u012e\u012f\7p\2\2\u012f\u0130\7q\2\2\u0130V\3\2\2\2\u0131\u0132\7"+
		"o\2\2\u0132\u0133\7k\2\2\u0133\u0134\7g\2\2\u0134\u0135\7p\2\2\u0135\u0136"+
		"\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7c\2\2\u0138\u0139\7u\2\2\u0139"+
		"X\3\2\2\2\u013a\u013b\7j\2\2\u013b\u013c\7c\2\2\u013c\u013d\7e\2\2\u013d"+
		"\u013e\7g\2\2\u013e\u013f\7t\2\2\u013fZ\3\2\2\2\u0140\u0141\7h\2\2\u0141"+
		"\u0142\7o\2\2\u0142\u0143\7k\2\2\u0143\u0144\7g\2\2\u0144\u0145\7p\2\2"+
		"\u0145\u0146\7v\2\2\u0146\u0147\7t\2\2\u0147\u0148\7c\2\2\u0148\u0149"+
		"\7u\2\2\u0149\\\3\2\2\2\u014a\u014b\7t\2\2\u014b\u014c\7w\2\2\u014c\u014d"+
		"\7r\2\2\u014d\u014e\7v\2\2\u014e\u014f\7w\2\2\u014f\u0150\7t\2\2\u0150"+
		"\u0151\7c\2\2\u0151^\3\2\2\2\u0152\u0153\7x\2\2\u0153\u0154\7c\2\2\u0154"+
		"\u0155\7e\2\2\u0155\u0156\7k\2\2\u0156\u0157\7c\2\2\u0157`\3\2\2\2\u0158"+
		"\u0159\7w\2\2\u0159\u015a\7n\2\2\u015a\u015b\7v\2\2\u015b\u015c\7k\2\2"+
		"\u015c\u015d\7o\2\2\u015d\u015e\7c\2\2\u015e\u015f\7a\2\2\u015f\u0160"+
		"\7r\2\2\u0160\u0161\7q\2\2\u0161\u0162\7u\2\2\u0162\u0163\7k\2\2\u0163"+
		"\u0164\7e\2\2\u0164\u0165\7k\2\2\u0165\u0166\7q\2\2\u0166\u0167\7p\2\2"+
		"\u0167b\3\2\2\2\u0168\u0169\7H\2\2\u0169\u016a\7H\2\2\u016a\u016b\7W\2"+
		"\2\u016b\u016c\7P\2\2\u016c\u016d\7E\2\2\u016d\u016e\7K\2\2\u016e\u016f"+
		"\7Q\2\2\u016f\u0170\7P\2\2\u0170d\3\2\2\2\u0171\u0172\7H\2\2\u0172\u0173"+
		"\7R\2\2\u0173\u0174\7T\2\2\u0174\u0175\7Q\2\2\u0175\u0176\7E\2\2\u0176"+
		"\u0177\7G\2\2\u0177\u0178\7F\2\2\u0178\u0179\7K\2\2\u0179\u017a\7O\2\2"+
		"\u017a\u017b\7K\2\2\u017b\u017c\7G\2\2\u017c\u017d\7P\2\2\u017d\u017e"+
		"\7V\2\2\u017e\u017f\7Q\2\2\u017ff\3\2\2\2\u0180\u0181\7V\2\2\u0181h\3"+
		"\2\2\2\u0182\u0183\7H\2\2\u0183j\3\2\2\2\u0184\u0185\7U\2\2\u0185\u0186"+
		"\7G\2\2\u0186\u0187\7S\2\2\u0187\u0188\7*\2\2\u0188\u0189\7P\2\2\u0189"+
		"\u018a\7W\2\2\u018a\u018b\7O\2\2\u018b\u018c\7+\2\2\u018cl\3\2\2\2\u018d"+
		"\u018e\7U\2\2\u018e\u018f\7G\2\2\u018f\u0190\7S\2\2\u0190\u0191\7*\2\2"+
		"\u0191\u0192\7N\2\2\u0192\u0193\7Q\2\2\u0193\u0194\7I\2\2\u0194\u0195"+
		"\7+\2\2\u0195n\3\2\2\2\u0196\u0197\7e\2\2\u0197\u0198\7k\2\2\u0198\u0199"+
		"\7g\2\2\u0199\u019a\7t\2\2\u019a\u019b\7v\2\2\u019b\u019c\7q\2\2\u019c"+
		"p\3\2\2\2\u019d\u019e\7h\2\2\u019e\u019f\7c\2\2\u019f\u01a0\7n\2\2\u01a0"+
		"\u01a1\7u\2\2\u01a1\u01a2\7q\2\2\u01a2r\3\2\2\2\u01a3\u01a4\7o\2\2\u01a4"+
		"\u01a5\7q\2\2\u01a5\u01a6\7u\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7t\2\2"+
		"\u01a8\u01a9\7c\2\2\u01a9\u01aa\7t\2\2\u01aat\3\2\2\2\u01ab\u01b0\5\13"+
		"\6\2\u01ac\u01af\5\13\6\2\u01ad\u01af\5\t\5\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1v\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7\61\2\2\u01b4\u01b5"+
		"\7,\2\2\u01b5\u01b9\3\2\2\2\u01b6\u01b8\13\2\2\2\u01b7\u01b6\3\2\2\2\u01b8"+
		"\u01bb\3\2\2\2\u01b9\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bc\3\2"+
		"\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7,\2\2\u01bd\u01be\7\61\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\b<\2\2\u01c0x\3\2\2\2\u01c1\u01c2\7\61\2\2"+
		"\u01c2\u01c3\7\61\2\2\u01c3\u01c7\3\2\2\2\u01c4\u01c6\13\2\2\2\u01c5\u01c4"+
		"\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\5\7\4\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01cd\b=\2\2\u01cdz\3\2\2\2\n\2\u0084\u008f\u0094\u01ae\u01b0"+
		"\u01b9\u01c7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}