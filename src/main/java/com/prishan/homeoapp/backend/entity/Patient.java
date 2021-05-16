package com.prishan.homeoapp.backend.entity;

import java.util.Set;

import lombok.Data;

@Data
public class Patient extends BaseEntity<Long> {

	private Long patientId;
	private String patientName;
	private Set<Address> address;
	
}
