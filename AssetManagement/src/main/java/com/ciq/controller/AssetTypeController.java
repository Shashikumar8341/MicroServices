package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.AssetType;
import com.ciq.service.AssetTypeService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/map/type")
public class AssetTypeController {

	@Autowired
	AssetTypeService assetTypeService;

	@PostMapping("/path")
	public AssetType postMethodName(@RequestBody AssetType assetType) {
		return assetTypeService.save(assetType);
	}

}
