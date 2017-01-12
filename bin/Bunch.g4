/**
 * grammar para o bunch
 */
grammar Bunch;

arquivo
    : line+
    ;

line
    : modulo
    | submodulo
    ;

modulo
    : 'SS(' LABEL ') '
    ;

submodulo
    : ('= ' | ' ') LABEL (',')?
    ;


LABEL
    : [a-zA-Z0-9_.+\\-/*=&]+
    ;
