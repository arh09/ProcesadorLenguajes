// Analizador léxico lenguaje K
lexer grammar Analex;

BLANCO: ' ' ->skip;
TABULADOR: '\t'->skip;
FIN_LINEA: '\r'?'\n' ->skip;

fragment DIGITO: [0-9];
fragment LETRA:[a-zA-Z];

VARIABLES:'VARIABLES';
VAR: LETRA(LETRA|DIGITO)*;
DOS_PUNTOS:':';
PARENTESIS_ABIERTO : '(';
PARENTESIS_CERRADO : ')';
PyC : ';';
COMA : ',';
NUM:'NUM';
LOG:'LOG';
SEQ:'SEQ';

COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;
COMENTARIO_LINEA : '//' .*? FIN_LINEA -> skip ;