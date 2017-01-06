package antlr;
// Generated from Bunch.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BunchParser}.
 */
public interface BunchListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BunchParser#submodulo}.
	 * @param ctx the parse tree
	 */
	void enterSubmodulo(@NotNull BunchParser.SubmoduloContext ctx);
	/**
	 * Exit a parse tree produced by {@link BunchParser#submodulo}.
	 * @param ctx the parse tree
	 */
	void exitSubmodulo(@NotNull BunchParser.SubmoduloContext ctx);
	/**
	 * Enter a parse tree produced by {@link BunchParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull BunchParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BunchParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull BunchParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BunchParser#arquivo}.
	 * @param ctx the parse tree
	 */
	void enterArquivo(@NotNull BunchParser.ArquivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BunchParser#arquivo}.
	 * @param ctx the parse tree
	 */
	void exitArquivo(@NotNull BunchParser.ArquivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BunchParser#modulo}.
	 * @param ctx the parse tree
	 */
	void enterModulo(@NotNull BunchParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link BunchParser#modulo}.
	 * @param ctx the parse tree
	 */
	void exitModulo(@NotNull BunchParser.ModuloContext ctx);
}