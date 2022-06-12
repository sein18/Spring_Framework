package com.test05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
	@Pointcut("execution(public * *(..))") //기점으로 설정
	public void myClass() { 
		System.out.println("dd");
	}
	
	@Before("myClass()")//기점 메소드로 before, after사용 가능
	public void be() {
	System.out.println("zoom에 접속해서 qr을 찍는다.");	
	}
	
	@After("myClass()")
	public void af() {
		System.out.println("zoom으 종료한다.");	
			
	}
	
	
	
}
