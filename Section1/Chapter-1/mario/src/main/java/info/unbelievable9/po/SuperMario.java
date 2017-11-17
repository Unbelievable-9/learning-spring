package info.unbelievable9.po;

import info.unbelievable9.di.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/16
 * Author     : Unbelievable9
 **/
public class SuperMario implements Mario {

    private static final Logger logger = LogManager.getLogger(SuperMario.class);

    private Integer coinCount = 0;

    private Stage stage;

    public SuperMario(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void cheerForStage() {
        logger.trace("Mario Has: " + this.coinCount + " Coins.");

        stage.cheer();
        this.coinCount += stage.coinBonus();

        logger.trace("Mario Has: " + this.coinCount + " Coins.");
    }
}
