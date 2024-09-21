package com.ciq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.Employe;
import com.ciq.repository.EmployeRepo;

@Service
public class EmployeServiceImp implements EmployeService {

	@Autowired
	EmployeRepo employeRepo;

	@Override
	public Employe save(Employe employe) {
		employeRepo.save(employe);
		return employe;
	}

	@Override
	public Employe getEmployeById(Long number) {
		Optional<Employe> optional = employeRepo.findById(number);
		return optional.get();
	}

	@Override
	public List<Employe> getAllemploye() {
		List<Employe> employe = employeRepo.findAll();
		return employe;
	}

	@Override
	public Employe update(Employe employe) {
		Employe employe2 = employeRepo.save(employe);
		employe2.setEname(employe.getEname());
		employe2.setLocation(employe.getLocation());
		employe2.setNumber(employe.getNumber());
		employe2.setSalary(employe.getSalary());
		return employe2;
	}

	@Override
	public void deleteby(Long number) {
		employeRepo.existsById(number);
	}

}
