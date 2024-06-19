package com.example.demo.APIDOC;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Cloud Vendor API").version("1.0")
				.description("Cloud Vendor API Documentation").termsOfService("http://thinkconstructive.com/terms")
				.contact(new io.swagger.v3.oas.models.info.Contact().name("Esha Puri")
						.url("http://thinkconstructive.com").email("contact@thinkconstructive.com")));
	}
}
