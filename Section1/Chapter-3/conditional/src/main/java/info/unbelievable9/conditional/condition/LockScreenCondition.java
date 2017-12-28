package info.unbelievable9.conditional.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Copyright 2017 (C) Yunjian-VC
 * Created on : 2017/12/28
 * Author     : Unbelievable9
 **/
public class LockScreenCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if (conditionContext.getEnvironment() != null &&
                conditionContext.getEnvironment().containsProperty("phone_locked")) {
            String value = conditionContext.getEnvironment().getProperty("phone_locked");

            return Boolean.valueOf(value);
        }

        return false;
    }
}
