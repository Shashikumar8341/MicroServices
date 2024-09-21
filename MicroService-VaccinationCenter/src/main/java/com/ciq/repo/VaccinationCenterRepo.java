package com.ciq.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.entity.VaccinationCenter;

public interface VaccinationCenterRepo extends JpaRepository<VaccinationCenter, Integer> {

}
