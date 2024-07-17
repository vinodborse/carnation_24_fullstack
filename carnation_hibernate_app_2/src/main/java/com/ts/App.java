package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		//--------------------
		
		Student s1 = new Student();
		s1.setName("Vinod");
		s1.setAddress("Pune");
		session.persist(s1);

		Student s2 = new Student();
		s2.setName("Don");
		s2.setAddress("Mumbai");
		session.persist(s2);
		
		//---------------------
		
		
		session.getTransaction().commit();
		
		session.close();

    }
}
