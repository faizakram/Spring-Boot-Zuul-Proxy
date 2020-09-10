package com.app.eureka.user.controller;

public class User {
	private String name;
	private Long age;
	public User() {
	}
	
	public User(String name, Long age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}
}
