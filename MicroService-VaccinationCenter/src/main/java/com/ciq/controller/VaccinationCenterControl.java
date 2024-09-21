package com.ciq.controller;

import java.util.List;

//import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ciq.entity.VaccinationCenter;
import com.ciq.modal.Citizen;
import com.ciq.modal.RequiredResponse;
import com.ciq.repo.VaccinationCenterRepo;

@RestController
@RequestMapping("/vaccination")
public class VaccinationCenterControl {
	@Autowired
	VaccinationCenterRepo centerRepo;
	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/add")
	public ResponseEntity<VaccinationCenter> add(@RequestBody VaccinationCenter newcitizen) {
		VaccinationCenter citizen = centerRepo.save(newcitizen);
		return new ResponseEntity<>(citizen, HttpStatus.OK);
	}

	@GetMapping("/getAllDataby/{id}")
	public ResponseEntity<RequiredResponse> getAllDataby(@PathVariable("id") Integer id) {
		RequiredResponse response = new RequiredResponse();
		// get VaccinationCenter Details
		VaccinationCenter center = centerRepo.findById(id).get();
		response.setCenter(center);
		// then getAll Citizen required to VaccinationCenter
		@SuppressWarnings("unchecked")
		List<Citizen> listOfCitizen = (List<Citizen>) restTemplate
				.getForEntity("http://localhost:8997/citizen/id/" + id, List.class);
		response.setCitizens(listOfCitizen);
		return new ResponseEntity<RequiredResponse>(response, HttpStatus.OK);

	}

}
