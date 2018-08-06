package com.arun.h2demo;

import static org.assertj.core.api.Assertions.useRepresentation;

import org.springframework.beans.factory.annotation.Autowired;

import com.arun.h2demo.actual.NUser;
import com.arun.h2demo.actual.NUserJpaRepository;



public class TestClass {

	@Autowired
	private NUserJpaRepository userRepo;
	
	
	public void SaveUser(NUser user) {
	
		
		NUser savedUser = userRepo.save(user);
		
	}
	
public static void main(String args[])
{
	
	TestClass tc=new TestClass();
	tc.SaveUser(new NUser(1000,"Arun"));
	System.out.println("user saved successfully");
	
	
}
}
