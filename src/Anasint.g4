parser grammar Anasint;
options{
 tokenVocab=Analex;
}

programa: PROGRAMA VARIABLES(variables)? SUBPROGRAMAS(subprogramas)* INSTRUCCIONES(instrucciones)? EOF;

variables: (vars)+;

vars: VAR (COMA VAR)* DOS_PUNTOS tipo PyC;

tipo: elemental | no_elemental;

elemental: NUM | LOG ;

no_elemental: SEQ PARENTESIS_ABIERTO (NUM | LOG) PARENTESIS_CERRADO;

//el programa puede tenr funciones o procedimientos
subprogramas: funcion | procedimiento;

funcion:FUNCION (fun)+ VARIABLES(variables)? INSTRUCCIONES(instrucciones)* FFUNCION;

fun: func | predicado;

nombre_funcion: (MAYOR|MENOR) PARENTESIS_ABIERTO (expr2)* PARENTESIS_CERRADO;


//entrada--> secuencia posiblemente vacía , salida--> devuelve parámetros de salida
func: nombre_funcion  DEV PARENTESIS_ABIERTO (expr2)+ PARENTESIS_CERRADO;

expr_booleana: T |F;
//return valor lógico , entrada puede ser secuencia de números
predicado: (MAYOR_QUE|MENOR_QUE) NUMERO PARENTESIS_ABIERTO (expr2)* PARENTESIS_CERRADO DEV PARENTESIS_ABIERTO LOG VAR PARENTESIS_CERRADO;

expr2: NUM VAR COMA expr2  //(NUM x , NUM y..)
    | NUM VAR
    | no_elemental VAR COMA expr2
    | no_elemental VAR
    ;


procedimiento: PROCEDIMIENTO (proc)+ VARIABLES(variables)? INSTRUCCIONES(instrucciones)? FPROCEDIMIENTO;

proc: (MAYOR|MENOR) PARENTESIS_ABIERTO exprProc PARENTESIS_CERRADO;

exprProc: no_elemental VAR COMA exprProc
        | no_elemental VAR
        | elemental VAR COMA exprProc
        | elemental VAR
        |;

//Sin aserto ni función de avance (nivel 2)
instrucciones: ((asignacion)+ | (condicional)+ | (iteracion)+ | (ruptura)+ | (devolucion)+ | (llamada_a_funcion)+ | (llamada_a_procedimiento)+)+;

asignacion: asignacion_simple | asignacion_multiple;

asignacion_simple: asignacion_binaria | asignacion_logica | asignacion_secuencia;
//VAR IGUAL CORCHETE_ABIERTO (expr4)+  CORCHETE_CERRADO PyC;

asignacion_binaria: VAR IGUAL expresion_binaria PyC;

expresion_binaria: NUMERO
    | VAR
    | NUMERO (operaciones)?
    | VAR (operaciones)?
    ;

asignacion_logica: VAR IGUAL expresion_logica PyC;

expresion_logica: T
    | F
    | VAR
    ;

expresion_secuencia: elemento_secuencia | secuencia_completa ;

elemento_secuencia : VAR CORCHETE_ABIERTO (VAR | NUMERO)(operaciones)? CORCHETE_CERRADO;
secuencia_completa: CORCHETE_ABIERTO (sec_binaria | sec_logica) CORCHETE_CERRADO;

sec_binaria: (NUMERO| VAR)(operaciones)? COMA sec_binaria// 2,5,4,6..
        | (NUMERO| VAR)(operaciones)?;

sec_logica: expresion_logica COMA sec_logica //T,T,F,F,T...
        | expresion_logica;

asignacion_secuencia: VAR IGUAL expresion_secuencia PyC ;

asignacion_multiple: VAR (COMA VAR)+ IGUAL (expr5)+ PyC;

expr5: expresion_binaria COMA expr5 //puede tener operaciones o no
    | expresion_binaria
    | expresion_logica COMA expr5
    | expresion_logica
    | expresion_secuencia COMA expr5
    | expresion_secuencia;

operaciones: SUMA (VAR|NUMERO)
            |RESTA (VAR|NUMERO)
            |MULT (VAR|NUMERO)
            |DIV (VAR|NUMERO);

//el bloque_opcional sería el SINO , puede que aparezca o no
condicional:(condicional_si)+;

condicional_si:SI condicion ENTONCES (instrucciones)* (bloque_opcional)? FSI;

condicion: PARENTESIS_ABIERTO cond1 cond2 (VAR|nombre_llamada_funcion|NUMERO) (concatena_operador_logico)* PARENTESIS_CERRADO;

//en caso de que haya un && o ||
concatena_operador_logico: (AND|OR) cond1 cond2 (VAR|nombre_llamada_funcion|NUMERO);

// (p.e s[i] o s o s[i+1]
cond1: VAR CORCHETE_ABIERTO (VAR|NUMERO) (operaciones)? CORCHETE_CERRADO
      |VAR
      |NUMERO;



cond2: predicado | IGUALDAD | desigualdades ;

desigualdades: MAYORQ | MENORQ | MAY | MEN | DISTINTO;


bloque_opcional: SINO (instrucciones)*;

//dentro del while puede haber if o no , entonces por eso (condicional)?
iteracion: MIENTRAS condicion HACER (instrucciones)* FMIENTRAS;

ruptura: RUPTURA PyC;

llamada_a_funcion: (expr5)+ IGUAL nombre_llamada_funcion PyC;

nombre_llamada_funcion: (MAYOR|MENOR|ULTIMAPOSICION|VACIA) PARENTESIS_ABIERTO (VAR|NUMERO) PARENTESIS_CERRADO;

llamada_a_procedimiento: MOSTRAR PARENTESIS_ABIERTO (expr5) PARENTESIS_CERRADO PyC ;

devolucion: DEV (NUMERO | expresion_logica)(COMA (NUMERO | expresion_logica))* PyC;