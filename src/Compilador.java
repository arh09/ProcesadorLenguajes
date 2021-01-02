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

    //Generar código para v = exp
    public void gencodigo_asignacion(String v, Object exp) {
        String txt_exp = "0";
        if (exp != null) txt_exp = generador.visit((ParseTree) exp);
        gencode_espacios();
        try {
            fichero.write(v + "=" + txt_exp + ";\n");
            //código de una asignación
        } catch (IOException e) {
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
            fichero.write("{\n");
            espacios++;
        } catch (IOException e) {
        }
    }

    // Generar código comienzo main
    private void gencode_begin_main() {
        try {
            gencode_espacios();
            fichero.write("public static void main(String[] args) {\n");
            espacios++;
        } catch (IOException e) {
        }
    }

    // Generar código fin main
    private void gencode_end_main() {
        try {
            espacios--;
            gencode_espacios();
            fichero.write("}\n");
        } catch (IOException e) {
        }
    }

    // Generar código fin clase
    private void gencode_end_class() {
        try {
            espacios--;
            gencode_espacios();
            fichero.write("}");
        } catch (IOException e) {
        }
    }

    private void gencode_begin_method(String t, String s, String type, String n) {
        try {
            fichero.write("public " + t + " " + s + "(" + type + " " + n + "){\n");
        } catch (IOException e) {
        }
    }

    private void gencode_declarar_variables(String s, String t) {
        try {
            if (cont == 0) {

                fichero.write("private " + t + " " + s);
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
        if (cont == 0) {
            gencode_begin_main();
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
                    gencode_declarar_variables(s, "Boolean");
                }
                if (integers.contains(s)) {
                    gencode_declarar_variables(s, "Integer");
                }
                if (listint.contains(s)) {
                    gencode_declarar_variables(s, "Integer[]");
                }
                if (listbool.contains(s)) {
                    gencode_declarar_variables(s, "Boolean[]");
                }
            }
        } else {
            for (String s : almacen_definiciones2.keySet()) {
                if (booleans.contains(s)) {
                    gencode_declarar_variables(s, "Boolean");
                }
                if (integers.contains(s)) {
                    gencode_declarar_variables(s, "Integer");
                }
                if (listint.contains(s)) {
                    gencode_declarar_variables(s, "Integer[]");
                }
                if (listbool.contains(s)) {
                    gencode_declarar_variables(s, "Boolean[]");
                }
            }
        }
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
        String type = "type";
        gencode_espacios();
        espacios++;
        gencode_begin_method(t, s, "type", "n");
    }

    public void exitFuncion(Anasint.FuncionContext ctx) {
        try {
            fichero.write("\n}\n");
            espacios--;
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
            fichero.write("while");
        } catch (IOException e) {
        }
    }

    public void exitCondicion(Anasint.CondicionContext ctx) {
        try {
            fichero.write(ctx.getText() + "{\n");
        } catch (IOException e) {
        }
    }

    public void exitIteracion(Anasint.IteracionContext ctx) {
        try {
            fichero.write("}\n");
        } catch (IOException e) {
        }
    }

    public void enterCondicional(Anasint.CondicionalContext ctx) {
        try {
            fichero.write("if");
        } catch (IOException e) {
        }
    }

    public void exitCondicional(Anasint.CondicionalContext ctx) {
        try {
            fichero.write("}\n");
        } catch (IOException e) {
        }
    }

    public void enterBloque_opcional(Anasint.Bloque_opcionalContext ctx) {
        try {
            fichero.write("}else{\n");
        } catch (IOException e) {
        }
    }

    public static String reemplazar(String cadena, String busqueda, String reemplazo) {
        return cadena.replaceAll(busqueda, reemplazo);
    }

    public void exitLlamada_a_procedimiento(Anasint.Llamada_a_procedimientoContext ctx) {
        String nombre = ctx.getText();
        String nombre2 = reemplazar(nombre, "mostrar", "System.out.println");
        try {
            fichero.write(nombre2 + "\n");
        } catch (IOException e) {
        }
    }

    public void enterAsignacion_binaria(Anasint.Asignacion_binariaContext ctx) {
        try {
            fichero.write(ctx.getText() + "\n");
        } catch (IOException e) {
        }
    }

    public void enterAsignacion_logica(Anasint.Asignacion_logicaContext ctx) {
        try {
            fichero.write(ctx.getText() + "\n");
        } catch (IOException e) {
        }
    }

    public void enterAsignacion_secuencia(Anasint.Asignacion_secuenciaContext ctx) {
        try {
            fichero.write(ctx.VAR().getText() + "=");
        } catch (IOException e) {
        }
    }

    public void enterSecuencia_completa(Anasint.Secuencia_completaContext ctx) {
        String nombre = ctx.getText();
        String nombre2 = nombre.replace("]", "}");
        String nombre3 = nombre2.replace("[", "new Integer[]{");
        try {
            fichero.write(nombre3 + ";\n");
        } catch (IOException e) {
        }
    }


}
