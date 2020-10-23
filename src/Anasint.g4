parser grammar Anasint;
options{
 tokenVocab=Analex;
}

programa: variables;

variables: VARIABLES (vars)+;

vars: VAR (COMA VAR)* DOS_PUNTOS NUM PyC;

tipo: elemental | no_elemental;

elemental: NUM | LOG;

no_elemental: secuencia_entera | secuencia_logica ;

secuencia_entera: SEQ PARENTESIS_ABIERTO (expr)* PARENTESIS_CERRADO;

secuencia_logica:  SEQ PARENTESIS_ABIERTO (LOG)? PARENTESIS_CERRADO;

expr: NUM COMA expr
     | NUM;