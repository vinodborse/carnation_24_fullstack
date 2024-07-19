package com.ts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Batch {

	@Id
	private int id;
	private String name;
	private String sir;
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
	public String getSir() {
		return sir;
	}
	public void setSir(String sir) {
		this.sir = sir;
	}
	
	public Batch() {}
	
	public Batch(int id, String name, String sir) {
		this.id = id;
		this.name = name;
		this.sir = sir;
	}
	
	
}
