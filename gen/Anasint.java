// Generated from C:/Users/dioni/IdeaProjects/proyectoPL/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Anasint extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, VARIABLES=4, VAR=5, DOS_PUNTOS=6, 
		PARENTESIS_ABIERTO=7, PARENTESIS_CERRADO=8, PyC=9, COMA=10, NUM=11, LOG=12, 
		SEQ=13, COMENTARIO_BLOQUE=14, COMENTARIO_LINEA=15;
	public static final int
		RULE_programa = 0, RULE_variables = 1, RULE_vars = 2, RULE_tipo = 3, RULE_elemental = 4, 
		RULE_no_elemental = 5, RULE_secuencia_entera = 6, RULE_secuencia_logica = 7, 
		RULE_expr = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "variables", "vars", "tipo", "elemental", "no_elemental", 
			"secuencia_entera", "secuencia_logica", "expr"
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

	@Override
	public String getGrammarFileName() { return "Anasint.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Anasint(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			variables();
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VARIABLES() { return getToken(Anasint.VARIABLES, 0); }
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(VARIABLES);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(21);
				vars();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VarsContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(Anasint.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(Anasint.VAR, i);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(Anasint.DOS_PUNTOS, 0); }
		public TerminalNode NUM() { return getToken(Anasint.NUM, 0); }
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(VAR);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(28);
				match(COMA);
				setState(29);
				match(VAR);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(DOS_PUNTOS);
			setState(36);
			match(NUM);
			setState(37);
			match(PyC);
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

	public static class TipoContext extends ParserRuleContext {
		public ElementalContext elemental() {
			return getRuleContext(ElementalContext.class,0);
		}
		public No_elementalContext no_elemental() {
			return getRuleContext(No_elementalContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case LOG:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				elemental();
				}
				break;
			case SEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				no_elemental();
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

	public static class ElementalContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(Anasint.NUM, 0); }
		public TerminalNode LOG() { return getToken(Anasint.LOG, 0); }
		public ElementalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterElemental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitElemental(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitElemental(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementalContext elemental() throws RecognitionException {
		ElementalContext _localctx = new ElementalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elemental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class No_elementalContext extends ParserRuleContext {
		public Secuencia_enteraContext secuencia_entera() {
			return getRuleContext(Secuencia_enteraContext.class,0);
		}
		public Secuencia_logicaContext secuencia_logica() {
			return getRuleContext(Secuencia_logicaContext.class,0);
		}
		public No_elementalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_elemental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterNo_elemental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitNo_elemental(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitNo_elemental(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_elementalContext no_elemental() throws RecognitionException {
		No_elementalContext _localctx = new No_elementalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_no_elemental);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				secuencia_entera();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				secuencia_logica();
				}
				break;
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

	public static class Secuencia_enteraContext extends ParserRuleContext {
		public TerminalNode SEQ() { return getToken(Anasint.SEQ, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(Anasint.PARENTESIS_ABIERTO, 0); }
		public TerminalNode PARENTESIS_CERRADO() { return getToken(Anasint.PARENTESIS_CERRADO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Secuencia_enteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secuencia_entera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSecuencia_entera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSecuencia_entera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSecuencia_entera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Secuencia_enteraContext secuencia_entera() throws RecognitionException {
		Secuencia_enteraContext _localctx = new Secuencia_enteraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_secuencia_entera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(SEQ);
			setState(50);
			match(PARENTESIS_ABIERTO);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM) {
				{
				{
				setState(51);
				expr();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(PARENTESIS_CERRADO);
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

	public static class Secuencia_logicaContext extends ParserRuleContext {
		public TerminalNode SEQ() { return getToken(Anasint.SEQ, 0); }
		public TerminalNode PARENTESIS_ABIERTO() { return getToken(Anasint.PARENTESIS_ABIERTO, 0); }
		public TerminalNode PARENTESIS_CERRADO() { return getToken(Anasint.PARENTESIS_CERRADO, 0); }
		public TerminalNode LOG() { return getToken(Anasint.LOG, 0); }
		public Secuencia_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secuencia_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSecuencia_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSecuencia_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSecuencia_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Secuencia_logicaContext secuencia_logica() throws RecognitionException {
		Secuencia_logicaContext _localctx = new Secuencia_logicaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_secuencia_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(SEQ);
			setState(60);
			match(PARENTESIS_ABIERTO);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOG) {
				{
				setState(61);
				match(LOG);
				}
			}

			setState(64);
			match(PARENTESIS_CERRADO);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(Anasint.NUM, 0); }
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(NUM);
				setState(67);
				match(COMA);
				setState(68);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(NUM);
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\3\4\7\4!\n\4\f\4\16\4$\13\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\5\5,\n\5\3\6\3\6\3\7\3\7\5\7\62\n\7\3\b\3\b\3\b"+
		"\7\b\67\n\b\f\b\16\b:\13\b\3\b\3\b\3\t\3\t\3\t\5\tA\n\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\5\nI\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\r\16\2H\2"+
		"\24\3\2\2\2\4\26\3\2\2\2\6\35\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f\61\3\2\2"+
		"\2\16\63\3\2\2\2\20=\3\2\2\2\22H\3\2\2\2\24\25\5\4\3\2\25\3\3\2\2\2\26"+
		"\32\7\6\2\2\27\31\5\6\4\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32"+
		"\33\3\2\2\2\33\5\3\2\2\2\34\32\3\2\2\2\35\"\7\7\2\2\36\37\7\f\2\2\37!"+
		"\7\7\2\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2"+
		"\2\2%&\7\b\2\2&\'\7\r\2\2\'(\7\13\2\2(\7\3\2\2\2),\5\n\6\2*,\5\f\7\2+"+
		")\3\2\2\2+*\3\2\2\2,\t\3\2\2\2-.\t\2\2\2.\13\3\2\2\2/\62\5\16\b\2\60\62"+
		"\5\20\t\2\61/\3\2\2\2\61\60\3\2\2\2\62\r\3\2\2\2\63\64\7\17\2\2\648\7"+
		"\t\2\2\65\67\5\22\n\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\2"+
		"9;\3\2\2\2:8\3\2\2\2;<\7\n\2\2<\17\3\2\2\2=>\7\17\2\2>@\7\t\2\2?A\7\16"+
		"\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\n\2\2C\21\3\2\2\2DE\7\r\2\2EF\7"+
		"\f\2\2FI\5\22\n\2GI\7\r\2\2HD\3\2\2\2HG\3\2\2\2I\23\3\2\2\2\t\32\"+\61"+
		"8@H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}