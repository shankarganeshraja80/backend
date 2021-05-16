package com.prishan.homeoapp.backend.exception;

import lombok.Data;

@Data
public class BackendException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String exceptionMessage;
	private String exceptionId;

}
