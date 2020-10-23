// Generated from C:/Users/dioni/IdeaProjects/proyectoPL/src\Anasint.g4 by ANTLR 4.8
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
}