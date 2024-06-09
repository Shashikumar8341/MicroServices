package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.Asset;
import com.ciq.service.AssetService;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/map")
public class AssetController {

	@Autowired
	AssetService assetService;

	@ApiResponses(value = { @ApiResponse(code = 250	, message = "Insert Sucesses") })
	@Operation(summary = "Get example", description = "Returns an example Asset")
	@PostMapping("/path")
	public Asset postMethodName(
			@Parameter(description = "Name of the AssetController to greet") @RequestBody Asset asset) {
		return assetService.save(asset);
	}

	@GetMapping("/{id}")
	  @ApiResponses(value = {
		        @ApiResponse(code = 200, message = "Successful operation"),
		        @ApiResponse(code = 400, message = "Bad request"),
		        @ApiResponse(code = 500, message = "Internal server error")
		    })
	public Asset getMethodName(@PathParam(value = "path") Long id) {
		return assetService.getbyid(id);
	}

}
