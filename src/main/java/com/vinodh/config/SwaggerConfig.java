package com.vinodh.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.vinodh")).build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Alarm REST API",
				"All Alarm related information",
				"API",
				"Terms of services",
				new Contact("Vinodh Software Private Limited", "https://vcti.io/", "vinodh.sangavaram@vinodh.com"),
				"License of API",
				"https://vinodh.io/",
				Collections.emptyList());
		return apiInfo;
	}

}
