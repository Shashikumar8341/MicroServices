package com.ciq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciq.entity.MaintenanceLog;

@Repository
public interface MaintenceLogRepository extends JpaRepository<MaintenanceLog, Long> {

}
