package com.springboot.gateway.gateway.enable.configuation;

import com.springboot.gateway.gateway.filter.zuul.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TokenConfiguration {

    @Bean
    public TokenFilter setTokenFilter() {
        return new TokenFilter();
    }
}
