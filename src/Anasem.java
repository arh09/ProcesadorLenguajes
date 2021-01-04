import java.util.*;

public class Anasem extends AnasintBaseVisitor<Object> {
    //variables --> mapa para almacenar variables flobales
    private Map<String,Integer> variables = new HashMap<>();

    @Override
    //programa: PROGRAMA VARIABLES(variables)? subprogramas INSTRUCCIONES(instrucciones)? EOF;
    public Object visitPrograma(Anasint.ProgramaContext ctx) {
        System.out.println("Comienzo de PROGRAMA...");
        visit(ctx.variables());
        visit(ctx.subprogramas());
        if(ctx.children.contains(ctx.instrucciones())){
            visit(ctx.instrucciones());
        }
        return null;
    }

    @Override
    //variables: VARIABLES (vars)*;
    public Object visitVariables(Anasint.VariablesContext ctx) {
        System.out.println("VARIABLES");
        Map<String, Integer> n = new HashMap<>();
        for (int i = 1; i < ctx.children.size(); i++) {
            Map<String, Integer> m = (Map<String, Integer>) visit(ctx.children.get(i));
            n.putAll(m);
        }

        return n;
    }


    //vars: varRecurs DOS_PUNTOS tipo PyC
    @Override
    public Object visitVars(Anasint.VarsContext ctx) {
        Map<String, Integer> m = new HashMap<>();
        Set<String> r = (Set<String>)visit(ctx.varRecurs());
        Integer t = (Integer)visit(ctx.tipo());
        r.stream().forEach((v)->m.put(v,t));
        variables.putAll(m); //la utilizaremos luego para el tipado

        return m;
    }

    @Override
    //varRecurs: VAR (COMA varRecurs)*;
    public Object visitVarRecurs(Anasint.VarRecursContext ctx) {
        Set<String> r = new HashSet<>();
        r.add(ctx.VAR().getText());
        if(ctx.getChildCount()>1){ //recorro la parte recursiva y la visito
            for(Anasint.VarRecursContext v : ctx.varRecurs()) {
                Set<String> s = (Set<String>) visit(v);
                r.addAll(s);
            }
        }
        System.out.println("\t" + r);
        return r;
    }

    @Override
    //tipo: elemental | no_elemental;
    public Object visitTipo(Anasint.TipoContext ctx) {
        return visit(ctx.getChild(0)); //recogemos "t"
    }

    @Override
    // elemental: NUM | LOG ;
    public Object visitElemental(Anasint.ElementalContext ctx) {
        Integer a = ctx.getStart().getType();
        return a;
    }

    @Override
    //no_elemental: SEQ_NUM | SEQ_LOG;
    public Object visitNo_elemental(Anasint.No_elementalContext ctx) {
        Integer a = ctx.getStart().getType();
        return a;
    }




    @Override
    //asignacion: asignacion_simple | asignacion_multiple;
    public Object visitAsignacion(Anasint.AsignacionContext ctx) {
        return visit(ctx.getChild(0));
    }


    @Override
    //asignacion_simple: asignacion_binaria | asignacion_logica | asignacion_secuencia;
    public Object visitAsignacion_simple(Anasint.Asignacion_simpleContext ctx) {
        return visit(ctx.getChild(0));
    }




    @Override
    //asignacion_binaria: VAR IGUAL expresion_binaria PyC;
    public Object visitAsignacion_binaria(Anasint.Asignacion_binariaContext ctx) {


        String izquierdaAsig = ctx.VAR().getText();
        //se comprueba que las variables binarias declaradas coinciden con las que están almacenada al comienzo del programa
        if(variables.containsKey(izquierdaAsig)) {
            System.out.println("Variable --> " +izquierdaAsig +" EXISTE VARIABLE que se está asignando");

            Integer tipoDerecha = (Integer)visit(ctx.getChild(2));
            if(tipoDerecha==variables.get(izquierdaAsig)){ // si coincide el tipo de la derecha con el de la izquierda bien tipada
                System.out.println("--------> " + izquierdaAsig + " bien tipada <---------\n");
            }else{
                System.out.println("--------> " + izquierdaAsig + " mal tipada  <---------\n ");
            }

        }else {
            System.out.println("Variable --> " +izquierdaAsig + " ERROR, no está declarada");

        }


        return null;
    }

