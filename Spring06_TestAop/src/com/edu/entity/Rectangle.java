package com.edu.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("rect")
public class Rectangle extends Shape{
	@Autowired
	public Rectangle() {
		super();
	}

	public Rectangle(String title, int width, int height) {
		super(title, width, height);
	} 
	
	@Override
	public void viewSize() { 
		System.out.println(getTitle()+"의 넓이: "+(super.getWidth()*super.getHeight()));
	}

}
