package com.test09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class School {
	@Autowired
	@Qualifier("kim")
	private Student preson;
 

	@Override
	public String toString() {
		return "School [preson=" + preson + "]";
	}
	
}
