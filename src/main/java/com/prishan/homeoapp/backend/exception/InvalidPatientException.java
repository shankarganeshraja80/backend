package com.prishan.homeoapp.backend.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;


@Data
@AllArgsConstructor
@Builder
public class InvalidPatientException extends BackendException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;
	private String errorId;
}
