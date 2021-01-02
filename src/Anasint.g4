parser grammar Anasint;
options{
 tokenVocab=Analex;
}

programa: PROGRAMA variables subprogramas INSTRUCCIONES instrucciones EOF;

variables: VARIABLES (vars)*;

vars: varRecurs DOS_PUNTOS tipo PyC;

varRecurs: VAR (COMA varRecurs)*;

tipo: elemental | no_elemental;

elemental: NUM | LOG ;

no_elemental: SEQ_NUM | SEQ_LOG;

//el programa puede tenr funciones o procedimientos
subprogramas:SUBPROGRAMAS (funcion | procedimiento)*;

funcion:FUNCION fun variables INSTRUCCIONES instrucciones FFUNCION;

fun: func | predicado;

expresionF: VAR (BB (VAR|NUMERO))*;

nombre_funcion: expresionF PARENTESIS_ABIERTO (expr2)* PARENTESIS_CERRADO;


//entrada--> secuencia posiblemente vacía , salida--> devuelve parámetros de salida
func: nombre_funcion  retornoFuncion;

retornoFuncion: DEV PARENTESIS_ABIERTO expr2 PARENTESIS_CERRADO;

expr_booleana: T |F;
//return valor lógico , entrada puede ser secuencia de números
predicado: expresionF PARENTESIS_ABIERTO (expr2)* PARENTESIS_CERRADO DEV PARENTESIS_ABIERTO LOG VAR PARENTESIS_CERRADO;

expr2: NUM VAR COMA expr2  #NumVarComa
    | NUM VAR               #NumVar
    | no_elemental VAR COMA expr2 #SeqVarComa
    | no_elemental VAR             #SeqVar
    ;

procedimiento: PROCEDIMIENTO proc variables INSTRUCCIONES instrucciones FPROCEDIMIENTO;

proc: expresionF PARENTESIS_ABIERTO exprProc PARENTESIS_CERRADO;

exprProc: no_elemental VAR COMA exprProc
        | no_elemental VAR
        | elemental VAR COMA exprProc
        | elemental VAR
        |;

//Sin aserto ni función de avance (nivel 2)
instrucciones: ((asignacion) | (condicional) | (iteracion) | (ruptura) | (devolucion) | (llamada_a_funcion) | (llamada_a_procedimiento))*;

asignacion: asignacion_simple | asignacion_multiple;

asignacion_simple: asignacion_binaria | asignacion_logica | asignacion_secuencia;
//VAR IGUAL CORCHETE_ABIERTO (expr4)+  CORCHETE_CERRADO PyC;


asignacion_binaria: VAR IGUAL expresion_binaria PyC;

expresion_binaria: NUMERO #BinNum
    | VAR   #BinVar
    | NUMERO (operaciones)* #BinNumOp
    | VAR (operaciones)*    #BinVarOp
    | PARENTESIS_ABIERTO expresion_binaria PARENTESIS_CERRADO #BinParent
    | nombre_llamada_funcion #BinFun
    ;


asignacion_logica: VAR IGUAL expresion_logica PyC;

expresion_logica: (NEGACION)?T #ExprLogTrue
    | (NEGACION)?F              #ExprLogFalse
    | (NEGACION)?VAR               #ExprLogVar
    | (NEGACION)?nombre_llamada_funcion #ExprLogFun
    | (NEGACION)?llamada_a_procedimiento    #ExprLogProc
    ;

expresion_secuencia: elemento_secuencia | secuencia_completa ;

elemento_secuencia : VAR CORCHETE_ABIERTO expresion_binaria CORCHETE_CERRADO;
secuencia_completa: CORCHETE_ABIERTO (sec_binaria | sec_logica)? CORCHETE_CERRADO;

sec_binaria: expresion_binaria COMA sec_binaria// 2,5,4,6..
        | expresion_binaria ;

sec_logica: expresion_logica COMA sec_logica //T,T,F,F,T...
        | expresion_logica;

asignacion_secuencia: VAR IGUAL expresion_secuencia PyC ;

asignacion_multiple: VAR (CORCHETE_ABIERTO expresion_binaria CORCHETE_CERRADO)? (COMA VAR (CORCHETE_ABIERTO expresion_binaria CORCHETE_CERRADO)?)+ IGUAL (expr5)+ PyC;

expr5: expresion_binaria COMA expr5 //puede tener operaciones o no
    | expresion_binaria
    | expresion_logica COMA expr5
    | expresion_logica
    | expresion_secuencia COMA expr5
    | expresion_secuencia;

operaciones: SUMA (expresion_binaria)   #OpSuma
            |RESTA (expresion_binaria)  #OpResta
            |MULT (expresion_binaria)   #OpMult
            |DIV (expresion_binaria)    #OpDiv
            ;

//el bloque_opcional sería el SINO , puede que aparezca o no
condicional:SI condicion ENTONCES instrucciones (bloque_opcional)? FSI;

condicion: PARENTESIS_ABIERTO expr5 (desigualdades expr5)? (concatena_operador_logico)* PARENTESIS_CERRADO;

//en caso de que haya un && o ||
concatena_operador_logico: (AND|OR) expr5 (desigualdades expr5)?;

desigualdades: IGUALDAD | MAYORQ | MENORQ | MAY | MEN | DISTINTO;


bloque_opcional: SINO instrucciones;

//dentro del while puede haber if o no , entonces por eso (condicional)?
iteracion: MIENTRAS condicion HACER instrucciones FMIENTRAS;

ruptura: RUPTURA PyC;

llamada_a_funcion: (expr5)+ IGUAL nombre_llamada_funcion PyC;

nombre_llamada_funcion: expresionF PARENTESIS_ABIERTO (expr5)? PARENTESIS_CERRADO;

llamada_a_procedimiento: expresionF PARENTESIS_ABIERTO (expr5)? PARENTESIS_CERRADO PyC ;

devolucion: DEV expr5 PyC;