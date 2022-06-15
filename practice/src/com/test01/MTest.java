package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/application.xml");
		beaner a = factory.getBean("beaner",beaner.class); 
		System.out.println(a); 
	}

}
