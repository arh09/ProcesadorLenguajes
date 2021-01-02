// Generated from /home/alberto/IdeaProjects/Procesadores de Lenguajes/Proyecto/proyectoPL/src/Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Anasint}.
 */
public interface AnasintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(Anasint.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(Anasint.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(Anasint.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(Anasint.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#varRecurs}.
	 * @param ctx the parse tree
	 */
	void enterVarRecurs(Anasint.VarRecursContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#varRecurs}.
	 * @param ctx the parse tree
	 */
	void exitVarRecurs(Anasint.VarRecursContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(Anasint.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(Anasint.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#elemental}.
	 * @param ctx the parse tree
	 */
	void enterElemental(Anasint.ElementalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#elemental}.
	 * @param ctx the parse tree
	 */
	void exitElemental(Anasint.ElementalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#no_elemental}.
	 * @param ctx the parse tree
	 */
	void enterNo_elemental(Anasint.No_elementalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#no_elemental}.
	 * @param ctx the parse tree
	 */
	void exitNo_elemental(Anasint.No_elementalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 */
	void enterSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 */
	void exitSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(Anasint.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(Anasint.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(Anasint.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(Anasint.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresionF}.
	 * @param ctx the parse tree
	 */
	void enterExpresionF(Anasint.ExpresionFContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresionF}.
	 * @param ctx the parse tree
	 */
	void exitExpresionF(Anasint.ExpresionFContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#nombre_funcion}.
	 * @param ctx the parse tree
	 */
	void enterNombre_funcion(Anasint.Nombre_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#nombre_funcion}.
	 * @param ctx the parse tree
	 */
	void exitNombre_funcion(Anasint.Nombre_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(Anasint.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(Anasint.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#retornoFuncion}.
	 * @param ctx the parse tree
	 */
	void enterRetornoFuncion(Anasint.RetornoFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#retornoFuncion}.
	 * @param ctx the parse tree
	 */
	void exitRetornoFuncion(Anasint.RetornoFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr_booleana}.
	 * @param ctx the parse tree
	 */
	void enterExpr_booleana(Anasint.Expr_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr_booleana}.
	 * @param ctx the parse tree
	 */
	void exitExpr_booleana(Anasint.Expr_booleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#predicado}.
	 * @param ctx the parse tree
	 */
	void enterPredicado(Anasint.PredicadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#predicado}.
	 * @param ctx the parse tree
	 */
	void exitPredicado(Anasint.PredicadoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumVarComa}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void enterNumVarComa(Anasint.NumVarComaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumVarComa}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void exitNumVarComa(Anasint.NumVarComaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumVar}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void enterNumVar(Anasint.NumVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumVar}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void exitNumVar(Anasint.NumVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SeqVarComa}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void enterSeqVarComa(Anasint.SeqVarComaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SeqVarComa}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void exitSeqVarComa(Anasint.SeqVarComaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SeqVar}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void enterSeqVar(Anasint.SeqVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SeqVar}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void exitSeqVar(Anasint.SeqVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimiento(Anasint.ProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimiento(Anasint.ProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(Anasint.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(Anasint.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#exprProc}.
	 * @param ctx the parse tree
	 */
	void enterExprProc(Anasint.ExprProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#exprProc}.
	 * @param ctx the parse tree
	 */
	void exitExprProc(Anasint.ExprProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignacion_simple}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_simple(Anasint.Asignacion_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignacion_simple}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_simple(Anasint.Asignacion_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignacion_binaria}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_binaria(Anasint.Asignacion_binariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignacion_binaria}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_binaria(Anasint.Asignacion_binariaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinNum}
	 * labeled alternative in {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 */
	void enterBinNum(Anasint.BinNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinNum}
	 * labeled alternative in {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 */
	void exitBinNum(Anasint.BinNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinVar}
	 * labeled alternative in {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 */
	void enterBinVar(Anasint.BinVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinVar}
	 * labeled alternative in {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 */
	void exitBinVar(Anasint.BinVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinNumOp}
	 * labeled alternative in {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 */
	void enterBinNumOp(Anasint.BinNumOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinNumOp}
	 * labeled alternative in {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 */
	void exitBinNumOp(Anasint.BinNumOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinVarOp}
	 * labeled alternative in {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 */
	void enterBinVarOp(Anasint.BinVarOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinVarOp}
	 * labeled alternative in {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 */
	void exitBinVarOp(Anasint.BinVarOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinParent}
	 * labeled alternative in {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 */
	void enterBinParent(Anasint.BinParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinParent}
	 * labeled alternative in {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 */
	void exitBinParent(Anasint.BinParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinFun}
	 * labeled alternative in {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 */
	void enterBinFun(Anasint.BinFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinFun}
	 * labeled alternative in {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 */
	void exitBinFun(Anasint.BinFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignacion_logica}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_logica(Anasint.Asignacion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignacion_logica}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_logica(Anasint.Asignacion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogTrue}
	 * labeled alternative in {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExprLogTrue(Anasint.ExprLogTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogTrue}
	 * labeled alternative in {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExprLogTrue(Anasint.ExprLogTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogFalse}
	 * labeled alternative in {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExprLogFalse(Anasint.ExprLogFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogFalse}
	 * labeled alternative in {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExprLogFalse(Anasint.ExprLogFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogVar}
	 * labeled alternative in {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExprLogVar(Anasint.ExprLogVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogVar}
	 * labeled alternative in {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExprLogVar(Anasint.ExprLogVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogFun}
	 * labeled alternative in {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExprLogFun(Anasint.ExprLogFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogFun}
	 * labeled alternative in {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExprLogFun(Anasint.ExprLogFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogProc}
	 * labeled alternative in {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExprLogProc(Anasint.ExprLogProcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogProc}
	 * labeled alternative in {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExprLogProc(Anasint.ExprLogProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion_secuencia}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_secuencia(Anasint.Expresion_secuenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion_secuencia}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_secuencia(Anasint.Expresion_secuenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#elemento_secuencia}.
	 * @param ctx the parse tree
	 */
	void enterElemento_secuencia(Anasint.Elemento_secuenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#elemento_secuencia}.
	 * @param ctx the parse tree
	 */
	void exitElemento_secuencia(Anasint.Elemento_secuenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#secuencia_completa}.
	 * @param ctx the parse tree
	 */
	void enterSecuencia_completa(Anasint.Secuencia_completaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#secuencia_completa}.
	 * @param ctx the parse tree
	 */
	void exitSecuencia_completa(Anasint.Secuencia_completaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#sec_binaria}.
	 * @param ctx the parse tree
	 */
	void enterSec_binaria(Anasint.Sec_binariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#sec_binaria}.
	 * @param ctx the parse tree
	 */
	void exitSec_binaria(Anasint.Sec_binariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#sec_logica}.
	 * @param ctx the parse tree
	 */
	void enterSec_logica(Anasint.Sec_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#sec_logica}.
	 * @param ctx the parse tree
	 */
	void exitSec_logica(Anasint.Sec_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignacion_secuencia}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_secuencia(Anasint.Asignacion_secuenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignacion_secuencia}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_secuencia(Anasint.Asignacion_secuenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignacion_multiple}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_multiple(Anasint.Asignacion_multipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignacion_multiple}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_multiple(Anasint.Asignacion_multipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr5}.
	 * @param ctx the parse tree
	 */
	void enterExpr5(Anasint.Expr5Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr5}.
	 * @param ctx the parse tree
	 */
	void exitExpr5(Anasint.Expr5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code OpSuma}
	 * labeled alternative in {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOpSuma(Anasint.OpSumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpSuma}
	 * labeled alternative in {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOpSuma(Anasint.OpSumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpResta}
	 * labeled alternative in {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOpResta(Anasint.OpRestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpResta}
	 * labeled alternative in {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOpResta(Anasint.OpRestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpMult}
	 * labeled alternative in {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOpMult(Anasint.OpMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpMult}
	 * labeled alternative in {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOpMult(Anasint.OpMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpDiv}
	 * labeled alternative in {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOpDiv(Anasint.OpDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpDiv}
	 * labeled alternative in {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOpDiv(Anasint.OpDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(Anasint.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(Anasint.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#concatena_operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterConcatena_operador_logico(Anasint.Concatena_operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#concatena_operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitConcatena_operador_logico(Anasint.Concatena_operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#desigualdades}.
	 * @param ctx the parse tree
	 */
	void enterDesigualdades(Anasint.DesigualdadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#desigualdades}.
	 * @param ctx the parse tree
	 */
	void exitDesigualdades(Anasint.DesigualdadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#bloque_opcional}.
	 * @param ctx the parse tree
	 */
	void enterBloque_opcional(Anasint.Bloque_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#bloque_opcional}.
	 * @param ctx the parse tree
	 */
	void exitBloque_opcional(Anasint.Bloque_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 */
	void enterIteracion(Anasint.IteracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 */
	void exitIteracion(Anasint.IteracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 */
	void enterRuptura(Anasint.RupturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 */
	void exitRuptura(Anasint.RupturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#llamada_a_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_a_funcion(Anasint.Llamada_a_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#llamada_a_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_a_funcion(Anasint.Llamada_a_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#nombre_llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterNombre_llamada_funcion(Anasint.Nombre_llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#nombre_llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitNombre_llamada_funcion(Anasint.Nombre_llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#llamada_a_procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_a_procedimiento(Anasint.Llamada_a_procedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#llamada_a_procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_a_procedimiento(Anasint.Llamada_a_procedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#devolucion}.
	 * @param ctx the parse tree
	 */
	void enterDevolucion(Anasint.DevolucionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#devolucion}.
	 * @param ctx the parse tree
	 */
	void exitDevolucion(Anasint.DevolucionContext ctx);
}