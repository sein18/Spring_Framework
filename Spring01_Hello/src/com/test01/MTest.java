package com.test01;

public class MTest {

	public static void main(String[] args) {
		MessageBean bean = new MessageBeanKo();
		bean.sayHello("������");
		
		bean = new MessageBeanEn();
		bean.sayHello("spring");
	}

}
