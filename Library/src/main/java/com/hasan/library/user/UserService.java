package com.hasan.library.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public User getUser(long id) {
		return userRepository.findById(id).get();
	}
	
	public User updateUser(User user) {
		return userRepository.save(user);
		
	}
	
	public void deleteUser(User id) {
		userRepository.delete(id);
	}
}
