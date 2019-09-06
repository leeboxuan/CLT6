package com.crud.app.crudapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.crud.app.crudapp.exceptions.ResourceNotFoundException;
import com.crud.app.crudapp.model.User;
import com.crud.app.crudapp.repo.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {


	@Autowired
	UserRepository userRepository;


	// Get All Users
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}


	// Create a new user
	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) {
		return userRepository.save(user);
	}



	// Get a Single user
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable(value = "id") Long userId) {
		return userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
	}


	// Update a user
	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable(value = "id") Long userId,
			@Valid @RequestBody User userDetails) {

		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

		user.setFullname(userDetails.getFullname());
		user.setEmail(userDetails.getEmail());
		user.setPassword(userDetails.getPassword());

		User updatedUser = userRepository.save(user);
		return updatedUser;
	}


	// Delete a user

	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long userId) {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

		userRepository.delete(user);

		return ResponseEntity.ok().build();
	}







}
