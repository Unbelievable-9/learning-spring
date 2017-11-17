package info.unbelievable9.config;

import info.unbelievable9.po.Mario;
import info.unbelievable9.po.SuperMario;
import info.unbelievable9.service.EndOfLevelStage;
import info.unbelievable9.service.Stage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/16
 * Author     : Unbelievable9
 **/
@Configuration
public class MarioConfig {

    @Bean
    public Stage stage() {
        return new EndOfLevelStage(System.out);
    }

    @Bean
    public Mario mario() {
        return new SuperMario(stage());
    }
}
