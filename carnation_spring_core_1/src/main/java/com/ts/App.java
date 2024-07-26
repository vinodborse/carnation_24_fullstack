package com.ts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        Teacher tch1 = ac.getBean("tch", Teacher.class);
        System.out.println(tch1);
        Teacher tch2 = ac.getBean("tch", Teacher.class);
        System.out.println(tch2);
        Teacher tch3 = ac.getBean("tch", Teacher.class);
        System.out.println(tch3);
        
        System.out.println("==========================================");
        Teacher t1 = new Teacher();
        System.out.println(t1);
        Teacher t2 = new Teacher();
        System.out.println(t2);
        Teacher t3 = new Teacher();
        System.out.println(t3);
        
    }
}
