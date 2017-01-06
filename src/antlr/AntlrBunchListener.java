package antlr;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class AntlrBunchListener extends BunchBaseListener {
 
	private String modulo;
	private String subModulo;
	private List<String> subModulos = new ArrayList<>();
	private String mensagem;
	
    @Override
    public void enterModulo(BunchParser.ModuloContext ctx){
        //modulo = ctx.getText().substring(3,21).replace(".", "_");
        //declaracao = ctx.getText().substring(3,8);
    	
    	String[] s = ctx.getText().split("[SS\\(\\)]");
    	for (int i = 0; i < s.length; i++) {
    		if(!s[i].trim().equals("")){
    			modulo = s[i];
    		}
		}
    }
   
    @Override
    public void enterSubmodulo(BunchParser.SubmoduloContext ctx) {
    	//subModulos.add(ctx.getText().substring(1).replace(".", "_"));
    	subModulos.add(ctx.getText());
    	
//    	String[] s = ctx.getText().split("SS\\(,\\)");
//    	for (int i = 0; i < s.length; i++) {
//    		subModulos.add(s[i]);
//		}
    }
    

    private String subDeclaracao(){
    	String retorno = "";
    	for (String s : subModulos){
    		retorno += s + " ";
    	}
    	return retorno;
    }
    
    private String subChamada(){
    	String retorno = "";
    	for (String s : subModulos){
    		retorno += modulo + "->" + s + "\n";
    	}
    	return retorno;
    }
    
	public String getMensagem() {
		//return "Modulo = " +modulo+ "\nSubmodulo = " + subModulo;
		return "module " + modulo +"\n\n"
				+"abstract sig Object { usa: set Object }\n\n"
				+ "one sig " +modulo+", "+subDeclaracao()+" extends Object{}\n\n"
				+ "fact chamada {usa = \n" + subChamada() + "}\n\n"
				+ "pred show {}\n\n"
				+ "run show\n\n\n";
	}
    
}