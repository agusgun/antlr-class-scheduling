// Generated from /home/agus/Project/ClassScheduling/src/LogGrammar.g4 by ANTLR 4.7
package com.log.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogGrammarParser}.
 */
public interface LogGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogGrammarParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(LogGrammarParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogGrammarParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(LogGrammarParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogGrammarParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(LogGrammarParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogGrammarParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(LogGrammarParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogGrammarParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(LogGrammarParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogGrammarParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(LogGrammarParser.TimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogGrammarParser#level}.
	 * @param ctx the parse tree
	 */
	void enterLevel(LogGrammarParser.LevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogGrammarParser#level}.
	 * @param ctx the parse tree
	 */
	void exitLevel(LogGrammarParser.LevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogGrammarParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(LogGrammarParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogGrammarParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(LogGrammarParser.MessageContext ctx);
}