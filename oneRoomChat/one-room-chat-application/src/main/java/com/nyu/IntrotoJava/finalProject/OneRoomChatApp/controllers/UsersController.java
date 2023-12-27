package com.nyu.IntrotoJava.finalProject.OneRoomChatApp.controllers;

import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nyu.IntrotoJava.finalProject.OneRoomChatApp.models.Users;
import com.nyu.IntrotoJava.finalProject.OneRoomChatApp.services.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UserServiceImpl userService;
	
	@GetMapping(path = "" , produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Users> findAllUser() {
		List<Users> allUsers = userService.findAllUsers();
		
		return allUsers;
	}
	
	@GetMapping("/{id}")
	public Optional<Users> findUserById(@PathVariable long id) {
		return userService.findUserById(id);
	}
	
//	@PostMapping("")
//	public  
	
}
