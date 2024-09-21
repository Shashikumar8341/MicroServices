package com.ciq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.Citizen;
import com.ciq.repository.CitizenReposi;

@Service
public class CitizenServiceImp implements CitizenService {

	@Autowired
	CitizenReposi citizenReposi;

	@Override
	public Citizen findbyVaccinationCenterId(Integer id) {
		Citizen citizen=null;
		Optional<Citizen> optional=citizenReposi.findById(id);
		if (optional.isPresent()) {
			citizen=optional.get();
		}
		return citizen;
		
		}

	@Override
	public Citizen save(Citizen citizen) {
		return citizenReposi.save(citizen);
	}

	@Override
	public List<Citizen> findAll() {
		return citizenReposi.findAll();
	}

}
