package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.Citizen;
import com.ciq.service.CitizenService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/citizen")
public class CitizenControl {

	@Autowired
	CitizenService citizenService;

	@GetMapping("/id/{id}")
	public ResponseEntity<Citizen> getMethodName(@PathVariable("id") Integer id) {
		Citizen citizen = citizenService.findbyVaccinationCenterId(id);
		return new ResponseEntity<>(citizen, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Citizen> add(@RequestBody Citizen newcitizen) {
		Citizen citizen = citizenService.save(newcitizen);
		return new ResponseEntity<>(citizen, HttpStatus.OK);
	}

	@GetMapping("/path")
	public ResponseEntity<String> getMethodName() {
		return new ResponseEntity<String>("hello", HttpStatus.OK);
	}
	@GetMapping("/find")
	public List<Citizen> findAll() {
		List<Citizen> citizen = citizenService.findAll();
		return  citizen;
	}
	

}
