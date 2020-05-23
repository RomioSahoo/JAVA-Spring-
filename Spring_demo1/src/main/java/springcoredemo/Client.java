package springcoredemo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource r=new ClassPathResource("Person.xml");
		//path of xml file which is required by BeanFactory class
		BeanFactory factory=new XmlBeanFactory(r);
		Person person=(Person)factory.getBean("p");
		person.displayPersonDetail();
	}

}
