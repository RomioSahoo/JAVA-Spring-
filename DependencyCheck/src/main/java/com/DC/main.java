package com.DC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("DC.xml");
		Prescription ps=(Prescription)ctx.getBean("p");
		System.out.println(ps);
		

	}

}
