package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProjectService {

	@Autowired
	private RestTemplate restTemplate;
    //microservice-management
	private final String management = "http://localhost:8081/rest/findById/1";
	// microservice-student
	private final String student = "http://localhost:8082/student/1";

	public String callProject1() {
		return restTemplate.getForObject(management, String.class);
	}

	public String callProject2() {
		return restTemplate.getForObject(student, String.class);
	}
}
