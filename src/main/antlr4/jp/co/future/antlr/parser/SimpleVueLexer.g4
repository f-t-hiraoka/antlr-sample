/**
 * vueファイルから<script>ブロックの中身を抽出するためのlexer用grammar
 */

lexer grammar SimpleVueLexer;

HtmlComment
    : '<!--' .*? '-->' -> skip
    ; 

WhiteSpaces
    : [\t\u000B\u000C\u0020\u00A0]+ -> skip
    ;

LineTerminator
    : [\r\n\u2028\u2029] -> skip
    ;

// このトークンを検出した場合、TEMPLATEモードに遷移する
TemplateOpen
    : '<template' .*? '>' -> pushMode(TEMPLATE)
    ;

// このトークンを検出した場合、SCRIPTモードに遷移する
ScriptOpen
    : '<script' .*? '>' -> pushMode(SCRIPT)
    ;

// このトークンを検出した場合、STYLEモードに遷移する
StyleOpen
    : '<style' .*? '>' -> pushMode(STYLE)
    ;

// <template>ブロックの中身を読んでいる時
mode TEMPLATE;

CommentInTemplate
    : '<!--' .*? '-->' -> skip
    ; 

TemplateClose
    : .* '</template>' -> popMode
    ;

// <script>ブロックの中身を読んでいる時
mode SCRIPT;

MultiLineComment
    : '/*' .*? '*/'
    ;

SingleLineComment
    : '//' ~[\r\n\u2028\u2029]*
    ;

ScriptClose
    : '</script>' -> popMode
    ;

//「</」や「//」や「/*」で始まらない
ScriptText
    : (~[</] | '<' ~'/' | '/' ~[*/])+
    ;

// <style>ブロックの中身を読んでいる時
mode STYLE;

CommentInStyle
    : '<!--' .*? '-->' -> skip
    ; 

StyleClose
    : .* '</style>' -> popMode
    ;