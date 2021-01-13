grammar Register;

prog:   stat+ ;

stat: LABEL ':' command;

command: REGISTER '+' '->' LABEL NEWLINE            # increase
       | REGISTER '-' '->' LABEL ',' LABEL NEWLINE  # decrease
       | HALT NEWLINE                               # halt
       | NEWLINE                                    # blank
       ;

LABEL: 'L' NUM;
REGISTER: 'R' NUM;
HALT:  [h|H][a|A][l|L][t|T];
fragment NUM: [0-9]+;
NEWLINE:'\r'? '\n';
WS: [ \t]+ -> skip;