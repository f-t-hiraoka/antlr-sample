package jp.co.future.antlr;

import java.io.IOException;

import jp.co.future.antlr.parser.ExtractRhsNumListener;
import jp.co.future.antlr.parser.ExtractRhsNumVisitor;
import jp.co.future.antlr.parser.JavaScriptExtractorListener;
import jp.co.future.antlr.parser.SampleLexer;
import jp.co.future.antlr.parser.SampleParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App {

	public static void main(String[] args) throws IOException {
		extractRhsNumByListener();
		extractRhsNumByVisitor();
		extractScriptBlock();
	}

	/**
	 * listenerで"123 + 456"の+の右側の整数を抽出
	 */
	public static void extractRhsNumByListener() {
		// 文字列からCharStreamを生成
		CharStream cs = CharStreams.fromString("123 + 456");
		// CharStreamをlexerに渡す
		SampleLexer lexer = new SampleLexer(cs);
		// lexerでトークン列に分解
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// トークン列をparserに渡し、ASTを作る
		SampleParser parser = new SampleParser(tokens);
		// listenerでASTをトラバース
		ParseTreeWalker walker = ParseTreeWalker.DEFAULT;
		ExtractRhsNumListener listener = new ExtractRhsNumListener();
		walker.walk(listener, parser.sum());
		System.out.println(listener.getRhsNum());
	}

	/**
	 * visitorで"123 + 456"の+の右側の整数を抽出
	 */
	public static void extractRhsNumByVisitor() {
		// 文字列からCharStreamを生成
		CharStream cs = CharStreams.fromString("123 + 456");
		// CharStreamをlexerに渡す
		SampleLexer lexer = new SampleLexer(cs);
		// lexerでトークン列に分解
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// トークン列をparserに渡し、ASTを作る
		SampleParser parser = new SampleParser(tokens);
		// visitorでASTをトラバース
		ParseTree tree = parser.sum();
		System.out.println(new ExtractRhsNumVisitor().visit(tree));
	}

	/**
	 * vueファイルから<script>ブロックの中身を抽出
	 */
	public static void extractScriptBlock() throws IOException {
		JavaScriptExtractorListener listener = new JavaScriptExtractorListener();
		listener.exec("src/main/resources/input.vue");
		System.out.println(listener.getScriptBody());
	}
}
