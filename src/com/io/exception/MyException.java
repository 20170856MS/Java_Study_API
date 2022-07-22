package com.io.exception;

public class MyException extends Exception{
	
	public MyException() {
		super("몰라요");
	}
	
	public MyException(String message) {
		super(message);
		
	}

}
