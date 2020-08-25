/**
 * vueファイルから<script>ブロックの中身を抽出するためのparser用grammar
 */


parser grammar SimpleVueParser;

options { tokenVocab=SimpleVueLexer; }

parse
    : templateElement? scriptElement styleElement?
    ;

templateElement
    : TemplateOpen TemplateClose
    ;

scriptElement
    : ScriptOpen scriptBody ScriptClose
    ;

// 今回取得したい部分
scriptBody
    : (SingleLineComment
    | MultiLineComment
    | ScriptText)+
    ;

styleElement
    : StyleOpen StyleClose
    ;