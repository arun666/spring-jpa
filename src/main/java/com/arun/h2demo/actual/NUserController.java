package com.arun.h2demo.actual;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.arun.h2demo.User;

@RestController
public class NUserController {
	@Autowired
	private NUserJpaRepository userRepo;
	
	
	@PostMapping("/users1")
	public NUser createUser(@Valid @RequestBody NUser user) {
		System.out.println("/n****");
		System.out.println(user.toString());
		NUser savedUser = userRepo.save(user);
		// CREATED
		// /user/{id}     savedUser.getId()
		
		return savedUser;
		
//		URI location = ServletUriComponentsBuilder
//			.fromCurrentRequest()
//			.path("/{id}")
//			.buildAndExpand(savedUser.getId()).toUri();
//		
//		return ResponseEntity.created(location).build();
		
	}
	@GetMapping("/users")
	public List<NUser> retrieveAllUsers() {
		return userRepo.findAll();
	}

}
