package com.prishan.homeoapp.backend.entity;

import java.util.Set;

import lombok.Data;

@Data
public class Address extends BaseEntity<Long> {

	private Long addressId;
	private String addressLine1;
	private String addressLine2;
	private String locationName;
	private Set<Location> location;
}
