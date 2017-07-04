/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar t1simplyfied;
//C:\Users\igorc\Desktop\LFA\tmp\T1\src\t1

prog 
    : code
    ;

code 
    : definition* (train_operator | control_structure | function)*
    ;

definition 
    : type ID COMMAND_END
    | primitive_type ID ASSIGNMENT primitive_value COMMAND_END
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

type 
    : primitive_type
    | object_type
    ;

primitive_type
    : STRING 
    | BOOLEAN 
    | INTEGER 
    ;

object_type
    : TRAIN 
    | WAGON  
    | LOCOM 
    ;

math 
    : LPAR math math_operator math RPAR
    | LPAR math RPAR
    | INT
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
    | math
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