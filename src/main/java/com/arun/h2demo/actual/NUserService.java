package com.arun.h2demo.actual;

public class NUserService {
 
	private NUserJpaRepository nur;
	
	
	
	public void SaveUser(NUser nuser) {
		nur.save(nuser);
		
	}
	
	
	
}
