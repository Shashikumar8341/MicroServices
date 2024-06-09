package com.ciq.service;

import com.ciq.entity.Asset;

public interface AssetService {

	Asset save(Asset asset);
	Asset getbyid(Long id);
}
