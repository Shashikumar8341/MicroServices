package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.service.ProjectService;

@RestController
@RequestMapping("/api")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@GetMapping("/management")
	public String getProject1() {
		return projectService.callProject1();
	}

	@GetMapping("/student")
	public String getProject2() {
		return projectService.callProject2();
	}
}
