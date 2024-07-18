package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).addAnnotatedClass(Aadhar.class);
    	   
    	SessionFactory sf=cf.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	session.beginTransaction();
    	
    	
    	//----------------
    	
    	User u = new User();
    	
    	u.setId(1);
    	u.setName("Vinod");

    	
    	Aadhar aadhar = new Aadhar();
    	
    	aadhar.setId(101);
    	aadhar.setNumber(7878);

    	u.setAadhar(aadhar);
    	
    	session.persist(u);
    	session.persist(aadhar);
    	
    	//---------------
    	
    	
    	
    	session.getTransaction().commit();
    	session.close();
    }
}
