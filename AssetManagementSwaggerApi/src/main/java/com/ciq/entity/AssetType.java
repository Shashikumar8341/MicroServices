package com.ciq.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "asset_types")
public class AssetType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(description =  "name of the AssetType", example = "1")
	private Long id;
	@Schema(description =  "name of the AssetType", example = "shashi")
	private String name;
}