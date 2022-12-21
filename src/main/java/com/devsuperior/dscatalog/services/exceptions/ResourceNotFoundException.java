package com.devsuperior.dscatalog.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//construtor que repassa msg para classe pai
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
	
}
