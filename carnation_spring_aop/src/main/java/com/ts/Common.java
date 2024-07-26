package com.ts;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Common {
	
//	@Before("execution(public void UserDataMethod())")
//	public void sample() {
//		System.out.println("Start");
//	}
	
//	@Before("execution(public void *DataMethod())")
//	public void sample1() {
//		System.out.println("Start");
//	}
//	
//	@After("execution(public void userDataMethod())")
//	public void end() {
//		System.out.println("End");
//	}
	
	@Around("execution(public void userDataMethod())")
	public void m1(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Start");
		pjp.proceed();
		System.out.println("End");
	}
	
}
