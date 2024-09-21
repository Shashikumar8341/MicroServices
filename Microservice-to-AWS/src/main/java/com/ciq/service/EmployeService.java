package com.ciq.service;

import java.util.List;

import com.ciq.entity.Employe;

public interface EmployeService {
	public Employe save(Employe employe);

	public Employe getEmployeById(Long number);

	public List<Employe> getAllemploye();

	public Employe update(Employe employe);

	public void deleteby(Long number);

}
