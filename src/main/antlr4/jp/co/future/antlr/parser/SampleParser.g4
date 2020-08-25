/**
 * parser用grammar
 */


parser grammar SampleParser;

options { tokenVocab=SampleLexer; }

sum
	: NUM PLUS NUM
	;