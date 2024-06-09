package com.ciq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciq.entity.AssetType;

@Repository
public interface AssetTypeRepository extends JpaRepository<AssetType, Long> {

}
