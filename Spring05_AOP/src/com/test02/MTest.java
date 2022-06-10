package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factopry = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Woman w = factopry.getBean("woman",Woman.class);
		Man m = factopry.getBean("man",Man.class);
		
		System.out.println("양성희 입장!");
		w.classWork();
		System.out.println("___________");
		System.out.println("이영재 입장!");
		m.classWork();
		
	}

}
