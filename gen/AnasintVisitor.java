// Generated from C:/Users/arubi/IdeaProjects/PL/proyectoPL/src\Anasint.g4 by ANTLR 4.8
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
}