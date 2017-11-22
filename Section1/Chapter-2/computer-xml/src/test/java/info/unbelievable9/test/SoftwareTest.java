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
    private Software fileExplorer;

    @Autowired
    private Software xyplorer;

    @Autowired
    private SystemService systemService;

    @Test
    public void fileExplorerShouldNotBeNull() {
        Assert.assertNotNull(fileExplorer);
    }

    @Test
    public void xyplorerShouldNotBeNull() {
        Assert.assertNotNull(xyplorer);
    }

    @Test
    public void systemServiceShouldOperate() {
        systemService.operation();

        Assert.assertEquals(
                "XYplorer(18.50.0300) is Loading.\n" +
                        "Fast, powerful, and easy to use.\n" +
                        "Managing files in more than 100 countries.\n" +
                        "Compatible with Windows XP, Vista, 7, 8, and 10.\n",
                systemOutRule.getLog());
    }
}
