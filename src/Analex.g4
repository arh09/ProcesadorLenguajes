lexer grammar Analex;

BLANCO: ' ' ->skip;
TABULADOR: '\t'->skip;
FIN_LINEA: '\r'?'\n' ->skip;

fragment DIGITO: [0-9];
fragment LETRA:[a-z];
NUMERO:('-')?(DIGITO)+;
VARIABLES:'VARIABLES';
FUNCION:'FUNCION';
PROCEDIMIENTO:'PROCEDIMIENTO';
INSTRUCCIONES:'INSTRUCCIONES';
PROGRAMA:'PROGRAMA';
SUBPROGRAMAS:'SUBPROGRAMAS';

DOS_PUNTOS: ':';
PARENTESIS_ABIERTO : '(';
PARENTESIS_CERRADO : ')';
PyC: ';';
COMA: ',';
NUM:'NUM';
LOG:'LOG';
SEQ:'SEQ';
DEV:'dev';
MAYOR:'mayor';
MENOR:'menor';
MAYOR_QUE:'mayor_que_';
MENOR_QUE:'menor_que_';
SUMA: '+';
RESTA: '-';
MULT: '*';
DIV:'/';
IGUAL:'=';
SI:'si';
FSI:'fsi';
MAYORQ:'>=';
MENORQ:'<=';
MAY:'>';
MEN:'<';
DISTINTO:'!=';
IGUALDAD:'==';
AND:'&&';
OR:'||';
NEGACION:'!';
ENTONCES:'entonces';
CORCHETE_ABIERTO:'[';
CORCHETE_CERRADO:']';
SINO:'sino';
MIENTRAS:'mientras';
HACER:'hacer';
FMIENTRAS:'fmientras';
RUPTURA:'ruptura';
VACIA: 'vacia';
MOSTRAR:'mostrar';
ULTIMAPOSICION: 'ultima_posicion';
FFUNCION:'FFUNCION';
FPROCEDIMIENTO:'FPROCEDIMIENTO';
T:'T';
F:'F';

VAR: LETRA(LETRA|DIGITO)*;


COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;
COMENTARIO_LINEA : '//' .*? FIN_LINEA -> skip ;
