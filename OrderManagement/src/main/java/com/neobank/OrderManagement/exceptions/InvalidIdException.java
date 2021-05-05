package com.neobank.OrderManagement.exceptions;

public class InvalidIdException extends RuntimeException {

	public InvalidIdException(String error) {
		super(error);  
	}
    
}
