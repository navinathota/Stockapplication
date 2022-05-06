package com.zensar.stockapplication.exceptions;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class InvalidStockIdException extends Exception {
//this is a checked exception which is usually surround with try catch
	//exception class has multiple constructors and taking string as attribute is also a constructor
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public InvalidStockIdException(String message) {
		super(message);
	}
}
