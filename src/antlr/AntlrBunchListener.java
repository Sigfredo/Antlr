package antlr;

import java.util.ArrayList;
import java.util.HashSet;
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
    			modulo = s[i].replace(".", "_");
    		}
		}
    }
   
    @Override
    public void enterSubmodulo(BunchParser.SubmoduloContext ctx) {
    	//subModulos.add(ctx.getText().substring(1).replace(".", "_"));
    	//subModulos.add(ctx.getText());
    	
    	String[] s = ctx.getText().split("[\\=\\,]");
    	for (int i = 0; i < s.length; i++) {
    		if(!s[i].trim().equals("")){
    			subModulos.add(s[i].replace(".", "_"));
    		}
		}
    }
    

    public HashSet<String> getDeclaracao(HashSet<String> retorno){   	
    	for (String s : subModulos){
    			retorno.add(s);
    	}
    	retorno.add(modulo);
    	return retorno;
    }
    
    public String getRelacionamento(String retorno){
    	for (String s : subModulos){
    		if(retorno.equals("")){
    			retorno += modulo + "->" + s + "\n";
    		}else{
    			retorno += "+"+ modulo + "->" + s + "\n";
    		}
    		
    	}
    	return retorno;
    }
    
//	public String getMensagem() {
//		//return "Modulo = " +modulo+ "\nSubmodulo = " + subModulo;
//		return "module " + modulo +"\n\n"
//				+"abstract sig Object { usa: set Object }\n\n"
//				+ "one sig " +modulo+", "+getDeclaracao()+" extends Object{}\n\n"
//				+ "fact chamada {usa = \n" + getRelacionamento() + "}\n\n"
//				+ "pred show {}\n\n"
//				+ "run show\n\n\n";
//	}

	public String getModulo() {
		return modulo;
	}
	
	
    
}