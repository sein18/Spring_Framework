package com.edu.entity;

import org.springframework.stereotype.Component;

@Component("tri")
public class Triangle extends Shape{
 
	public Triangle() {
		super();
	}

	public Triangle(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	public void viewSize() {  
		System.out.println(getTitle()+"의 넓이: "+(super.getWidth()*super.getHeight())/2);
 	}

}
