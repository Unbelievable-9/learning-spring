package info.unbelievable9.di;

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
        logger.trace("Mario Got a Coin!");

        printStream.println("That's So Nice");
    }

    @Override
    public Integer coinBonus() {
        return 100;
    }
}
