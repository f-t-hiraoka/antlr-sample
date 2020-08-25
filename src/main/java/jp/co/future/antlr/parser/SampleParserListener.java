// Generated from jp\co\future\antlr\parser\SampleParser.g4 by ANTLR 4.8
package jp.co.future.antlr.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampleParser}.
 */
public interface SampleParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampleParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(SampleParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(SampleParser.SumContext ctx);
}