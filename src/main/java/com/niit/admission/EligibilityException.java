package com.niit.admission;

public class EligibilityException extends Exception {

	private String errorMessage;
	public EligibilityException(String message){
		errorMessage=message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Marks exception : " + errorMessage;
	}

	
	
}
