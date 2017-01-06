package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr.AntlrBunchListener;
import antlr.BunchLexer;
import antlr.BunchParser;
import antlr.BunchParser.ArquivoContext;

public class Test {
	
	private static final String FILENAME = "C:\\test\\SisRU_Completo.mdg.bunch";
	
	public static void main(String[] args) {
		//new Test().printBunch("SS(sisru.persistencia.ss) = fast.web.listener, fast.core.web, fast2;");
		Test test = new Test();
		test.leArquivo(FILENAME);
	}
	
	
//	public void print(List<String> tokens){
//		
//		for (String token : tokens) {
//			
//			printBunch(token); 
//		}
//		
//	}
	
	public List<String> leArquivo(String filename){
		
		List<String> linhas = new ArrayList<>();
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILENAME));

			while ((sCurrentLine = br.readLine()) != null) {
				//String[] tokens = sCurrentLine.split("SS");
//				for (String token : tokens)
//				{
					//linhas.add("SS" + token);
					printBunch(sCurrentLine);
				//}
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

				if (br != null)
					try {
						br.close();
						if (fr != null)
							fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}



		}
		return linhas;
		
	}
	
	
	private void printBunch(String bunchSentence) {
	    // Get our lexer
	    BunchLexer lexer = new BunchLexer(new ANTLRInputStream(bunchSentence));
	 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    BunchParser parser = new BunchParser(tokens);
	 
	    // Specify our entry point
	    ArquivoContext bunchArquivoContext = parser.arquivo();
	 
	    // Walk it and attach our listener
	    ParseTreeWalker walker = new ParseTreeWalker();
	    AntlrBunchListener listener = new AntlrBunchListener();
	    walker.walk(listener, bunchArquivoContext);
	    System.out.println(listener.getMensagem());
	}
	

}
