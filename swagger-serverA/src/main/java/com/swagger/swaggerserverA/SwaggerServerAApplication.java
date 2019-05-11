package com.swagger.swaggerserverA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class SwaggerServerAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerServerAApplication.class, args);
	}
	@Bean
	public Docket swaggerPersonApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.swagger.swaggerserverA.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(
						new ApiInfoBuilder()
								.version("1.0")
								.title("Original Service API")
								.description("Original Service API v1.0")
								.build()
				);
	}

}
