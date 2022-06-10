package com.test08;

 
public class MyNickName {
	 private int num; 
	 private int sum;
	public MyNickName(int num, int sum) {
		super();
		this.num = num;
		this.sum = sum;
	}
	public MyNickName(int num) {
		super();
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	 
	@Override
	public String toString() {
		return "MyNickName [num=" + num + ", sum=" + sum + "]";
	}
	 
	
}
