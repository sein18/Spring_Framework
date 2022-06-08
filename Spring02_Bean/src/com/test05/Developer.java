package com.test05;

public class Developer extends Emp{
	private String dept;

	public Developer() {
		super(); 
	}

	public Developer(String name,int sallary) {
		super(name,sallary); 
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + " dept=" + dept ;
	}
	
}