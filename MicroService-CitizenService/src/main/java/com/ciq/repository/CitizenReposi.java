package com.ciq.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.Citizen;

public interface CitizenReposi extends JpaRepository<Citizen, Integer>{


	
}
