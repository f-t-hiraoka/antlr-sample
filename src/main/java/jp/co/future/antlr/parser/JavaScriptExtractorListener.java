package jp.co.future.antlr.parser;

import java.io.IOException;
import java.nio.file.Paths;

import jp.co.future.antlr.parser.SimpleVueParser.ScriptElementContext;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class JavaScriptExtractorListener extends SimpleVueParserBaseListener {

	/** 抽出した文字列 */
	private String scriptBody;

	/**
	 * 抽出実行
	 * @param filePath
	 * @throws IOException
	 */
	public void exec(String filePath) throws IOException {
		// 指定したファイルからCharStreamを生成
		CharStream cs = CharStreams.fromPath(Paths.get(filePath));
		// CharStreamをlexerに渡す
		SimpleVueLexer lexer = new SimpleVueLexer(cs);
		// lexerでトークン列に分解
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// トークン列をparserに渡し、ASTを作る
		SimpleVueParser parser = new SimpleVueParser(tokens);
		// ASTをトラバースして文字列を抽出する
		ParseTreeWalker walker = ParseTreeWalker.DEFAULT;
		walker.walk(this, parser.parse());
	}

	@Override
	public void enterScriptElement(ScriptElementContext ctx) {
		// 抽出する文字列をセット
		scriptBody = ctx.scriptBody().getText();
	}

	/**
	 * 抽出した文字列を取得する
	 * @return
	 */
	public String getScriptBody() {
		return scriptBody;
	}

}