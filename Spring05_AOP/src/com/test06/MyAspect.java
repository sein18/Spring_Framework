package com.test06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Pointcut("execution(public * *(..))")
	public void myClass() { 
		System.out.println("dd");
	}
	
	@Before("myClass()")
	public void be() {
	System.out.println("zoom에 접속해서 qr을 찍는다.");	
	}
	
	@After("myClass()")
	public void af() {
		System.out.println("zoom으 종료한다.");	
			
	}
	
	
	
}
