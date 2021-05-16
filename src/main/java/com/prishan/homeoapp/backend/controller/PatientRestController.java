package com.prishan.homeoapp.backend.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prishan.homeoapp.backend.entity.Patient;
import com.prishan.homeoapp.backend.exception.InvalidPatientException;
import com.prishan.homeoapp.backend.patientService.PatientService;

import lombok.extern.slf4j.Slf4j;

/**
 * Patient Details
 * 
 * @author shankaran79
 *
 */
@RestController
@Slf4j
@RequestMapping("api")
public class PatientRestController {

	@Autowired
	private PatientService patientService;

	@GetMapping("/patient/{patientId}")
	public ResponseEntity<Patient> getPatientDetails(@PathVariable("patientId") Optional<String> patientId)
			throws InvalidPatientException {

		ResponseEntity<Patient> response = null;

		if (patientId.isPresent()) {
			Optional<Patient> patient = patientService.getPatientDetail(Long.valueOf(patientId.get()));
			response = ResponseEntity.ok(patient.get());
		}

		return response;
	}
}
