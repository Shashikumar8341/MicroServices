package com.ciq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciq.entity.Employe;

@Repository
public interface EmployeRepo extends JpaRepository<Employe, Long> {

}
