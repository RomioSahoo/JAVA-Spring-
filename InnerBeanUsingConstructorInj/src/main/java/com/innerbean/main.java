package com.innerbean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class main {

	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("innerbean.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Employee ee=(Employee)factory.getBean("e");
		System.out.println(ee);
	
	}
}

