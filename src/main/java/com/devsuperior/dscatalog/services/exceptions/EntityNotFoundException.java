package com.devsuperior.dscatalog.services.exceptions;

public class EntityNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//construtor que repassa msg para classe pai
	public EntityNotFoundException(String msg) {
		super(msg);
	}
	
}