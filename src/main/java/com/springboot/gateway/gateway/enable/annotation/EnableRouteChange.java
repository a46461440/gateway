package com.springboot.gateway.gateway.enable.annotation;

import com.springboot.gateway.gateway.enable.configuation.RouteChangeConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 添加自定义路由变化模块
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RouteChangeConfiguration.class)
public @interface EnableRouteChange {
}
