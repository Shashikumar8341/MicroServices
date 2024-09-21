package com.ciq.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paths")
public class ProfileDemo {
	@Value(value = "${profiles}")
	private String profile;

	@GetMapping("/path")
	public String getProfile() {
		return profile;
	}

}
