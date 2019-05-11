package com.swagger.swaggerzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SwaggerZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerZuulApplication.class, args);
	}

}
