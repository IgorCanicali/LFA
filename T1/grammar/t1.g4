grammar t1;
//C:\Users\igorc\Desktop\LFA\tmp\T1\src\t1

@header {
package t1;
import t1.ast.*;
import java.util.List;
import java.util.LinkedList;
}

prog
    : code
    ;

code 
    : var_dec* (assignment | control_structure | function)*
    ;

var_dec returns [Definition result]
    : t = type var = ID COMMAND_END {$result = new Definiton($t.result, $var.text)}
    | t = type var = ID EQUALS val = VALUE COMMAND_END {$result = new Definiton($t.result, $var.text, $val.text)}
    ;

assignment 
    : ID EQUALS (ID | VALUE | math) COMMAND_END
    | ID SPLIT VALUE COMMAND_END
    | ID REMOVE position COMMAND_END
    | ID APPEND position ID COMMAND_END
    ;
/* Referentes ao tipo trem, exceto os que dizem o inverso
 * EQUALS  atribui nome(ID)(serve para qualquer tipo)
 * APPEND  adiciona um trem em outro
 * SPLIT   separa um trem em dois
 * comparable compara dois tipo(tipos iguais)(serve para qualquer tipo)
 * REMOVE  retira um tipo(exceto trem)
 */

control_structure
    : IF LPAR ID comparable ID RPAR LKEYS code RKEYS (ELSE LKEYS code RKEYS)?
    | FOR (INT? ID (EQUALS VALUE)? COMMAND_END ID comparable (ID | VALUE) COMMAND_END ID EQUALS math) LKEYS code RKEYS
    ;

function 
    : ID LPAR parameter? RPAR COMMAND_END
    ;

type returns [Type result]
    : tt = TRAIN {$result = new Type($tt.text)}
    | tw = WAGON {$result = new Type($tw.text)}
    | tl = LOCOM {$result = new Type($tl.text)}
    | ti = INT   {$result = new Type($ti.text)}
    ;

math 
    : (ID | VALUE) ((PLUS | MINUS) (ID | VALUE))*
    ;

comparable
    : COMP_SMALLER
    | COMP_EQUALS
    | COMP_BIGER
    | COMP_DIFF
    ;

position
    : HEAD
    | TAIL
    ;

parameter
    : ID 
    | VALUE
    ;

LPAR            : '(' ;
RPAR            : ')' ;
PLUS            : '+' ;
LKEYS           : '{' ;
RKEYS           : '}' ;
SPLIT           : '/' ;
MINUS           : '-' ;
APPEND          : '+' ;
EQUALS          : '=' ;
REMOVE          : '-' ;
COMP_BIGER      : '>' ;
COMP_SMALLER    : '<' ;
COMMAND_END     : ';' ;
IF              : 'if' ;
COMP_DIFF       : '!=' ;
COMP_EQUALS     : '==' ;
FOR             : 'for' ;
INT             : 'int' ;
ELSE            : 'else' ;
HEAD            : 'head' ;
TAIL            : 'tail' ;
TRAIN           : 'Train' ;
WAGON           : 'Wagon' ;
LOCOM           : 'Locomotive' ;
VALUE           : [0-9]+ ;
ID              : [_a-zA-Z][_a-zA-Z0-9]* ;
WS              : [ \t\r\n]+ -> skip;