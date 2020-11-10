parser grammar Anasint;
options{
 tokenVocab=Analex;
}

programa: PROGRAMA (variables)? SUBPROGRAMAS(subprogramas)* (instrucciones)? EOF;

subprogramas: subprograma (variables)? instrucciones (retorno)? (FFUNCION|FPROCEDIMIENTO);

retorno: DEV exprRetorno;

exprRetorno: VAR COMA exprRetorno PyC
            | VAR;

variables: VARIABLES (vars)+;

vars: VAR (COMA VAR)* DOS_PUNTOS tipo PyC;

tipo: elemental | no_elemental;

elemental: NUM | LOG ;

no_elemental: secuencia_entera | secuencia_logica ;

secuencia_entera: SEQ PARENTESIS_ABIERTO (expr)* PARENTESIS_CERRADO;

secuencia_logica:  SEQ PARENTESIS_ABIERTO (expr1)* PARENTESIS_CERRADO;

expr: NUM COMA expr
     | NUM;

expr1: LOG VAR COMA expr1
    | LOG VAR
    |LOG COMA expr1
    |LOG;

//el programa puede tenr funciones o procedimientos
subprograma: funcion | procedimiento;

funcion:FUNCION (fun)+;

fun: func | predicado;

func: func1 |func2 |func3;

nombre_funcion: (MAYOR|MENOR) PARENTESIS_ABIERTO (expr2)+ PARENTESIS_CERRADO;


//entrada--> secuencia posiblemente vacía , salida--> devuelve parámetros de salida
func1: nombre_funcion  DEV PARENTESIS_ABIERTO (expr2)+ PARENTESIS_CERRADO;

func2: nombre_funcion DEV PARENTESIS_ABIERTO (expr1) PARENTESIS_CERRADO;

func3: nombre_funcion DEV PARENTESIS_ABIERTO (expr) PARENTESIS_CERRADO;

expr_booleana: T |F;
//return valor lógico , entrada puede ser secuencia de números
predicado: (MAYOR_QUE|MENOR_QUE)  PARENTESIS_ABIERTO (expr2)+ PARENTESIS_CERRADO DEV PARENTESIS_ABIERTO (expr3)+ PARENTESIS_CERRADO;

expr2: NUM VAR COMA expr2  //(NUM x , NUM y..)
    | NUM VAR
    | SEQ VAR COMA expr2
    | SEQ VAR;

expr3: LOG VAR COMA expr3
    | LOG VAR;


procedimiento: PROCEDIMIENTO (proc)+;

proc: (MAYOR|MENOR) PARENTESIS_ABIERTO exprProc PARENTESIS_CERRADO;

exprProc: SEQ VAR COMA exprProc
        |SEQ VAR
        |NUM VAR COMA exprProc
        |NUM VAR
        |;

//Sin aserto ni función de avance (nivel 2)
instrucciones: INSTRUCCIONES ((asignacion)+ | (condicional)+ | (iteracion)+ )+;

asignacion: asignacion_simple | asignacion_multiple | llamada_a_funcion | llamada_a_procedimiento;

asignacion_simple: VAR IGUAL CORCHETE_ABIERTO (expr4)+  CORCHETE_CERRADO PyC;

expr4: NUMERO COMA expr4 // 2,5,4,6..
        | NUMERO;

asignacion_multiple: (expr5)+ IGUAL (expr5)+ (CORCHETE_ABIERTO VAR CORCHETE_CERRADO)? PyC;

expr5: VAR (operaciones)? COMA expr5 //puede tener operaciones o no
    |NUMERO (operaciones)? COMA expr5
    |NUMERO COMA expr5
    | VAR COMA expr5
    |VAR (operaciones)?
    |NUMERO (operaciones)?
    |NUMERO
    | VAR ;

operaciones: SUMA (VAR|NUMERO)
            |RESTA (VAR|NUMERO)
            |MULT (VAR|NUMERO)
            |DIV (VAR|NUMERO);

//el bloque_opcional sería el SINO , puede que aparezca o no
condicional:(condicional_si)+;

condicional_si:SI condicion (bloque)* (DEV expr_booleana)? (ruptura)?  (bloque_opcional)?  FSI;


condicion: condicion1 ENTONCES;

condicion1: PARENTESIS_ABIERTO cond1 cond2 (VAR|nombre_llamada_funcion|NUMERO) (concatena_operador_logico)* PARENTESIS_CERRADO;

//en caso de que haya un && o ||
concatena_operador_logico: (AND|OR) cond1 cond2 (VAR|nombre_llamada_funcion|NUMERO);

// (p.e s[i] o s o s[i+1]
cond1: VAR CORCHETE_ABIERTO (VAR|NUMERO) (operaciones)? CORCHETE_CERRADO
      |VAR
      |NUMERO;



cond2: predicado | IGUALDAD | desigualdades ;

desigualdades: MAYORQ | MENORQ | MAY | MEN | DISTINTO;

bloque: cond1 (operaciones)? IGUAL cond1 (operaciones)? PyC
        |llamada_a_procedimiento;

bloque_opcional: SINO (bloque)* (DEV expr_booleana)? (ruptura)?;

//dentro del while puede haber if o no , entonces por eso (condicional)?
iteracion: MIENTRAS condicion1 HACER (bloque)* (ruptura)? (condicional)? (ruptura)? (bloque)* FMIENTRAS;

ruptura: RUPTURA PyC;

llamada_a_funcion: (expr5)+ IGUAL nombre_llamada_funcion PyC;

nombre_llamada_funcion: (MAYOR|MENOR|ULTIMAPOSICION|VACIA) PARENTESIS_ABIERTO (VAR|NUMERO) PARENTESIS_CERRADO;

llamada_a_procedimiento: MOSTRAR PARENTESIS_ABIERTO (expr5) PARENTESIS_CERRADO PyC ;
