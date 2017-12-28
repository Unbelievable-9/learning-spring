package info.unbelievable9.conditional.config;

import info.unbelievable9.conditional.bean.LockScreenBean;
import info.unbelievable9.conditional.condition.LockScreenCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright 2017 (C) Yunjian-VC
 * Created on : 2017/12/28
 * Author     : Unbelievable9
 **/
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(LockScreenCondition.class)
    public LockScreenBean lockScreenBean() {
        return new LockScreenBean();
    }
}
