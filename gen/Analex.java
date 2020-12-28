// Generated from /home/alberto/IdeaProjects/Procesadores de Lenguajes/Proyecto/proyectoPL/src/Analex.g4 by ANTLR 4.8
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
		FFUNCION=45, FPROCEDIMIENTO=46, T=47, F=48, SEQ_NUM=49, SEQ_LOG=50, VAR=51, 
		COMENTARIO_BLOQUE=52, COMENTARIO_LINEA=53;
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
			"SINO", "MIENTRAS", "HACER", "FMIENTRAS", "RUPTURA", "FFUNCION", "FPROCEDIMIENTO", 
			"T", "F", "SEQ_NUM", "SEQ_LOG", "VAR", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
			"'mientras'", "'hacer'", "'fmientras'", "'ruptura'", "'FFUNCION'", "'FPROCEDIMIENTO'", 
			"'T'", "'F'", "'SEQ(NUM)'", "'SEQ(LOG)'"
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
			"HACER", "FMIENTRAS", "RUPTURA", "FFUNCION", "FPROCEDIMIENTO", "T", "F", 
			"SEQ_NUM", "SEQ_LOG", "VAR", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0199\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\5\4{\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\5\7\u0086\n\7\3"+
		"\7\6\7\u0089\n\7\r\7\16\7\u008a\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\7\66\u017a\n\66\f\66\16\66"+
		"\u017d\13\66\3\67\3\67\3\67\3\67\7\67\u0183\n\67\f\67\16\67\u0186\13\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\78\u0191\n8\f8\168\u0194\138\38"+
		"\38\38\38\4\u0184\u0192\29\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25"+
		"\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30"+
		"\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a"+
		"\60c\61e\62g\63i\64k\65m\66o\67\3\2\4\3\2\62;\4\2C\\c|\2\u019d\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5u\3\2\2\2"+
		"\7z\3\2\2\2\t\u0080\3\2\2\2\13\u0082\3\2\2\2\r\u0085\3\2\2\2\17\u008c"+
		"\3\2\2\2\21\u0096\3\2\2\2\23\u009e\3\2\2\2\25\u00ac\3\2\2\2\27\u00ba\3"+
		"\2\2\2\31\u00c3\3\2\2\2\33\u00d0\3\2\2\2\35\u00d2\3\2\2\2\37\u00d4\3\2"+
		"\2\2!\u00d6\3\2\2\2#\u00d8\3\2\2\2%\u00da\3\2\2\2\'\u00dc\3\2\2\2)\u00de"+
		"\3\2\2\2+\u00e0\3\2\2\2-\u00e4\3\2\2\2/\u00e8\3\2\2\2\61\u00ec\3\2\2\2"+
		"\63\u00f0\3\2\2\2\65\u00f2\3\2\2\2\67\u00f4\3\2\2\29\u00f6\3\2\2\2;\u00f8"+
		"\3\2\2\2=\u00fa\3\2\2\2?\u00fd\3\2\2\2A\u0101\3\2\2\2C\u0104\3\2\2\2E"+
		"\u0107\3\2\2\2G\u0109\3\2\2\2I\u010b\3\2\2\2K\u010e\3\2\2\2M\u0111\3\2"+
		"\2\2O\u0114\3\2\2\2Q\u0117\3\2\2\2S\u0119\3\2\2\2U\u0122\3\2\2\2W\u0127"+
		"\3\2\2\2Y\u0130\3\2\2\2[\u0136\3\2\2\2]\u0140\3\2\2\2_\u0148\3\2\2\2a"+
		"\u0151\3\2\2\2c\u0160\3\2\2\2e\u0162\3\2\2\2g\u0164\3\2\2\2i\u016d\3\2"+
		"\2\2k\u0176\3\2\2\2m\u017e\3\2\2\2o\u018c\3\2\2\2qr\7\"\2\2rs\3\2\2\2"+
		"st\b\2\2\2t\4\3\2\2\2uv\7\13\2\2vw\3\2\2\2wx\b\3\2\2x\6\3\2\2\2y{\7\17"+
		"\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\f\2\2}~\3\2\2\2~\177\b\4\2\2\177"+
		"\b\3\2\2\2\u0080\u0081\t\2\2\2\u0081\n\3\2\2\2\u0082\u0083\t\3\2\2\u0083"+
		"\f\3\2\2\2\u0084\u0086\7/\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0088\3\2\2\2\u0087\u0089\5\t\5\2\u0088\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\16\3\2\2\2\u008c"+
		"\u008d\7X\2\2\u008d\u008e\7C\2\2\u008e\u008f\7T\2\2\u008f\u0090\7K\2\2"+
		"\u0090\u0091\7C\2\2\u0091\u0092\7D\2\2\u0092\u0093\7N\2\2\u0093\u0094"+
		"\7G\2\2\u0094\u0095\7U\2\2\u0095\20\3\2\2\2\u0096\u0097\7H\2\2\u0097\u0098"+
		"\7W\2\2\u0098\u0099\7P\2\2\u0099\u009a\7E\2\2\u009a\u009b\7K\2\2\u009b"+
		"\u009c\7Q\2\2\u009c\u009d\7P\2\2\u009d\22\3\2\2\2\u009e\u009f\7R\2\2\u009f"+
		"\u00a0\7T\2\2\u00a0\u00a1\7Q\2\2\u00a1\u00a2\7E\2\2\u00a2\u00a3\7G\2\2"+
		"\u00a3\u00a4\7F\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7O\2\2\u00a6\u00a7"+
		"\7K\2\2\u00a7\u00a8\7G\2\2\u00a8\u00a9\7P\2\2\u00a9\u00aa\7V\2\2\u00aa"+
		"\u00ab\7Q\2\2\u00ab\24\3\2\2\2\u00ac\u00ad\7K\2\2\u00ad\u00ae\7P\2\2\u00ae"+
		"\u00af\7U\2\2\u00af\u00b0\7V\2\2\u00b0\u00b1\7T\2\2\u00b1\u00b2\7W\2\2"+
		"\u00b2\u00b3\7E\2\2\u00b3\u00b4\7E\2\2\u00b4\u00b5\7K\2\2\u00b5\u00b6"+
		"\7Q\2\2\u00b6\u00b7\7P\2\2\u00b7\u00b8\7G\2\2\u00b8\u00b9\7U\2\2\u00b9"+
		"\26\3\2\2\2\u00ba\u00bb\7R\2\2\u00bb\u00bc\7T\2\2\u00bc\u00bd\7Q\2\2\u00bd"+
		"\u00be\7I\2\2\u00be\u00bf\7T\2\2\u00bf\u00c0\7C\2\2\u00c0\u00c1\7O\2\2"+
		"\u00c1\u00c2\7C\2\2\u00c2\30\3\2\2\2\u00c3\u00c4\7U\2\2\u00c4\u00c5\7"+
		"W\2\2\u00c5\u00c6\7D\2\2\u00c6\u00c7\7R\2\2\u00c7\u00c8\7T\2\2\u00c8\u00c9"+
		"\7Q\2\2\u00c9\u00ca\7I\2\2\u00ca\u00cb\7T\2\2\u00cb\u00cc\7C\2\2\u00cc"+
		"\u00cd\7O\2\2\u00cd\u00ce\7C\2\2\u00ce\u00cf\7U\2\2\u00cf\32\3\2\2\2\u00d0"+
		"\u00d1\7<\2\2\u00d1\34\3\2\2\2\u00d2\u00d3\7*\2\2\u00d3\36\3\2\2\2\u00d4"+
		"\u00d5\7+\2\2\u00d5 \3\2\2\2\u00d6\u00d7\7=\2\2\u00d7\"\3\2\2\2\u00d8"+
		"\u00d9\7.\2\2\u00d9$\3\2\2\2\u00da\u00db\7a\2\2\u00db&\3\2\2\2\u00dc\u00dd"+
		"\7]\2\2\u00dd(\3\2\2\2\u00de\u00df\7_\2\2\u00df*\3\2\2\2\u00e0\u00e1\7"+
		"P\2\2\u00e1\u00e2\7W\2\2\u00e2\u00e3\7O\2\2\u00e3,\3\2\2\2\u00e4\u00e5"+
		"\7N\2\2\u00e5\u00e6\7Q\2\2\u00e6\u00e7\7I\2\2\u00e7.\3\2\2\2\u00e8\u00e9"+
		"\7U\2\2\u00e9\u00ea\7G\2\2\u00ea\u00eb\7S\2\2\u00eb\60\3\2\2\2\u00ec\u00ed"+
		"\7f\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7x\2\2\u00ef\62\3\2\2\2\u00f0\u00f1"+
		"\7-\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7/\2\2\u00f3\66\3\2\2\2\u00f4\u00f5"+
		"\7,\2\2\u00f58\3\2\2\2\u00f6\u00f7\7\61\2\2\u00f7:\3\2\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9<\3\2\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7k\2\2\u00fc>\3"+
		"\2\2\2\u00fd\u00fe\7h\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7k\2\2\u0100"+
		"@\3\2\2\2\u0101\u0102\7@\2\2\u0102\u0103\7?\2\2\u0103B\3\2\2\2\u0104\u0105"+
		"\7>\2\2\u0105\u0106\7?\2\2\u0106D\3\2\2\2\u0107\u0108\7@\2\2\u0108F\3"+
		"\2\2\2\u0109\u010a\7>\2\2\u010aH\3\2\2\2\u010b\u010c\7#\2\2\u010c\u010d"+
		"\7?\2\2\u010dJ\3\2\2\2\u010e\u010f\7?\2\2\u010f\u0110\7?\2\2\u0110L\3"+
		"\2\2\2\u0111\u0112\7(\2\2\u0112\u0113\7(\2\2\u0113N\3\2\2\2\u0114\u0115"+
		"\7~\2\2\u0115\u0116\7~\2\2\u0116P\3\2\2\2\u0117\u0118\7#\2\2\u0118R\3"+
		"\2\2\2\u0119\u011a\7g\2\2\u011a\u011b\7p\2\2\u011b\u011c\7v\2\2\u011c"+
		"\u011d\7q\2\2\u011d\u011e\7p\2\2\u011e\u011f\7e\2\2\u011f\u0120\7g\2\2"+
		"\u0120\u0121\7u\2\2\u0121T\3\2\2\2\u0122\u0123\7u\2\2\u0123\u0124\7k\2"+
		"\2\u0124\u0125\7p\2\2\u0125\u0126\7q\2\2\u0126V\3\2\2\2\u0127\u0128\7"+
		"o\2\2\u0128\u0129\7k\2\2\u0129\u012a\7g\2\2\u012a\u012b\7p\2\2\u012b\u012c"+
		"\7v\2\2\u012c\u012d\7t\2\2\u012d\u012e\7c\2\2\u012e\u012f\7u\2\2\u012f"+
		"X\3\2\2\2\u0130\u0131\7j\2\2\u0131\u0132\7c\2\2\u0132\u0133\7e\2\2\u0133"+
		"\u0134\7g\2\2\u0134\u0135\7t\2\2\u0135Z\3\2\2\2\u0136\u0137\7h\2\2\u0137"+
		"\u0138\7o\2\2\u0138\u0139\7k\2\2\u0139\u013a\7g\2\2\u013a\u013b\7p\2\2"+
		"\u013b\u013c\7v\2\2\u013c\u013d\7t\2\2\u013d\u013e\7c\2\2\u013e\u013f"+
		"\7u\2\2\u013f\\\3\2\2\2\u0140\u0141\7t\2\2\u0141\u0142\7w\2\2\u0142\u0143"+
		"\7r\2\2\u0143\u0144\7v\2\2\u0144\u0145\7w\2\2\u0145\u0146\7t\2\2\u0146"+
		"\u0147\7c\2\2\u0147^\3\2\2\2\u0148\u0149\7H\2\2\u0149\u014a\7H\2\2\u014a"+
		"\u014b\7W\2\2\u014b\u014c\7P\2\2\u014c\u014d\7E\2\2\u014d\u014e\7K\2\2"+
		"\u014e\u014f\7Q\2\2\u014f\u0150\7P\2\2\u0150`\3\2\2\2\u0151\u0152\7H\2"+
		"\2\u0152\u0153\7R\2\2\u0153\u0154\7T\2\2\u0154\u0155\7Q\2\2\u0155\u0156"+
		"\7E\2\2\u0156\u0157\7G\2\2\u0157\u0158\7F\2\2\u0158\u0159\7K\2\2\u0159"+
		"\u015a\7O\2\2\u015a\u015b\7K\2\2\u015b\u015c\7G\2\2\u015c\u015d\7P\2\2"+
		"\u015d\u015e\7V\2\2\u015e\u015f\7Q\2\2\u015fb\3\2\2\2\u0160\u0161\7V\2"+
		"\2\u0161d\3\2\2\2\u0162\u0163\7H\2\2\u0163f\3\2\2\2\u0164\u0165\7U\2\2"+
		"\u0165\u0166\7G\2\2\u0166\u0167\7S\2\2\u0167\u0168\7*\2\2\u0168\u0169"+
		"\7P\2\2\u0169\u016a\7W\2\2\u016a\u016b\7O\2\2\u016b\u016c\7+\2\2\u016c"+
		"h\3\2\2\2\u016d\u016e\7U\2\2\u016e\u016f\7G\2\2\u016f\u0170\7S\2\2\u0170"+
		"\u0171\7*\2\2\u0171\u0172\7N\2\2\u0172\u0173\7Q\2\2\u0173\u0174\7I\2\2"+
		"\u0174\u0175\7+\2\2\u0175j\3\2\2\2\u0176\u017b\5\13\6\2\u0177\u017a\5"+
		"\13\6\2\u0178\u017a\5\t\5\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a"+
		"\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017cl\3\2\2\2"+
		"\u017d\u017b\3\2\2\2\u017e\u017f\7\61\2\2\u017f\u0180\7,\2\2\u0180\u0184"+
		"\3\2\2\2\u0181\u0183\13\2\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2"+
		"\u0184\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0187\u0188\7,\2\2\u0188\u0189\7\61\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\b\67\2\2\u018bn\3\2\2\2\u018c\u018d\7\61\2\2\u018d\u018e\7\61\2"+
		"\2\u018e\u0192\3\2\2\2\u018f\u0191\13\2\2\2\u0190\u018f\3\2\2\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0195\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0195\u0196\5\7\4\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\b8\2\2\u0198p\3\2\2\2\n\2z\u0085\u008a\u0179\u017b\u0184\u0192"+
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