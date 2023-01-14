package com.jsp;

public class InsufficientBalanceException extends RuntimeException {
	
	private String message;

	public InsufficientBalanceException(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return "Insufficient Balance";
	}

}
