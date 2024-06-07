package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.entity.MaintenanceLog;
import com.ciq.repository.MaintenceLogRepository;
@Service
public class MaintenceLogServiceImp implements MaintenceLogService {

	@Autowired
	MaintenceLogRepository maintenceLogRepository;

	@Override
	public MaintenanceLog save(MaintenanceLog maintenanceLog) {
		return maintenceLogRepository.save(maintenanceLog);
	}

}
