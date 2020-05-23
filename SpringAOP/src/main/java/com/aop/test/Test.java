package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.ProductServices;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ct = new ClassPathXmlApplicationContext("config.xml");
		ProductServices p = (ProductServices) ct.getBean("ps");
		System.out.println(p.multiply(6, 5));

	}

}
