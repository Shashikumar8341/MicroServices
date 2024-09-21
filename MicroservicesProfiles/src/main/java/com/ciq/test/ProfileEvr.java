package com.ciq.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProfileEvr {
	@Autowired
	Environment environment;

	@GetMapping("/pathenv")
	public String getMethodName() {
		return environment.getProperty("profiles");
	}
	
}
