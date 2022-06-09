package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/beans.xml");
		MessageBean kor = factory.getBean("korea",MessageBean.class);
		kor.sayHello("스프링");
		kor = factory.getBean("english",MessageBean.class);
		kor.sayHello("스프링");
	}

}
