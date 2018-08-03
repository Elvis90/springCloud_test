package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

@EnableEurekaServer
@EnableZuulProxy
@SpringBootApplication
public class EurekaServerApplication {

	//自定义路由规则(helloservice-v1 这种服务名自动路由为/v1/helloservice)
	@Bean
	public PatternServiceRouteMapper serviceRouteMapper() {
	    return new PatternServiceRouteMapper(
	        "(?<name>^.+)-(?<version>v.+$)",
	        "${version}/${name}");
	}
	public static void main(String[] args) {

		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
