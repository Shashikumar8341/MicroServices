package com.ciq.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "management_tab")
public class Management {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String department;
	private String location;
	

}
