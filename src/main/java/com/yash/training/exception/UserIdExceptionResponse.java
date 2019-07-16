package com.yash.training.exception;

public class UserIdExceptionResponse {

	private String loginname;

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public UserIdExceptionResponse(String loginname) {
		super();
		this.loginname = loginname;
	}
}
