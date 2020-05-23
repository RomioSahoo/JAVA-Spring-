package TestMap;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("Product.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Product p=(Product)factory.getBean("pi");
		System.out.println(p);

	}

}
