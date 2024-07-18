package com.ts;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).addAnnotatedClass(Document.class);
 	   
    	SessionFactory sf=cf.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	session.beginTransaction();
    	
    	
    	//----------------
    	
    	User user1 = new User();
    	user1.setId(1);
    	user1.setName("Vinod");

    	
    	User user2 = new User();
    	user2.setId(2);
    	user2.setName("Don");

    	Document doc1 = new Document(101, "Pan", "ABC1234");
    	Document doc2 = new Document(102, "Aadhar", "7878");

    	List<Document> docs = new ArrayList<Document>();
    	
    	docs.add(doc1);
    	docs.add(doc2);
    	
    	user1.setDocuments(docs);
    	
    	user2.setDocuments(docs);
    	
    	
    	session.persist(user1);
    	session.persist(user2);
    	session.persist(doc1);
    	session.persist(doc2);
    	//---------------
    	
    	
    	
    	session.getTransaction().commit();
    	session.close();
    }
}
