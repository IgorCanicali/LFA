grammar t1;
//C:\Users\igorc\Desktop\LFA\tmp\T1\src\t1

prog 
    : code
    ;

code 
    : definition* (train_operator | control_structure | function)*
    ;

definition  returns [Definition result]
    : type ID COMMAND_END {$result = new Definiton($type.result, $ID.text);}
    | primitive_type ID ASSIGNMENT primitive_value COMMAND_END {$result = new Definiton($primitive_type.result, $ID.text, $primitive_value.text);}
    ;

train_operator
    : ID SPLIT INT COMMAND_END
    | ID REMOVE position COMMAND_END
    | ID APPEND position ID COMMAND_END
    ;
/* Referentes ao tipo trem, exceto os que dizem o inverso
 * ASSIGNMENT  atribui nome(ID)(serve para qualquer tipo)
 * APPEND  adiciona um trem em outro
 * SPLIT   separa um trem em dois
 * compare_operator compara dois tipo(tipos iguais)(serve para qualquer tipo)
 * REMOVE  retira um tipo(exceto trem)
 */

control_structure
    : IF LPAR ID RPAR LKEYS code RKEYS/*No caso ID tem que ser BOOLEAN*/
    | IF LPAR ID RPAR LKEYS code RKEYS ELSE LKEYS code RKEYS/*No caso ID tem que ser BOOLEAN*/
    | IF LPAR ID compare_operator ID RPAR LKEYS code RKEYS
    | IF LPAR ID compare_operator ID RPAR LKEYS code RKEYS ELSE LKEYS code RKEYS
    | WHILE LPAR ID RPAR LKEYS code RKEYS/*No caso ID tem que ser BOOLEAN*/
    | WHILE LPAR ID compare_operator ID RPAR LKEYS code RKEYS
    ;

math_operator
    : PLUS
    | MINUS
    | MULT
    | DIV
    ;

function 
    : ID LPAR value? RPAR COMMAND_END
    ;

type returns [Type result]
    : primitive_type {$result = new Type($primitive_type.result);}
    | object_type {$result = new Type($object_type.result);}
    ;

primitive_type returns [Type result]
    : STRING {$result = new Type($STRING.text);}
    | BOOLEAN {$result = new Type($BOOLEAN.text);}
    | INTEGER {$result = new Type($INTEGER.text);}
    ;

object_type returns [Type result]
    : TRAIN {$result = new Type($TRAIN.text);}
    | WAGON {$result = new Type($WAGON.text);}
    | LOCOM {$result = new Type($LOCOM.text);}
    ;

math 
    : value math_operator math
    | LPAR math RPAR
    | LPAR math math_operator math RPAR
    | value
    ;

compare_operator
    : COMP_SMALLER
    | COMP_ASSIGNMENT
    | COMP_BIGER
    | COMP_DIFF
    ;

position
    : HEAD
    | TAIL
    ;

value
    : ID 
    | primitive_value
    ;

primitive_value
    : INT
    | BOOL
    | STR
    ;

fragment
    NUMBER      : [0-9]+ ;

fragment
    QM          : '"' ;

DIV             : '/' ;
MULT            : '*' ;
LPAR            : '(' ;
RPAR            : ')' ;
PLUS            : '+' ;
LKEYS           : '{' ;
RKEYS           : '}' ;
SPLIT           : 'split' ;
MINUS           : '-' ;
APPEND          : 'append' ;
ASSIGNMENT      : '=' ;
REMOVE          : 'remove' ;
COMP_BIGER      : '>' ;
COMP_SMALLER    : '<' ;
COMMAND_END     : ';' ;
IF              : 'if' ;
COMP_DIFF       : '!=' ;
COMP_ASSIGNMENT : '==' ;
WHILE             : 'while' ;
ELSE            : 'else' ;
HEAD            : 'head' ;
TAIL            : 'tail' ;
TRAIN           : 'Train' ;
WAGON           : 'Wagon' ;
STRING          : 'String';
INTEGER         : 'Integer' ;
BOOLEAN         : 'Boolean' ;
LOCOM           : 'Locomotive' ;
INT             : NUMBER ;
BOOL            : ('True' | 'False') ;
STR             : QM [_a-zA-Z0-9]* QM ;
ID              : [_a-zA-Z][_a-zA-Z0-9]* ;
WS              : [ \t\r\n]+ -> skip;