package com.springboot.gateway.gateway.enable.condition;

import com.springboot.gateway.gateway.enable.annotation.NeedInject;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class NeedInjectCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map map = annotatedTypeMetadata.getAnnotationAttributes(NeedInject.class.getName());
        String need = String.valueOf(map.get("value"));
        return "need".equalsIgnoreCase(need);
    }
}
