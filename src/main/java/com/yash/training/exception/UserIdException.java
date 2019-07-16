package com.yash.training.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class UserIdException extends RuntimeException {
	
	private static final long serialVersionID = 1L;

	public UserIdException(String message) {
		super(message);
	}

}
