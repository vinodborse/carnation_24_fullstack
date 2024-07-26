package com.ts;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	public void teacherDetails() {
		System.out.println("Vinod sir takes FULLSTACK classes");
	}

}


/*
 * @Component --> creates Object 
 * WEB APPLICATION
 * 
 * @Controller --> own methods + @Component
 * 
 * @Service --> own methods + @Component
 * 
 * @Repository --> own methods + @Component
 * 
 */
