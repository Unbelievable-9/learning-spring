package info.unbelievable9.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.PrintStream;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/16
 * Author     : Unbelievable9
 **/
public class EndOfLevelStage implements Stage {

    private static final Logger logger = LogManager.getLogger(EndOfLevelStage.class);

    private PrintStream printStream;

    public EndOfLevelStage(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void cheer() {
        printStream.println("That's so nice");
    }
}
