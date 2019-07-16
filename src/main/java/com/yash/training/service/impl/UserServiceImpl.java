package com.yash.training.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.yash.training.beans.User;
import com.yash.training.dao.UserRepository;
import com.yash.training.exception.UserIdException;
import com.yash.training.service.UserService;



@Service
public class UserServiceImpl implements UserService {

	public final Integer USER_STATUS_ACTIVE = 1;
	public final Integer USER_STATUS_BLOCKED = 2;

	@Autowired
	private UserRepository userRepository;

	@Override
	public User register(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(Integer id) {

		userRepository.deleteById(id);

	}

	@Override
	public Optional<User> authenticate(String userId, String password) {

		Optional<User> user =null;
		try {
			user = userRepository.findByUserId(userId);
			if (user == null) {
				throw new UserIdException("User with userId : '" + userId + "' does not exist!!");
			}
		/*	if (user.getId() == USER_STATUS_BLOCKED) {
				throw new UserIdException("You are blocked. Contact admin for more information");
			} else {
				if (user.getUserId().equals(userId) && user.getPassword().equals(password)) {
					return user;
				} else {
					throw new UserIdException("You have entered inccorect Password. Please enter the correct Password");
				}
		
			}
		*/
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		
		return user;
	}

	@Override
	public User update(User user) {
		return userRepository.save(user);
	}

	@Override
	public Iterable<User> list() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findByUId(Integer id) {
		return userRepository.findById(id);
	}

	@Override
	public Optional<User> findByUserId(String userId) {
		return userRepository.findByUserId(userId);
	}



}
