/**
 * grammar para o bunch
 */
grammar Bunch;

modulo :  nomeModulo nomeSubmodulo ;

nomeModulo : NOME ;
nomeSubmodulo : SUBMODULO ;


//NOME : 'sisru' ;
NOME : 'SS(' [a-z|.]+ ')' ;
SUBMODULO:
   [a-z|.]+;



