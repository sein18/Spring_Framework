package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		MessageBean ba = factory.getBean("banana",MessageBean.class);
		ba.sayHello();
		MessageBean ap = factory.getBean("apple",MessageBean.class);
		ap.sayHello();
		MessageBean me = factory.getBean("melon",MessageBean.class);
		me.sayHello();

	}

}
