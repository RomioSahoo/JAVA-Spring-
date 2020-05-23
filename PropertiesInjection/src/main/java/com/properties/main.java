package com.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Mydao d=(Mydao)ctx.getBean("dao");
		System.out.println(d);
	}

}
