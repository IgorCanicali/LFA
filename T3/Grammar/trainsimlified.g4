grammar trainsimplified;

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

assignment returns [Assignment result]
    : ID GETS value COMAND_END {$result = new Assignment($ID.text, $value.result);}
    | ID GETS math_operations COMAND_END {$result = new Assignment($ID.text, $math_operations.result);}
    ;

control_structure
    : IF (logical) LKEYS code RKEYS (ELSE LKEYS code RKEYS)?
    | While (logical) LKEYS code RKEYS
    ;

function_call
    : ID LPAR value (COMMA value)* RPAR COMAND_END
    ;

math_operations
    : (ID | INT | math_op1) ((PLUS | MINUS) (ID | INT| math_op1))*
    | LPAR math_operations RPAR
    : (ID | INT | math_op1)
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

fragment
    NUMBER      : [0-9]+ ;

fragment
    QM          : '"' ;

GETS            : '=' ;
PLUS            : '+' ;
MINUS           : '-' ;
LPAR            : '(' ;
RPAR            : ')' ;
MULT            : '*' ;
DIVISION        : '/' ;
LESS            : '<' ;
GREATER         : '>' ;
COMAND_END      : ';' ;
LKEYS           : '{' ;
RKEYS           : '}' ;
NOT             : '!' ;
AND             : '&&' ;
OR              : '||' ;
EQUALS          : '==' ;
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