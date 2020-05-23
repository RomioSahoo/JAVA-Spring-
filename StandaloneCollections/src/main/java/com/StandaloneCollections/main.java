package com.StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ct=new ClassPathXmlApplicationContext("products.xml");
		ProductList p=(ProductList)ct.getBean("pl");
		System.out.println(p);

	}

}
