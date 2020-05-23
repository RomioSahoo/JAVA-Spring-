package Pschema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ct=new ClassPathXmlApplicationContext("config.xml");
		profile p=(profile)ct.getBean("i");
		System.out.println("Id:"+p.getId()+"\tName:"+p.getName());

	}

}
