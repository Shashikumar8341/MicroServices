package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.entity.Management;
import com.ciq.service.ManagementService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/rest")
public class ManagController {

	@Autowired
	ManagementService managementService;

	@PostMapping("/save")
	public Management save(@RequestBody Management management) {
		return managementService.save(management);
	}

	@GetMapping("/findById/{Id}")
	public Management findById(@PathVariable Integer Id) {
		return managementService.findById(Id);
	}

	@PutMapping("/path/{id}")
	public Management update(@RequestBody Management management) {
		return managementService.update(management);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer Id) {
		managementService.delete(Id);
		;
	}

}
