package com.ts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	@Id
	private int id;
	private String name;
	
	@OneToOne
	private Aadhar aadhar; //aadhar_id
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	public User() {}
	public User(int id, String name, Aadhar aadhar) {
		
		this.id = id;
		this.name = name;
		this.aadhar = aadhar;
	}
	
	
	
	
	
}
