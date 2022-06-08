package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		Address lee = (Address)factory.getBean("lee");
		Address hong = (Address)factory.getBean("hong");

		System.out.println(lee);
		System.out.println(hong);
		
		//�̼���, ����� ������, 010-1111-1111
		//ȫ�浿, ��⵵ ȭ����, 010-2222-2222
	}

}
