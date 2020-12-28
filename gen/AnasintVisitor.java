// Generated from /home/alberto/IdeaProjects/Procesadores de Lenguajes/Proyecto/proyectoPL/src/Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Anasint}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnasintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Anasint.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(Anasint.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#varRecurs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRecurs(Anasint.VarRecursContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(Anasint.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#elemental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemental(Anasint.ElementalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#no_elemental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_elemental(Anasint.No_elementalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(Anasint.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(Anasint.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresionF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionF(Anasint.ExpresionFContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#nombre_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre_funcion(Anasint.Nombre_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(Anasint.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#retornoFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornoFuncion(Anasint.RetornoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_booleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_booleana(Anasint.Expr_booleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#predicado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicado(Anasint.PredicadoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumVarComa}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumVarComa(Anasint.NumVarComaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumVar}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumVar(Anasint.NumVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SeqVarComa}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqVarComa(Anasint.SeqVarComaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SeqVar}
	 * labeled alternative in {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqVar(Anasint.SeqVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#procedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimiento(Anasint.ProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(Anasint.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#exprProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprProc(Anasint.ExprProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignacion_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_simple(Anasint.Asignacion_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignacion_binaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_binaria(Anasint.Asignacion_binariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion_binaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_binaria(Anasint.Expresion_binariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignacion_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_logica(Anasint.Asignacion_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_logica(Anasint.Expresion_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion_secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_secuencia(Anasint.Expresion_secuenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#elemento_secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento_secuencia(Anasint.Elemento_secuenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#secuencia_completa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecuencia_completa(Anasint.Secuencia_completaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#sec_binaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSec_binaria(Anasint.Sec_binariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#sec_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSec_logica(Anasint.Sec_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignacion_secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_secuencia(Anasint.Asignacion_secuenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignacion_multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_multiple(Anasint.Asignacion_multipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr5(Anasint.Expr5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(Anasint.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(Anasint.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#concatena_operador_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatena_operador_logico(Anasint.Concatena_operador_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#desigualdades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesigualdades(Anasint.DesigualdadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#bloque_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_opcional(Anasint.Bloque_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#iteracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracion(Anasint.IteracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#ruptura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuptura(Anasint.RupturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#llamada_a_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_a_funcion(Anasint.Llamada_a_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#nombre_llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre_llamada_funcion(Anasint.Nombre_llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#llamada_a_procedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_a_procedimiento(Anasint.Llamada_a_procedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#devolucion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevolucion(Anasint.DevolucionContext ctx);
}