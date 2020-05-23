package com.setterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Employee emp=(Employee)factory.getBean("e");
		System.out.println(emp);
	}

}
