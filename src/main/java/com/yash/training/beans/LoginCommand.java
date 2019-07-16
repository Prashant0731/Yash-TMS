package com.yash.training.beans;

import javax.validation.constraints.NotBlank;

public class LoginCommand {

	@NotBlank(message="Loginname cannot be blank")
	private String userId;
	
	@NotBlank(message="Password cannot be blank")
	private String password;


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}