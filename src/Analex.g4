lexer grammar Analex;

BLANCO: ' ' ->skip;
TABULADOR: '\t'->skip;
FIN_LINEA: '\r'?'\n' ->skip;

fragment DIGITO: [0-9];
fragment LETRA:[a-zA-Z];
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
BB: '_';
CORCHETE_ABIERTO:'[';
CORCHETE_CERRADO:']';
NUM:'NUM';
LOG:'LOG';
SEQ:'SEQ';
DEV:'dev';
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
SINO:'sino';
MIENTRAS:'mientras';
HACER:'hacer';
FMIENTRAS:'fmientras';
RUPTURA:'ruptura';

//MAYOR:'mayor';
//MENOR:'menor';
//MAYOR_QUE:'mayor_que_'(DIGITO|LETRA)*;
//MENOR_QUE:'menor_que_'(DIGITO|LETRA)*;
VACIA: 'vacia';
ULTIMAPOSICION: 'ultima_posicion';
FFUNCION:'FFUNCION';
FPROCEDIMIENTO:'FPROCEDIMIENTO';
T:'T';
F:'F';
SEQ_NUM:'SEQ(NUM)';
SEQ_LOG:'SEQ(LOG)';
CIERTO: 'cierto';
FALSO: 'falso';
MOSTRAR:'mostrar';
VAR: LETRA(LETRA|DIGITO)*;



COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;
COMENTARIO_LINEA : '//' .*? FIN_LINEA -> skip ;