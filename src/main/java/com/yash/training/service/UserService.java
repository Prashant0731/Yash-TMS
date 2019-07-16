package com.yash.training.service;

import java.util.Optional;

import com.yash.training.beans.User;

public interface UserService {
	
	public User register(User user);
	
	public void delete(Integer id);
	
	public Optional<User> authenticate(String userId,String password);
	
	public User update(User user);
	
	public Iterable<User> list();
	
	public Optional<User> findByUserId(String userId);
	
	public Optional<User>  findByUId(Integer id);
}
