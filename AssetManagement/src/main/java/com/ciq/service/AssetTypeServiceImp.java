package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.AssetType;
import com.ciq.repository.AssetTypeRepository;
@Service
public class AssetTypeServiceImp implements AssetTypeService{

	@Autowired
	AssetTypeRepository assetTypeRepository;

	@Override
	public AssetType save(AssetType assetType) {
		return assetTypeRepository.save(assetType);
	}

}
