package info.unbelievable9.test;

import info.unbelievable9.computer.Software;
import info.unbelievable9.computer.SystemService;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/22
 * Author     : Unbelievable9
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/computer-config.xml"})
public class SoftwareTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private Software software;

    @Autowired
    private SystemService systemService;

    @Test
    public void softwareShouldNotBeNull() {
        Assert.assertNotNull(software);
    }

    @Test
    public void systemServiceShouldOperate() {
        systemService.operation();

        Assert.assertEquals(
                "File Explorer(1.0.0) is Loading.\n",
                systemOutRule.getLog());
    }
}
