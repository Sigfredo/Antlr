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
	 * Enter a parse tree produced by {@link BunchParser#nomeSubmodulo}.
	 * @param ctx the parse tree
	 */
	void enterNomeSubmodulo(@NotNull BunchParser.NomeSubmoduloContext ctx);
	/**
	 * Exit a parse tree produced by {@link BunchParser#nomeSubmodulo}.
	 * @param ctx the parse tree
	 */
	void exitNomeSubmodulo(@NotNull BunchParser.NomeSubmoduloContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link BunchParser#nomeModulo}.
	 * @param ctx the parse tree
	 */
	void enterNomeModulo(@NotNull BunchParser.NomeModuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link BunchParser#nomeModulo}.
	 * @param ctx the parse tree
	 */
	void exitNomeModulo(@NotNull BunchParser.NomeModuloContext ctx);
}