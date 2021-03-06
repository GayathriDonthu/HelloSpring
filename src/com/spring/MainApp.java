package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
		HelloWorld obj2 = (HelloWorld)context.getBean("helloWorld");
		System.out.println(obj);
		System.out.println(obj2);
	}	

}
