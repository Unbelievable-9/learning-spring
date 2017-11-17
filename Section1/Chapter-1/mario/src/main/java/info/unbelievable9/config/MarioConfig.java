package info.unbelievable9.config;

import info.unbelievable9.po.Mario;
import info.unbelievable9.po.SuperMario;
import info.unbelievable9.aop.Coin;
import info.unbelievable9.di.EndOfLevelStage;
import info.unbelievable9.di.Stage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/16
 * Author     : Unbelievable9
 **/
@Configuration
@EnableAspectJAutoProxy
public class MarioConfig {

    @Bean
    public Stage stage() {
        return new EndOfLevelStage(System.out);
    }

    @Bean
    public Mario mario() {
        return new SuperMario(stage());
    }

    @Bean
    public Coin coin() {
        return new Coin(System.out);
    }
}
