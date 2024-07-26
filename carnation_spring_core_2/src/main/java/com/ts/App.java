package com.ts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
//    	Teacher t2 = ac.getBean("thr", Teacher.class);
//    	
//    	System.out.println(t2.getName());

    	Student s = ac.getBean("st", Student.class);
    	s.helloStudent();
    }
}
