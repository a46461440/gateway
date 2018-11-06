package com.springboot.gateway.gateway;

import com.springboot.gateway.gateway.enable.annotation.EnableFilter;
import com.springboot.gateway.gateway.enable.annotation.EnableRouteChange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableFilter
@EnableRouteChange
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
