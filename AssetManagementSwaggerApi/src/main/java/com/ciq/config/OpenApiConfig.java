package com.ciq.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

@OpenAPIDefinition(
    info = @io.swagger.v3.oas.annotations.info.Info(title = "My API", version = "1.0", description = "My API Description"),
    servers = @Server(url = "http://localhost:8080")
)
public class OpenApiConfig {

	@Bean
	 OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Asset API documentation")
						.description("Asset api documentation for all end points").version("v1.0")
						.contact(
								new Contact().name("shashi").email("john.doe@example.com").url("http://example.com"))
						.license(new License().name("Apache 2.0").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation().description("Spring Boot 3 Documentation")
						.url("https://spring.io/projects/spring-boot"));
	}
}