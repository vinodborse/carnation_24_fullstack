package com.ts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aadhar {

	@Id
	private int id;
	
	private int	number;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Aadhar() {}
	
	public Aadhar(int id, int number) {
		
		this.id = id;
		this.number = number;
	}
	
	
}
