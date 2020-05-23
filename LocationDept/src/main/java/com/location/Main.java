package com.location;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("location.xml");
		Location loc=(Location)context.getBean("l");
		loc.display();
	}
}