    //expresion_binaria: NUMERO
    //    | VAR
    //    | NUMERO (operaciones)?
    //    | VAR (operaciones)?
    //    ;
    // j = 0  m = y;
    //parte derecha
    public Object visitExpresion_binaria(Anasint.Expresion_binariaContext ctx) {

        Set<Object> s = new HashSet<>();
        int tipo = ctx.getStart().getType();
        if(Anasint.NUMERO==tipo){
            tipo = Anasint.NUM;
        }else{
            tipo = Anasint.VAR;
        }

        return tipo;

    }

    ////////////////////////////////// para secuencias ////////////////////////////

    @Override
    //asignacion_secuencia: VAR IGUAL expresion_secuencia PyC ;         s = [1,42,4,5]
    public Object visitAsignacion_secuencia(Anasint.Asignacion_secuenciaContext ctx) {
        Map<Object,Object> mapAux = new HashMap<>();
        String izquierdaAsig = ctx.VAR().getText();
        if(variables.containsKey(izquierdaAsig)){
            System.out.println("Variable --> " +izquierdaAsig +" EXISTE VARIABLE que se está asignando");

            Integer tipoDerecha = (Integer)visit(ctx.getChild(2));
            if(tipoDerecha==variables.get(izquierdaAsig)){ // si coincide el tipo de la derecha con el de la izquierda bien tipada
                System.out.println("--------> " + izquierdaAsig + " bien tipada <---------\n");
            }else{
                System.out.println("--------> " + izquierdaAsig + " mal tipada  <---------\n");
            }

        }else{
            System.out.println("Variable --> " +izquierdaAsig + " ERROR, no está declarada");
        }

        return null;
    }

    @Override
    //expresion_secuencia: elemento_secuencia | secuencia_completa ;
    public Object visitExpresion_secuencia(Anasint.Expresion_secuenciaContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    //elemento_secuencia : VAR CORCHETE_ABIERTO (VAR | NUMERO)(operaciones)? CORCHETE_CERRADO;
    public Object visitElemento_secuencia(Anasint.Elemento_secuenciaContext ctx) {
        Object tipo = ctx.getChild(2).getText();
        if(ctx.VAR()==tipo){
            tipo = Anasint.VAR;
        }else{
            tipo = Anasint.NUM;
        }
        return tipo;
    }

    @Override
    //secuencia_completa: CORCHETE_ABIERTO (sec_binaria | sec_logica) CORCHETE_CERRADO;
    public Object visitSecuencia_completa(Anasint.Secuencia_completaContext ctx) {
        return visit(ctx.getChild(1));
    }

    //sec_binaria: (NUMERO| VAR)(operaciones)? COMA sec_binaria
    //        | (NUMERO| VAR)(operaciones)?;
    public Object visitSec_binaria(Anasint.Sec_binariaContext ctx) {
        int tipo = ctx.getStart().getType();
        if(Anasint.NUMERO==tipo){
            tipo = Anasint.SEQ_NUM;
        }else{
            tipo = Anasint.SEQ_LOG;
        }

        return tipo;
    }

    //////////////// FIN SECUENCIAS /////////////////////////////////


    //////////// SECUENCIA LOGICA y ASIGNACION LOGICA BINARIA///////////////////////////
    @Override
    // asignacion_logica: VAR IGUAL expresion_logica PyC;
    public Object visitAsignacion_logica(Anasint.Asignacion_logicaContext ctx) {
        String izquierdaAsig = ctx.VAR().getText();

        if(variables.containsKey(izquierdaAsig)) {
            System.out.println("Variable --> " +izquierdaAsig +" EXISTE VARIABLE que se está asignando");

            Integer tipoDerecha = (Integer)visit(ctx.getChild(2));
            if(tipoDerecha==variables.get(izquierdaAsig)){ // si coincide el tipo de la derecha con el de la izquierda bien tipada
                System.out.println("--------> " + izquierdaAsig + " bien tipada <---------\n");
            }else{
                System.out.println("--------> " +  izquierdaAsig + " mal tipada <---------\n");
            }

        }else {
            System.out.println("Variable --> " +izquierdaAsig + " ERROR, no está declarada");

        }


        return null;
    }


    //expresion_logica: T
    //    | F
    //    | VAR
    //    ;
    public Object visitExpresion_logica(Anasint.Expresion_logicaContext ctx) {
        int tipo = ctx.getStart().getType();
        if(Anasint.F==tipo || Anasint.T==tipo){
            tipo = Anasint.LOG;
        }

        return tipo;
    }


    ////////////// FIN SECUENCIA LOGICA ///////////////////////
}
