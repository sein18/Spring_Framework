package com.test01;

import org.springframework.stereotype.Component;

@Component
public class bean {
	private int a;
	private String b;
	private String c;
	public bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bean(int a, String b, String c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "bean [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
