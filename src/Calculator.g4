grammar Calculator;

prog : stat+;

stat: expr  ';'                               # do
    | ID '=' expr  ';'                        # assign
    | 'print' '(' expr ')' ';'                 # printResult
    ;

expr: expr op=('*'|'/') expr    # MulDiv
| expr op=('+'|'-') expr        # AddSub
| INT                           # int
| ID                            # id
| '(' expr ')'                  # parens
;

MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
ID : [a-zA-Z]+[0-9]* ;
INT : '-'?[0-9]+ | '-'?[0-9]+'.'[0-9]+;
NEWLINE:'\r'? '\n' ->skip ;
WS : [ \t]+ -> skip;