package com.test08;

public class BeanFactory {
	 
	Object getBean(String BeanName) {
		if(BeanName.equals("samsung")) {
			return new SamsungTV();
		}else if(BeanName.equals("lg")) {
			return new LgTV(); 
		}
		
		return null;
	}
}
