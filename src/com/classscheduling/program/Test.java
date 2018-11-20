package com.classscheduling.program;

import com.classscheduling.grammar.CSGrammarLexer;
import com.classscheduling.grammar.CSGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Test {
    public static void main(String []args) {
        CSGrammarLexer lexer = new CSGrammarLexer(CharStreams.fromString("SCHEDULE\n"));
        CSGrammarParser parser = new CSGrammarParser(new CommonTokenStream(lexer));

        String name = parser.entry().schedule().getText();
        System.out.println(name);
    }
}
