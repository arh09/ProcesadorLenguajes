parser grammar Anasint;
options{
 tokenVocab=Analex;
}

programa: variables subprograma instrucciones EOF;

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

//Sin aserto ni función de avance (nivel 2)
instrucciones: INSTRUCCIONES ((asignacion)+ | (condicional)+ | (iteracion)+ )+;

asignacion: asignacion_simple | asignacion_multiple;

asignacion_simple: VAR IGUAL CORCHETE_ABIERTO (expr4)+  CORCHETE_CERRADO PyC;

expr4: NUMERO COMA expr4 // 2,5,4,6..
        | NUMERO;

asignacion_multiple: (expr5)+ IGUAL (expr5)+ PyC;

expr5: VAR (operaciones)? COMA expr5 //puede tener operaciones o no
    |NUMERO (operaciones)? COMA expr5
    |NUMERO COMA expr5
    | VAR COMA expr5
    |VAR (operaciones)?//puede tener operaciones o no
    |NUMERO (operaciones)?
    |NUMERO
    | VAR ;

operaciones: SUMA (VAR|NUMERO)
            |RESTA (VAR|NUMERO)
            |MULT (VAR|NUMERO)
            |DIV (VAR|NUMERO);

//el bloque_opcional sería el SINO , puede que aparezca o no
condicional:SI condicion (bloque)+ (ruptura)? (bloque_opcional)? FSI;

condicion: condicion1 ENTONCES;

condicion1: PARENTESIS_ABIERTO cond1 cond2 VAR (concatena_operador_logico)* PARENTESIS_CERRADO;

//en caso de que haya un && o ||
concatena_operador_logico: (AND|OR) cond1 cond2 VAR;

// (p.e s[i] o s)
cond1: VAR CORCHETE_ABIERTO (VAR|NUMERO) CORCHETE_CERRADO
      |VAR;

//revisar la llamada a predicado aquí , no estoy seguro
cond2: predicado | IGUALDAD | desigualdades ;

desigualdades: MAYORQ | MENORQ | MAY | MEN | DISTINTO;

bloque: cond1 (operaciones)? IGUAL cond1 (operaciones)? PyC ;

bloque_opcional: SINO (bloque)+ (ruptura)?;

//dentro del while puede haber if o no , entonces por eso (condicional)?
iteracion: MIENTRAS condicion1 HACER (bloque)* (ruptura)? (condicional)? (ruptura)? (bloque)* FMIENTRAS;

ruptura: RUPTURA PyC;

