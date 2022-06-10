package com.test08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test08/applicationContext.xml");
		 MyNickName nick1 = factory.getBean("myNickName1",MyNickName.class);
		 System.out.println(nick1);
	}

}
