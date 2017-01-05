package antlr;


public class AntlrBunchListener extends BunchBaseListener {
 
	private String modulo;
	private String subModulo;
	private String declaracao;
	
    @Override
    public void enterNomeModulo(BunchParser.NomeModuloContext ctx){
        modulo = ctx.getText().substring(3,21).replace(".", "_");
        declaracao = ctx.getText().substring(3,8);
    }
   
    @Override
    public void enterNomeSubmodulo(BunchParser.NomeSubmoduloContext ctx) {
    	subModulo = ctx.getText().substring(1).replace(".", "_");
    }
    

	public String getMensagem() {
		//return "Modulo = " +modulo+ "\nSubmodulo = " + subModulo;
		return "module " + declaracao +"\n\n"
				+"abstract sig Object { usa: set Object }\n\n"
				+ "one sig " +modulo+", "+subModulo+" extends Object{}\n\n"
				+ "fact chamada {usa = "+modulo+"->"+subModulo+"}\n\n"
				+ "pred show {}\n\n"
				+ "run show";
	}


    
    
 
}