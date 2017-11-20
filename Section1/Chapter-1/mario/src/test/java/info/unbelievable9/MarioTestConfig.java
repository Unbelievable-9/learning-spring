package info.unbelievable9;

import info.unbelievable9.di.EndOfLevelStage;
import info.unbelievable9.di.Stage;
import info.unbelievable9.po.Mario;
import info.unbelievable9.po.SuperMario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/20
 * Author     : Unbelievable9
 **/
@Configuration
@EnableAspectJAutoProxy
public class MarioTestConfig {

    @Bean
    public FakePrintStream fakePrintStream() {
        return new FakePrintStream();
    }

    @Bean
    public Stage stage() {
        return new EndOfLevelStage(fakePrintStream());
    }

    @Bean
    public Mario mario() {
        return new SuperMario(stage());
    }
}
