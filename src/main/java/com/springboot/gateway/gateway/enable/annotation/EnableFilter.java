package com.springboot.gateway.gateway.enable.annotation;

import com.springboot.gateway.gateway.enable.configuation.TokenConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 添加自定义zuul过滤器模块
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({TokenConfiguration.class})
public @interface EnableFilter {
}
