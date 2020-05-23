package CollectionInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("questions.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Question que=(Question)factory.getBean("q");
		que.display();

	}

}
