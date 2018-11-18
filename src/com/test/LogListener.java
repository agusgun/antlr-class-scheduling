package com.test;

import com.log.grammar.LogGrammarBaseListener;
import com.log.grammar.LogGrammarParser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LogListener extends LogGrammarBaseListener {

    private List<LogEntry> entries = new ArrayList<>();
    private LogEntry current;

    @Override
    public void enterEntry(LogGrammarParser.EntryContext ctx) {
        this.current = new LogEntry();
    }

    @Override
    public void enterTimestamp(LogGrammarParser.TimestampContext ctx) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-LL-dd");
        this.current.setTimestamp(
                LocalDateTime.parse(ctx.getText(), formatter));
    }

    @Override
    public void enterMessage(LogGrammarParser.MessageContext ctx) {
        this.current.setMessage(ctx.getText());
    }

    @Override
    public void enterLevel(LogGrammarParser.LevelContext ctx) {
        this.current.setLevel(String.valueOf(ctx.getText()));
    }
}
