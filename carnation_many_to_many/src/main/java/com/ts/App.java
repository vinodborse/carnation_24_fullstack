package com.ts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf=new Configuration().configure("hibernate.cfg.xml")
    										.addAnnotatedClass(Student.class)
    										.addAnnotatedClass(Batch.class);
  	   
    	SessionFactory sf=cf.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	session.beginTransaction();
    	
    	//-------------------
    	
    	Student s1 = new Student();
    	s1.setRollno(1);
    	s1.setName("Vinod");
    	
    	Batch b1 = new Batch(101, "CORE JAVA", "Avinash");
    	Batch b2 = new Batch(102, "UI", "Vinod");
    	Batch b3 = new Batch(103, "ADV JAVA", "Vinod");
    	
//    	List<Batch> fullstackBatch = new ArrayList<>();
//    	
//    	fullstackBatch.add(b1);
//    	fullstackBatch.add(b2);
//    	fullstackBatch.add(b3);
    	
    	List<Batch> fullstackBatch1 = Arrays.asList(b1, b2, b3);
    	List<Batch> backendBatch = Arrays.asList(b1, b3);
    	
    	s1.setBatch(fullstackBatch1);
    	
    	
    	Student s2 = new Student();
    	s2.setRollno(2);
    	s2.setName("Don");
    	s2.setBatch(backendBatch);
    	
    	session.persist(s1);
    	session.persist(s2);
    	session.persist(b1);
    	session.persist(b2);
    	session.persist(b3);
    	//-------------------
    	
    	session.getTransaction().commit();
    	session.close();
    }
}
