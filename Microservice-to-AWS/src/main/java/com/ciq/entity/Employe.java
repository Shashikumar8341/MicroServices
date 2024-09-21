package com.ciq.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long number;
	private String Ename;
	private String location;
	private Double salary;

}
