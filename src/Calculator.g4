grammar Calculator;
prog : stat+;
stat: expr ';' NEWLINE          # docal
    | ID '=' expr ';' NEWLINE   # assign
    | NEWLINE                   # blank
    | 'print' expr ';' NEWLINE  # printRes
    ;
expr: expr op=('*'|'/') expr    # MulDiv
| expr op=('+'|'-') expr        # AddSub
| FOL                           # fol
| ID                            # id
| '(' expr ')'                  # parens
;
MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
ID : [a-zA-Z]+ ;
FOL : [0-9]+|[0-9]+'.'[0-9]+ ;
NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip;