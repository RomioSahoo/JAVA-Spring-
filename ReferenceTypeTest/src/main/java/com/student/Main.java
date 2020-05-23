package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("Scores.xml");
		Student stu=(Student)ctx.getBean("st");
		System.out.println(stu);
	}
}
