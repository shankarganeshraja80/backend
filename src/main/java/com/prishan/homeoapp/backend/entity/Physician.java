package com.prishan.homeoapp.backend.entity;

import lombok.Data;

/**
 * 
 * @author shankaran79
 *
 */
@Data
public class Physician extends BaseEntity<Long> {

	private Long physicianId;
	private String physcianName;
	private Address address;

}
