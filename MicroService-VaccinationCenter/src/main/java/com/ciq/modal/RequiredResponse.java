package com.ciq.modal;

import java.util.List;

import com.ciq.entity.VaccinationCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequiredResponse {

	private VaccinationCenter center;
	private List<Citizen> citizens;
}
