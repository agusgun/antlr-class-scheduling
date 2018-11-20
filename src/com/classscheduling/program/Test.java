package com.classscheduling.program;

import com.classscheduling.CSGrammarListener;
import com.classscheduling.grammar.CSGrammarLexer;
import com.classscheduling.grammar.CSGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Test {
    public static void main(String []args) throws IOException {
        String command = "1. CONFIGURE: <CLASS_NAME> WITH <CLASS_CONFIG>\n" +
                        "CLASS_CONFIG: CAPACITY=<AMOUNT>";

        System.out.println(command);

        String inputAntlr = "";
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        while (!input.equals("EXIT")) {
            inputAntlr = inputAntlr + input + '\n';
            input = inputScanner.nextLine();
        }
        CSGrammarLexer lexer = new CSGrammarLexer(CharStreams.fromString(inputAntlr));
        CSGrammarParser parser = new CSGrammarParser(new CommonTokenStream(lexer));
        parser.addParseListener(new CSGrammarListener());
        parser.main();


    }
}
