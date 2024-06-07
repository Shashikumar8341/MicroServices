package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.MaintenanceLog;
import com.ciq.service.MaintenceLogService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/map/log")
public class MaintenanceLogController {

	@Autowired
	MaintenceLogService maintenceLogService;

	@PostMapping("/path")
	public MaintenanceLog postMethodName(@RequestBody MaintenanceLog maintenanceLog) {
		return maintenceLogService.save(maintenanceLog);
	}

}
