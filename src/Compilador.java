import org.antlr.v4.runtime.RecognitionException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Compilador extends AnasintBaseListener{

    Generador generador = new Generador();
    FileWriter fichero;
    String nombreFichero = null;
    int espacios = 0;
    Boolean main = true;
    Boolean maindone = false;
    Map<String, Integer> variablesProg = new HashMap<>();
    Map<String, Integer> variablesSubProg = new HashMap<>();

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
            gencode_methods();
        } catch (IOException e) {
        }
    }

    private void gencode_methods() {
        try {
            gencode_espacios();
            fichero.write("   public static Integer ultima_posicion(Object[] s){\n" +
                    "      return s.length -1;\n" +
                    "   }\n\n" +
                    "   public static Boolean vacia(Object[] s){\n" +
                    "      if(s.length==0){\n" +
                    "         return true;\n" +
                    "      }else{\n" +
                    "         return false;\n" +
                    "      }\n" +
                    "   }\n\n"+
                    "   public static void mostrar(Object x){\n"+
                    "       System.out.println(x);\n" +
                    "   }\n\n");

            espacios++;
        } catch (IOException e) {
        }
    }

    // Generar código comienzo main
    private void gencode_begin_main() {
        try {
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
            gencode_espacios();
            fichero.write("public static " + t + " " + s + "(" + type +"){\n");
            espacios++;
        } catch (IOException e) {
        }
    }

    private void gencode_begin_method2(String t, String s, String type, String res) {
        try {
            gencode_espacios();
            fichero.write("public static " + t + " " + s + "(" + type +"){\n");
            espacios++;
            gencode_espacios();
            fichero.write(t+" "+res+";\n");
        } catch (IOException e) {
        }
    }

    private void gencode_end_method() {
        try {
            espacios--;
            gencode_espacios();
            fichero.write("}\n\n");
        } catch (IOException e) {
        }
    }

    private void gencode_variables(Map<String, Integer> variables) {

        if(main==true){
            variables.forEach((k,v)-> {
                try {
                    if(v==19){
                        gencode_espacios();
                        fichero.write("public static Integer "+k+";\n");
                    }else if(v==Anasint.LOG){
                        gencode_espacios();
                        fichero.write("public static Boolean "+k+";\n");
                    }else if(v==Anasint.SEQ_LOG){
                        gencode_espacios();
                        fichero.write("public static Boolean[] "+k+";\n");
                    }else if(v==Anasint.SEQ_NUM){
                        gencode_espacios();
                        fichero.write("public static Integer[] "+k+";\n");
                    }

                } catch (IOException e) {
                }
            });
            try{fichero.write("\n");}catch(IOException e){}
        }else{
            variables.forEach((k,v)-> {
                try {
                    if(v==19){
                        gencode_espacios();
                        fichero.write("Integer "+k+";\n");
                    }else if(v==Anasint.LOG){
                        gencode_espacios();
                        fichero.write("Boolean "+k+";\n");
                    }else if(v==Anasint.SEQ_LOG){
                        gencode_espacios();
                        fichero.write("Boolean[] "+k+";\n");
                    }else if(v==Anasint.SEQ_NUM){
                        gencode_espacios();
                        fichero.write("Integer[] "+k+";\n");
                    }

                } catch (IOException e) {
                }
            });
        }

    }

    /////////////////////////
    //  REGLAS. ATRIBUCIONES.//
    ///////////////////////

    public void enterPrograma(Anasint.ProgramaContext ctx) {
        open_file();
        gencode_begin_class();
    }

    public void exitPrograma(Anasint.ProgramaContext ctx) {
        gencode_end_main();
        gencode_end_class();
        close_file();
    }

    public void enterSubprogramas(Anasint.SubprogramasContext ctx) {
        gencode_variables(variablesProg);
        main = false;
    }

    public void exitSubprogramas(Anasint.SubprogramasContext ctx) {
        main = true;
    }

    public void enterInstrucciones(Anasint.InstruccionesContext ctx){
        if(main){
            if(!maindone){
                gencode_begin_main();
                maindone = true;
            }
        }else{
            gencode_variables(variablesSubProg);
        }
    }

    public void exitVariables(Anasint.VariablesContext ctx){
        List<String> l = (List<String>) generador.visit(ctx.vars());
        Integer i = (Integer) generador.visit(ctx.tipo());
        for (String s : l) {
            if(main) {
                variablesProg.put(s,i);
            }else{
                variablesSubProg.put(s, i);
            }
        }
    }

    
    public void enterFuncion(Anasint.FuncionContext ctx){
        String s = null;
        String t = null;
        String type = null;
        String res = null;
        if(ctx.fun().children.contains(ctx.fun().predicado())){
            s = ctx.fun().predicado().expresionF().getText();
            t = "Boolean";
            res = ctx.fun().predicado().VAR().getText();
            if(ctx.fun().predicado().children.contains(ctx.fun().predicado().params())){
                type = ctx.fun().predicado().params().getText();
                type= type.replace("(", "");
                type= type.replace(")", "");
                type= type.replaceAll("SEQNUM", "Integer[] ");
                type= type.replaceAll("SEQLOG", "Boolean[] ");
                type= type.replaceAll("NUM", "Integer ");
                type= type.replaceAll("LOG", "Boolean ");
            }
        }else if(ctx.fun().children.contains(ctx.fun().func())){
            s = ctx.fun().func().nombre_funcion().expresionF().getText();
            res = ctx.fun().func().retornoFuncion().params().VAR().getText();
            t= ctx.fun().func().retornoFuncion().params().tipo().getText();
            t= t.replace("(", "");
            t= t.replace(")", "");
            t= t.replaceAll("SEQNUM", "Integer[] ");
            t= t.replaceAll("SEQLOG", "Boolean[] ");
            t= t.replaceAll("NUM", "Integer");
            t= t.replaceAll("LOG", "Boolean ");
            if(ctx.fun().func().nombre_funcion().children.contains(ctx.fun().func().nombre_funcion().params())){
                type = ctx.fun().func().nombre_funcion().params().getText();
                type= type.replace("(", "");
                type= type.replace(")", "");
                type= type.replaceAll("SEQNUM", "Integer[] ");
                type= type.replaceAll("SEQLOG", "Boolean[] ");
                type= type.replaceAll("NUM", "Integer ");
                type= type.replaceAll("LOG", "Boolean ");
            }
        }
        if(type==null){type="";}
        gencode_begin_method2(t,s,type,res);
    }

    public void enterProcedimiento(Anasint.ProcedimientoContext ctx){
        String t = null;
        if(!ctx.proc().children.contains(ctx.proc().retornoFuncion())){
            t = "void";
        }else{
            t= ctx.proc().retornoFuncion().params().tipo().getText();
            t= t.replace("(", "");
            t= t.replace(")", "");
            t= t.replaceAll("SEQNUM", "Integer[] ");
            t= t.replaceAll("SEQLOG", "Boolean[] ");
            t= t.replaceAll("NUM", "Integer ");
            t= t.replaceAll("LOG", "Boolean ");

        }
        String s = ctx.proc().expresionF().getText();
        String type = null;
        if(!ctx.proc().children.contains(ctx.proc().params())){
            type = "";
        }else{
            type = ctx.proc().params().getText();
            type= type.replace("(", "");
            type= type.replace(")", "");
            type= type.replaceAll("SEQNUM", "Integer[] ");
            type= type.replaceAll("SEQLOG", "Boolean[] ");
            type= type.replaceAll("NUM", "Integer ");
            type= type.replaceAll("LOG", "Boolean ");
        }


        gencode_begin_method(t,s,type);
    }

    public void exitProcedimiento(Anasint.ProcedimientoContext ctx){
        gencode_end_method();
    }

    public void exitFuncion(Anasint.FuncionContext ctx){
        gencode_end_method();
    }

    public void enterAsignacion_simple(Anasint.Asignacion_simpleContext ctx){
        try{
            gencode_espacios();
            String s = ctx.getText();
            s = s.replaceAll("T","true");
            s = s.replaceAll("F","false");
            if(variablesProg.containsKey(ctx.expr().VAR().getText())){
                if(variablesProg.get(ctx.expr().VAR().getText())==Anasint.SEQ_NUM){
                    s = s.replace("]","}");
                    s = s.replace("[","new Integer[]{");
                }else if(variablesProg.get(ctx.expr().VAR().getText())==Anasint.SEQ_LOG){
                    s = s.replace("]","}");
                    s = s.replace("[","new Boolean[]{");
                }

            }else if(variablesSubProg.containsKey(ctx.expr().VAR().getText())){
                if(variablesSubProg.get(ctx.expr().VAR().getText())==Anasint.SEQ_NUM){
                    s = s.replace("]","}");
                    s = s.replace("[","=new Integer[]{");
                }else if(variablesSubProg.get(ctx.expr().VAR().getText())==Anasint.SEQ_LOG){
                    s = s.replace("]","}");
                    s = s.replace("[","new Boolean[]{");

                }
            }
            fichero.write(s+"\n");
        }catch (IOException e){}
    }

    public void enterAsignacion_multiple(Anasint.Asignacion_multipleContext ctx){
        try{
            int i = 0;
            while(i<ctx.expr().size()){
                gencode_espacios();
                if(ctx.expr().size()==ctx.expresion().size()){
                    String expresion = ctx.expresion(i).getText();
                    expresion = expresion.replaceAll("T","true");
                    expresion = expresion.replaceAll("F","false");
                    if(variablesProg.containsKey(ctx.expr(i).getText())){
                        if(variablesProg.get(ctx.expr(i).getText())==Anasint.SEQ_NUM){
                            expresion = expresion.replace("]","}");
                            expresion = expresion.replace("[","new Integer[]{");
                        }else if(variablesProg.get(ctx.expr(i).getText())==Anasint.LOG){
                            expresion = expresion.replace("]","}");
                            expresion = expresion.replace("[","new Boolean[]{");
                        }
                    }else if(variablesSubProg.containsKey(ctx.expr(i).getText())){
                        if(variablesSubProg.get(ctx.expr(i).getText())==Anasint.SEQ_NUM){
                            expresion = expresion.replace("]","}");
                            expresion = expresion.replace("[","new Integer[]{");
                        }else if(variablesSubProg.get(ctx.expr(i).getText())==Anasint.LOG){
                            expresion = expresion.replace("]","}");
                            expresion = expresion.replace("[","new Boolean[]{");
                        }
                    }
                    fichero.write(ctx.expr(i).getText()+" = "+expresion+";\n");
                }else{
                    String expresion = ctx.expresion(0).getText();
                    expresion = expresion.replaceAll("T","true");
                    expresion = expresion.replaceAll("F","false");
                    if(variablesProg.containsKey(ctx.expr(i).getText())){
                        if(variablesProg.get(ctx.expr(i).getText())==Anasint.SEQ_NUM){
                            expresion = expresion.replace("]","}");
                            expresion = expresion.replace("[","new Integer[]{");
                        }else if(variablesProg.get(ctx.expr(i).getText())==Anasint.LOG){
                            expresion = expresion.replace("]","}");
                            expresion = expresion.replace("[","new Boolean[]{");
                        }
                    }else if(variablesSubProg.containsKey(ctx.expr(i).getText())){
                        if(variablesSubProg.get(ctx.expr(i).getText())==Anasint.SEQ_NUM){
                            expresion = expresion.replace("]","}");
                            expresion = expresion.replace("[","new Integer[]{");
                        }else if(variablesSubProg.get(ctx.expr(i).getText())==Anasint.LOG){
                            expresion = expresion.replace("]","}");
                            expresion = expresion.replace("[","new Boolean[]{");
                        }
                    }
                    fichero.write(ctx.expr(i).getText()+" = "+expresion+";\n");
                }
                i++;
            }

        }catch (IOException e){}
    }

    public void enterCondicional(Anasint.CondicionalContext ctx){
        try{
            gencode_espacios();
            fichero.write("if("+ctx.condicion().getText()+"){\n");
            espacios++;
        }catch (IOException e){

        }
    }

    public void enterIteracion(Anasint.IteracionContext ctx){
        try{
            gencode_espacios();
            fichero.write("while("+ctx.condicion().getText()+"){\n");
            espacios++;
        }catch (IOException e){

        }
    }

    public void exitIteracion(Anasint.IteracionContext ctx){
        try{
            espacios--;
            gencode_espacios();
            fichero.write("}\n");

        }catch (IOException e){

        }
    }

    public void exitCondicional(Anasint.CondicionalContext ctx){
        try{
            espacios--;
            gencode_espacios();
            fichero.write("}\n");

        }catch (IOException e){

        }
    }

    public void enterDevolucion(Anasint.DevolucionContext ctx){
        try{
            gencode_espacios();
            String s = ctx.getText();
            s = s.replaceAll("dev", "return ");
            s = s.replaceAll(" T", " true");
            s = s.replaceAll(" F", " false");
            fichero.write(s+"\n");

        }catch (IOException e){

        }
    }

    public void enterBloque_opcional(Anasint.Bloque_opcionalContext ctx){
        try{
            espacios--;
            gencode_espacios();
            fichero.write("}else{\n");
            espacios++;

        }catch (IOException e){

        }
    }

    public void enterRuptura(Anasint.RupturaContext ctx){
        try{
            gencode_espacios();
            fichero.write("break;\n");
        }catch (IOException e){

        }
    }

    public void exitMostrar(Anasint.MostrarContext ctx){
        try{
            gencode_espacios();
            fichero.write(ctx.getText()+"\n");
        }catch (IOException e){

        }
    }

    public void exitLlamada_procedimiento(Anasint.Llamada_procedimientoContext ctx){
        try{
            gencode_espacios();
            fichero.write(ctx.getText()+"\n");
        }catch (IOException e){

        }
    }

}
