package jp.co.future.antlr.parser;

public class ExtractRhsNumVisitor extends SampleParserBaseVisitor<Integer> {

	public Integer visitSum(SampleParser.SumContext ctx) {
		return new Integer(ctx.NUM(1).getText());
	}
}
