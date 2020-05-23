package com.Employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("Employee.xml");
		BeanFactory factroy=new XmlBeanFactory(r);
		Department dt=(Department)factroy.getBean("d");
		dt.display();

	}

}
