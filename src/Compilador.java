import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Compilador extends AnasintBaseListener {

    Generador generador = new Generador();
    FileWriter fichero;
    String nombreFichero = null;
    int espacios = 0;
    Map<String, Object> almacen_definiciones1 = new HashMap<>();
    Map<String, Object> almacen_definiciones2 = new HashMap<>();
    Boolean main = true;
    String multiple = "";

    List<String> integers = new ArrayList<String>();
    List<String> booleans = new ArrayList<String>();
    List<String> listint = new ArrayList<String>();
    List<String> listbool = new ArrayList<String>();


    int cont = 0;

    public void init(String f) {
        nombreFichero = new String(f.substring(0, f.length() - 4));
    }

    private void open_file() {
        try {
            fichero = new FileWriter("src/" + nombreFichero + ".java");
        } catch (IOException e) {
            System.out.println("open_file (exception): " + e.toString());
        }
    }

    private void close_file() {
        try {
            fichero.close();
        } catch (IOException e) {
            System.out.println("close_file (exception): " + e.toString());
        }
    }

    public void declarar_variable(String var) {
        String[] sts = var.split(",");
        int i = 0;
        while (i < sts.length) {
            if (cont == 0) {
                almacen_definiciones1.put(sts[i], null);
            } else {
                almacen_definiciones2.put(sts[i], null);
            }
            i++;
        }

    }

    public void definir_variable(String var, Object expr) {
        if (cont == 0) {
            almacen_definiciones1.put(var, expr);
        } else {
            almacen_definiciones2.put(var, expr);
        }
    }

    //Escribir espacios en blanco en fichero de salida
    private void gencode_espacios() {
        try {
            for (int i = 1; i <= espacios; i++) fichero.write("   ");
        } catch (IOException e) {
            System.out.println("gencode_espacios (exception): " + e.toString());
        }
    }


    //Generar código comienzo clase
    private void gencode_begin_class() {
        try {
            gencode_espacios();
            fichero.write("import java.io.*;\n");
            fichero.write("import java.util.List;\n");
            gencode_espacios();
            fichero.write("public class " + nombreFichero);
            gencode_espacios();
            fichero.write("{\n\n");
            espacios++;
        } catch (IOException e) {
        }
    }

    // Generar código comienzo main
    private void gencode_begin_main() {
        try {
            espacios++;
            gencode_espacios();
            fichero.write("public static void main(String[] args) {\n\n");
            espacios++;
        } catch (IOException e) {
        }
    }

    // Generar código fin main
    private void gencode_end_main() {
        try {
            espacios--;
            gencode_espacios();
            fichero.write("}\n\n");
        } catch (IOException e) {
        }
    }

    // Generar código fin clase
    private void gencode_end_class() {
        try {
            espacios--;
            gencode_espacios();
            fichero.write("}\n\n");
        } catch (IOException e) {
        }
    }

    private void gencode_begin_method(String t, String s, String type) {
        try {
            espacios--;
            gencode_espacios();
            fichero.write("public static " + t + " " + s + "(" + type +"){\n");
            espacios++;
        } catch (IOException e) {
        }
    }

    private void gencode_declarar_variables(String s, String t) {
        try {
            if (cont == 0) {

                fichero.write("private static " + t + " " + s);
                fichero.write(";\n");
            } else {
                fichero.write(t + " " + s);
                fichero.write(";\n");
            }
        } catch (IOException e) {
        }
    }

    /////////////////////////
    //  REGLAS. ATRIBUCIONES.//
    ///////////////////////

    public void enterPrograma(Anasint.ProgramaContext ctx) {
        open_file();
        gencode_begin_class();
    }

    public void enterSubprogramas(Anasint.SubprogramasContext ctx) {
        cont = 1;
    }

    public void exitSubprogramas(Anasint.SubprogramasContext ctx) {
        cont = 0;
    }

    public void enterInstrucciones(Anasint.InstruccionesContext ctx) {
        if (cont == 0 && main) {
            gencode_begin_main();
            main = false;
        }
    }

    public void exitVars(Anasint.VarsContext ctx) {
        declarar_variable(generador.visitVarRecurs(ctx.varRecurs()));
        String var = generador.visit(ctx.varRecurs());
        if (ctx.tipo().getStart().getType() == Anasint.LOG) {
            if (var.contains(",")) {
                String[] st = var.split(",");
                for (String s : st) {
                    booleans.add(s);
                }
            } else {
                booleans.add(var);
            }
        } else if (ctx.tipo().getStart().getType() == Anasint.NUM) {
            if (var.contains(",")) {
                String[] st = var.split(",");
                for (String s : st) {
                    integers.add(s);
                }
            } else {
                integers.add(var);
            }
        } else if (ctx.tipo().getStart().getType() == Anasint.SEQ_NUM) {
            if (var.contains(",")) {
                String[] st = var.split(",");
                for (String s : st) {
                    listint.add(s);
                }
            } else {
                listint.add(var);
            }
        } else if (ctx.tipo().getStart().getType() == Anasint.SEQ_LOG) {
            if (var.contains(",")) {
                String[] st = var.split(",");
                for (String s : st) {
                    listbool.add(s);
                }
            } else {
                listbool.add(var);
            }
        }

    }

    public void exitVariables(Anasint.VariablesContext ctx) {
        if (cont == 0) {
            for (String s : almacen_definiciones1.keySet()) {
                if (booleans.contains(s)) {
                    gencode_espacios();
                    gencode_declarar_variables(s, "Boolean");
                }
                if (integers.contains(s)) {
                    gencode_espacios();
                    gencode_declarar_variables(s, "Integer");
                }
                if (listint.contains(s)) {
                    gencode_espacios();
                    gencode_declarar_variables(s, "Integer[]");
                }
                if (listbool.contains(s)) {
                    gencode_espacios();
                    gencode_declarar_variables(s, "Boolean[]");
                }
            }
        } else if(cont==1){
            for (String s : almacen_definiciones2.keySet()) {
                if (almacen_definiciones2.containsKey(s) && booleans.contains(s)) {
                    gencode_espacios();
                    gencode_declarar_variables(s, "Boolean");
                }
                if (almacen_definiciones2.containsKey(s) && integers.contains(s)) {
                    gencode_espacios();
                    gencode_declarar_variables(s, "Integer");
                }
                if (almacen_definiciones2.containsKey(s) && listint.contains(s)) {
                    gencode_espacios();
                    gencode_declarar_variables(s, "Integer[]");
                }
                if (almacen_definiciones2.containsKey(s) && listbool.contains(s)) {
                    gencode_espacios();
                    gencode_declarar_variables(s, "Boolean[]");
                }
            }
        }
        try{
            fichero.write("\n");
        }catch (IOException e){}
    }


    //   public void enterFuncion(Anasint.FuncionContext ctx){
    //      String t;
    //     String s;
    //    String type;
    //   String n;
    //  gencode_begin_method();
    // }


    public void enterFuncion(Anasint.FuncionContext ctx) {
        String s = generador.visitFun(ctx.fun());
        String t = generador.visitFun2(ctx.fun());
        String type=generador.visitFun3(ctx.fun());;
        gencode_espacios();
        espacios++;
        gencode_begin_method(t, s, type);
    }

    public void exitFuncion(Anasint.FuncionContext ctx) {
        try {
            gencode_espacios();
            fichero.write("}\n\n");
            espacios--;
            almacen_definiciones2.clear();
        } catch (IOException e) {
        }
    }

    public void enterProcedimiento(Anasint.ProcedimientoContext ctx){
        String s = generador.visitProc(ctx.proc());
        String type=generador.visitProc2(ctx.proc());
        String type2 = reemplazar(type,"NUM","Integer ");
        gencode_espacios();
        espacios++;
        gencode_begin_method("void", s, type2);
    }

    public void exitProcedimiento(Anasint.ProcedimientoContext ctx){
        try{
        gencode_espacios();
        fichero.write("}\n\n");
        espacios--;
        almacen_definiciones2.clear();
    } catch (IOException e) {
    }
    }

    public void exitPrograma(Anasint.ProgramaContext ctx) {
        gencode_end_main();
        gencode_end_class();
        System.out.println(almacen_definiciones1);
        System.out.println(almacen_definiciones2);
        System.out.println("Int: " + integers);
        System.out.println("Bool: " + booleans);
        System.out.println("ListInt: " + listint);
        System.out.println("ListBool: " + listbool);
        close_file();
    }

    public void exitNumVarComa(Anasint.NumVarComaContext ctx) {
        declarar_variable(ctx.VAR().getText());
        integers.add(ctx.VAR().getText());
    }

    public void exitNumVar(Anasint.NumVarContext ctx) {
        declarar_variable(ctx.VAR().getText());
        integers.add(ctx.VAR().getText());
    }

    public void exitSeqVarComa(Anasint.SeqVarComaContext ctx) {
        declarar_variable(ctx.VAR().getText());
        listint.add(ctx.VAR().getText());
    }

    public void exitSeqVar(Anasint.SeqVarContext ctx) {
        declarar_variable(ctx.VAR().getText());
        listint.add(ctx.VAR().getText());
    }


    public void enterIteracion(Anasint.IteracionContext ctx) {
        try {
            gencode_espacios();
            fichero.write("while");
        } catch (IOException e) {
        }
    }

    public void enterCondicion(Anasint.CondicionContext ctx) {
        try {
            fichero.write("(");
        } catch (IOException e) {
        }
    }

    public void exitCondicion(Anasint.CondicionContext ctx) {
        try {
            fichero.write("){\n");
            espacios++;
        } catch (IOException e) {
        }
    }

    public void exitIteracion(Anasint.IteracionContext ctx) {
        try {
            gencode_espacios();
            fichero.write("}\n");
            espacios--;
        } catch (IOException e) {
        }
    }

    public void enterCondicional(Anasint.CondicionalContext ctx) {
        try {
            gencode_espacios();
            fichero.write("if");
        } catch (IOException e) {
        }
    }

    public void exitCondicional(Anasint.CondicionalContext ctx) {
        try {
            espacios--;
            gencode_espacios();
            fichero.write("}\n");
            espacios--;
        } catch (IOException e) {
        }
    }

    public void enterBloque_opcional(Anasint.Bloque_opcionalContext ctx) {
        try {
            espacios--;
            gencode_espacios();
            fichero.write("}else{\n");
            espacios++;
        } catch (IOException e) {
        }
    }

    public static String reemplazar(String cadena, String busqueda, String reemplazo) {
        return cadena.replaceAll(busqueda, reemplazo);
    }

    public void exitLlamada_a_procedimiento(Anasint.Llamada_a_procedimientoContext ctx) {
        try {
            fichero.write( ");\n");
        } catch (IOException e) {
        }
    }

    public void enterLlamada_a_procedimiento(Anasint.Llamada_a_procedimientoContext ctx) {
        String nombre = ctx.getText();
        String nombre2 = reemplazar(nombre, "mostrar", "System.out.println");
        try {
            gencode_espacios();
            if(nombre.contains("mostrar")) {
                fichero.write("System.out.println(");
            }else{
                fichero.write(ctx.getText()+"\n");
            }
        } catch (IOException e) {
        }
    }

    public void enterNombre_llamada_funcion(Anasint.Nombre_llamada_funcionContext ctx){
        try {
            fichero.write(ctx.expresionF().getText()+"(");
        } catch (IOException e) {
        }
    }

    public void exitNombre_llamada_funcion(Anasint.Nombre_llamada_funcionContext ctx){
        try {
            fichero.write(")");
        } catch (IOException e) {
        }
    }

    public void enterAsignacion_binaria(Anasint.Asignacion_binariaContext ctx) {
        try {
            gencode_espacios();
            fichero.write(ctx.VAR().getText() + "=" );
        } catch (IOException e) {
        }
    }

    public void enterAsignacion_logica(Anasint.Asignacion_logicaContext ctx) {
        try {
            gencode_espacios();
            fichero.write(ctx.VAR().getText() + "=" );
        } catch (IOException e) {
        }
    }

    public void enterAsignacion_secuencia(Anasint.Asignacion_secuenciaContext ctx) {
        try {
            gencode_espacios();
            fichero.write(ctx.VAR().getText() + "=");
        } catch (IOException e) {
        }
    }




    public void enterSecuencia_completa(Anasint.Secuencia_completaContext ctx) {
        try {
            if(ctx.children.contains(ctx.sec_binaria())) {
                fichero.write("new Integer[]{");
            }else if(ctx.children.contains(ctx.sec_logica())){
                fichero.write("new Boolean[]{");
            }else{
                fichero.write("new Boolean[]{");
            }
        } catch (IOException e) {
        }
    }

    public void exitSecuencia_completa(Anasint.Secuencia_completaContext ctx) {
        try {
            fichero.write("}" );
        } catch (IOException e) {
        }
    }

    public void enterElemento_secuencia(Anasint.Elemento_secuenciaContext ctx){
        try {
            fichero.write(ctx.VAR().getText()+"[");
        } catch (IOException e) {
        }
    }

    public void exitElemento_secuencia(Anasint.Elemento_secuenciaContext ctx){
        try {
            fichero.write("]");
        } catch (IOException e) {
        }
    }

    public void exitAsignacion(Anasint.AsignacionContext ctx){
        try {
            fichero.write(";\n");
        } catch (IOException e) {
        }
    }

    public void exitDesigualdades(Anasint.DesigualdadesContext ctx){
        try {
            fichero.write(ctx.getText());
        } catch (IOException e) {
        }
    }

    public void enterConcatena_operador_logico(Anasint.Concatena_operador_logicoContext ctx){
        try {
            if(ctx.getText().contains("&&")){
                fichero.write(" && ");
            }else{
                fichero.write(" || ");
            }
        } catch (IOException e) {
        }
    }

    public void enterDevolucion(Anasint.DevolucionContext ctx){
        try {
            gencode_espacios();
            fichero.write("return ");
        } catch (IOException e) {
        }
    }

    public void exitDevolucion(Anasint.DevolucionContext ctx){
        try {
            fichero.write(";\n");
        } catch (IOException e) {
        }
    }

 //   expresion_binaria: NUMERO #BinNum
 //   | VAR   #BinVar
 //   | NUMERO (operaciones)* #BinNumOp
 //   | VAR (operaciones)*    #BinVarOp
 //   | PARENTESIS_ABIERTO expresion_binaria PARENTESIS_CERRADO #BinParent
 //   | nombre_llamada_funcion #BinFun
 //   ;

    public void enterBinNum(Anasint.BinNumContext ctx){
        try {
            fichero.write(generador.visitBinNum(ctx));
        } catch (IOException e) {
        }
    }

    public void enterBinVar(Anasint.BinVarContext ctx){
        try {
            fichero.write(generador.visitBinVar(ctx));

        } catch (IOException e) {
        }
    }

    public void enterBinNumOp(Anasint.BinNumOpContext ctx){
        try {
            if(ctx.getText().contains("F")){
                fichero.write("False");
            }else if(ctx.getText().contains("T")){
                fichero.write("True");
            }else {
                fichero.write(ctx.NUMERO().getText());
            }
        } catch (IOException e) {
        }
    }

    public void enterBinVarOp(Anasint.BinVarOpContext ctx){
        try {
            if(ctx.getText().contains("F")){
                fichero.write("False");
            }else if(ctx.getText().contains("T")){
                fichero.write("True");
            }else {
                fichero.write(ctx.VAR().getText());
            }
        } catch (IOException e) {
        }
    }

    public void enterBinParent(Anasint.BinParentContext ctx){
        try {
            if(ctx.getText().contains("F")){
                fichero.write("False");
            }else if(ctx.getText().contains("T")){
                fichero.write("True");
            }else {
                fichero.write("(");
            }
        } catch (IOException e) {
        }
    }

    public void exitBinParent(Anasint.BinParentContext ctx){
        try {
            if(ctx.getText().contains("F")){
                fichero.write("False");
            }else if(ctx.getText().contains("T")){
                fichero.write("True");
            }else {
                fichero.write(")");
            }
        } catch (IOException e) {
        }
    }

    //operaciones: SUMA (expresion_binaria)   #OpSuma
    //        |RESTA (expresion_binaria)  #OpResta
     //       |MULT (expresion_binaria)   #OpMult
    //        |DIV (expresion_binaria)    #OpDiv
    //;

    public void enterOpSuma(Anasint.OpSumaContext ctx){
        try {
            fichero.write("+");
        } catch (IOException e) {
        }
    }

    public void enterOpResta(Anasint.OpRestaContext ctx){
        try {
            fichero.write("-");
        } catch (IOException e) {
        }
    }

    public void enterOpMult(Anasint.OpMultContext ctx){
        try {
            fichero.write("*");
        } catch (IOException e) {
        }
    }

    public void enterOpDiv(Anasint.OpDivContext ctx){
        try {
            fichero.write("/");
        } catch (IOException e) {
        }
    }

  //  expresion_logica: (NEGACION)?T #ExprLogTrue
  //  | (NEGACION)?F              #ExprLogFalse
  //  | (NEGACION)?VAR               #ExprLogVar
  //  | (NEGACION)?nombre_llamada_funcion #ExprLogFun
  //  | (NEGACION)?llamada_a_procedimiento    #ExprLogProc
  //  ;

    public void enterExprLogTrue(Anasint.ExprLogTrueContext ctx){
        try {
            if(ctx.children.contains(ctx.NEGACION())){
                fichero.write("false");
            }else{
                fichero.write("true");
            }
        } catch (IOException e) {
        }
    }

    public void enterExprLogFalse(Anasint.ExprLogFalseContext ctx){
        try {
            if(ctx.children.contains(ctx.NEGACION())){
                fichero.write("true");
            }else{
                fichero.write("false");
            }
        } catch (IOException e) {
        }
    }

    public void enterAsignacion_multiple(Anasint.Asignacion_multipleContext ctx){
        try{
            gencode_espacios();
            fichero.write(ctx.VAR(0).getText()+"=");

        }catch(IOException e){}
    }

    public void exitAsignacion_multiple(Anasint.Asignacion_multipleContext ctx){
        try{
            int i = 1;
            while(i<ctx.VAR().size()){
                fichero.write(";\n");
                gencode_espacios();
                if(ctx.children.contains(ctx.expr5())){
                    fichero.write(ctx.VAR(i).getText()+"="+ generador.visit(ctx.expr5(1)));
                }
                i++;
            }
        }catch(IOException e){}
    }

    public void enterSecBin(Anasint.SecBinContext ctx){
        try{
            if(ctx.children.contains(ctx.VAR())){
                fichero.write(ctx.VAR().getText()+",");
            }else if(ctx.children.contains(ctx.NUMERO())){
                fichero.write(ctx.NUMERO().getText()+",");
            }else if(ctx.children.contains(ctx.llamada_a_funcion())){
                fichero.write(ctx.llamada_a_funcion().getText()+",");
            }
        }catch(IOException e){}
    }

    public void enterSecBin2(Anasint.SecBin2Context ctx){
        try{
            if(ctx.children.contains(ctx.VAR())){
                fichero.write(ctx.VAR().getText());
            }else if(ctx.children.contains(ctx.NUMERO())){
                fichero.write(ctx.NUMERO().getText());
            }else if(ctx.children.contains(ctx.llamada_a_funcion())){
                fichero.write(ctx.llamada_a_funcion().getText());
            }
        }catch(IOException e){}
    }

    public void enterSecLog(Anasint.SecLogContext ctx){
        try{
                fichero.write(ctx.expresion_logica().getText()+",");
        }catch(IOException e){}
    }

    public void enterSecLog2(Anasint.SecLog2Context ctx){
        try{
            fichero.write(ctx.expresion_logica().getText());
        }catch(IOException e){}
    }

    public void exitRuptura(Anasint.RupturaContext ctx){
        try{
            gencode_espacios();
            fichero.write("break;\n");
        }catch(IOException e){}
    }

    public void exitPredicado(Anasint.PredicadoContext ctx){
        booleans.add(ctx.VAR().getText());
    }

}
