package com.spring;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("your message:"+message);
		//return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

