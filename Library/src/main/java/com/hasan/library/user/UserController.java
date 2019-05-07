package com.hasan.library.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	UserService userService;
	
	
	
	// localhost:8080/user/all
	@RequestMapping(method = RequestMethod.GET, value="/all")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/add")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public User getUser(@PathVariable  long id) {
		return userService.getUser(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value="/update")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/{id}")
	public void deleteUser(@PathVariable User id) {
		userService.deleteUser(id);
	}
	
}
