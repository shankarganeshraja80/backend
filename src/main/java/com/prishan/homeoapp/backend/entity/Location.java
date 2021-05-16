package com.prishan.homeoapp.backend.entity;

import lombok.Data;

@Data
public class Location extends BaseEntity<Long> {

	private Long locationId;
	private String locationName;
	private String stateName;
	private String zipCode;
	private String countryName;
	private String countryCode;
}
