package com.test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class beaner{
	@Autowired
	@Qualifier("a")
	private bean b;

	public bean getB() {
		return b;
	}

	public void setB(bean b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "beaner [b=" + b + "]";
	}
	
}
