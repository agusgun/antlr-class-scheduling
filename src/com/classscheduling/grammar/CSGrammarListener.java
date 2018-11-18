// Generated from /home/agus/Project/ClassScheduling/src/CSGrammar.g4 by ANTLR 4.7
package com.classscheduling.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSGrammarParser}.
 */
public interface CSGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CSGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CSGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(CSGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(CSGrammarParser.NameContext ctx);
}