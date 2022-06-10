package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06/applicationContext.xml");
		Person m = factory.getBean("man",Person.class);
		Person w = factory.getBean("woman",Person.class);
		
		System.out.println("이영재 입장!");
		m.classWork();
		System.out.println("______________");
		System.out.println("양성희 입장!");
		w.classWork();
	}
}
