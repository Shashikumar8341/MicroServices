package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.Asset;
import com.ciq.repository.AssetRepository;
@Service
public class AssetServiceImp implements AssetService {

	@Autowired
	AssetRepository assetRepository;

	@Override
	public Asset save(Asset asset) {
		return assetRepository.save(asset);
	}

	@Override
	public Asset getbyid(Long id) {
		return assetRepository.findById(id).orElse(null);
	}

}
