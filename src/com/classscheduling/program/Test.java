package com.classscheduling.program;

import com.classscheduling.grammar.CSGrammarLexer;
import com.classscheduling.grammar.CSGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Test {
    public static void main(String []args) {
        System.out.println("Hello World"); // prints Hello World
        CSGrammarLexer lexer = new CSGrammarLexer(CharStreams.fromString("Hello John ."));
        CSGrammarParser parser = new CSGrammarParser(new CommonTokenStream(lexer));

        String name = parser.main().name().getText();
        System.out.println(name);
    }
}
