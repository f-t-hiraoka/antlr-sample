// Generated from jp\co\future\antlr\parser\SimpleVueParser.g4 by ANTLR 4.8
package jp.co.future.antlr.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleVueParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVueParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleVueParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SimpleVueParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleVueParser#templateElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateElement(SimpleVueParser.TemplateElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleVueParser#scriptElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptElement(SimpleVueParser.ScriptElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleVueParser#scriptBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptBody(SimpleVueParser.ScriptBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleVueParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(SimpleVueParser.StyleElementContext ctx);
}