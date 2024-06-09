package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.AssetType;
import com.ciq.service.AssetTypeService;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/map/type")
public class AssetTypeController {

	@Autowired
	AssetTypeService assetTypeService;

	@PostMapping("/path")
	@Operation(summary = "Get a list of letters for a specific AssetTypeController", description = "Get a list of letters for a specific AssetTypeController", tags = {
			"AssetTypeController" })

	public AssetType postMethodName(

			@Parameter(description = "Name of the AssetTypeController to greet") @RequestBody AssetType assetType) {
		return assetTypeService.save(assetType);
	}

	@GetMapping("/{id}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful operation"),
			@ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 500, message = "Internal server error") })
	public AssetType getMethodName(@PathParam(value = "path") Long id) {
		return assetTypeService.getAssetById(id);
	}

}
