package com.exceptions;

public class MyProgramRuntimeException extends RuntimeException {

	public MyProgramRuntimeException() {
	}

	public MyProgramRuntimeException(String message) {
		super(message);
	}

	public MyProgramRuntimeException(Throwable cause) {
		super(cause);
	}

	public MyProgramRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyProgramRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
