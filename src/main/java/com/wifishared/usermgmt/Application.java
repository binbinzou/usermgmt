package com.wifishared.usermgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import com.wifishared.common.framework.jwt.HTTPBearerAuthorizationFilter;
import com.wifishared.common.framework.redis.RedisManager;

@SpringBootApplication
@EnableAutoConfiguration
@EnableHystrix
@ComponentScan(basePackages = "com.wifishared")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
