package com.prishan.homeoapp.backend.dao;

import org.springframework.data.repository.CrudRepository;

import com.prishan.homeoapp.backend.entity.Patient;

public interface PatientRepositry extends CrudRepository<Patient, Long> {

	Patient getPatientDetail(Long patientId);
}
