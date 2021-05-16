package com.prishan.homeoapp.backend.patientService;

import java.util.Optional;

import com.prishan.homeoapp.backend.entity.Patient;
import com.prishan.homeoapp.backend.exception.InvalidPatientException;

public interface PatientService {

	Optional<Patient> getPatientDetail(Long patientId) throws InvalidPatientException;	
}
