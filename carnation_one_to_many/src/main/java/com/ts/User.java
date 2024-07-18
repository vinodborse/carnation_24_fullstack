package com.ts;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

	@Id
	private int id;
	private String name;
	
	@OneToMany
	private List<Document> documents;
	
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
	
	
	
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	public User() {}
	
	
	public User(int id, String name, List<Document> documents) {
		this.id = id;
		this.name = name;
		this.documents = documents;
	}
	
	
	
	
}
