// Generated from C:/Users/Alberto Rubio/OneDrive/Desktop/ALBERTOU/ETSII/PL/proyectoPL/src\Anasint.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link Anasint#predicado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicado(Anasint.PredicadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresionF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionF(Anasint.ExpresionFContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(Anasint.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#nombre_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre_funcion(Anasint.Nombre_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#retornoFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornoFuncion(Anasint.RetornoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(Anasint.ParamsContext ctx);
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
	 * Visit a parse tree produced by {@link Anasint#asignacion_multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_multiple(Anasint.Asignacion_multipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_binaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_binaria(Anasint.Expr_binariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(Anasint.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#elemento_secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento_secuencia(Anasint.Elemento_secuenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(Anasint.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_logica(Anasint.Expr_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr_secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_secuencia(Anasint.Expr_secuenciaContext ctx);
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
	 * Visit a parse tree produced by {@link Anasint#desigualdades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesigualdades(Anasint.DesigualdadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#operador_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_logico(Anasint.Operador_logicoContext ctx);
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
	 * Visit a parse tree produced by {@link Anasint#devolucion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevolucion(Anasint.DevolucionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#mostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar(Anasint.MostrarContext ctx);
}