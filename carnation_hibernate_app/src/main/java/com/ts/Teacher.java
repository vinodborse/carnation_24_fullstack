package com.ts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {

	@Id
	private int id;
	private String teachername;
	private int mobile;
	private String batch;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	public Teacher() {}
	
	public Teacher(int id, String teachername, int mobile, String batch) {
	
		this.id = id;
		this.teachername = teachername;
		this.mobile = mobile;
		this.batch = batch;
	}

	
}
