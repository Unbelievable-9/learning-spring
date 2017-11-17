package info.unbelievable9.po;

import info.unbelievable9.di.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/16
 * Author     : Unbelievable9
 **/
public class SuperMario implements Mario, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        BeanPostProcessor, InitializingBean, DisposableBean {

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


    /**
     * Spring Bean Life Cycle
     */

    @Override
    public void setBeanName(String s) {
        logger.debug("Set Bean Name.");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.debug("Set Bean Factory.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.debug("Set Application Context.");
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        logger.debug("Post Process Before Initialization.");

        // 没调用

        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.debug("After Properties Set.");
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        logger.debug("Post Process After Initialization.");

        // 没调用

        return null;
    }


    @Override
    public void destroy() throws Exception {
        logger.debug("Destroy.");
    }
}
