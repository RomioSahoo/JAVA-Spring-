package com.instructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ct=new ClassPathXmlApplicationContext("Config.xml");
		Instructor ins=(Instructor)ct.getBean("ins");
		System.out.println(ins+" "+ins.hashCode());
		Instructor ins1=(Instructor)ct.getBean("ins");
		System.out.println(ins1+" "+ins1.hashCode());

	}

}
