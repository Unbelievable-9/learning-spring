package info.unbelievable9.test;

import info.unbelievable9.di.Stage;
import info.unbelievable9.po.SuperMario;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/20
 * Author     : Unbelievable9
 **/
public class SuperMarioTest {

    @Test
    public void marioShouldCheer() {
        Stage mockStage = Mockito.mock(Stage.class);

        SuperMario superMario = new SuperMario(mockStage);
        superMario.cheerForStage();

        Mockito.verify(mockStage, Mockito.times(1)).cheer();
    }
}
