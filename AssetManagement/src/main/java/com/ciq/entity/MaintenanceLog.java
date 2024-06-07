package com.ciq.entity;

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
public class MaintenanceLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String maintenanceActivity;
	private Date date;
	private String performedBy;
	private String notes;
	@ManyToOne
	@JoinColumn(name = "asset_id", referencedColumnName = "id")
	private Asset asset;
}