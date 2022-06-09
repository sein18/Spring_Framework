package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/applicationContext.xml");
		
		Address lee = factory.getBean("lee",Address.class);
		System.out.println(lee);
		Address hong = factory.getBean("hong",Address.class);
		System.out.println(hong);
	}

}
