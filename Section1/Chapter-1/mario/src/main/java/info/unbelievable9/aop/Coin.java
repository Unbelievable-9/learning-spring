package info.unbelievable9.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.io.PrintStream;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/17
 * Author     : Unbelievable9
 **/
@Aspect
public class Coin {

    private static final Logger logger = LogManager.getLogger(Coin.class);

    private PrintStream printStream;

    public Coin(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Pointcut("execution(* info.unbelievable9.po.Mario.cheerForStage())")
    public void aspect() {

    }

    @Before("aspect()")
    public void beforeGetCoin() {
        logger.trace("Spring AOP Before Advice.");

        this.printStream.println("Coin Bonus is Coming.");
    }

    @After("aspect()")
    public void afterGotCoin() {
        logger.trace("Spring AOP After Advice.");

        this.printStream.println("Coin Bonus in the pocket.");
    }
}
