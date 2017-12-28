package info.unbelievable9.conditional.test;

import info.unbelievable9.conditional.config.ConditionConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Copyright 2017 (C) Yunjian-VC
 * Created on : 2017/12/28
 * Author     : Unbelievable9
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConditionConfig.class)
public class LockScreenTest {

    static {
        System.setProperty("phone_locked", "false");
    }

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void shouldCreateBean() {
        Assert.assertTrue(applicationContext.containsBean("lockScreenBean"));
    }
}
