package com.prishan.homeoapp.backend.patientService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prishan.homeoapp.backend.dao.PatientRepositry;
import com.prishan.homeoapp.backend.entity.Patient;
import com.prishan.homeoapp.backend.exception.InvalidPatientException;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepositry patientRepositry;

	@Override
	public Optional<Patient> getPatientDetail(Long patientId) throws InvalidPatientException {
		Patient patientDetail = patientRepositry.getPatientDetail(null);
		Optional<Patient> patient = Optional.ofNullable(patientDetail);
		return patient;
	}

}
