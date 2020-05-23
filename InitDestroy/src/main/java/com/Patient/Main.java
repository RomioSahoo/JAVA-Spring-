package com.Patient;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("Patient.xml");
		Patient pt=(Patient)ctx.getBean("p");
		System.out.println(pt);
		ctx.registerShutdownHook();
	}

}
