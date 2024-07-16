package com.ts;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration()
    											.configure("hibernate.cfg.xml")
    											.addAnnotatedClass(Student.class)
    											.addAnnotatedClass(Teacher.class);
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	session.beginTransaction();
    	//---------------
    		//INSERT INTO student VALUE (1, 'Vinod', 'Pune');
/*
    	Student s = new Student();
    	s.setRollno(2);
    	s.setName("Don");
    	s.setAddress("Faltu gali");
    	
    	Student s1 = new Student(3, "Aliya", "Mumbai");
    	
    		session.save(s);
    		session.persist(s1);
*/    	
    		// SELECT * FROM student WHERE rollno = 4;
//    		Student std =  session.get(Student.class, 4);
//    		System.out.println(std.getName());
    	
    	/*	List<Student> students =  session.createQuery("FROM Student", Student.class).getResultList();
    		for(Student s : students) {
    			System.out.println(s.getName());
    		}
    	*/	
    		// UPDATE student SET name = 'Pappu' WHERE rollno = 3;
    /*
     		Student std =  session.get(Student.class, 3);
     		std.setName("Pappu Yadav");
     */
    
    	
    	//DELETE FROM student WHERE rollno = 3;
    	Student std1 =  session.get(Student.class, 3);
    	session.remove(std1);
    	
    	//--------------
    	
    	
    	session.getTransaction().commit();

    	session.close();
    }
}
