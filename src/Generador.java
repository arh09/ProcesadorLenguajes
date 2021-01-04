import org.antlr.v4.runtime.tree.ParseTree;

public class Generador extends AnasintBaseVisitor<String> {



    public String visitVars(Anasint.VarsContext ctx){
        String s = visit(ctx.tipo())+" "+visit(ctx.varRecurs())+";";
        return s;
    }

    //Generar texto correspondiente a variable
    public String visitVarRecurs(Anasint.VarRecursContext ctx) {
        return ctx.getText();
    }

    //Generar texto correspondiente a número
    public String visitBinNum(Anasint.BinNumContext ctx) {
        return ctx.NUMERO().getText();
    }

    //Generar texto correspondiente a variable binaria
    public String visitBinVar(Anasint.BinVarContext ctx) {
        return ctx.VAR().getText();
    }

    //Generar texto correspondiente a número con operaciones
    public String visitBinNumOp(Anasint.BinNumOpContext ctx) {
        visit((ParseTree) ctx.operaciones());
        return ctx.NUMERO().getText();
    }

    //Generar texto correspondiente a número
    public String visitBinVarOp(Anasint.BinVarOpContext ctx) {
        visit((ParseTree) ctx.operaciones());
        return ctx.VAR().getText();
    }

    //Generar texto correspondiente a número
    public String visitBinParent(Anasint.BinParentContext ctx) {
        visit((ParseTree) ctx.expresion_binaria());
        return null;
    }

    //Generar texto correspondiente a número
    public String visitBinFun(Anasint.BinFunContext ctx) {
        visit((ParseTree) ctx.nombre_llamada_funcion());
        return null;
    }

    //Generar texto correspondiente a suma de expresiones
    public String visitOpSuma(Anasint.OpSumaContext ctx) {
    String j=visit(ctx.expresion_binaria());
    return "+"+j;
    }

    //Generar texto correspondiente a diferencia de expresiones
    public String visitOpResta(Anasint.OpRestaContext ctx) {
        String j=visit(ctx.expresion_binaria());
        return "-"+j;
    }

    //Generar texto correspondiente a diferencia de expresiones
    public String visitOpMult(Anasint.OpMultContext ctx) {
        String j=visit(ctx.expresion_binaria());
        return "*"+j;
    }

    //Generar texto correspondiente a diferencia de expresiones
    public String visitOpDiv(Anasint.OpDivContext ctx) {
        String j=visit(ctx.expresion_binaria());
        return "/"+j;
    }

    public String visitExprLogTrue(Anasint.ExprLogTrueContext ctx){
        String res = "";
        if(ctx.children.contains(ctx.NEGACION())){
            res += "!";
        }
        res += "True";
        return res;
    }
    public String visitExprLogFalse(Anasint.ExprLogFalseContext ctx){
        String res = "";
        if(ctx.children.contains(ctx.NEGACION())){
            res += "!";
        }
        res += "False";
        return res;
    }
    public String visitExprLogVar(Anasint.ExprLogVarContext ctx){
        String res = "";
        if(ctx.children.contains(ctx.NEGACION())){
            res += "!";
        }
        res += ctx.VAR().getText();
        return res;
    }

    public String visitExprLogFun(Anasint.ExprLogFunContext ctx){
        String res = "";
        if(ctx.children.contains(ctx.NEGACION())){
            res += "!";
        }
        res += visit(ctx.nombre_llamada_funcion());
        return res;
    }

    public String visitExprLogProc(Anasint.ExprLogProcContext ctx){
        String res = "";
        if(ctx.children.contains(ctx.NEGACION())){
            res += "!";
        }
        res += visit(ctx.llamada_a_procedimiento());
        return res;
    }

    public String visitTipo(Anasint.TipoContext ctx){
        if(ctx.children.contains(ctx.elemental())){
            return visit(ctx.getChild(0));
        }else{
            return visitNo_elemental((Anasint.No_elementalContext) ctx.getChild(0));
        }
    }

    public String visitElemental(Anasint.ElementalContext ctx){
        Integer a = ctx.getStart().getType();
        return a.toString();
    }

    public String visitNo_Elemental(Anasint.No_elementalContext ctx){
        Integer a = ctx.getStart().getType();
        return a.toString();
    }

    public String visitFun(Anasint.FunContext ctx){
        return visit(ctx.getChild(0));
    }

    public String visitFunc(Anasint.FuncContext ctx){
        return visitNombre_Funcion(ctx.nombre_funcion());
    }

    public String visitPredicado(Anasint.PredicadoContext ctx){
        return ctx.expresionF().getText();
    }
    public String visitNombre_Funcion(Anasint.Nombre_funcionContext ctx){
        return ctx.expresionF().getText();
    }


    public String visitFun2(Anasint.FunContext ctx) {
        if(ctx.children.contains(ctx.func())) {
            return visitFunc2(ctx.func());
        }else if(ctx.children.contains(ctx.predicado())){
            return "Boolean";
        }else{return "";}
    }
    public String visitFunc2(Anasint.FuncContext ctx){
        return visitRetornoFuncion(ctx.retornoFuncion());
    }
    public String visitRetornoFuncion(Anasint.RetornoFuncionContext ctx){
        return visitExpr2(ctx.expr2());
    }

    public String visitExpr2(Anasint.Expr2Context ctx){
        if(ctx.getText().contains(",")){
            return "Object[]";
        }else {
            return "Integer";
        }
    }

    @Override
    public String visitNumVar(Anasint.NumVarContext ctx) {
        return "Integer";
    }

    public String visitNumVarComa(Anasint.NumVarComaContext ctx){
        return "Tuple<Integer>";
    }

    public String visitSeqVar(Anasint.SeqVarContext ctx){
        return visitNo_elemental((Anasint.No_elementalContext) ctx.getChild(0));
    }

    public String visitAsignacionBinaria(Anasint.Asignacion_binariaContext ctx){
        return null;
    }

    public String visitFun3(Anasint.FunContext ctx) {
        if(ctx.children.contains(ctx.func())) {
            return visitFunc3(ctx.func());
        }else{return "";}
    }

    public String visitFunc3(Anasint.FuncContext ctx) {
        return visitNombre_Funcion2(ctx.nombre_funcion());
    }

   public String visitNombre_Funcion2(Anasint.Nombre_funcionContext ctx){
        return visitExpr22((Anasint.Expr2Context) ctx.expr2(0));
   }
   public String visitExpr22(Anasint.Expr2Context ctx){
        if(ctx.getText().contains(",")){
            if(ctx.getText().contains("SEQ")){
                return "Integer[] "+ctx.getChild(1).getText()+",";
            }else{
                return  "Integer "+ctx.getChild(1).getText()+",";
            }
        }else{
            if(ctx.getText().contains("SEQ")){
                return "Integer[] "+ctx.getChild(1).getText();
            }else{
                return  "Integer "+ctx.getChild(1).getText();
            }
        }
   }

   public String visitProc(Anasint.ProcContext ctx){
        return ctx.expresionF().getText();
   }

    public String visitProc2(Anasint.ProcContext ctx){
        return ctx.exprProc().getText();
    }
}