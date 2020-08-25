/**
 * lexer用grammar
 */

lexer grammar SampleLexer;

NUM
	: [0-9]+
	;

PLUS
	: '+'
	;

SPACE
	: ' ' -> skip
	;