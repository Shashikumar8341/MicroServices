package com.ciq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceEurekaServerApplication {

// MicroServiceCitizenService-project
	public static void main(String[] args) {
		SpringApplication.run(MicroServiceEurekaServerApplication.class, args);
	}

}
