package listDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctc=new ClassPathXmlApplicationContext("hospital.xml");
		Hospital h=(Hospital)ctc.getBean("h");
		System.out.println("Id:"+h.getId());
		System.out.println("Departments:"+h.getDepartments().getClass().getName());
	

	}

}
