// Generated from jp\co\future\antlr\parser\SimpleVueParser.g4 by ANTLR 4.8
package jp.co.future.antlr.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleVueParser}.
 */
public interface SimpleVueParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleVueParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SimpleVueParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleVueParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SimpleVueParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleVueParser#templateElement}.
	 * @param ctx the parse tree
	 */
	void enterTemplateElement(SimpleVueParser.TemplateElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleVueParser#templateElement}.
	 * @param ctx the parse tree
	 */
	void exitTemplateElement(SimpleVueParser.TemplateElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleVueParser#scriptElement}.
	 * @param ctx the parse tree
	 */
	void enterScriptElement(SimpleVueParser.ScriptElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleVueParser#scriptElement}.
	 * @param ctx the parse tree
	 */
	void exitScriptElement(SimpleVueParser.ScriptElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleVueParser#scriptBody}.
	 * @param ctx the parse tree
	 */
	void enterScriptBody(SimpleVueParser.ScriptBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleVueParser#scriptBody}.
	 * @param ctx the parse tree
	 */
	void exitScriptBody(SimpleVueParser.ScriptBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleVueParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(SimpleVueParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleVueParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(SimpleVueParser.StyleElementContext ctx);
}