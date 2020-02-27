package com.exceptions;

public class MyProgramException extends Exception {

	public MyProgramException(String string) {
		super(string);
	}

	public MyProgramException(String string, NumberFormatException ex) {
		super(string, ex);
	}

}
