package com.boot.leaf.Dto;

public class LeadfDto {
	private String subject;
	private int seq;

	public LeadfDto() {
		super();
	}
	
	public LeadfDto(String subject, int seq) {
		super();
		this.subject = subject;
		this.seq = seq;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
}
