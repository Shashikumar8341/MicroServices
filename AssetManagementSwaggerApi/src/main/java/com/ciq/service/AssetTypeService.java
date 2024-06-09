package com.ciq.service;

import com.ciq.entity.AssetType;

public interface AssetTypeService {

	AssetType save(AssetType assetType);

	AssetType getAssetById(Long id);

}
