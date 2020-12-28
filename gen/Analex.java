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
		PARENTESIS_ABIERTO=12, PARENTESIS_CERRADO=13, PyC=14, COMA=15, NUM=16, 
		LOG=17, SEQ=18, DEV=19, MAYOR=20, MENOR=21, MAYOR_QUE=22, MENOR_QUE=23, 
		SUMA=24, RESTA=25, MULT=26, DIV=27, IGUAL=28, SI=29, FSI=30, MAYORQ=31, 
		MENORQ=32, MAY=33, MEN=34, DISTINTO=35, IGUALDAD=36, AND=37, OR=38, NEGACION=39, 
		ENTONCES=40, CORCHETE_ABIERTO=41, CORCHETE_CERRADO=42, SINO=43, MIENTRAS=44, 
		HACER=45, FMIENTRAS=46, RUPTURA=47, VACIA=48, MOSTRAR=49, ULTIMAPOSICION=50, 
		FFUNCION=51, FPROCEDIMIENTO=52, T=53, F=54, VAR=55, COMENTARIO_BLOQUE=56, 
		COMENTARIO_LINEA=57;
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
			"NUM", "LOG", "SEQ", "DEV", "MAYOR", "MENOR", "MAYOR_QUE", "MENOR_QUE", 
			"SUMA", "RESTA", "MULT", "DIV", "IGUAL", "SI", "FSI", "MAYORQ", "MENORQ", 
			"MAY", "MEN", "DISTINTO", "IGUALDAD", "AND", "OR", "NEGACION", "ENTONCES", 
			"CORCHETE_ABIERTO", "CORCHETE_CERRADO", "SINO", "MIENTRAS", "HACER", 
			"FMIENTRAS", "RUPTURA", "VACIA", "MOSTRAR", "ULTIMAPOSICION", "FFUNCION", 
			"FPROCEDIMIENTO", "T", "F", "VAR", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, null, "'VARIABLES'", "'FUNCION'", "'PROCEDIMIENTO'", 
			"'INSTRUCCIONES'", "'PROGRAMA'", "'SUBPROGRAMAS'", "':'", "'('", "')'", 
			"';'", "','", "'NUM'", "'LOG'", "'SEQ'", "'dev'", "'mayor'", "'menor'", 
			"'mayor_que_'", "'menor_que_'", "'+'", "'-'", "'*'", "'/'", "'='", "'si'", 
			"'fsi'", "'>='", "'<='", "'>'", "'<'", "'!='", "'=='", "'&&'", "'||'", 
			"'!'", "'entonces'", "'['", "']'", "'sino'", "'mientras'", "'hacer'", 
			"'fmientras'", "'ruptura'", "'vacia'", "'mostrar'", "'ultima_posicion'", 
			"'FFUNCION'", "'FPROCEDIMIENTO'", "'T'", "'F'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "NUMERO", "VARIABLES", "FUNCION", 
			"PROCEDIMIENTO", "INSTRUCCIONES", "PROGRAMA", "SUBPROGRAMAS", "DOS_PUNTOS", 
			"PARENTESIS_ABIERTO", "PARENTESIS_CERRADO", "PyC", "COMA", "NUM", "LOG", 
			"SEQ", "DEV", "MAYOR", "MENOR", "MAYOR_QUE", "MENOR_QUE", "SUMA", "RESTA", 
			"MULT", "DIV", "IGUAL", "SI", "FSI", "MAYORQ", "MENORQ", "MAY", "MEN", 
			"DISTINTO", "IGUALDAD", "AND", "OR", "NEGACION", "ENTONCES", "CORCHETE_ABIERTO", 
			"CORCHETE_CERRADO", "SINO", "MIENTRAS", "HACER", "FMIENTRAS", "RUPTURA", 
			"VACIA", "MOSTRAR", "ULTIMAPOSICION", "FFUNCION", "FPROCEDIMIENTO", "T", 
			"F", "VAR", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u01cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4\u0083\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\5\7\u008e\n\7\3\7\6\7\u0091\n\7\r\7\16\7\u0092\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\39\39\3:\3:\3:\7:\u01ae\n:\f:\16:\u01b1\13:\3;\3;\3;\3;\7"+
		";\u01b7\n;\f;\16;\u01ba\13;\3;\3;\3;\3;\3;\3<\3<\3<\3<\7<\u01c5\n<\f<"+
		"\16<\u01c8\13<\3<\3<\3<\3<\4\u01b8\u01c6\2=\3\3\5\4\7\5\t\2\13\2\r\6\17"+
		"\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25"+
		"-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S"+
		")U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67q8s9u:w;\3\2\4\3\2\62;\3"+
		"\2c|\2\u01d1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5}\3\2\2\2\7\u0082"+
		"\3\2\2\2\t\u0088\3\2\2\2\13\u008a\3\2\2\2\r\u008d\3\2\2\2\17\u0094\3\2"+
		"\2\2\21\u009e\3\2\2\2\23\u00a6\3\2\2\2\25\u00b4\3\2\2\2\27\u00c2\3\2\2"+
		"\2\31\u00cb\3\2\2\2\33\u00d8\3\2\2\2\35\u00da\3\2\2\2\37\u00dc\3\2\2\2"+
		"!\u00de\3\2\2\2#\u00e0\3\2\2\2%\u00e2\3\2\2\2\'\u00e6\3\2\2\2)\u00ea\3"+
		"\2\2\2+\u00ee\3\2\2\2-\u00f2\3\2\2\2/\u00f8\3\2\2\2\61\u00fe\3\2\2\2\63"+
		"\u0109\3\2\2\2\65\u0114\3\2\2\2\67\u0116\3\2\2\29\u0118\3\2\2\2;\u011a"+
		"\3\2\2\2=\u011c\3\2\2\2?\u011e\3\2\2\2A\u0121\3\2\2\2C\u0125\3\2\2\2E"+
		"\u0128\3\2\2\2G\u012b\3\2\2\2I\u012d\3\2\2\2K\u012f\3\2\2\2M\u0132\3\2"+
		"\2\2O\u0135\3\2\2\2Q\u0138\3\2\2\2S\u013b\3\2\2\2U\u013d\3\2\2\2W\u0146"+
		"\3\2\2\2Y\u0148\3\2\2\2[\u014a\3\2\2\2]\u014f\3\2\2\2_\u0158\3\2\2\2a"+
		"\u015e\3\2\2\2c\u0168\3\2\2\2e\u0170\3\2\2\2g\u0176\3\2\2\2i\u017e\3\2"+
		"\2\2k\u018e\3\2\2\2m\u0197\3\2\2\2o\u01a6\3\2\2\2q\u01a8\3\2\2\2s\u01aa"+
		"\3\2\2\2u\u01b2\3\2\2\2w\u01c0\3\2\2\2yz\7\"\2\2z{\3\2\2\2{|\b\2\2\2|"+
		"\4\3\2\2\2}~\7\13\2\2~\177\3\2\2\2\177\u0080\b\3\2\2\u0080\6\3\2\2\2\u0081"+
		"\u0083\7\17\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0085\7\f\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\4\2\2\u0087"+
		"\b\3\2\2\2\u0088\u0089\t\2\2\2\u0089\n\3\2\2\2\u008a\u008b\t\3\2\2\u008b"+
		"\f\3\2\2\2\u008c\u008e\7/\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\u0090\3\2\2\2\u008f\u0091\5\t\5\2\u0090\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\16\3\2\2\2\u0094"+
		"\u0095\7X\2\2\u0095\u0096\7C\2\2\u0096\u0097\7T\2\2\u0097\u0098\7K\2\2"+
		"\u0098\u0099\7C\2\2\u0099\u009a\7D\2\2\u009a\u009b\7N\2\2\u009b\u009c"+
		"\7G\2\2\u009c\u009d\7U\2\2\u009d\20\3\2\2\2\u009e\u009f\7H\2\2\u009f\u00a0"+
		"\7W\2\2\u00a0\u00a1\7P\2\2\u00a1\u00a2\7E\2\2\u00a2\u00a3\7K\2\2\u00a3"+
		"\u00a4\7Q\2\2\u00a4\u00a5\7P\2\2\u00a5\22\3\2\2\2\u00a6\u00a7\7R\2\2\u00a7"+
		"\u00a8\7T\2\2\u00a8\u00a9\7Q\2\2\u00a9\u00aa\7E\2\2\u00aa\u00ab\7G\2\2"+
		"\u00ab\u00ac\7F\2\2\u00ac\u00ad\7K\2\2\u00ad\u00ae\7O\2\2\u00ae\u00af"+
		"\7K\2\2\u00af\u00b0\7G\2\2\u00b0\u00b1\7P\2\2\u00b1\u00b2\7V\2\2\u00b2"+
		"\u00b3\7Q\2\2\u00b3\24\3\2\2\2\u00b4\u00b5\7K\2\2\u00b5\u00b6\7P\2\2\u00b6"+
		"\u00b7\7U\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7T\2\2\u00b9\u00ba\7W\2\2"+
		"\u00ba\u00bb\7E\2\2\u00bb\u00bc\7E\2\2\u00bc\u00bd\7K\2\2\u00bd\u00be"+
		"\7Q\2\2\u00be\u00bf\7P\2\2\u00bf\u00c0\7G\2\2\u00c0\u00c1\7U\2\2\u00c1"+
		"\26\3\2\2\2\u00c2\u00c3\7R\2\2\u00c3\u00c4\7T\2\2\u00c4\u00c5\7Q\2\2\u00c5"+
		"\u00c6\7I\2\2\u00c6\u00c7\7T\2\2\u00c7\u00c8\7C\2\2\u00c8\u00c9\7O\2\2"+
		"\u00c9\u00ca\7C\2\2\u00ca\30\3\2\2\2\u00cb\u00cc\7U\2\2\u00cc\u00cd\7"+
		"W\2\2\u00cd\u00ce\7D\2\2\u00ce\u00cf\7R\2\2\u00cf\u00d0\7T\2\2\u00d0\u00d1"+
		"\7Q\2\2\u00d1\u00d2\7I\2\2\u00d2\u00d3\7T\2\2\u00d3\u00d4\7C\2\2\u00d4"+
		"\u00d5\7O\2\2\u00d5\u00d6\7C\2\2\u00d6\u00d7\7U\2\2\u00d7\32\3\2\2\2\u00d8"+
		"\u00d9\7<\2\2\u00d9\34\3\2\2\2\u00da\u00db\7*\2\2\u00db\36\3\2\2\2\u00dc"+
		"\u00dd\7+\2\2\u00dd \3\2\2\2\u00de\u00df\7=\2\2\u00df\"\3\2\2\2\u00e0"+
		"\u00e1\7.\2\2\u00e1$\3\2\2\2\u00e2\u00e3\7P\2\2\u00e3\u00e4\7W\2\2\u00e4"+
		"\u00e5\7O\2\2\u00e5&\3\2\2\2\u00e6\u00e7\7N\2\2\u00e7\u00e8\7Q\2\2\u00e8"+
		"\u00e9\7I\2\2\u00e9(\3\2\2\2\u00ea\u00eb\7U\2\2\u00eb\u00ec\7G\2\2\u00ec"+
		"\u00ed\7S\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		"\u00f1\7x\2\2\u00f1,\3\2\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4\7c\2\2\u00f4"+
		"\u00f5\7{\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7t\2\2\u00f7.\3\2\2\2\u00f8"+
		"\u00f9\7o\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7q\2\2"+
		"\u00fc\u00fd\7t\2\2\u00fd\60\3\2\2\2\u00fe\u00ff\7o\2\2\u00ff\u0100\7"+
		"c\2\2\u0100\u0101\7{\2\2\u0101\u0102\7q\2\2\u0102\u0103\7t\2\2\u0103\u0104"+
		"\7a\2\2\u0104\u0105\7s\2\2\u0105\u0106\7w\2\2\u0106\u0107\7g\2\2\u0107"+
		"\u0108\7a\2\2\u0108\62\3\2\2\2\u0109\u010a\7o\2\2\u010a\u010b\7g\2\2\u010b"+
		"\u010c\7p\2\2\u010c\u010d\7q\2\2\u010d\u010e\7t\2\2\u010e\u010f\7a\2\2"+
		"\u010f\u0110\7s\2\2\u0110\u0111\7w\2\2\u0111\u0112\7g\2\2\u0112\u0113"+
		"\7a\2\2\u0113\64\3\2\2\2\u0114\u0115\7-\2\2\u0115\66\3\2\2\2\u0116\u0117"+
		"\7/\2\2\u01178\3\2\2\2\u0118\u0119\7,\2\2\u0119:\3\2\2\2\u011a\u011b\7"+
		"\61\2\2\u011b<\3\2\2\2\u011c\u011d\7?\2\2\u011d>\3\2\2\2\u011e\u011f\7"+
		"u\2\2\u011f\u0120\7k\2\2\u0120@\3\2\2\2\u0121\u0122\7h\2\2\u0122\u0123"+
		"\7u\2\2\u0123\u0124\7k\2\2\u0124B\3\2\2\2\u0125\u0126\7@\2\2\u0126\u0127"+
		"\7?\2\2\u0127D\3\2\2\2\u0128\u0129\7>\2\2\u0129\u012a\7?\2\2\u012aF\3"+
		"\2\2\2\u012b\u012c\7@\2\2\u012cH\3\2\2\2\u012d\u012e\7>\2\2\u012eJ\3\2"+
		"\2\2\u012f\u0130\7#\2\2\u0130\u0131\7?\2\2\u0131L\3\2\2\2\u0132\u0133"+
		"\7?\2\2\u0133\u0134\7?\2\2\u0134N\3\2\2\2\u0135\u0136\7(\2\2\u0136\u0137"+
		"\7(\2\2\u0137P\3\2\2\2\u0138\u0139\7~\2\2\u0139\u013a\7~\2\2\u013aR\3"+
		"\2\2\2\u013b\u013c\7#\2\2\u013cT\3\2\2\2\u013d\u013e\7g\2\2\u013e\u013f"+
		"\7p\2\2\u013f\u0140\7v\2\2\u0140\u0141\7q\2\2\u0141\u0142\7p\2\2\u0142"+
		"\u0143\7e\2\2\u0143\u0144\7g\2\2\u0144\u0145\7u\2\2\u0145V\3\2\2\2\u0146"+
		"\u0147\7]\2\2\u0147X\3\2\2\2\u0148\u0149\7_\2\2\u0149Z\3\2\2\2\u014a\u014b"+
		"\7u\2\2\u014b\u014c\7k\2\2\u014c\u014d\7p\2\2\u014d\u014e\7q\2\2\u014e"+
		"\\\3\2\2\2\u014f\u0150\7o\2\2\u0150\u0151\7k\2\2\u0151\u0152\7g\2\2\u0152"+
		"\u0153\7p\2\2\u0153\u0154\7v\2\2\u0154\u0155\7t\2\2\u0155\u0156\7c\2\2"+
		"\u0156\u0157\7u\2\2\u0157^\3\2\2\2\u0158\u0159\7j\2\2\u0159\u015a\7c\2"+
		"\2\u015a\u015b\7e\2\2\u015b\u015c\7g\2\2\u015c\u015d\7t\2\2\u015d`\3\2"+
		"\2\2\u015e\u015f\7h\2\2\u015f\u0160\7o\2\2\u0160\u0161\7k\2\2\u0161\u0162"+
		"\7g\2\2\u0162\u0163\7p\2\2\u0163\u0164\7v\2\2\u0164\u0165\7t\2\2\u0165"+
		"\u0166\7c\2\2\u0166\u0167\7u\2\2\u0167b\3\2\2\2\u0168\u0169\7t\2\2\u0169"+
		"\u016a\7w\2\2\u016a\u016b\7r\2\2\u016b\u016c\7v\2\2\u016c\u016d\7w\2\2"+
		"\u016d\u016e\7t\2\2\u016e\u016f\7c\2\2\u016fd\3\2\2\2\u0170\u0171\7x\2"+
		"\2\u0171\u0172\7c\2\2\u0172\u0173\7e\2\2\u0173\u0174\7k\2\2\u0174\u0175"+
		"\7c\2\2\u0175f\3\2\2\2\u0176\u0177\7o\2\2\u0177\u0178\7q\2\2\u0178\u0179"+
		"\7u\2\2\u0179\u017a\7v\2\2\u017a\u017b\7t\2\2\u017b\u017c\7c\2\2\u017c"+
		"\u017d\7t\2\2\u017dh\3\2\2\2\u017e\u017f\7w\2\2\u017f\u0180\7n\2\2\u0180"+
		"\u0181\7v\2\2\u0181\u0182\7k\2\2\u0182\u0183\7o\2\2\u0183\u0184\7c\2\2"+
		"\u0184\u0185\7a\2\2\u0185\u0186\7r\2\2\u0186\u0187\7q\2\2\u0187\u0188"+
		"\7u\2\2\u0188\u0189\7k\2\2\u0189\u018a\7e\2\2\u018a\u018b\7k\2\2\u018b"+
		"\u018c\7q\2\2\u018c\u018d\7p\2\2\u018dj\3\2\2\2\u018e\u018f\7H\2\2\u018f"+
		"\u0190\7H\2\2\u0190\u0191\7W\2\2\u0191\u0192\7P\2\2\u0192\u0193\7E\2\2"+
		"\u0193\u0194\7K\2\2\u0194\u0195\7Q\2\2\u0195\u0196\7P\2\2\u0196l\3\2\2"+
		"\2\u0197\u0198\7H\2\2\u0198\u0199\7R\2\2\u0199\u019a\7T\2\2\u019a\u019b"+
		"\7Q\2\2\u019b\u019c\7E\2\2\u019c\u019d\7G\2\2\u019d\u019e\7F\2\2\u019e"+
		"\u019f\7K\2\2\u019f\u01a0\7O\2\2\u01a0\u01a1\7K\2\2\u01a1\u01a2\7G\2\2"+
		"\u01a2\u01a3\7P\2\2\u01a3\u01a4\7V\2\2\u01a4\u01a5\7Q\2\2\u01a5n\3\2\2"+
		"\2\u01a6\u01a7\7V\2\2\u01a7p\3\2\2\2\u01a8\u01a9\7H\2\2\u01a9r\3\2\2\2"+
		"\u01aa\u01af\5\13\6\2\u01ab\u01ae\5\13\6\2\u01ac\u01ae\5\t\5\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0t\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7\61\2\2"+
		"\u01b3\u01b4\7,\2\2\u01b4\u01b8\3\2\2\2\u01b5\u01b7\13\2\2\2\u01b6\u01b5"+
		"\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9"+
		"\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7,\2\2\u01bc\u01bd\7\61"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\b;\2\2\u01bfv\3\2\2\2\u01c0\u01c1"+
		"\7\61\2\2\u01c1\u01c2\7\61\2\2\u01c2\u01c6\3\2\2\2\u01c3\u01c5\13\2\2"+
		"\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c6\u01c4"+
		"\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\5\7\4\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cc\b<\2\2\u01ccx\3\2\2\2\n\2\u0082\u008d\u0092"+
		"\u01ad\u01af\u01b8\u01c6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}