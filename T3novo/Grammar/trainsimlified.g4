grammar trainsimlified;

prog
    : code
    ;

code
    : (definition | train_operation | assignment | control_structure | function_call)*
    ;

definition
    : type ID (GETS data)?
    ;

train_operation
    : ID SLPIT INT COMAND_END
    | ID APPEND ID POS COMAND_END
    | ID REMOVE POS COMAND_END
    ;

assignment
    : ID GETS value COMAND_END
    | ID GETS math_operations COMAND_END
    ;

control_structure
    : IF (logical) LKEYS code RKEYS (ELSE LKEYS code RKEYS)?
    | While (logical) LKEYS code RKEYS
    ;

function_call
    : ID LPAR value (COMMA value)* RPAR COMAND_END
    ;

math_operations
    : (value | math_op1) ((PLUS | MINUS) (value | math_op1))*
    | LPAR math_operations RPAR
    | (value | math_op1)
    ;

math_op1
    : (ID | INT) ((MULT | DIVISION) (ID | INT))*
    | LPAR math_operations RPAR
    ;

logical
    : ID compare_operation ID
    | ID logical_operation ID 
    | LPAR logical RPAR
    | NOT logical
    | ID
    ; 

logical_operation
    : AND
    | OR
    ;

compare_operation
    : LESS
    | GREATER
    | EQUALS
    ;

value
    : ID
    | data
    ;

data
    : INT
    | BOOL
    | STR
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

fragment
    NUMBER      : [0-9]+ ;

fragment
    QM          : '"' ;

GETS            : '=' ;
PLUS            : '+' ;
MINUS           : '-' ;
LPAR            : '(' ;
RPAR            : ')' ;
LKEYS           : '{' ;
RKEYS           : '}' ;
MULT            : '*' ;
DIVISION        : '/' ;
LESS            : '<' ;
GREATER         : '>' ;
COMAND_END      : ';' ;
NOT             : '!' ;
COMMA           : ',' ;
AND             : '&&' ;
OR              : '||' ;
EQUALS          : '==' ;
IF              : 'if' ;
ELSE            : 'else' ;
While           : 'wile' ;
SLPIT           : 'split' ;
APPEND          : 'append' ;
REMOVE          : 'remove' ;
STRING          : 'String' ;
BOOLEAN         : 'Boolean' ;
INTEGER         : 'Integer' ;
WAGON           : 'Wagon' ;
TRAIN           : 'Train' ;
LOCOM           : 'Locomotive' ;
POS             : ('head' | 'tail') ;
BOOL            : ('True' | 'False') ;
INT             : NUMBER ;
STR             : QM [_a-zA-Z0-9]* QM ;
ID              : [_a-zA-Z][_a-zA-Z0-9]* ;
WS              : [ \t\r\n]+ -> skip;