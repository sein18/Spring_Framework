package com.test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	//before->target->afterReturning->after 
	//예외시
	//before->target->afterThrowing->after 
	@Before("execution(public * *(..))")
	public void before(JoinPoint join) {
		System.out.println("zoom에 접속해서 qr을 찍는다.");
	}
	
	@AfterReturning(pointcut="execution(public * *(..))", returning = "returnVal")
	public void returning(JoinPoint join,Object returnVal) {
		System.out.println(returnVal+"공부하는 날이었다.");
	}
	
	@AfterThrowing("execution(public * com.test04.*.*(..))")
	public void throwing(JoinPoint join) {
		System.out.println("쉬는 날이었다.");
	}
	
	@After("execution(public * *(..))")
	public void after(JoinPoint join) {
		System.out.println("zoom을 종료한다.");
	}
	
//	@After("execution(public String *(..))")
//	public void after2(JoinPoint join) {
//		System.out.println("zoom을 종료한다.!");
//	}
	
	
}
