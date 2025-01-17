package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
				.paths(PathSelectors.ant("/cloudvendor/**")).build().apiInfo(apiCustomData());
	}

	private ApiInfo apiCustomData() {
		return new ApiInfo("Cloud Vendor API", "Cloud Vendor Documentation", "1.0", "Terms of Service",
				new Contact("Esha Puri", "http://thinkconstructive.com", "contact@thinkconstructive.com"),
				"Think Constructive License", "http://thinkconstructive.com", Collections.emptyList());
	}
}
