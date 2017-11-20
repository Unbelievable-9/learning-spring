package info.unbelievable9.test;

import info.unbelievable9.FakePrintStream;
import info.unbelievable9.MarioTestConfig;
import info.unbelievable9.po.Mario;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/20
 * Author     : Unbelievable9
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MarioTestConfig.class, loader = AnnotationConfigContextLoader.class)
public class MarioInjectionTest {

    @Autowired
    Mario mario;

    @Autowired
    FakePrintStream fakePrintStream;

    @After
    public void clearPrintStream() {
        fakePrintStream.clear();
    }

    @Test
    public void shoutInjectMarioWithEndOfLevelStage() {
        mario.cheerForStage();

        Assert.assertEquals(
                "That's So Nice\n",
                fakePrintStream.getPrintedString()
        );
    }
}
