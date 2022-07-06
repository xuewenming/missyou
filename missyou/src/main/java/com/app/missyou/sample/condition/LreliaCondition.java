package com.app.missyou.sample.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 条件接口
 */
public class LreliaCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String value = conditionContext.getEnvironment().getProperty("test.condition");
        return "lrelia".equals(value);
    }
}
