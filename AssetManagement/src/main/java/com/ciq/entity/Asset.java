package com.ciq.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Asset {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String type;
	private String status;
	private String location;
	private Date acquisitionDate;
	private String manufacturer;
	private String model;
	private String serialNumber;
	private double purchaseCost;
	private LocalDate warrantyExpiryDate;
	private LocalDate lastMaintenanceDate;
	private LocalDate nextMaintenanceDate;
	private String notes;
}