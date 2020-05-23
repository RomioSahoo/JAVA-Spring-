package com.ambiguity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("amb.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Test t=(Test)factory.getBean("tt");
		System.out.println(t);

	}

}
