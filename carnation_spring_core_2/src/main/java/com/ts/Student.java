package com.ts;

public class Student {

	private Batch b;


	public Batch getB() {
		return b;
	}
	public void setB(Batch b) {
		this.b = b;
	}
	public Student() {}
	
	public Student(Batch b) {
		this.b = b;
	}

	
	public void helloStudent() {
		System.out.println("We are in student class.");
    	
		
    	b.batchName();
	}
}
