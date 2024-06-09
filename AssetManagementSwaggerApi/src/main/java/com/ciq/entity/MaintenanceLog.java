package com.ciq.entity;

import java.util.Date;

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
public class MaintenanceLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(description = "Name of the MaintenanceLog", example = "1")
	private Long id;
	@Schema(description = "Name of the MaintenanceLog", example = "products")
	private String maintenanceActivity;
	@Schema(description = "Name of the MaintenanceLog", example = "2014-05-25")
	private Date date;
	@Schema(description = "Name of the MaintenanceLog", example = "lopi")
	private String performedBy;
	@Schema(description = "Name of the MaintenanceLog", example = "In the Controller class I've defined the following Annotations above the method")
	private String notes;
	@ManyToOne
	@JoinColumn(name = "asset_id", referencedColumnName = "id")
	private Asset asset;
}