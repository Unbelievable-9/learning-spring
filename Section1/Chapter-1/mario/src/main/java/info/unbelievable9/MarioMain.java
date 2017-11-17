package info.unbelievable9;

import info.unbelievable9.po.Mario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/16
 * Author     : Unbelievable9
 **/
public class MarioMain {

    private static final Logger logger = LogManager.getLogger(MarioMain.class);

    public static void main(String[] argv) {
        logger.trace("Mario Starts Running!");

        AnnotationConfigApplicationContext configApplicationContext =
                new AnnotationConfigApplicationContext("info.unbelievable9.config");

        Mario mario = configApplicationContext.getBean(Mario.class);
        mario.cheerForStage();

        configApplicationContext.close();
    }
}
