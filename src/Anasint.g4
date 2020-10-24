parser grammar Anasint;
options{
 tokenVocab=Analex;
}

programa: variables subprograma EOF;

variables: VARIABLES (vars)+;

vars: VAR (COMA VAR)* DOS_PUNTOS tipo PyC;

tipo: elemental | no_elemental;

elemental: NUM | LOG ;

no_elemental: secuencia_entera | secuencia_logica ;

secuencia_entera: SEQ PARENTESIS_ABIERTO (expr)* PARENTESIS_CERRADO;

secuencia_logica:  SEQ PARENTESIS_ABIERTO (expr1)* PARENTESIS_CERRADO;

expr: NUM COMA expr
     | NUM;

expr1: LOG COMA expr1
    | LOG;

//el programa puede tenr funciones o procedimientos , las dos a la vez no . Para probar en entrada.txt si pones funcion quitar procedimiento , y al revés , ya que solo puede tener uno de los dos.
subprograma: funcion | procedimiento;

funcion:FUNCION (fun)+;

fun: func | predicado;

func: func1 |func2 |func3;

//entrada--> secuencia posiblemente vacía , salida--> devuelve parámetros de salida
func1: (MAYOR|MENOR) PARENTESIS_ABIERTO SEQ VAR PARENTESIS_CERRADO DEV PARENTESIS_ABIERTO (expr2)+ PARENTESIS_CERRADO;

func2: VACIA PARENTESIS_ABIERTO SEQ VAR PARENTESIS_CERRADO DEV PARENTESIS_ABIERTO (expr1) PARENTESIS_CERRADO;

func3: ULTIMAPOSICION PARENTESIS_ABIERTO SEQ VAR PARENTESIS_CERRADO DEV PARENTESIS_ABIERTO (expr) PARENTESIS_CERRADO;

//return valor lógico , entrada puede ser secuencia de números
predicado: (MAYOR_QUE|MENOR_QUE) PARENTESIS_ABIERTO (expr2)+ PARENTESIS_CERRADO DEV PARENTESIS_ABIERTO (expr3)+ PARENTESIS_CERRADO;

expr2: NUM VAR COMA expr2  //(NUM x , NUM y..)
    | NUM VAR;

expr3: LOG VAR COMA expr3
    | LOG VAR;


procedimiento: PROCEDIMIENTO (proc)+;

proc: (MAYOR|MENOR) PARENTESIS_ABIERTO SEQ VAR COMA (expr2)+ PARENTESIS_CERRADO;
