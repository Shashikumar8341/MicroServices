package com.ciq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciq.entity.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {

}
