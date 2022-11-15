package com.example.demo.Exception;


public class ControllerException extends RuntimeException {
	
	String msg;

	public ControllerException(String msg) {
		super(msg);
		
	}
	
	
	

}
