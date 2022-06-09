package com.test03;

public class MessageBeanImpl implements MessageBean{
	private String fruit;
	private int cost;
	
	public MessageBeanImpl() {
		this.fruit = "banana";
		this.cost = 5000;
	}

	public MessageBeanImpl(String fruit, int cost) {
		super();
		this.fruit = fruit;
		this.cost = cost;
	}

	@Override
	public void sayHello() {
		System.out.println("과일: " + fruit + " 비용: " + cost);
	}

}
