

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;
import com.dto.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		//Employee employee = new Employee();
		//employee.setId(3);
		//employee.setName("Romio");
		//employee.setSalary(10800);
		//int result=dao.create(employee);
		//int result=dao.update(employee);
		//int result=dao.delete(102);
		//Employee employee=dao.read(3);
		List<Employee> result=dao.read();
;		System.out.println("Records: "+result);
		//System.out.println("Number of records inserted "+result);
		
	}

}
