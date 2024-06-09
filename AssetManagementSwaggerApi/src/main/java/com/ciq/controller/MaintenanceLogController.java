package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.MaintenanceLog;
import com.ciq.service.MaintenceLogService;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/map/log")
public class MaintenanceLogController {

	@Autowired
	MaintenceLogService maintenceLogService;

	@PostMapping("/path")
	 @ApiResponses(value = {
			 @ApiResponse(code = 400,message = "dataType")
		    })
	@Operation(summary = "Get example", description = "Returns an example MaintenanceLogController")
	public MaintenanceLog postMethodName(@Parameter(description = "Name of the MaintenanceLogController to greet")@RequestBody MaintenanceLog maintenanceLog) {
		return maintenceLogService.save(maintenanceLog);
	}

}
