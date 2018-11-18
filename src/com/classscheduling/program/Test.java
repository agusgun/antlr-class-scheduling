package com.classscheduling.program;

import com.classscheduling.parser.TestLexer;
import com.classscheduling.parser.TestParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Test {
    public static void main(String []args) {
        System.out.println("Hello World"); // prints Hello World
        TestLexer lexer = new TestLexer(CharStreams.fromString("Hello John!"));
        TestParser parser = new TestParser(new CommonTokenStream(lexer));

        String name = parser.main().name().getText();
        System.out.println(name);
    }
}
