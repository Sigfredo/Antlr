package main;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr.AntlrBunchListener;
import antlr.BunchLexer;
import antlr.BunchParser;
import antlr.BunchParser.ModuloContext;

public class Test {
	
	public static void main(String[] args) {
		new Test().printBunch("SS(sisru.persistencia.ss) = fast.web.listener, fast.core.web, fast2");
		
	}
	
	private void printBunch(String bunchSentence) {
	    // Get our lexer
	    BunchLexer lexer = new BunchLexer(new ANTLRInputStream(bunchSentence));
	 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    BunchParser parser = new BunchParser(tokens);
	 
	    // Specify our entry point
	    ModuloContext bunchModuloContext = parser.modulo();
	 
	    // Walk it and attach our listener
	    ParseTreeWalker walker = new ParseTreeWalker();
	    AntlrBunchListener listener = new AntlrBunchListener();
	    walker.walk(listener, bunchModuloContext);
	    System.out.println(listener.getMensagem());
	}
	

}
