package com.test09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test09/applicationContext.xml");
		System.out.println("spring bean container 실행 후");
		TV tv = (TV)factory.getBean("samsung");
		TV tv1 = (TV)factory.getBean("lg");

		tv.powerOn();
		tv.volUp();
		tv.volDown();
		tv.powerOff();

		tv1.powerOn();
		tv1.volUp();
		tv1.volDown();
		tv1.powerOff();
	}

}
