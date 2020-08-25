package jp.co.future.antlr.parser;

public class ExtractRhsNumListener extends SampleParserBaseListener {

	Integer rhsNum;

	@Override
	public void exitSum(SampleParser.SumContext ctx) {
		// 2つ目のNUM、つまり+の右側の整数をセットする
		setRhsNum(new Integer(ctx.NUM(1).getText()));
	}

	public Integer getRhsNum() {
		return rhsNum;
	}

	public void setRhsNum(Integer rhsNum) {
		this.rhsNum = rhsNum;
	}

}
