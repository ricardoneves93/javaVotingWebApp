package com.pp.voting.entities;

import java.util.UUID;

import org.springframework.data.annotation.Id;

public class User {
	public String id;
	
	public String userName;
	public String userRole;
	public String userEmail;
	
	
	public User(String userName, String userRole, String userEmail) {
		this.id = UUID.randomUUID().toString();
		this.userName = userName;
		this.userRole = userRole;
		this.userEmail = userEmail;
	}

}
