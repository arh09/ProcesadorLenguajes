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
	/**
	 * Enter a parse tree produced by {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(Anasint.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(Anasint.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#subprograma}.
	 * @param ctx the parse tree
	 */
	void enterSubprograma(Anasint.SubprogramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#subprograma}.
	 * @param ctx the parse tree
	 */
	void exitSubprograma(Anasint.SubprogramaContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#func1}.
	 * @param ctx the parse tree
	 */
	void enterFunc1(Anasint.Func1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#func1}.
	 * @param ctx the parse tree
	 */
	void exitFunc1(Anasint.Func1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#func2}.
	 * @param ctx the parse tree
	 */
	void enterFunc2(Anasint.Func2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#func2}.
	 * @param ctx the parse tree
	 */
	void exitFunc2(Anasint.Func2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#func3}.
	 * @param ctx the parse tree
	 */
	void enterFunc3(Anasint.Func3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#func3}.
	 * @param ctx the parse tree
	 */
	void exitFunc3(Anasint.Func3Context ctx);
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
	 * Enter a parse tree produced by {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(Anasint.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(Anasint.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(Anasint.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(Anasint.Expr3Context ctx);
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
}