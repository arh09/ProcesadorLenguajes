// Generated from C:/Users/dioni/Desktop/pl/proyectoPL/src\Anasint.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogramas(Anasint.SubprogramasContext ctx);
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
	 * Visit a parse tree produced by {@link Anasint#secuencia_entera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecuencia_entera(Anasint.Secuencia_enteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#secuencia_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecuencia_logica(Anasint.Secuencia_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Anasint.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(Anasint.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#subprograma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprograma(Anasint.SubprogramaContext ctx);
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
	 * Visit a parse tree produced by {@link Anasint#func1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc1(Anasint.Func1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#func2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc2(Anasint.Func2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#func3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc3(Anasint.Func3Context ctx);
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
	 * Visit a parse tree produced by {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(Anasint.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr3(Anasint.Expr3Context ctx);
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
	 * Visit a parse tree produced by {@link Anasint#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr4(Anasint.Expr4Context ctx);
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
	 * Visit a parse tree produced by {@link Anasint#condicional_si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional_si(Anasint.Condicional_siContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(Anasint.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condicion1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion1(Anasint.Condicion1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#concatena_operador_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatena_operador_logico(Anasint.Concatena_operador_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#cond1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond1(Anasint.Cond1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#cond2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond2(Anasint.Cond2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#desigualdades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesigualdades(Anasint.DesigualdadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(Anasint.BloqueContext ctx);
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
}