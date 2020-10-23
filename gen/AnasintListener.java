// Generated from C:/Users/arubi/IdeaProjects/PL/proyectoPL/src\Anasint.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link Anasint#secuencia_entera}.
	 * @param ctx the parse tree
	 */
	void enterSecuencia_entera(Anasint.Secuencia_enteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#secuencia_entera}.
	 * @param ctx the parse tree
	 */
	void exitSecuencia_entera(Anasint.Secuencia_enteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#secuencia_logica}.
	 * @param ctx the parse tree
	 */
	void enterSecuencia_logica(Anasint.Secuencia_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#secuencia_logica}.
	 * @param ctx the parse tree
	 */
	void exitSecuencia_logica(Anasint.Secuencia_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Anasint.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Anasint.ExprContext ctx);
}