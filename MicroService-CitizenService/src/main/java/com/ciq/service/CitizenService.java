package com.ciq.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ciq.entity.Citizen;

@Service
public interface CitizenService {

	Citizen findbyVaccinationCenterId(Integer id);

	Citizen save(Citizen citizen);

	List<Citizen> findAll();
}
