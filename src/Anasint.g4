parser grammar Anasint;
options{
 tokenVocab=Analex;
}

programa: PROGRAMA VARIABLES variables* SUBPROGRAMAS subprogramas INSTRUCCIONES instrucciones EOF;

variables: vars DOS_PUNTOS tipo PyC;

vars: VAR (COMA VAR)* ;

tipo: elemental | no_elemental;

elemental: NUM | LOG ;

no_elemental: SEQ_NUM | SEQ_LOG;

//el programa puede tenr funciones o procedimientos
subprogramas:(funcion | procedimiento)*;

funcion:FUNCION fun VARIABLES variables* INSTRUCCIONES instrucciones FFUNCION;

fun: predicado | func;

predicado: expresionF PARENTESIS_ABIERTO (params)? PARENTESIS_CERRADO DEV PARENTESIS_ABIERTO LOG VAR PARENTESIS_CERRADO;

expresionF: VAR (BB (VAR|NUMERO))*;

func: nombre_funcion  retornoFuncion;

nombre_funcion: expresionF PARENTESIS_ABIERTO (params)? PARENTESIS_CERRADO;

retornoFuncion: DEV PARENTESIS_ABIERTO params PARENTESIS_CERRADO;

params: tipo VAR COMA params
         | tipo VAR
         ;

procedimiento: PROCEDIMIENTO proc VARIABLES variables* INSTRUCCIONES instrucciones FPROCEDIMIENTO;

proc: expresionF PARENTESIS_ABIERTO (params)? PARENTESIS_CERRADO (retornoFuncion)?;

instrucciones: (asignacion | condicional | iteracion | ruptura | devolucion | llamada_procedimiento | mostrar)*;

llamada_procedimiento: llamada_funcion PyC;

asignacion: asignacion_simple | asignacion_multiple;

asignacion_simple: expr IGUAL expresion PyC;

expr: VAR| elemento_secuencia;

asignacion_multiple: expr COMA expr (COMA expr)*
            IGUAL expresion (COMA expresion)* PyC;

expresion: VAR
            | llamada_funcion
            | expr_binaria
            | expr_logica
            | expr_secuencia
            | elemento_secuencia
            ;

expr_binaria: NUMERO (operaciones)?
               | VAR (operaciones)?
               | elemento_secuencia (operaciones)?
               | PARENTESIS_ABIERTO expr_binaria PARENTESIS_CERRADO (operaciones)?
               | llamada_funcion (operaciones)?
               ;

operaciones: (SUMA|RESTA|MULT) expresion;

elemento_secuencia: VAR CORCHETE_ABIERTO expresion CORCHETE_CERRADO;

llamada_funcion: (expresionF| VACIA | ULTIMAPOSICION) PARENTESIS_ABIERTO (expresion (COMA expresion)*)? PARENTESIS_CERRADO;

expr_logica: T
    | F
    | elemento_secuencia
    ;

expr_secuencia: CORCHETE_ABIERTO
        (expresion(COMA expresion)*)?
        CORCHETE_CERRADO;

condicional:SI condicion ENTONCES instrucciones (bloque_opcional)? FSI;

 condicion: PARENTESIS_ABIERTO (NEGACION)?(expresion | CIERTO | FALSO)
            (desigualdades (NEGACION)?(expresion | CIERTO | FALSO))?
            (operador_logico)* PARENTESIS_CERRADO;

desigualdades: IGUALDAD | MAYORQ | MENORQ | MAY | MEN | DISTINTO;

operador_logico: (AND|OR) (NEGACION PARENTESIS_ABIERTO)?(expresion | CIERTO | FALSO)
        (desigualdades (NEGACION)?(expresion | CIERTO | FALSO))? (PARENTESIS_CERRADO)?;

bloque_opcional: SINO instrucciones;

iteracion: MIENTRAS condicion HACER instrucciones FMIENTRAS;

ruptura: RUPTURA PyC;

devolucion: DEV expresion (COMA expresion)* PyC;

mostrar: MOSTRAR PARENTESIS_ABIERTO (VAR|elemento_secuencia) (COMA (VAR|elemento_secuencia))* PARENTESIS_CERRADO PyC;