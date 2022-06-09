package com.test06;

public class Emp {
	private String name;
	private int sallary;
	public Emp() {
		super();
		 
	}
	public Emp(String name, int sallary) {
		super();
		this.name = name;
		this.sallary = sallary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSallary() {
		return sallary;
	}
	public void setSallary(int sallary) {
		this.sallary = sallary;
	}
	@Override
	public String toString() {
		return " name=" + name + ", sallary=" + sallary  ;
	}
	
}
