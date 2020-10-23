parser grammar Anasint;
options{
 tokenVocab=Analex;
}

programa: variables instrucciones subprogramas EOF;

variables: VARIABLES (vars)+;

vars: VAR (COMA VAR)* DOS_PUNTOS tipo PyC;

tipo: NUM | LOG | no_elemental;

no_elemental: secuencia_entera | secuencia_logica ;

secuencia_entera: SEQ PARENTESIS_ABIERTO (expr)* PARENTESIS_CERRADO;

secuencia_logica:  SEQ PARENTESIS_ABIERTO (expr1)* PARENTESIS_CERRADO;

expr: NUM COMA expr
     | NUM;

expr1: LOG COMA expr1
    | LOG;

instrucciones: instr;

instr: NUM POR NUM | instr2;

instr2: NUM MAS NUM |
        NUM MENOS NUM;




