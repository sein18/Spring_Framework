package com.test09;

public class LgTV implements TV{
	
	public LgTV() {
		System.out.println("lg tv ��ü ����");
	}
	 
	@Override
	public void powerOn() {
		System.out.println("lg tv on");
	}

	@Override
	public void powerOff() {
		System.out.println("lg tv off");
	}

	@Override
	public void volUp() {
		System.out.println("lg tv vol on");
	}

	@Override
	public void volDown() {
		System.out.println("lg tv vol off");
	}

}
