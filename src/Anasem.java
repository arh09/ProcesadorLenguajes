import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class Anasem extends AnasintBaseVisitor<Object>{


    private Map<String,Integer> variablesProg = new HashMap<>();
    private Map<String,Integer> variablesSubProg = new HashMap<>();
    private boolean subprog = false;
    private Map<String,List<Integer>> parametrosEntrada = new HashMap<>();
    private Map<String,List<Integer>> parametrosSalida = new HashMap<>();
    private String funcion = null;

    private String resultado= "CORRECTO";

    public Object visitPrograma(Anasint.ProgramaContext ctx) {
        System.out.println("Análisis Semántico:");
        for(ParseTree t : ctx.variables()){
            visit(t);
        }
        visit(ctx.subprogramas());
        if(ctx.children.contains(ctx.instrucciones())){
            visit(ctx.instrucciones());
        }
        System.out.println("Resultado: "+resultado);
        return null;
    }

    public Object visitInstrucciones(Anasint.InstruccionesContext ctx){
        if(ctx.children!=null){
            for(ParseTree t : ctx.children){
                visit(t);
            }
        }
        return null;
    }

    public Object visitMostrar(Anasint.MostrarContext ctx){
        if(subprog){
            for(TerminalNode t: ctx.VAR()){
                if(!variablesSubProg.containsKey(t.getText())&&!variablesProg.containsKey(t.getText())){
                    System.out.println("La variable "+t.getText()+" a mostrar no está declarada.");
                    resultado="INCORRECTO";
                }
            }
            for(Anasint.Elemento_secuenciaContext t: ctx.elemento_secuencia()){
                if(!variablesSubProg.containsKey(t.VAR().getText()) ||!variablesProg.containsKey(t.getText())){
                    System.out.println("La variable "+t.VAR().getText()+" a mostrar no está declarada.");
                    resultado="INCORRECTO";
                }
            }
        }else{
            for(TerminalNode t: ctx.VAR()){
            if(!variablesProg.containsKey(t.getText())){
                System.out.println("La variable "+t.getText()+" a mostrar no está declarada.");
                resultado="INCORRECTO";
            }
        }
            for(Anasint.Elemento_secuenciaContext t: ctx.elemento_secuencia()){
                if(!variablesProg.containsKey(t.VAR().getText())){
                    System.out.println("La variable "+t.VAR().getText()+" a mostrar no está declarada.");
                    resultado="INCORRECTO";
                }
            }
        }


        return null;
    }

    public Object visitDevolucion(Anasint.DevolucionContext ctx){
        List<Integer> res = new ArrayList<Integer>();
        for(ParseTree t : ctx.expresion()){
            Integer tipo = (Integer)visit(t);
            res.add(tipo);
        }
        int j = 0;
        for(Integer i: res){
            if(null!=parametrosSalida.get(funcion)){
                if(i!=parametrosSalida.get(funcion).get(j)){
                    System.out.println("La función "+funcion+ " devuelve parámetros de tipo incorrecto. Espera:"+parametrosSalida.get(funcion).get(j)+" Devuelve:"+i);
                }
            }
            i++;
        }
        return null;
    }

    public Object visitIteracion(Anasint.IteracionContext ctx){
        visit(ctx.condicion());
        visit(ctx.instrucciones());
        return null;
    }

    public Object visitCondicional(Anasint.CondicionalContext ctx){
        visit(ctx.condicion());
        visit(ctx.instrucciones());
        if(ctx.children.contains(ctx.bloque_opcional())){
            visit(ctx.bloque_opcional());
        }
        return null;
    }

    public Object visitCondicion(Anasint.CondicionContext ctx){
        List<Integer> tipos = new ArrayList<Integer>();
        for(ParseTree t : ctx.expresion()) {
            Integer i = (Integer)visit(t);
            tipos.add(i);
        }
        if(subprog){
            if(tipos.get(0)!=tipos.get(1) || (tipos.get(0)!=Anasint.NUM || tipos.get(1)!=Anasint.NUM)){
                System.out.println("La expresión "+ctx.expresion(0).getText()+ctx.desigualdades().getText()+ctx.expresion(1).getText()+ " no está bien tipada en el subprograma.");
                resultado="INCORRECTO";
            }
        }else{
            if(tipos.get(0)!=tipos.get(1) || (tipos.get(0)!=Anasint.NUM || tipos.get(1)!=Anasint.NUM)){
                System.out.println("La expresión "+ctx.expresion(0).getText()+ctx.desigualdades().getText()+ctx.expresion(1).getText()+ " no está bien tipada en el programa principal.");
                resultado="INCORRECTO";
            }

        }
        for(ParseTree t: ctx.operador_logico()){
            visit(t);
        }
        return null;
    }

    public Object visitOperador_logico(Anasint.Operador_logicoContext ctx){
        List<Integer> tipos = new ArrayList<Integer>();
        for(ParseTree t : ctx.expresion()) {
            Integer i = (Integer)visit(t);
            tipos.add(i);
        }
        if(subprog){
            if(tipos.get(0)!=tipos.get(1)|| (tipos.get(0)!=Anasint.NUM || tipos.get(1)!=Anasint.NUM)){
                System.out.println("La expresión "+ctx.expresion(0).getText()+ctx.desigualdades().getText()+ctx.expresion(1).getText()+ " no está bien tipada en el subprograma.");
                resultado="INCORRECTO";
            }
        }else{
            if(tipos.get(0)!=tipos.get(1)|| (tipos.get(0)!=Anasint.NUM || tipos.get(1)!=Anasint.NUM)){
                System.out.println("La expresión "+ctx.expresion(0).getText()+ctx.desigualdades().getText()+ctx.expresion(1).getText()+ " no está bien tipada en el programa principal.");
                resultado="INCORRECTO";
            }

        }
        return null;
    }

    public Integer visitExpresion(Anasint.ExpresionContext ctx){
        Integer res=null;
        if(ctx.children.contains(ctx.VAR())){
            if(subprog){
                if(!variablesSubProg.containsKey(ctx.VAR().getText())&&!variablesProg.containsKey(ctx.VAR().getText())){
                    System.out.println("La variable "+ctx.VAR().getText()+ " no está declarada en el subprograma.");
                    resultado="INCORRECTO";
                }else{
                    if(variablesSubProg.containsKey(ctx.VAR().getText())){
                        res = variablesSubProg.get(ctx.VAR().getText());
                    }else if(variablesProg.containsKey(ctx.VAR().getText())){
                        res = variablesProg.get(ctx.VAR().getText());
                    }

                }
            }else{
                if(!variablesProg.containsKey(ctx.VAR().getText())){
                    System.out.println("La variable "+ctx.VAR().getText()+ " no está declarada en el programa principal.");
                    resultado="INCORRECTO";
                }else{
                    if(variablesProg.containsKey(ctx.VAR().getText())){
                        res = variablesProg.get(ctx.VAR().getText());
                    }
                }
            }
        }else if(ctx.children.contains(ctx.llamada_funcion())){
           res = (Integer) visit(ctx.llamada_funcion());
        }else if(ctx.children.contains(ctx.expr_binaria())){
            res = (Integer)visit(ctx.expr_binaria());
        }else if(ctx.children.contains(ctx.expr_logica())){
            res = (Integer)visit(ctx.expr_logica());
        }else if(ctx.children.contains(ctx.expr_secuencia())){
            res = (Integer) visit(ctx.expr_secuencia());
        }else if(ctx.children.contains(ctx.elemento_secuencia())){
            res= (Integer) visit(ctx.elemento_secuencia());
        }
        return res;
    }

    public Integer visitLlamada_funcion(Anasint.Llamada_funcionContext ctx){
        Integer res = null;
        Integer tipo= null;
        if(ctx.expresion().size()==1){
            tipo= visitExpresion(ctx.expresion(0));
        }
        if(ctx.children.contains(ctx.VACIA())){
            res = Anasint.LOG;

            if(tipo!=null){
                if(tipo!=Anasint.SEQ_NUM && tipo!=Anasint.SEQ_LOG){
                    System.out.println("El parámetro de la función vacia no es del tipo SEQ.");
                }
            }else{
                System.out.println("El parámetro de la función vacia no es del tipo SEQ.");
            }

        }else if(ctx.children.contains(ctx.ULTIMAPOSICION())){
            res = Anasint.NUM;

            if(tipo!=Anasint.SEQ_NUM && tipo!=Anasint.SEQ_LOG){
                System.out.println("El parámetro de la función ultima_posicion no es del tipo SEQ.");
            }
        }else{

            if(parametrosSalida.containsKey(ctx.expresionF().getText())){
                if(parametrosSalida.get(ctx.expresionF().getText()).size()>1){
                    res= null;
                }else{
                    res = parametrosSalida.get(ctx.expresionF().getText()).get(0);
                }
            }
            if(parametrosEntrada.containsKey(ctx.expresionF().getText())){
                if(parametrosEntrada.get(ctx.expresionF().getText()).get(0)!=tipo){
                    System.out.println("El parámetro de la función "+ctx.expresionF().getText()+ " no es del tipo requerido. Se espera:"+res+
                            " Se obtiene:"+tipo);
                }
            }

        }
        return res;
    }

    public Integer visitExpr_secuencia(Anasint.Expr_secuenciaContext ctx){
        Integer res = null;
        Integer aux = null;
        if(ctx.children.size()==2){
            res = Anasint.SEQ;
        }else{


            for(ParseTree t: ctx.expresion()){
                aux = (Integer) visit(t);
                if(aux==null || (res!=null && aux!=res)){
                    res= null;
                }else if(res==null && aux!=null){
                    res = aux;
                }
            }
        }

        if(res!=null){
            if(res==Anasint.NUM){
                res= Anasint.SEQ_NUM;
            }else if(res == Anasint.LOG){
                res= Anasint.SEQ_LOG;
            }
        }

        return res;
    }

    public Integer visitExpr_logica(Anasint.Expr_logicaContext ctx){
        Integer res = Anasint.LOG;
        if(ctx.children.contains(ctx.elemento_secuencia())){
            res = (Integer)visit(ctx.elemento_secuencia());
        }
        return res;
    }

    public Object visitExpr_binaria(Anasint.Expr_binariaContext ctx){
        Integer res = null;
        Integer aux = null;
        if(ctx.children.contains(ctx.operaciones())){
            aux = (Integer) visit(ctx.operaciones());
            if(aux!=null){
                res= aux;
            }
        }
        if(ctx.children.contains(ctx.NUMERO())){
            aux = Anasint.NUM;
            if(ctx.children.contains(ctx.operaciones())){
                if(res!=null && aux!=res){
                    res = null;
                }
            }else{
                res = aux;
            }
        }else if(ctx.children.contains(ctx.VAR())){
            if(subprog){
                if(!variablesSubProg.containsKey(ctx.VAR().getText())&&!variablesProg.containsKey(ctx.VAR().getText())){
                    System.out.println("La variable "+ctx.VAR().getText()+ " no está declarada en el subprograma.");
                    resultado="INCORRECTO";
                }else{
                    aux = variablesSubProg.get(ctx.VAR().getText());
                    if(ctx.children.contains(ctx.operaciones())){
                        if(res!=null && aux!=res){
                            res = null;
                        }
                    }else{
                        res = aux;
                    }
                }
            }else{
                if(!variablesProg.containsKey(ctx.VAR().getText())){
                    System.out.println("La variable "+ctx.VAR().getText()+ " no está declarada en el programa principal.");
                    resultado="INCORRECTO";
                }else{
                    aux = variablesProg.get(ctx.VAR().getText());
                    if(ctx.children.contains(ctx.operaciones())){
                        if(res!=null && aux!=res){
                            res = null;
                        }
                    }else{
                        res = aux;
                    }
                }
            }
        }else if(ctx.children.contains(ctx.elemento_secuencia())){
            aux = (Integer)visit(ctx.elemento_secuencia());
            if(ctx.children.contains(ctx.operaciones())){
                if(res!=null && aux != res){
                    res = null;
                }
            }else{
                res = aux;
            }
        }else if(ctx.children.contains(ctx.expr_binaria())){
            aux = (Integer)visit(ctx.expr_binaria());
            if(ctx.children.contains(ctx.operaciones())){
                if(res!=null && aux != res){
                    res = null;
                }
            }else{
                res = aux;
            }
        }else if(ctx.children.contains(ctx.llamada_funcion())){
            aux = (Integer)visit(ctx.llamada_funcion());
            if(ctx.children.contains(ctx.operaciones())){
                if(res!=null && aux!=res){
                    res = null;
                }
            }else{
                res = aux;
            }
        }
        return res;
    }

    public Integer visitExpr(Anasint.ExprContext ctx) {
        Integer res = null;
        if(subprog){
            if(ctx.children.contains(ctx.VAR())){
                if(variablesSubProg.get(ctx.VAR().getText())==null){
                    res=variablesProg.get(ctx.VAR().getText());
                }else{
                    res=variablesSubProg.get(ctx.VAR().getText());
                }
            }else{
                if(variablesSubProg.get(ctx.elemento_secuencia().VAR().getText())==null){
                    res=variablesProg.get(ctx.elemento_secuencia().VAR().getText());
                }else{
                    res=variablesSubProg.get(ctx.elemento_secuencia().VAR().getText());
                }
            }
        }else{
            if(ctx.children.contains(ctx.VAR())){
                res=variablesProg.get(ctx.VAR().getText());
            }else{
                res=variablesProg.get(ctx.elemento_secuencia().VAR().getText());
                if(res!=null){
                    if(res==Anasint.SEQ_LOG){
                        res=Anasint.LOG;
                    }else if(res==Anasint.SEQ_NUM){
                        res=Anasint.NUM;
                    }
                }
            }
        }
       return res;
    }

    public Integer visitOperaciones(Anasint.OperacionesContext ctx){
        Integer res = null;
        res = (Integer)visit(ctx.expresion());
        return res;
    }

    public Object visitAsignacion(Anasint.AsignacionContext ctx){
        visit(ctx.getChild(0));
        return null;
    }

    public Object visitAsignacion_simple(Anasint.Asignacion_simpleContext ctx){
        Integer tipoExpr = (Integer)visit(ctx.expr());
        Integer tipoExpresion=(Integer)visit(ctx.expresion());
        if(subprog){

            if (ctx.expr().children.contains(ctx.expr().VAR())){
                if(!variablesSubProg.containsKey(ctx.expr().VAR().getText()) && !variablesProg.containsKey(ctx.expr().VAR().getText())){
                    System.out.println("La variable "+ctx.expr().VAR().getText()+" de la asignación no está declarada en el subprograma.");
                    resultado="INCORRECTO";
                }
            }else if(ctx.expr().children.contains(ctx.expr().elemento_secuencia())){
                if(!variablesSubProg.containsKey(ctx.expr().elemento_secuencia().VAR().getText())&&!variablesProg.containsKey(ctx.expr().elemento_secuencia().VAR().getText())){
                    System.out.println("La variable "+ctx.expr().elemento_secuencia().VAR().getText()+" de la asignación no está declarada en el subprograma.");
                    resultado="INCORRECTO";
                }
            }

            if (ctx.expresion().children.contains(ctx.expresion().VAR())){
                if(!variablesSubProg.containsKey(ctx.expresion().VAR().getText())&&!variablesProg.containsKey(ctx.expresion().VAR().getText())){
                    System.out.println("La variable "+ctx.expresion().VAR().getText()+" de la asignación no está declarada en el subprograma.");
                    resultado="INCORRECTO";
                }
            }else if(ctx.expresion().children.contains(ctx.expresion().elemento_secuencia())){
                if(!variablesSubProg.containsKey(ctx.expresion().elemento_secuencia().VAR().getText())|| !variablesSubProg.containsKey(ctx.expresion().elemento_secuencia().VAR().getText())){
                    System.out.println("La variable "+ctx.expresion().elemento_secuencia().VAR().getText()+" de la asignación no está declarada en el subprograma.");
                    resultado="INCORRECTO";
                }
            }
            if(tipoExpresion!=null && tipoExpr!=null){
                if ((tipoExpr != tipoExpresion) && ((tipoExpr!=52 && tipoExpr!=51)&&(tipoExpresion!=21))) {
                    if (ctx.expr().children.contains(ctx.expr().VAR())) {
                        System.out.println("La asignación de la variable " + ctx.expr().VAR().getText() + " no está bien tipada en el subprograma. Var:"+ tipoExpr+" Expr:"+tipoExpresion);
                        resultado="INCORRECTO";
                    } else {
                        System.out.println("La asignación de la variable " + ctx.expr().elemento_secuencia().getText() + " no está bien tipada en el subprograma. Var:"+ tipoExpr+" Expr:"+tipoExpresion);
                        resultado="INCORRECTO";
                    }
                }
            }else{
                if (ctx.expr().children.contains(ctx.expr().VAR())) {
                    System.out.println("La asignación de la variable " + ctx.expr().VAR().getText() + " no está bien tipada en el subprograma. Var:"+ tipoExpr+" Expr:"+tipoExpresion);
                    resultado="INCORRECTO";
                } else {
                    System.out.println("La asignación de la variable " + ctx.expr().elemento_secuencia().getText() + " no está bien tipada en el subprograma. Var:"+ tipoExpr+" Expr:"+tipoExpresion);
                    resultado="INCORRECTO";
                }
            }
        }else{
            if (ctx.expr().children.contains(ctx.expr().VAR())){
                if(!variablesProg.containsKey(ctx.expr().VAR().getText())){
                    System.out.println("La variable "+ctx.expr().VAR().getText()+" de la asignación no está declarada en el programa principal.");
                    resultado="INCORRECTO";
                }
            }else if(ctx.expr().children.contains(ctx.expr().elemento_secuencia())){
                if(!variablesProg.containsKey(ctx.expr().elemento_secuencia().VAR().getText())){
                    System.out.println("La variable "+ctx.expr().elemento_secuencia().VAR().getText()+" de la asignación no está declarada en el programa principal.");
                    resultado="INCORRECTO";
                }
            }
            if (ctx.expresion().children.contains(ctx.expresion().VAR())){
                if(!variablesProg.containsKey(ctx.expresion().VAR().getText())){
                    System.out.println("La variable "+ctx.expresion().VAR().getText()+" de la asignación no está declarada en el programa principal.");
                    resultado="INCORRECTO";
                }
            }else if(ctx.expresion().children.contains(ctx.expresion().elemento_secuencia())){
                if(!variablesProg.containsKey(ctx.expresion().elemento_secuencia().VAR().getText())){
                    System.out.println("La variable "+ctx.expresion().elemento_secuencia().VAR().getText()+" de la asignación no está declarada en el programa principal.");
                    resultado="INCORRECTO";
                }
            }

            if(tipoExpresion!=null && tipoExpr!=null){
                if ((tipoExpr != tipoExpresion) && ((tipoExpr!=52 && tipoExpr!=51)&&(tipoExpresion!=21))) {
                    if (ctx.expr().children.contains(ctx.expr().VAR())) {
                        System.out.println("La asignación de la variable " + ctx.expr().VAR().getText() + " no está bien tipada en el programa principal. Var:"+ tipoExpr+" Expr:"+tipoExpresion);
                        resultado="INCORRECTO";
                    } else {
                        System.out.println("La asignación de la variable " + ctx.expr().elemento_secuencia().getText() + " no está bien tipada en el programa principal Var:"+ tipoExpr+" Expr:"+tipoExpresion);
                        resultado="INCORRECTO";
                    }
                }
            }else{
                if (ctx.expr().children.contains(ctx.expr().VAR())) {
                    System.out.println("La asignación de la variable " + ctx.expr().VAR().getText() + " no está bien tipada en el programa principal. Var:"+ tipoExpr+" Expr:"+tipoExpresion);
                    resultado="INCORRECTO";
                } else {
                    System.out.println("La asignación de la variable " + ctx.expr().elemento_secuencia().getText() + " no está bien tipada en el programa principal Var:"+ tipoExpr+" Expr:"+tipoExpresion);
                    resultado="INCORRECTO";
                }
            }
        }
        return null;
    }

    public Integer visitElemento_secuencia(Anasint.Elemento_secuenciaContext ctx){
        Integer res = null;
        if(subprog){
            if(!variablesSubProg.containsKey(ctx.VAR().getText())&&!variablesProg.containsKey(ctx.VAR().getText())){
                System.out.println("La variable "+ctx.VAR().getText()+" no está declarada en el subprograma.");
                resultado="INCORRECTO";
            }else{
                if(variablesSubProg.get(ctx.VAR().getText())==null){
                    if(variablesProg.get(ctx.VAR().getText())==Anasint.SEQ_LOG){
                        res = Anasint.LOG;
                    }else if(variablesProg.get(ctx.VAR().getText())==Anasint.SEQ_NUM){
                        res = Anasint.NUM;
                    }
                }else{
                    if(variablesSubProg.get(ctx.VAR().getText())==Anasint.SEQ_LOG){
                        res = Anasint.LOG;
                    }else if(variablesSubProg.get(ctx.VAR().getText())==Anasint.SEQ_NUM){
                        res = Anasint.NUM;
                    }
                }
            }
        }else{
            if(!variablesProg.containsKey(ctx.VAR().getText())){
                System.out.println("La variable "+ctx.VAR().getText()+" no está declarada en el programa principal.");
                resultado="INCORRECTO";
            }else{
                if(variablesProg.get(ctx.VAR().getText())==Anasint.SEQ_LOG){
                    res = Anasint.LOG;
                }else if(variablesProg.get(ctx.VAR().getText())==Anasint.SEQ_NUM){
                    res = Anasint.NUM;
                }
            }
        }
        return res;
    }

    public Object visitAsignacion_multiple(Anasint.Asignacion_multipleContext ctx){
        Map<String,Integer> tipo= new HashMap<String,Integer>();
        Map<String,Integer> tipo2= new HashMap<String,Integer>();
        for(ParseTree t : ctx.expr()){
            tipo.put(t.getText(),(Integer)visit(t));
        }
        for(ParseTree t : ctx.expresion()){
            tipo2.put(t.getText(),(Integer)visit(t));
        }
        if(ctx.expresion().size()>1){
            int i = 0;
            if(subprog){
                while(i<tipo.size()){
                    if(ctx.expresion(i).children.contains(ctx.expresion(i).VAR())) {
                        if (!variablesSubProg.containsKey(ctx.expresion(i).VAR().getText())&&!variablesProg.containsKey(ctx.expresion(i).VAR().getText())) {
                            System.out.println("La variable " + ctx.expresion(i).VAR().getText() + " de la asignación múltiple no está declarada en el subprograma.");
                            resultado="INCORRECTO";
                        }
                    }else if(ctx.expresion(i).children.contains(ctx.expresion(i).elemento_secuencia())){
                        if(!variablesSubProg.containsKey(ctx.expresion(i).elemento_secuencia().VAR().getText())
                                &&!variablesProg.containsKey(ctx.expresion(i).elemento_secuencia().VAR().getText())) {
                            System.out.println("La variable " + ctx.expresion(i).elemento_secuencia().VAR().getText() + " de la asignación múltiple no está declarada en el subprograma.");
                            resultado="INCORRECTO";
                        }
                    }

                    if(ctx.expr(i).children.contains(ctx.expr(i).VAR())) {
                        if (!variablesSubProg.containsKey(ctx.expr(i).VAR().getText())&&!variablesProg.containsKey(ctx.expr(i).VAR().getText())) {
                            System.out.println("La variable " + ctx.expr(i).VAR().getText() + " de la asignación múltiple no está declarada en el subprograma.");
                            resultado="INCORRECTO";
                        }
                    }else if(ctx.expr(i).children.contains(ctx.expr(i).elemento_secuencia())){
                        if(!variablesSubProg.containsKey(ctx.expr(i).elemento_secuencia().VAR().getText())
                                &&!variablesProg.containsKey(ctx.expr(i).elemento_secuencia().VAR().getText())) {
                            System.out.println("La variable " + ctx.expr(i).elemento_secuencia().VAR().getText() + " de la asignación múltiple no está declarada en el subprograma.");
                            resultado="INCORRECTO";
                        }
                    }


                    if(tipo.get(ctx.expr(i).getText())!=tipo2.get(ctx.expresion(i).getText())){
                        System.out.println("La asignación múltiple de la variable "+ctx.expr(i).getText()+" no está bien tipada en el programa principal. Variable:"+tipo.get(ctx.expr(i).getText())
                                + " Expresion:"+tipo2.get(ctx.expresion(i).getText()));
                        resultado="INCORRECTO";
                    }
                    i++;
                }
            }else{
                while(i<tipo.size()){
                    if(ctx.expresion(i).children.contains(ctx.expresion(i).VAR())) {
                        if (!variablesProg.containsKey(ctx.expresion(i).VAR().getText())) {
                            System.out.println("La variable " + ctx.expresion(i).VAR().getText() + " de la asignación múltiple no está declarada en el programa principal.");
                            resultado="INCORRECTO";
                        }
                    }else if(ctx.expresion(i).children.contains(ctx.expresion(i).elemento_secuencia())){
                        if(!variablesProg.containsKey(ctx.expresion(i).elemento_secuencia().VAR().getText())) {
                            System.out.println("La variable " + ctx.expresion(i).elemento_secuencia().VAR().getText() + " de la asignación múltiple no está declarada en el programa principal.");
                            resultado="INCORRECTO";
                        }
                    }

                    if(ctx.expr(i).children.contains(ctx.expr(i).VAR())) {
                        if (!variablesProg.containsKey(ctx.expr(i).VAR().getText())) {
                            System.out.println("La variable " + ctx.expr(i).VAR().getText() + " de la asignación múltiple no está declarada en el programa principal.");
                            resultado="INCORRECTO";
                        }
                    }else if(ctx.expr(i).children.contains(ctx.expr(i).elemento_secuencia())){
                        if(!variablesProg.containsKey(ctx.expr(i).elemento_secuencia().VAR().getText())) {
                            System.out.println("La variable " + ctx.expr(i).elemento_secuencia().VAR().getText() + " de la asignación múltiple no está declarada en el programa principal.");
                            resultado="INCORRECTO";
                        }
                    }


                    if(tipo.get(ctx.expr(i).getText())!=tipo2.get(ctx.expresion(i).getText())){
                        System.out.println("La asignación múltiple de la variable "+ctx.expr(i).getText()+" no está bien tipada en el programa principal. Variable:"+tipo.get(ctx.expr(i).getText())
                                + " Expresion:"+tipo2.get(ctx.expresion(i).getText()));
                        resultado="INCORRECTO";
                    }
                    i++;
                }
            }


        }
        return null;
    }

    public Object visitVariables(Anasint.VariablesContext ctx){
        if(subprog){
            List<String> l = (List<String>) visit(ctx.vars());
            for(String s: l){
                variablesSubProg.put(s,(Integer)visit(ctx.tipo()));
            }
        }else {
            List<String> l = (List<String>) visit(ctx.vars());
            for (String s : l) {
                variablesProg.put(s, (Integer) visit(ctx.tipo()));
            }
        }
        return null;
    }

    public List<String> visitVars(Anasint.VarsContext ctx){
        List<String> res = new ArrayList<String>();
        for(Object o : ctx.VAR()){
            res.add(o.toString());
        }
        return res;
    }

    public Object visitSubprogramas(Anasint.SubprogramasContext ctx){
        subprog = true;
        if(ctx.children!=null){
            for(ParseTree t : ctx.children){
                visit(t);
            }
        }
        subprog = false;
        return null;
    }

    public Object visitFuncion(Anasint.FuncionContext ctx){
        variablesSubProg.clear();
        visit(ctx.fun());
        for(ParseTree t : ctx.variables()){
            visit(t);
        }
        if(ctx.children.contains(ctx.instrucciones())){
            visit(ctx.instrucciones());
        }
        return null;
    }

    public Object visitProcedimiento(Anasint.ProcedimientoContext ctx){
        variablesSubProg.clear();
        visit(ctx.proc());
        for(ParseTree t : ctx.variables()){
            visit(t);
        }
        if(ctx.children.contains(ctx.instrucciones())){
            visit(ctx.instrucciones());
        }
        return null;
    }

    public Object visitProc(Anasint.ProcContext ctx){
        if(ctx.children.contains(ctx.params())){

            visit(ctx.params());
        }
        if(ctx.children.contains(ctx.retornoFuncion())){
            visit(ctx.retornoFuncion());
        }
        return null;
    }

    public Object visitFun(Anasint.FunContext ctx){
        visit(ctx.getChild(0));
        return null;
    }

    public Object visitFunc(Anasint.FuncContext ctx){
        String nombre = (String)visit(ctx.nombre_funcion());
        funcion = nombre;
        List<Integer> parametrosSa = ( List<Integer>)visit(ctx.retornoFuncion());
            parametrosSalida.put(nombre,parametrosSa);
        List<Integer> parametrosEn = ( List<Integer>)visitNombre_funcion2(ctx.nombre_funcion());
            parametrosEntrada.put(nombre,parametrosEn);
        return null;
    }

    public Object visitPredicado(Anasint.PredicadoContext ctx){
        funcion = ctx.expresionF().getText();
        variablesProg.put(ctx.expresionF().getText(),Anasint.LOG);
        variablesSubProg.put(ctx.VAR().getText(),Anasint.LOG);
        List<Integer> array = new ArrayList<>();
        array.add(Anasint.LOG);
        parametrosSalida.put(ctx.expresionF().getText(),array);
        if(ctx.children.contains(ctx.params())){
            visit(ctx.params());
        }
        return null;
    }

    public List<Integer> visitNombre_funcion2(Anasint.Nombre_funcionContext ctx){
        List<Integer> res = new ArrayList<Integer>();
        if(ctx.children.contains(ctx.params())){
            res = (List<Integer>) visit(ctx.params());
        }
        return res;
    }

    public String visitNombre_funcion(Anasint.Nombre_funcionContext ctx){
        if(ctx.children.contains(ctx.params())){
            visit(ctx.params());
        }
        return ctx.expresionF().getText();
    }

    public List<Integer> visitRetornoFuncion(Anasint.RetornoFuncionContext ctx){
        List<Integer> res= (List<Integer>)visit(ctx.params());
        return res;
    }

    public List<Integer> visitParams(Anasint.ParamsContext ctx){
        Integer t =(Integer) visit(ctx.tipo());
        String n = ctx.VAR().getText();
        List<Integer> res = new ArrayList<Integer>();
        res.add(t);
        variablesSubProg.put(n,t);
        if(ctx.children.contains(ctx.params())){
            res.addAll((List<Integer>)visit(ctx.params()));
        }
        return res;
    }


    //tipo: elemental | no_elemental;
    public Integer visitTipo(Anasint.TipoContext ctx) {
        return (Integer) visit(ctx.getChild(0)); //recogemos "t"
    }

    // elemental: NUM | LOG ;
    public Integer visitElemental(Anasint.ElementalContext ctx) {
        Integer a = ctx.getStart().getType();
        return a;
    }

    //no_elemental: SEQ_NUM | SEQ_LOG;
    public Integer visitNo_elemental(Anasint.No_elementalContext ctx) {
        Integer a = ctx.getStart().getType();
        return a;
    }

}
