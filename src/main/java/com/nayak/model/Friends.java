package com.nayak.model;

public class Friends {

	private String name;
	private String nickName;

	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Friends(String name, String nickName) {
		super();
		this.name = name;
		this.nickName = nickName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
