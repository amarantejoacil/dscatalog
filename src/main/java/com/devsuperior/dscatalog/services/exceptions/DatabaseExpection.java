package com.devsuperior.dscatalog.services.exceptions;

public class DatabaseExpection extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//construtor que repassa msg para classe pai
	public DatabaseExpection(String msg) {
		super(msg);
	}
	
}
