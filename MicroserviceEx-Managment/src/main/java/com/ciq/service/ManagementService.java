package com.ciq.service;

import java.util.List;

import com.ciq.entity.Management;

public interface ManagementService {

	public Management save(Management management);

	public Management update(Management management);

	List<Management> findAll();

	public Management findById(Integer Id);

	public void delete(Integer Id);

}
