package com.ciq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.Management;
import com.ciq.repo.ManagementRepo;

@Service
public class ManagementServiceImpl implements ManagementService {

	@Autowired
	ManagementRepo managementRepo;

	@Override
	public Management save(Management management) {
		return managementRepo.save(management);
	}

	@Override
	public Management update(Management management) {
		Management management2 = managementRepo.findById(management.getId()).get();
		management2.setDepartment(management.getDepartment());
		management2.setLocation(management.getLocation());
		Management management3 = managementRepo.save(management2);
		return management3;
	}

	@Override
	public List<Management> findAll() {
		return managementRepo.findAll();
	}

	@Override
	public Management findById(Integer Id) {
		Optional<Management> optional = managementRepo.findById(Id);
		return optional.get();
	}

	@Override
	public void delete(Integer Id) {
		managementRepo.deleteById(Id);
	}

}
