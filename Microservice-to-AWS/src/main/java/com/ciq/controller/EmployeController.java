package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.Employe;
import com.ciq.service.EmployeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/employe")
public class EmployeController {

	@Autowired
	EmployeService service;

	@PostMapping("/save")
	public Employe postMethodSave(@RequestBody Employe employe) {
		service.save(employe);
		return employe;
	}


	@GetMapping("/{id}")
	public Employe getUserById(@PathVariable Long number) {
		return service.getEmployeById(number);

	}

	@GetMapping("/findAll")
	public List<Employe> getAllemploye() {
		return 	service.getAllemploye();
	}

	@PutMapping("/update")
	public Employe Update(@RequestBody Employe employe) {
		return service.update(employe);

	}

	@DeleteMapping("/{id}")
	public void deleteEmploye(@PathVariable Long number) {
		service.deleteby(number);
	}


}
