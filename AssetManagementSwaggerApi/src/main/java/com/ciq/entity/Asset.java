package com.ciq.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Schema(description = "Asset entity")

public class Asset {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Schema(description = "Name of the Asset", example = "1")
	private Long id;
	@Schema(description = "Name of the Asset", example = "John Doe")
	private String name;
	@Schema(description = "Name of the Asset", example = "male")
	private String type;
	@Schema(description = "Name of the Asset", example = "single")
	private String status;
	@Schema(description = "Name of the Asset", example = "smg")
	private String location;
	@Schema(description = "Name of the Asset", example = "2014-05-25")
	private Date acquisitionDate;
	@Schema(description = "Name of the Asset", example = "mumbai")
	private String manufacturer;
	@Schema(description = "Name of the Asset", example = "india")
	private String model;
	@Schema(description = "Name of the Asset", example = "19")
	private String serialNumber;
	@Schema(description = "Name of the Asset", example = "2503.25")
	private double purchaseCost;
	@Schema(description = "Name of the Asset", example = "2024-06-08")
	private LocalDate warrantyExpiryDate;
	@Schema(description = "Name of the Asset", example = "2024-06-08")
	private LocalDate lastMaintenanceDate;
	@Schema(description = "Name of the Asset", example = "2024-06-08")
	private LocalDate nextMaintenanceDate;
	@Schema(description = "Name of the Asset", example = "2024-06-08")
	private String notes;

	@OneToMany(mappedBy = "asset")
	private List<MaintenanceLog> movementRecords;
}