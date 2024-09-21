package com.ciq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SuppressWarnings("serial")
@SpringBootApplication
public class MicroServiceVaccinationCenterApplication extends ClassCastException {


	public static void main(String[] args) {
		SpringApplication.run(MicroServiceVaccinationCenterApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
		
	}
	
}
