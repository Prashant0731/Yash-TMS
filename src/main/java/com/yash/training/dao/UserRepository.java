package com.yash.training.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.training.beans.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

	Optional<User> findByUserId(String userId);
	
	Optional<User> findById(Integer id);
}
