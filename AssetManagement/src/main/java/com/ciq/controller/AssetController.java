package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.Asset;
import com.ciq.service.AssetService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/map")
public class AssetController {

	@Autowired
	AssetService assetService;

	@PostMapping("/path")
	public Asset postMethodName(@RequestBody Asset asset) {
		return assetService.save(asset);
	}

}
