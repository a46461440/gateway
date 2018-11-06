package com.springboot.gateway.gateway.enable.annotation;

import com.springboot.gateway.gateway.enable.condition.NeedInjectCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(NeedInjectCondition.class)
public @interface NeedInject {

    String value() default "need";

}
