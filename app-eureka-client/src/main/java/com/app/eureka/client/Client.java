package com.app.eureka.client;

public class Client {
	private String name;
	private Long size;
	public Client() {
	}
	public Client(String name, Long size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}
}
