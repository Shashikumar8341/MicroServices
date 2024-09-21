package com.ciq.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.Management;


public interface ManagementRepo extends JpaRepository<Management, Integer> {
	
}
