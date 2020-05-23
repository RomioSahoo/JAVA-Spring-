

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("auto.xml");
		Employee ee=(Employee)ctx.getBean("e");
		System.out.println(ee);

	}
}

