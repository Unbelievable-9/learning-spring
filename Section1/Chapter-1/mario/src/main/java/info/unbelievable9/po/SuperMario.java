package info.unbelievable9.po;

import info.unbelievable9.service.Stage;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/16
 * Author     : Unbelievable9
 **/
public class SuperMario implements Mario {

    private Stage stage;

    public SuperMario(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void cheerForStage() {
        stage.cheer();
    }
}
